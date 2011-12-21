lexer grammar InternalDslOntoUML;
@header {
package br.ufes.inf.nemo.ontouml.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : '*' ;
T14 : 'true' ;
T15 : 'false' ;
T16 : 'none' ;
T17 : 'shared' ;
T18 : 'composite' ;
T19 : 'model' ;
T20 : '{' ;
T21 : '}' ;
T22 : 'viewpoint' ;
T23 : 'kind' ;
T24 : ':' ;
T25 : ',' ;
T26 : ';' ;
T27 : 'quantity' ;
T28 : 'collective' ;
T29 : 'subKind' ;
T30 : 'category' ;
T31 : 'phase' ;
T32 : 'role' ;
T33 : 'mixin' ;
T34 : 'roleMixin' ;
T35 : 'mode' ;
T36 : 'relator' ;
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
T49 : 'datatype' ;
T50 : 'type' ;
T51 : '(' ;
T52 : ')' ;
T53 : 'generalizationSet' ;
T54 : 'OpaqueExpression' ;
T55 : 'begin' ;
T56 : 'end' ;
T57 : '#' ;
T58 : '[' ;
T59 : ']' ;
T60 : 'defaults to' ;
T61 : 'aggregation' ;
T62 : 'subset of' ;
T63 : 'redefines' ;
T64 : '=' ;
T65 : 'instance' ;
T66 : 'specification' ;
T67 : '=>' ;
T68 : 'NULL' ;
T69 : 'active' ;
T70 : 'abstract' ;
T71 : 'extensional' ;
T72 : 'derived' ;
T73 : 'leaf' ;
T74 : 'substitutable' ;
T75 : 'complete' ;
T76 : 'disjoint' ;
T77 : 'static' ;
T78 : 'ordered' ;
T79 : 'unique' ;
T80 : 'read-only' ;
T81 : 'derived-union' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24834
RULE_RWS : (' '|'\t')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24836
RULE_NL : ('\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24838
RULE_WS : (RULE_RWS|RULE_NL)+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24840
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24842
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24844
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24846
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24848
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24850
RULE_ANY_OTHER : .;


