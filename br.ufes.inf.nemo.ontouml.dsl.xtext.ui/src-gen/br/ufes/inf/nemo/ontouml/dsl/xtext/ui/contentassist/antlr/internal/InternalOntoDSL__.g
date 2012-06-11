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
T42 : 'and' ;
T43 : '<' ;
T44 : '>' ;
T45 : 'characterization' ;
T46 : 'mode:' ;
T47 : 'characterized:' ;
T48 : 'mediation' ;
T49 : 'relator:' ;
T50 : 'mediated:' ;
T51 : 'derivation' ;
T52 : 'material:' ;
T53 : 'materialAssociation' ;
T54 : 'formalAssociation' ;
T55 : 'datatype' ;
T56 : 'type' ;
T57 : '(' ;
T58 : ')' ;
T59 : 'generalizationSet' ;
T60 : 'op' ;
T61 : '[' ;
T62 : ']' ;
T63 : 'OpaqueExpression' ;
T64 : 'begin' ;
T65 : 'end' ;
T66 : '#' ;
T67 : 'defaults to' ;
T68 : 'aggregation' ;
T69 : 'subset of' ;
T70 : 'redefines' ;
T71 : '=' ;
T72 : 'instance' ;
T73 : 'specification' ;
T74 : '=>' ;
T75 : 'NULL' ;
T76 : 'active' ;
T77 : 'abstract' ;
T78 : 'extensional' ;
T79 : 'derived' ;
T80 : 'leaf' ;
T81 : 'substitutable' ;
T82 : 'complete' ;
T83 : 'disjoint' ;
T84 : 'static' ;
T85 : 'ordered' ;
T86 : 'unique' ;
T87 : 'read-only' ;
T88 : 'derived-union' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 21968
RULE_RWS : (' '|'\t')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 21970
RULE_NL : ('\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 21972
RULE_WS : (RULE_RWS|RULE_NL)+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 21974
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 21976
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 21978
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 21980
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 21982
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 21984
RULE_ANY_OTHER : .;


