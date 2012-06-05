lexer grammar InternalDslOntoUML;
@header {
package br.ufes.inf.nemo.ontouml.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : '*' ;
T14 : '+' ;
T15 : '-' ;
T16 : '/' ;
T17 : 'true' ;
T18 : 'false' ;
T19 : 'none' ;
T20 : 'shared' ;
T21 : 'composite' ;
T22 : 'model' ;
T23 : '{' ;
T24 : '}' ;
T25 : 'viewpoint' ;
T26 : 'kind' ;
T27 : ':' ;
T28 : ',' ;
T29 : ';' ;
T30 : 'quantity' ;
T31 : 'collective' ;
T32 : 'subKind' ;
T33 : 'category' ;
T34 : 'phase' ;
T35 : 'role' ;
T36 : 'mixin' ;
T37 : 'roleMixin' ;
T38 : 'mode' ;
T39 : 'relator' ;
T40 : 'characterization' ;
T41 : 'mode:' ;
T42 : 'characterized:' ;
T43 : 'memberEnd' ;
T44 : 'navigableOwnedEnd' ;
T45 : 'mediation' ;
T46 : 'mediated' ;
T47 : 'derivation' ;
T48 : 'material:' ;
T49 : 'relator:' ;
T50 : 'materialAssociation' ;
T51 : 'formalAssociation' ;
T52 : 'datatype' ;
T53 : 'type' ;
T54 : '(' ;
T55 : ')' ;
T56 : 'generalizationSet' ;
T57 : 'op' ;
T58 : '[' ;
T59 : ']' ;
T60 : 'OpaqueExpression' ;
T61 : 'begin' ;
T62 : 'end' ;
T63 : '#' ;
T64 : 'defaults to' ;
T65 : 'aggregation' ;
T66 : 'subset of' ;
T67 : 'redefines' ;
T68 : '=' ;
T69 : 'instance' ;
T70 : 'specification' ;
T71 : '=>' ;
T72 : 'NULL' ;
T73 : 'active' ;
T74 : 'abstract' ;
T75 : 'extensional' ;
T76 : 'derived' ;
T77 : 'leaf' ;
T78 : 'substitutable' ;
T79 : 'complete' ;
T80 : 'disjoint' ;
T81 : 'static' ;
T82 : 'ordered' ;
T83 : 'unique' ;
T84 : 'read-only' ;
T85 : 'derived-union' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24735
RULE_RWS : (' '|'\t')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24737
RULE_NL : ('\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24739
RULE_WS : (RULE_RWS|RULE_NL)+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24741
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24743
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24745
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24747
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24749
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 24751
RULE_ANY_OTHER : .;


