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
T22 : ';' ;
T23 : 'quantity' ;
T24 : 'extensional' ;
T25 : 'collective' ;
T26 : 'subKind' ;
T27 : 'category' ;
T28 : 'phase' ;
T29 : 'role' ;
T30 : 'mixin' ;
T31 : 'roleMixin' ;
T32 : 'mode' ;
T33 : 'relator' ;
T34 : 'derived' ;
T35 : 'leaf' ;
T36 : 'characterization' ;
T37 : 'mode:' ;
T38 : 'characterized:' ;
T39 : 'memberEnd' ;
T40 : 'navigableOwnedEnd' ;
T41 : 'mediation' ;
T42 : 'mediated' ;
T43 : 'derivation' ;
T44 : 'material:' ;
T45 : 'relator:' ;
T46 : 'materialAssociation' ;
T47 : 'formalAssociation' ;
T48 : 'datatype' ;
T49 : 'type' ;
T50 : 'substitutable' ;
T51 : '(' ;
T52 : ')' ;
T53 : 'complete' ;
T54 : 'disjoint' ;
T55 : 'generalizationSet' ;
T56 : 'op' ;
T57 : '[' ;
T58 : ']' ;
T59 : '+' ;
T60 : '-' ;
T61 : '*' ;
T62 : '/' ;
T63 : 'OpaqueExpression' ;
T64 : 'begin' ;
T65 : '#' ;
T66 : 'end' ;
T67 : 'static' ;
T68 : 'ordered' ;
T69 : 'unique' ;
T70 : 'read-only' ;
T71 : 'derived-union' ;
T72 : 'defaults to' ;
T73 : 'aggregation' ;
T74 : 'subset of' ;
T75 : 'redefines' ;
T76 : '=' ;
T77 : 'instance' ;
T78 : 'specification' ;
T79 : '=>' ;
T80 : 'true' ;
T81 : 'false' ;
T82 : 'NULL' ;
T83 : 'none' ;
T84 : 'shared' ;
T85 : 'composite' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8094
RULE_RWS : (' '|'\t')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8096
RULE_NL : ('\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8098
RULE_WS : (RULE_RWS|RULE_NL)+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8100
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8102
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8104
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8106
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8108
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 8110
RULE_ANY_OTHER : .;


