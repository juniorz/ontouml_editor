lexer grammar InternalOntoDSL;
@header {
package br.ufes.inf.nemo.ontouml.dsl.xtext.ui.contentassist.antlr.internal;

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
T40 : 'simpleRelator' ;
T41 : 'mediates' ;
T42 : 'characterization' ;
T43 : 'mode:' ;
T44 : 'characterized:' ;
T45 : 'memberEnd' ;
T46 : 'navigableOwnedEnd' ;
T47 : 'mediation' ;
T48 : 'mediated' ;
T49 : 'derivation' ;
T50 : 'material:' ;
T51 : 'relator:' ;
T52 : 'materialAssociation' ;
T53 : 'formalAssociation' ;
T54 : 'datatype' ;
T55 : 'type' ;
T56 : '(' ;
T57 : ')' ;
T58 : 'generalizationSet' ;
T59 : 'op' ;
T60 : '[' ;
T61 : ']' ;
T62 : 'OpaqueExpression' ;
T63 : 'begin' ;
T64 : 'end' ;
T65 : '#' ;
T66 : 'defaults to' ;
T67 : 'aggregation' ;
T68 : 'subset of' ;
T69 : 'redefines' ;
T70 : '=' ;
T71 : 'instance' ;
T72 : 'specification' ;
T73 : '=>' ;
T74 : 'NULL' ;
T75 : 'active' ;
T76 : 'abstract' ;
T77 : 'extensional' ;
T78 : 'derived' ;
T79 : 'leaf' ;
T80 : 'substitutable' ;
T81 : 'complete' ;
T82 : 'disjoint' ;
T83 : 'static' ;
T84 : 'ordered' ;
T85 : 'unique' ;
T86 : 'read-only' ;
T87 : 'derived-union' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 25023
RULE_RWS : (' '|'\t')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 25025
RULE_NL : ('\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 25027
RULE_WS : (RULE_RWS|RULE_NL)+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 25029
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 25031
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 25033
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 25035
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 25037
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 25039
RULE_ANY_OTHER : .;


