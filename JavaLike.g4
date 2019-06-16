grammar JavaLike;

compilationUnit
	: function* EOF;

literal
	: BooleanLiteral
	| IntegerLiteral
	| CharacterLiteral
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
	: methodName LEFT_BRACKET parameterList? RIGHT_BRACKET;

methodName
    : Identifier;

parameterList
	: parameter (COMMA parameter)*;

parameter
	: type parameterName;

parameterName
    : Identifier;

modifier
	: PUBLIC_KEYWORD
	| PROTECTED_KEYWORD
	| PRIVATE_KEYWORD
	| STATIC_KEYWORD
	| FINAL_KEYWORD;


expression
    : EXCLAMATION  expression
    | LEFT_BRACKET expression RIGHT_BRACKET
    | arithmeticExpression
    | assignment
	| atom;


arithmeticExpression
    : LEFT_BRACKET arithmeticExpression RIGHT_BRACKET
    | additiveExpression
    | multiplicativeExpression
    | atom;

additiveExpression
	: multiplicativeExpression
	| additiveExpression additive_operators multiplicativeExpression;

multiplicativeExpression
    : atom
    | multiplicativeExpression multiplicative_operators additiveExpression;

relationalExpression
    : atom
    | LEFT_BRACKET relationalExpression RIGHT_BRACKET
    | expression comparsion_operators expression
    | relationalExpression bool_operators relationalExpression
    ;

body
	: lines*;

lines
	: statement
	| assignment
	| fieldDeclaration;

assignment
	: leftHandSide assign_operators rightHandSide SEMICOLON;

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
	: basicIfStatement elsefifStatement * elseStatement?;

basicIfStatement
    : IF_KEYWORD LEFT_BRACKET relationalExpression RIGHT_BRACKET LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET;

elsefifStatement
    : ELIF_KEYWORD LEFT_BRACKET relationalExpression RIGHT_BRACKET LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET;

elseStatement
    : ELSE_KEYWORD LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET;

whileStatement
	: WHILE_KEYWORD LEFT_BRACKET relationalExpression RIGHT_BRACKET LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET;

returnStatement
	: RETURN_KEYWORD expression SEMICOLON;

fieldDeclaration
	: type variableDeclarator SEMICOLON ;

variableDeclarator
	: basicDeclarator
	| basicVariableDeclarationInitialization
	| variableArrayDeclarationInitialization;

variableName
    : Identifier;

variableInitializer
	: expression
	| atom;

basicDeclarator
    : variableName;

basicVariableDeclarationInitialization
    : variableName (OPERATORS_ASSIGNMENT variableInitializer)?;

variableArrayDeclarationInitialization
    : variableName (OPERATORS_ASSIGNMENT variableArrayInitializer)?;

variableArrayInitializer
	: LEFT_CURLYBRACKET variableArrayInitializerList? RIGHT_CURLYBRACKET
	| expression
	| atom;

comparsion_operators : EQUAL | NOT_EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL;
additive_operators : PLUS | MINUS;
multiplicative_operators : DIV | MUL;
assign_operators : OPERATORS_ASSIGNMENT;
bool_operators: ANDAND | OROR;

atom
	: LEFT_BRACKET expression RIGHT_BRACKET
	| literal
	| Identifier;

variableArrayInitializerList
	: variableInitializer (COMMA variableInitializer)*;

primitiveType
	: INT_KEYWORD
	| BOOLEAN_KEYWORD
	| CHAR_KEYWORD;

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

CharacterLiteral
	: '\'' SingleCharacter '\'';

fragment
SingleCharacter
	: ~['\\\r\n];
// LEXER -----------------------------------------------
fragment
NonZeroDigit: 	[1-9];
Zero: 			'0';
NullLiteral:  	'null';
BooleanLiteral: 'true'|'false';
// KEYWORDS
BOOLEAN_KEYWORD:	'boolean';
INT_KEYWORD:		'int';
CHAR_KEYWORD:		'char';
WHILE_KEYWORD: 		'while';
IF_KEYWORD: 		'if';
ELIF_KEYWORD :		'else if';
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
DIV: 			'/';
MUL:			'*';
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