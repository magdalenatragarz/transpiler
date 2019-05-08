grammar Java;

compilationUnit
	: typeDeclaration EOF
	| Whitespace*
	| Comment*
	| LineComment*
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
	: (fieldModifier* type declarator ';')*
	;

declarator
	: variableArrayDeclarator
	| variableDeclarator
	;

variableDeclarator
	: Identifier ('=' variableInitializer)?
	;

variableInitializer
	: expression
	;

variableArrayDeclarator
	: Identifier ('=' variableArrayInitializer)?
	;

variableArrayInitializer
	: '{' variableArrayInitializerList? '}'
	;

expression
	: '1'
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


Identifier
	:	JavaLetter JavaLetterOrDigit*
	;

JavaLetter
	:	[a-zA-Z$_];

JavaLetterOrDigit
	:	[a-zA-Z0-9$_];


JavaDigit
	:	[0-9];

//-----------------------------------------------
Whitespace
	:  [ \t\r\n\u000C]+ -> skip
    ;

Comment
    :   '/*' .*? '*/' -> skip
    ;

LineComment
    :   '//' ~[\r\n]* -> skip
    ;