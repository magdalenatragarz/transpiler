grammar Java;

compilationUnit
	: typeDeclaration* EOF
	| Whitespace*
	| Comment*
	| LineComment*
	;

literal
	: BooleanLiteral
	| CharacterLiteral
	| FloatLiteral
	| IntegerLiteral
	| StringLiteral
	| NullLiteral
	;

typeDeclaration
	: classDeclaration
	;

classDeclaration
	: classModifier* 'class' Identifier classBody
	;

classModifier
	: 'public'
	| 'protected'
	| 'private'
	| 'static'
	;

classBody
	: '{' classBodyDeclaration '}'
	;

classBodyDeclaration
	: fieldDeclaration
	;

fieldDeclaration
	: (fieldModifier* type variableDeclarator ';')*
	;


variableDeclarator
	: Identifier ('=' variableInitializer)?
	| variableArrayDeclarator 
	;

variableInitializer
	: expression
	;

variableArrayDeclarator
	: Identifier ('=' variableArrayInitializer)?
	;

variableArrayInitializer
	: '{' variableArrayInitializerList? '}'
	| expression
	;

expression
	: literal
	;

variableArrayInitializerList
	: variableInitializer (',' variableInitializer)* 
	;

fieldModifier
	: 'public'
	| 'protected'
	| 'private'
	| 'static'
	| 'final'
	;

numericType
	:	integralType
	|	floatingPointType
	;

integralType
	:	'int'
	|	'char'
	;

floatingPointType
	:	'float'
	|	'double'
	;

primitiveType
	: numericType
	| 'boolean'
	;

type
	: classType
	| primitiveType
	| arrayType
	;

classType
	: Identifier;

arrayType
	: primitiveType dims
	| classType dims
	;

dims
	: '[' ']' ('[' ']')*
	;

//-----------------------------------------------
IntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix?
	;

fragment
IntegerTypeSuffix
	:	[lL]
	;

fragment
DecimalNumeral
	:	'0'
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

fragment
Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

fragment
Digit
	:	'0'
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

fragment
DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment
DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment
Underscores
	:	'_'+
	;

FloatLiteral
	:	Digits '.' Digits?  FloatTypeSuffix?
	|	'.' Digits FloatTypeSuffix?
	|	Digits FloatTypeSuffix?
	;


fragment
FloatTypeSuffix
	:	[fFdD]
	;

BooleanLiteral
	:	'true'
	|	'false'
	;

CharacterLiteral
	:	'\'' SingleCharacter '\''
	;

fragment
SingleCharacter
	:	~['\\\r\n]
	;

StringLiteral
	:	'"' StringCharacters? '"'
	;
fragment
StringCharacters
	:	StringCharacter+
	;
fragment
StringCharacter
	:	~["\\\r\n]
	;

fragment
ZeroToThree
	:	[0-3]
	;

NullLiteral
	:	'null'
	;

Identifier
	: JavaLetter JavaLetterOrDigit*;
	
JavaLetter
	: [a-zA-Z$_];

JavaLetterOrDigit
	:[a-zA-Z0-9$_];

//-----------------------------------------------
Whitespace:  	[ \t\r\n\u000C]+ -> skip;
Comment:   		'/*' .*? '*/' -> skip;
LineComment:   	'//' ~[\r\n]* -> skip;