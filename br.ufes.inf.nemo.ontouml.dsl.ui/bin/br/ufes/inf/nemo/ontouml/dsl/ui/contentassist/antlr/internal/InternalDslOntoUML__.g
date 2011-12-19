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
T19 : 'public' ;
T20 : 'private' ;
T21 : 'protected' ;
T22 : 'package' ;
T23 : 'model' ;
T24 : '{' ;
T25 : '}' ;
T26 : 'viewpoint' ;
T27 : 'kind' ;
T28 : ':' ;
T29 : ',' ;
T30 : 'attributes' ;
T31 : ';' ;
T32 : 'quantity' ;
T33 : 'collective' ;
T34 : 'subKind' ;
T35 : 'category' ;
T36 : 'phase' ;
T37 : 'role' ;
T38 : 'mixin' ;
T39 : 'roleMixin' ;
T40 : 'mode' ;
T41 : 'relator' ;
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
T54 : '(' ;
T55 : ')' ;
T56 : 'generalizationSet' ;
T57 : 'OpaqueExpression' ;
T58 : 'begin' ;
T59 : 'end' ;
T60 : '#' ;
T61 : '[' ;
T62 : ']' ;
T63 : 'defaults to' ;
T64 : 'aggregation' ;
T65 : 'subset of' ;
T66 : 'redefines' ;
T67 : '=' ;
T68 : '=>' ;
T69 : 'instance' ;
T70 : 'NULL' ;
T71 : 'active' ;
T72 : 'abstract' ;
T73 : 'extensional' ;
T74 : 'derived' ;
T75 : 'leaf' ;
T76 : 'substitutable' ;
T77 : 'complete' ;
T78 : 'disjoint' ;
T79 : 'static' ;
T80 : 'ordered' ;
T81 : 'unique' ;
T82 : 'read-only' ;
T83 : 'derived-union' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 25584
RULE_RWS : (' '|'\t')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 25586
RULE_NL : ('\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 25588
RULE_WS : (RULE_RWS|RULE_NL)+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 25590
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 25592
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 25594
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 25596
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 25598
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 25600
RULE_ANY_OTHER : .;


