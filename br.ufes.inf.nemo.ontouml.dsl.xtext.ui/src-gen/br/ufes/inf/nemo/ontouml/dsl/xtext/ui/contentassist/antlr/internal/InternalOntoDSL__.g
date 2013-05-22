lexer grammar InternalOntoDSL;
@header {
package br.ufes.inf.nemo.ontouml.dsl.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '*' ;
T12 : '+' ;
T13 : '-' ;
T14 : '/' ;
T15 : 'true' ;
T16 : 'false' ;
T17 : 'none' ;
T18 : 'shared' ;
T19 : 'composite' ;
T20 : 'model' ;
T21 : ';' ;
T22 : 'import' ;
T23 : 'kind' ;
T24 : '{' ;
T25 : '}' ;
T26 : ':' ;
T27 : ',' ;
T28 : 'quantity' ;
T29 : 'collective' ;
T30 : 'subKind' ;
T31 : 'category' ;
T32 : 'phase' ;
T33 : 'role' ;
T34 : 'mixin' ;
T35 : 'roleMixin' ;
T36 : 'mode' ;
T37 : 'relator' ;
T38 : 'mediates' ;
T39 : '[' ;
T40 : '..' ;
T41 : ']' ;
T42 : '->' ;
T43 : 'as' ;
T44 : 'characterization' ;
T45 : 'mode:' ;
T46 : 'characterized:' ;
T47 : 'mediation' ;
T48 : 'relator:' ;
T49 : 'mediated:' ;
T50 : 'derivation' ;
T51 : 'material:' ;
T52 : 'materialAssociation' ;
T53 : 'formalAssociation' ;
T54 : 'datatype' ;
T55 : 'type' ;
T56 : '(' ;
T57 : ')' ;
T58 : 'generalizationSet' ;
T59 : 'op' ;
T60 : 'defaults to' ;
T61 : 'aggregation' ;
T62 : 'subset of' ;
T63 : 'redefines' ;
T64 : 'property' ;
T65 : 'enum' ;
T66 : '=' ;
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

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 20487
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 20489
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 20491
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 20493
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 20495
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 20497
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g" 20499
RULE_ANY_OTHER : .;


