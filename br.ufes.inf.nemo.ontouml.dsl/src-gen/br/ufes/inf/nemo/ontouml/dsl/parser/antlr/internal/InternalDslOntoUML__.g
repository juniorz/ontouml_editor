lexer grammar InternalDslOntoUML;
@header {
package br.ufes.inf.nemo.ontouml.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'model' ;
T14 : 'viewpoint' ;
T15 : '{' ;
T16 : '}' ;
T17 : 'active' ;
T18 : 'abstract' ;
T19 : 'kind' ;
T20 : ':' ;
T21 : ',' ;
T22 : 'attributes' ;
T23 : ';' ;
T24 : 'quantity' ;
T25 : 'extensional' ;
T26 : 'collective' ;
T27 : 'subKind' ;
T28 : 'category' ;
T29 : 'phase' ;
T30 : 'role' ;
T31 : 'mixin' ;
T32 : 'roleMixin' ;
T33 : 'mode' ;
T34 : 'relator' ;
T35 : 'derived' ;
T36 : 'leaf' ;
T37 : 'characterization' ;
T38 : 'mode:' ;
T39 : 'characterized:' ;
T40 : 'memberEnd' ;
T41 : 'navigableOwnedEnd' ;
T42 : 'mediation' ;
T43 : 'mediated' ;
T44 : 'derivation' ;
T45 : 'material:' ;
T46 : 'relator:' ;
T47 : 'materialAssociation' ;
T48 : 'formalAssociation' ;
T49 : 'substitutable' ;
T50 : '(' ;
T51 : ')' ;
T52 : 'complete' ;
T53 : 'disjoint' ;
T54 : 'generalizationSet' ;
T55 : 'OpaqueExpression' ;
T56 : 'begin' ;
T57 : '#' ;
T58 : 'end' ;
T59 : 'static' ;
T60 : 'ordered' ;
T61 : 'unique' ;
T62 : 'read-only' ;
T63 : 'derived-union' ;
T64 : '[' ;
T65 : ']' ;
T66 : 'defaults to' ;
T67 : 'aggregation' ;
T68 : 'subset of' ;
T69 : 'redefines' ;
T70 : '=' ;
T71 : '=>' ;
T72 : 'instance' ;
T73 : 'true' ;
T74 : 'false' ;
T75 : '*' ;
T76 : 'NULL' ;
T77 : 'none' ;
T78 : 'shared' ;
T79 : 'composite' ;
T80 : 'public' ;
T81 : 'private' ;
T82 : 'protected' ;
T83 : 'package' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8263
RULE_RWS : (' '|'\t')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8265
RULE_NL : ('\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8267
RULE_WS : (RULE_RWS|RULE_NL)+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8269
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8271
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8273
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8275
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8277
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8279
RULE_ANY_OTHER : .;


