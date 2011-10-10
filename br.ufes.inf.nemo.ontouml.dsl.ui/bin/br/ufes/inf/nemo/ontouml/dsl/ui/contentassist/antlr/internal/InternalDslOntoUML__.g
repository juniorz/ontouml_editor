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
T27 : 'datatype' ;
T28 : 'attributes:' ;
T29 : 'Dependency' ;
T30 : 'depends on' ;
T31 : '(' ;
T32 : ')' ;
T33 : ',' ;
T34 : 'constraint' ;
T35 : 'merge' ;
T36 : ':' ;
T37 : 'generalizationSet' ;
T38 : 'OpaqueExpression' ;
T39 : 'begin' ;
T40 : 'end' ;
T41 : '#' ;
T42 : 'property' ;
T43 : '<' ;
T44 : '>' ;
T45 : '[' ;
T46 : ']' ;
T47 : 'defaults to' ;
T48 : 'aggregation' ;
T49 : 'subset of' ;
T50 : 'redefines' ;
T51 : 'mediation' ;
T52 : ';' ;
T53 : 'memberEnd' ;
T54 : 'navigableOwnedEnd' ;
T55 : 'derivation' ;
T56 : 'material:' ;
T57 : 'relator:' ;
T58 : 'materialAssociation' ;
T59 : 'formalAssociation' ;
T60 : '=' ;
T61 : 'instance' ;
T62 : 'specification' ;
T63 : '=>' ;
T64 : 'NULL' ;
T65 : 'subkind' ;
T66 : 'kind' ;
T67 : 'quantity' ;
T68 : 'collective' ;
T69 : 'phase' ;
T70 : 'role' ;
T71 : 'category' ;
T72 : 'ownedAttribute' ;
T73 : 'roleMixin' ;
T74 : 'mixin' ;
T75 : 'mode' ;
T76 : 'relator' ;
T77 : 'Characterization' ;
T78 : 'ownedEnd' ;
T79 : 'substitutable' ;
T80 : 'complete' ;
T81 : 'disjoint' ;
T82 : 'static' ;
T83 : 'ordered' ;
T84 : 'unique' ;
T85 : 'read-only' ;
T86 : 'derived-union' ;
T87 : 'derived' ;
T88 : 'abstract' ;
T89 : 'leaf' ;
T90 : 'active' ;
T91 : 'extensional' ;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 22765
RULE_RWS : (' '|'\t')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 22767
RULE_NL : ('\r'|'\n')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 22769
RULE_WS : (RULE_RWS|RULE_NL)+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 22771
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 22773
RULE_INT : ('0'..'9')+;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 22775
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 22777
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 22779
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../br.ufes.inf.nemo.ontouml.dsl.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/ui/contentassist/antlr/internal/InternalDslOntoUML.g" 22781
RULE_ANY_OTHER : .;


