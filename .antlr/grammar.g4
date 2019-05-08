grammar java;

compilationUnit
	: typeDeclaration* EOF
	;

typeDeclaration
	: classDeclaration
	| ';'
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
	: fieldModifier* fieldType Identifier ';' ()
	;

fieldModifier
	: 'public'
	| 'protected'
	| 'static'
	| 'final'
	;

fieldType
	: primitiveType
	| classType
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

//-----------------------------------------------
WHITESPACE
	:  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;