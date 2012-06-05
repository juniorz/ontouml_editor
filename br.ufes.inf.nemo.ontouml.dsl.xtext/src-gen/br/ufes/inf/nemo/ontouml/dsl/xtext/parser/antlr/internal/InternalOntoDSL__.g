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
T36 : 'derived' ;
T37 : 'leaf' ;
T38 : 'characterization' ;
T39 : 'mode:' ;
T40 : 'characterized:' ;
T41 : 'memberEnd' ;
T42 : 'navigableOwnedEnd' ;
T43 : 'mediation' ;
T44 : 'mediated' ;
T45 : 'derivation' ;
T46 : 'material:' ;
T47 : 'relator:' ;
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
T59 : '[' ;
T60 : ']' ;
T61 : '+' ;
T62 : '-' ;
T63 : '*' ;
T64 : '/' ;
T65 : 'OpaqueExpression' ;
T66 : 'begin' ;
T67 : '#' ;
T68 : 'end' ;
T69 : 'static' ;
T70 : 'ordered' ;
T71 : 'unique' ;
T72 : 'read-only' ;
T73 : 'derived-union' ;
T74 : 'defaults to' ;
T75 : 'aggregation' ;
T76 : 'subset of' ;
T77 : 'redefines' ;
T78 : '=' ;
T79 : 'instance' ;
T80 : 'specification' ;
T81 : '=>' ;
T82 : 'true' ;
T83 : 'false' ;
T84 : 'NULL' ;
T85 : 'none' ;
T86 : 'shared' ;
T87 : 'composite' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 8312
RULE_RWS : (' '|'\t')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 8314
RULE_NL : ('\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 8316
RULE_WS : (RULE_RWS|RULE_NL)+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 8318
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 8320
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 8322
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 8324
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 8326
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g" 8328
RULE_ANY_OTHER : .;


