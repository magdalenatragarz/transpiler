grammar Java;

compilationUnit
	: function* EOF
	| WHITESPACE*
	| COMMENT*
	| LINE_COMMENT*;

literal
	: BooleanLiteral
	| IntegerLiteral
	| NullLiteral;

function
	: modifier* methodHeader methodBody;

methodHeader
	:	result methodDeclarator 
	;

methodBody
	:	LEFTCURLYBRACKET_SEPARATOR lines* RIGHTCURLYBRACKET_SEPARATOR
	;

result
	:	type
	|	'void'
	;

methodDeclarator
	:	Identifier '(' parameterList? ')' 
	;

parameterList
	:	parameter (',' parameter)*
	;


parameter
	: type Identifier
	;

modifier
	: PUBLIC_KEYWORD
	| PROTECTED_KEYWORD
	| PRIVATE_KEYWORD
	| STATIC_KEYWORD
	| FINAL_KEYWORD
	;

expression 
    : EXCLAMATION  expression 
    | expression operators expression
    | atom;

body
	: lines*;

lines
	: 	statement
	|	fieldDeclaration
	| 	returnStatement;

statement
	: ifStatement
	| whileStatement
	; 

ifStatement
	: IF_KEYWORD LEFT_BRACKET expression RIGHT_BRACKET LEFTCURLYBRACKET_SEPARATOR body RIGHTCURLYBRACKET_SEPARATOR
	(ELIF_KEYWORD LEFT_BRACKET expression RIGHT_BRACKET LEFTCURLYBRACKET_SEPARATOR body RIGHTCURLYBRACKET_SEPARATOR)*
	(ELSE_KEYWORD LEFTCURLYBRACKET_SEPARATOR body RIGHTCURLYBRACKET_SEPARATOR)?
	;

whileStatement
	: WHILE_KEYWORD LEFT_BRACKET expression RIGHT_BRACKET LEFTCURLYBRACKET_SEPARATOR body RIGHTCURLYBRACKET_SEPARATOR
	;

returnStatement
	: RETURN_KEYWORD expression;

fieldDeclaration
	: type variableDeclarator SEMICOLON_SEPARATOR;

variableDeclarator
	: Identifier (OPERATORS_ASSIGNMENT variableInitializer)?
	| variableArrayDeclarator ;

variableInitializer
	: expression;

variableArrayDeclarator
	: Identifier (OPERATORS_ASSIGNMENT variableArrayInitializer)?;

variableArrayInitializer
	: LEFTCURLYBRACKET_SEPARATOR variableArrayInitializerList? RIGHTCURLYBRACKET_SEPARATOR
	| expression;

atom
	: literal
	| Identifier
	| LEFT_BRACKET expression RIGHT_BRACKET;



operators : EQUAL | NOT_EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | ANDAND | OROR;

variableArrayInitializerList
	: variableInitializer (COMMA_SEPARATOR variableInitializer)*;

primitiveType
	: INT_KEYWORD
	| BOOLEAN_KEYWORD;

type
	:
	| primitiveType
	| arrayType;

arrayType
	: primitiveType dims
	;

dims
	: LEFTSQUAREBRACKET_SEPARATOR RIGHTSQUAREBRACKET_SEPARATOR (LEFTSQUAREBRACKET_SEPARATOR RIGHTSQUAREBRACKET_SEPARATOR)*;

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
MAIN_KEYWORD: 		'public static void main(String[] argv)';
BOOLEAN_KEYWORD:	'boolean';
INT_KEYWORD:		'int';
WHILE_KEYWORD: 	'while';
IF_KEYWORD: 	'if';
ELIF_KEYWORD :	'elif';
ELSE_KEYWORD:	'else';
RETURN_KEYWORD: 'return';

PUBLIC_KEYWORD:'public';
PROTECTED_KEYWORD:'protected';
PRIVATE_KEYWORD:'private';
STATIC_KEYWORD:'static';
FINAL_KEYWORD:'final';

// SEPARATORS
SEMICOLON_SEPARATOR: 			';';
COMMA_SEPARATOR:				',';
DOT_SEPARATOR:					'.';
LEFTCURLYBRACKET_SEPARATOR:		'{';
RIGHTCURLYBRACKET_SEPARATOR:	'}';
LEFTSQUAREBRACKET_SEPARATOR:	'[';
RIGHTSQUAREBRACKET_SEPARATOR:	']';
LEFT_BRACKET: '(';
RIGHT_BRACKET: ')';

ANDAND : '&&';
OROR : '||';
EQUAL : '==';
NOT_EQUAL : '!=';
LESS : '<';
LESS_EQUAL : '<=';
GREATER : '>';
GREATER_EQUAL : '>=';

EXCLAMATION: '!';
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