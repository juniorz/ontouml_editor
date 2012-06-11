lexer grammar InternalOntoDSL;
@header {
package br.ufes.inf.nemo.ontouml.dsl.xtext.parser.antlr.internal;

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
T34 : 'simpleRelator' ;
T35 : 'mediates' ;
T36 : 'and' ;
T37 : '<' ;
T38 : '>' ;
T39 : 'characterization' ;
T40 : 'mode:' ;
T41 : 'characterized:' ;
T42 : 'mediation' ;
T43 : 'relator:' ;
T44 : 'mediated:' ;
T45 : 'derivation' ;
T46 : 'material:' ;
T47 : 'derived' ;
T48 : 'leaf' ;
T49 : 'materialAssociation' ;
T50 : 'formalAssociation' ;
T51 : 'datatype' ;
T52 : 'type' ;
T53 : 'substitutable' ;
T54 : '(' ;
T55 : ')' ;
T56 : 'complete' ;
T57 : 'disjoint' ;
T58 : 'generalizationSet' ;
T59 : 'op' ;
T60 : '[' ;
T61 : ']' ;
T62 : '+' ;
T63 : '-' ;
T64 : '*' ;
T65 : '/' ;
T66 : 'OpaqueExpression' ;
T67 : 'begin' ;
T68 : '#' ;
T69 : 'end' ;
T70 : 'static' ;
T71 : 'ordered' ;
T72 : 'unique' ;
T73 : 'read-only' ;
T74 : 'derived-union' ;
T75 : 'defaults to' ;
T76 : 'aggregation' ;
T77 : 'subset of' ;
T78 : 'redefines' ;
T79 : '=' ;
T80 : 'instance' ;
T81 : 'specification' ;
T82 : '=>' ;
T83 : 'true' ;
T84 : 'false' ;
T85 : 'NULL' ;
T86 : 'none' ;
T87 : 'shared' ;
T88 : 'composite' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7566
RULE_RWS : (' '|'\t')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7568
RULE_NL : ('\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7570
RULE_WS : (RULE_RWS|RULE_NL)+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7572
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7574
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7576
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7578
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7580
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 7582
RULE_ANY_OTHER : .;


