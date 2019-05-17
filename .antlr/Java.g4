grammar Java;

compilationUnit
	: function* EOF;

literal
	: BooleanLiteral
	| IntegerLiteral
	| NullLiteral;

function
	: modifier* methodHeader methodBody;

methodHeader
	: result methodDeclarator;

methodBody
	: LEFT_CURLYBRACKET lines* RIGHT_CURLYBRACKET;

result
	: type
	| VOID_KEYWORD;

methodDeclarator
	: Identifier LEFT_BRACKET parameterList? RIGHT_BRACKET;

parameterList
	: parameter (COMMA parameter)*;

parameter
	: type Identifier;

modifier
	: PUBLIC_KEYWORD
	| PROTECTED_KEYWORD
	| PRIVATE_KEYWORD
	| STATIC_KEYWORD
	| FINAL_KEYWORD;


expression 
    : EXCLAMATION  expression 
    | expression operators expression
	| atom;

body
	: lines*;

lines
	: statement
	| assignment
	| fieldDeclaration;

assignment
	: leftHandSide asgn_operators rightHandSide SEMICOLON;

leftHandSide
	: variableAccess
	| arrayAccess;

rightHandSide
	: expression; 

variableAccess
	: Identifier;

arrayAccess
	: Identifier LEFT_SQUAREBRACKET IntegerLiteral RIGHT_SQUAREBRACKET;

statement
	: ifStatement
	| whileStatement
	| returnStatement; 

ifStatement
	: IF_KEYWORD LEFT_BRACKET expression RIGHT_BRACKET LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET
	(ELIF_KEYWORD LEFT_BRACKET expression RIGHT_BRACKET LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET)*
	(ELSE_KEYWORD LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET)?;

whileStatement
	: WHILE_KEYWORD LEFT_BRACKET expression RIGHT_BRACKET LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET;

returnStatement
	: RETURN_KEYWORD expression SEMICOLON;

fieldDeclaration
	: type variableDeclarator SEMICOLON ;

variableDeclarator
	: Identifier (OPERATORS_ASSIGNMENT variableInitializer)?
	| variableArrayDeclarator ;

variableInitializer
	: expression
	| atom;

variableArrayDeclarator
	: Identifier (OPERATORS_ASSIGNMENT variableArrayInitializer)?;

variableArrayInitializer
	: LEFT_CURLYBRACKET variableArrayInitializerList? RIGHT_CURLYBRACKET
	| expression
	| atom;

operators : EQUAL | NOT_EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | ANDAND | OROR | PLUS | MINUS | SUB | MUL;
asgn_operators : ADD_ASSIGN  | MUL_ASSIGN | DIV_ASSIGN | SUB_ASSIGN | OPERATORS_ASSIGNMENT;

atom
	: LEFT_BRACKET expression RIGHT_BRACKET
	| literal
	| Identifier;

variableArrayInitializerList
	: variableInitializer (COMMA variableInitializer)*;

primitiveType
	: INT_KEYWORD
	| BOOLEAN_KEYWORD;

type
	: primitiveType
	| arrayType;

arrayType
	: primitiveType dims
	;

dims
	: LEFT_SQUAREBRACKET  RIGHT_SQUAREBRACKET  (LEFT_SQUAREBRACKET  RIGHT_SQUAREBRACKET )*;

//-----------------------------------------------
IntegerLiteral
	: Zero
	| NonZeroDigit (Digits?) ;

fragment
Digits
	: Digit (Digit)?;

fragment
Digit
	: Zero
	| NonZeroDigit;


// LEXER -----------------------------------------------
fragment
NonZeroDigit: 	[1-9];

Zero: 			'0';
NullLiteral:  	'null';
BooleanLiteral: 'true'|'false';	


// KEYWORDS
BOOLEAN_KEYWORD:	'boolean';
INT_KEYWORD:		'int';
WHILE_KEYWORD: 		'while';
IF_KEYWORD: 		'if';
ELIF_KEYWORD :		'elif';
ELSE_KEYWORD:		'else';
RETURN_KEYWORD: 	'return';
VOID_KEYWORD: 		'void';

PUBLIC_KEYWORD:		'public';
PROTECTED_KEYWORD:	'protected';
PRIVATE_KEYWORD:	'private';
STATIC_KEYWORD:		'static';
FINAL_KEYWORD:		'final';

// SEPARATORS
SEMICOLON : 			';';
COMMA:					',';
DOT:					'.';
LEFT_CURLYBRACKET:		'{';
RIGHT_CURLYBRACKET:		'}';
LEFT_SQUAREBRACKET :	'[';
RIGHT_SQUAREBRACKET :	']';
LEFT_BRACKET: 			'(';
RIGHT_BRACKET: 			')';

ANDAND : 		'&&';
OROR : 			'||';
EQUAL : 		'==';
NOT_EQUAL : 	'!=';
LESS : 			'<';
LESS_EQUAL : 	'<=';
GREATER : 		'>';
GREATER_EQUAL : '>=';
EXCLAMATION: 	'!';
PLUS:			'+';
MINUS:			'-';
SUB: 			'/';
MUL:			'*';

INC:			'++';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';


// OPERATORS
OPERATORS_ASSIGNMENT:		'=';

COMMENTS_LINE:    			'//';
COMMENTS_BLOCK_OPENING:		'/*';
COMMENTS_BLOCK_CLOSING:		'*/';


Identifier: JavaLetter JavaLetterOrDigit*;

fragment
JavaLetter:			[a-zA-Z$_];

fragment
JavaLetterOrDigit: 	[a-zA-Z0-9$_];

WHITESPACE:  	[ \t\r\n\u000C]+ -> skip;
COMMENT:   		COMMENTS_BLOCK_OPENING .*? COMMENTS_BLOCK_CLOSING -> skip;
LINE_COMMENT:   COMMENTS_LINE ~[\r\n]* -> skip;