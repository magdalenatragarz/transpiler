grammar Java;

compilationUnit
	: typeDeclaration* EOF
	| WHITESPACE*
	| COMMENT*
	| LINE_COMMENT*;

literal
	: BooleanLiteral
	| CharacterLiteral
	| FloatLiteral
	| IntegerLiteral
	| StringLiteral
	| NullLiteral;

typeDeclaration
	: classDeclaration;

classDeclaration
	: classModifier* CLASS_KEYWORD Identifier classBody;

classModifier
	: PUBLIC_KEYWORD
	| PROTECTED_KEYWORD
	| PRIVATE_KEYWORD
	| STATIC_KEYWORD;

classBody
	: LEFTCURLYBRACKET_SEPARATOR classBodyDeclaration RIGHTCURLYBRACKET_SEPARATOR;

classBodyDeclaration
	: fieldDeclaration;

fieldDeclaration
	: (fieldModifier* type variableDeclarator SEMICOLON_SEPARATOR)*;

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

expression
	: literal;

variableArrayInitializerList
	: variableInitializer (COMMA_SEPARATOR variableInitializer)*;

fieldModifier
	: PUBLIC_KEYWORD
	| PROTECTED_KEYWORD
	| PRIVATE_KEYWORD
	| STATIC_KEYWORD
	| FINAL_KEYWORD;

numericType
	:	integralType
	|	floatingPointType;

integralType
	:	INT_KEYWORD
	|	CHAR_KEYWORD;

floatingPointType
	:	DOUBLE_KEYWORD
	|	FLOAT_KEYWORD;

primitiveType
	: numericType
	| BOOLEAN_KEYWORD;

type
	: classType
	| primitiveType
	| arrayType;

classType
	: Identifier;

arrayType
	: primitiveType dims
	| classType dims;

dims
	: LEFTSQUAREBRACKET_SEPARATOR RIGHTSQUAREBRACKET_SEPARATOR (LEFTSQUAREBRACKET_SEPARATOR RIGHTSQUAREBRACKET_SEPARATOR)*;

//-----------------------------------------------
IntegerLiteral
	: DecimalNumeral IntegerTypeSuffix?;

fragment
IntegerTypeSuffix
	: [lL];

fragment
DecimalNumeral
	: Zero
	| NonZeroDigit (Digits? | Underscores Digits);

fragment
Digits
	: Digit (DigitsAndUnderscores? Digit)?;

fragment
Digit
	: Zero
	| NonZeroDigit;

fragment
DigitsAndUnderscores
	: DigitOrUnderscore+;

fragment
DigitOrUnderscore
	: Digit
	| UNDERSCORE_SEPARATOR;

fragment
Underscores
	: UNDERSCORE_SEPARATOR+;

FloatLiteral
	: Digits DOT_SEPARATOR Digits?  FloatTypeSuffix?
	| DOT_SEPARATOR Digits FloatTypeSuffix?
	| Digits FloatTypeSuffix?;

fragment
ExponentPart
	: ExponentIndicator SignedInteger;

fragment
ExponentIndicator
	: [eE];

fragment
SignedInteger
	: Sign? Digits;

fragment
Sign
	: [+-];

fragment
FloatTypeSuffix
	: [fFdD];

CharacterLiteral
	: '\'' SingleCharacter '\'';

StringLiteral
	: '"' StringCharacters? '"';

fragment
StringCharacters
	: StringCharacter+;


// LEXER -----------------------------------------------
fragment
SingleCharacter: 	~['\\\r\n];

fragment
StringCharacter: 	~["\\\r\n];

fragment
ZeroToThree: 	[0-3];

fragment
NonZeroDigit: 	[1-9];

Zero: 			'0';
NullLiteral:  	'null';
BooleanLiteral: 'true'|'false';	


// KEYWORDS
CLASS_KEYWORD: 		'class';
PUBLIC_KEYWORD:		'public';
PROTECTED_KEYWORD:	'protected';
PRIVATE_KEYWORD:	'private';
STATIC_KEYWORD:		'static';
FINAL_KEYWORD:		'final';
BOOLEAN_KEYWORD:	'boolean';
INT_KEYWORD:		'int';
CHAR_KEYWORD:		'char';
DOUBLE_KEYWORD:		'double';
FLOAT_KEYWORD:		'float';

// SEPARATORS
SEMICOLON_SEPARATOR: 			';';
COMMA_SEPARATOR:				',';
DOT_SEPARATOR:					'.';
LEFTCURLYBRACKET_SEPARATOR:		'{';
RIGHTCURLYBRACKET_SEPARATOR:	'}';
LEFTSQUAREBRACKET_SEPARATOR:	'[';
RIGHTSQUAREBRACKET_SEPARATOR:	']';
UNDERSCORE_SEPARATOR:			'_';

// OPERATORS
OPERATORS_ASSIGNMENT:	'=';

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