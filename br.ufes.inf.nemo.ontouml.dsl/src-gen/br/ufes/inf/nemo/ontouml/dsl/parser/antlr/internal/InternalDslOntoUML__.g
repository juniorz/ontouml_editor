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
T17 : 'datatype' ;
T18 : 'attributes:' ;
T19 : 'Dependency' ;
T20 : ',' ;
T21 : 'depends on' ;
T22 : '(' ;
T23 : ')' ;
T24 : 'constraint' ;
T25 : 'package' ;
T26 : 'merge' ;
T27 : ':' ;
T28 : 'substitutable' ;
T29 : 'complete' ;
T30 : 'disjoint' ;
T31 : 'generalizationSet' ;
T32 : 'OpaqueExpression' ;
T33 : 'begin' ;
T34 : '#' ;
T35 : 'end' ;
T36 : 'property' ;
T37 : '<' ;
T38 : 'static' ;
T39 : 'ordered' ;
T40 : 'unique' ;
T41 : 'read-only' ;
T42 : 'derived-union' ;
T43 : '>' ;
T44 : '[' ;
T45 : ']' ;
T46 : 'defaults to' ;
T47 : 'aggregation' ;
T48 : 'subset of' ;
T49 : 'redefines' ;
T50 : 'mediation' ;
T51 : ';' ;
T52 : 'memberEnd' ;
T53 : 'navigableOwnedEnd' ;
T54 : 'derived' ;
T55 : 'abstract' ;
T56 : 'leaf' ;
T57 : 'derivation' ;
T58 : 'material:' ;
T59 : 'relator:' ;
T60 : 'materialAssociation' ;
T61 : 'formalAssociation' ;
T62 : '=' ;
T63 : 'instance' ;
T64 : 'specification' ;
T65 : '=>' ;
T66 : 'true' ;
T67 : 'false' ;
T68 : '*' ;
T69 : 'NULL' ;
T70 : 'active' ;
T71 : 'subkind' ;
T72 : 'kind' ;
T73 : 'quantity' ;
T74 : 'extensional' ;
T75 : 'collective' ;
T76 : 'phase' ;
T77 : 'role' ;
T78 : 'category' ;
T79 : 'ownedAttribute' ;
T80 : 'roleMixin' ;
T81 : 'mixin' ;
T82 : 'mode' ;
T83 : 'relator' ;
T84 : 'Characterization' ;
T85 : 'ownedEnd' ;
T86 : 'none' ;
T87 : 'shared' ;
T88 : 'composite' ;
T89 : 'public' ;
T90 : 'private' ;
T91 : 'protected' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 7284
RULE_RWS : (' '|'\t')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 7286
RULE_NL : ('\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 7288
RULE_WS : (RULE_RWS|RULE_NL)+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 7290
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 7292
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 7294
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 7296
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 7298
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g" 7300
RULE_ANY_OTHER : .;


