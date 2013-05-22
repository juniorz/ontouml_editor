lexer grammar InternalOntoDSL;
@header {
package br.ufes.inf.nemo.ontouml.dsl.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'model' ;
T12 : ';' ;
T13 : 'import' ;
T14 : 'active' ;
T15 : 'abstract' ;
T16 : 'kind' ;
T17 : ':' ;
T18 : ',' ;
T19 : '{' ;
T20 : '}' ;
T21 : 'quantity' ;
T22 : 'extensional' ;
T23 : 'collective' ;
T24 : 'subKind' ;
T25 : 'category' ;
T26 : 'phase' ;
T27 : 'role' ;
T28 : 'mixin' ;
T29 : 'roleMixin' ;
T30 : 'mode' ;
T31 : 'relator' ;
T32 : 'mediates' ;
T33 : '[' ;
T34 : '..' ;
T35 : ']' ;
T36 : 'as' ;
T37 : '->' ;
T38 : 'characterization' ;
T39 : 'mode:' ;
T40 : 'characterized:' ;
T41 : 'mediation' ;
T42 : 'relator:' ;
T43 : 'mediated:' ;
T44 : 'derivation' ;
T45 : 'material:' ;
T46 : 'derived' ;
T47 : 'leaf' ;
T48 : 'materialAssociation' ;
T49 : 'formalAssociation' ;
T50 : 'datatype' ;
T51 : 'type' ;
T52 : 'substitutable' ;
T53 : '(' ;
T54 : ')' ;
T55 : 'complete' ;
T56 : 'disjoint' ;
T57 : 'generalizationSet' ;
T58 : 'op' ;
T59 : '+' ;
T60 : '-' ;
T61 : '*' ;
T62 : '/' ;
T63 : 'static' ;
T64 : 'ordered' ;
T65 : 'unique' ;
T66 : 'read-only' ;
T67 : 'derived-union' ;
T68 : 'defaults to' ;
T69 : 'aggregation' ;
T70 : 'subset of' ;
T71 : 'redefines' ;
T72 : 'property' ;
T73 : 'enum' ;
T74 : '=' ;
T75 : '=>' ;
T76 : 'true' ;
T77 : 'false' ;
T78 : 'NULL' ;
T79 : 'none' ;
T80 : 'shared' ;
T81 : 'composite' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7150
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7152
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7154
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7156
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7158
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7160
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7162
RULE_ANY_OTHER : .;


