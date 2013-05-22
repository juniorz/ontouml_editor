package br.ufes.inf.nemo.ontouml.dsl.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoDSLLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int RULE_ID=4;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T21=21;
    public static final int T71=71;
    public static final int T20=20;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=82;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T81=81;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T80=80;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalOntoDSLLexer() {;} 
    public InternalOntoDSLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:10:5: ( 'model' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:10:7: 'model'
            {
            match("model"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:11:5: ( ';' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:11:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:12:5: ( 'import' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:12:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:13:5: ( 'active' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:13:7: 'active'
            {
            match("active"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:14:5: ( 'abstract' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:14:7: 'abstract'
            {
            match("abstract"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:15:5: ( 'kind' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:15:7: 'kind'
            {
            match("kind"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:16:5: ( ':' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:16:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:17:5: ( ',' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:17:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:18:5: ( '{' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:18:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:19:5: ( '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:19:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:20:5: ( 'quantity' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:20:7: 'quantity'
            {
            match("quantity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:21:5: ( 'extensional' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:21:7: 'extensional'
            {
            match("extensional"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:22:5: ( 'collective' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:22:7: 'collective'
            {
            match("collective"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:23:5: ( 'subKind' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:23:7: 'subKind'
            {
            match("subKind"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:24:5: ( 'category' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:24:7: 'category'
            {
            match("category"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:25:5: ( 'phase' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:25:7: 'phase'
            {
            match("phase"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:26:5: ( 'role' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:26:7: 'role'
            {
            match("role"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:27:5: ( 'mixin' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:27:7: 'mixin'
            {
            match("mixin"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:28:5: ( 'roleMixin' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:28:7: 'roleMixin'
            {
            match("roleMixin"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:29:5: ( 'mode' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:29:7: 'mode'
            {
            match("mode"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:30:5: ( 'relator' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:30:7: 'relator'
            {
            match("relator"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:31:5: ( 'mediates' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:31:7: 'mediates'
            {
            match("mediates"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:32:5: ( '[' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:32:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:33:5: ( '..' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:33:7: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:34:5: ( ']' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:34:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:35:5: ( 'as' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:35:7: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:36:5: ( '->' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:36:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:37:5: ( 'characterization' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:37:7: 'characterization'
            {
            match("characterization"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:38:5: ( 'mode:' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:38:7: 'mode:'
            {
            match("mode:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:39:5: ( 'characterized:' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:39:7: 'characterized:'
            {
            match("characterized:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:40:5: ( 'mediation' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:40:7: 'mediation'
            {
            match("mediation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:41:5: ( 'relator:' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:41:7: 'relator:'
            {
            match("relator:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:42:5: ( 'mediated:' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:42:7: 'mediated:'
            {
            match("mediated:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:43:5: ( 'derivation' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:43:7: 'derivation'
            {
            match("derivation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:44:5: ( 'material:' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:44:7: 'material:'
            {
            match("material:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:45:5: ( 'derived' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:45:7: 'derived'
            {
            match("derived"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:46:5: ( 'leaf' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:46:7: 'leaf'
            {
            match("leaf"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:47:5: ( 'materialAssociation' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:47:7: 'materialAssociation'
            {
            match("materialAssociation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:48:5: ( 'formalAssociation' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:48:7: 'formalAssociation'
            {
            match("formalAssociation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:49:5: ( 'datatype' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:49:7: 'datatype'
            {
            match("datatype"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:50:5: ( 'type' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:50:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:51:5: ( 'substitutable' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:51:7: 'substitutable'
            {
            match("substitutable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:52:5: ( '(' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:52:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:53:5: ( ')' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:53:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:54:5: ( 'complete' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:54:7: 'complete'
            {
            match("complete"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:55:5: ( 'disjoint' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:55:7: 'disjoint'
            {
            match("disjoint"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:56:5: ( 'generalizationSet' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:56:7: 'generalizationSet'
            {
            match("generalizationSet"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:57:5: ( 'op' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:57:7: 'op'
            {
            match("op"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:58:5: ( '+' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:58:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:59:5: ( '-' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:59:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:60:5: ( '*' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:60:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:61:5: ( '/' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:61:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:62:5: ( 'static' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:62:7: 'static'
            {
            match("static"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:63:5: ( 'ordered' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:63:7: 'ordered'
            {
            match("ordered"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:64:5: ( 'unique' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:64:7: 'unique'
            {
            match("unique"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:65:5: ( 'read-only' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:65:7: 'read-only'
            {
            match("read-only"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:66:5: ( 'derived-union' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:66:7: 'derived-union'
            {
            match("derived-union"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:67:5: ( 'defaults to' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:67:7: 'defaults to'
            {
            match("defaults to"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:68:5: ( 'aggregation' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:68:7: 'aggregation'
            {
            match("aggregation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:69:5: ( 'subset of' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:69:7: 'subset of'
            {
            match("subset of"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:70:5: ( 'redefines' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:70:7: 'redefines'
            {
            match("redefines"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:71:5: ( 'property' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:71:7: 'property'
            {
            match("property"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:72:5: ( 'enum' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:72:7: 'enum'
            {
            match("enum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:73:5: ( '=' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:73:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:74:5: ( '=>' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:74:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:75:5: ( 'true' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:75:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:76:5: ( 'false' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:76:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:77:5: ( 'NULL' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:77:7: 'NULL'
            {
            match("NULL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:78:5: ( 'none' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:78:7: 'none'
            {
            match("none"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:79:5: ( 'shared' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:79:7: 'shared'
            {
            match("shared"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:80:5: ( 'composite' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:80:7: 'composite'
            {
            match("composite"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7150:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7150:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7150:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7150:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7150:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7152:10: ( ( '0' .. '9' )+ )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7152:12: ( '0' .. '9' )+
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7152:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7152:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7154:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7154:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7154:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("7154:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7154:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7154:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7154:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7154:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7154:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7154:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7154:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7154:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7156:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7156:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7156:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7156:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7158:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7158:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7158:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7158:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7158:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7158:41: ( '\\r' )? '\\n'
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7158:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7158:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7160:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7162:16: ( . )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7162:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=78;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='m') ) {
            alt12 = mTokensHelper001();
        }
        else if ( (LA12_0==';') ) {
            alt12 = mTokensHelper002();
        }
        else if ( (LA12_0=='i') ) {
            alt12 = mTokensHelper003();
        }
        else if ( (LA12_0=='a') ) {
            alt12 = mTokensHelper004();
        }
        else if ( (LA12_0=='k') ) {
            alt12 = mTokensHelper005();
        }
        else if ( (LA12_0==':') ) {
            alt12 = mTokensHelper006();
        }
        else if ( (LA12_0==',') ) {
            alt12 = mTokensHelper007();
        }
        else if ( (LA12_0=='{') ) {
            alt12 = mTokensHelper008();
        }
        else if ( (LA12_0=='}') ) {
            alt12 = mTokensHelper009();
        }
        else if ( (LA12_0=='q') ) {
            alt12 = mTokensHelper010();
        }
        else if ( (LA12_0=='e') ) {
            alt12 = mTokensHelper011();
        }
        else if ( (LA12_0=='c') ) {
            alt12 = mTokensHelper012();
        }
        else if ( (LA12_0=='s') ) {
            alt12 = mTokensHelper013();
        }
        else if ( (LA12_0=='p') ) {
            alt12 = mTokensHelper014();
        }
        else if ( (LA12_0=='r') ) {
            alt12 = mTokensHelper015();
        }
        else if ( (LA12_0=='[') ) {
            alt12 = mTokensHelper016();
        }
        else if ( (LA12_0=='.') ) {
            alt12 = mTokensHelper017();
        }
        else if ( (LA12_0==']') ) {
            alt12 = mTokensHelper018();
        }
        else if ( (LA12_0=='-') ) {
            alt12 = mTokensHelper019();
        }
        else if ( (LA12_0=='d') ) {
            alt12 = mTokensHelper020();
        }
        else if ( (LA12_0=='l') ) {
            alt12 = mTokensHelper021();
        }
        else if ( (LA12_0=='f') ) {
            alt12 = mTokensHelper022();
        }
        else if ( (LA12_0=='t') ) {
            alt12 = mTokensHelper023();
        }
        else if ( (LA12_0=='(') ) {
            alt12 = mTokensHelper024();
        }
        else if ( (LA12_0==')') ) {
            alt12 = mTokensHelper025();
        }
        else if ( (LA12_0=='g') ) {
            alt12 = mTokensHelper026();
        }
        else if ( (LA12_0=='o') ) {
            alt12 = mTokensHelper027();
        }
        else if ( (LA12_0=='+') ) {
            alt12 = mTokensHelper028();
        }
        else if ( (LA12_0=='*') ) {
            alt12 = mTokensHelper029();
        }
        else if ( (LA12_0=='/') ) {
            alt12 = mTokensHelper030();
        }
        else if ( (LA12_0=='u') ) {
            alt12 = mTokensHelper031();
        }
        else if ( (LA12_0=='=') ) {
            alt12 = mTokensHelper032();
        }
        else if ( (LA12_0=='N') ) {
            alt12 = mTokensHelper033();
        }
        else if ( (LA12_0=='n') ) {
            alt12 = mTokensHelper034();
        }
        else if ( (LA12_0=='^') ) {
            alt12 = mTokensHelper035();
        }
        else if ( ((LA12_0>='A' && LA12_0<='M')||(LA12_0>='O' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='h'||LA12_0=='j'||(LA12_0>='v' && LA12_0<='z')) ) {
            alt12 = mTokensHelper036();
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12 = mTokensHelper037();
        }
        else if ( (LA12_0=='\"') ) {
            alt12 = mTokensHelper038();
        }
        else if ( (LA12_0=='\'') ) {
            alt12 = mTokensHelper039();
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12 = mTokensHelper040();
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12 = mTokensHelper041();
        }
        else {
            alt12 = mTokensHelper042();
        }
        switch (alt12) {
            case 1 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:218: T63
                {
                mT63(); 

                }
                break;
            case 54 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:222: T64
                {
                mT64(); 

                }
                break;
            case 55 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:226: T65
                {
                mT65(); 

                }
                break;
            case 56 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:230: T66
                {
                mT66(); 

                }
                break;
            case 57 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:234: T67
                {
                mT67(); 

                }
                break;
            case 58 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:238: T68
                {
                mT68(); 

                }
                break;
            case 59 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:242: T69
                {
                mT69(); 

                }
                break;
            case 60 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:246: T70
                {
                mT70(); 

                }
                break;
            case 61 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:250: T71
                {
                mT71(); 

                }
                break;
            case 62 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:254: T72
                {
                mT72(); 

                }
                break;
            case 63 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:258: T73
                {
                mT73(); 

                }
                break;
            case 64 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:262: T74
                {
                mT74(); 

                }
                break;
            case 65 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:266: T75
                {
                mT75(); 

                }
                break;
            case 66 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:270: T76
                {
                mT76(); 

                }
                break;
            case 67 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:274: T77
                {
                mT77(); 

                }
                break;
            case 68 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:278: T78
                {
                mT78(); 

                }
                break;
            case 69 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:282: T79
                {
                mT79(); 

                }
                break;
            case 70 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:286: T80
                {
                mT80(); 

                }
                break;
            case 71 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:290: T81
                {
                mT81(); 

                }
                break;
            case 72 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:294: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 73 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:302: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 74 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:311: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:323: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:339: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 77 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:355: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1:363: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            int LA12_42 = input.LA(3);

            if ( (LA12_42=='d') ) {
                int LA12_102 = input.LA(4);

                if ( (LA12_102=='i') ) {
                    int LA12_143 = input.LA(5);

                    if ( (LA12_143=='a') ) {
                        int LA12_183 = input.LA(6);

                        if ( (LA12_183=='t') ) {
                            switch ( input.LA(7) ) {
                            case 'i':
                                {
                                int LA12_263 = input.LA(8);

                                if ( (LA12_263=='o') ) {
                                    int LA12_295 = input.LA(9);

                                    if ( (LA12_295=='n') ) {
                                        int LA12_324 = input.LA(10);

                                        if ( ((LA12_324>='0' && LA12_324<='9')||(LA12_324>='A' && LA12_324<='Z')||LA12_324=='_'||(LA12_324>='a' && LA12_324<='z')) ) {
                                            return 72;
                                        }
                                        else {
                                            return 31;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                                }
                            case 'e':
                                {
                                switch ( input.LA(8) ) {
                                case 'd':
                                    {
                                    int LA12_296 = input.LA(9);

                                    if ( (LA12_296==':') ) {
                                        return 33;
                                    }
                                    else {
                                        return 72;}
                                    }
                                case 's':
                                    {
                                    int LA12_297 = input.LA(9);

                                    if ( ((LA12_297>='0' && LA12_297<='9')||(LA12_297>='A' && LA12_297<='Z')||LA12_297=='_'||(LA12_297>='a' && LA12_297<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 22;}
                                    }
                                default:
                                    return 72;}

                                }
                            default:
                                return 72;}

                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'i':
            {
            int LA12_43 = input.LA(3);

            if ( (LA12_43=='x') ) {
                int LA12_103 = input.LA(4);

                if ( (LA12_103=='i') ) {
                    int LA12_144 = input.LA(5);

                    if ( (LA12_144=='n') ) {
                        int LA12_184 = input.LA(6);

                        if ( ((LA12_184>='0' && LA12_184<='9')||(LA12_184>='A' && LA12_184<='Z')||LA12_184=='_'||(LA12_184>='a' && LA12_184<='z')) ) {
                            return 72;
                        }
                        else {
                            return 18;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'o':
            {
            int LA12_44 = input.LA(3);

            if ( (LA12_44=='d') ) {
                int LA12_104 = input.LA(4);

                if ( (LA12_104=='e') ) {
                    switch ( input.LA(5) ) {
                    case ':':
                        {
                        return 29;
                        }
                    case 'l':
                        {
                        int LA12_186 = input.LA(6);

                        if ( ((LA12_186>='0' && LA12_186<='9')||(LA12_186>='A' && LA12_186<='Z')||LA12_186=='_'||(LA12_186>='a' && LA12_186<='z')) ) {
                            return 72;
                        }
                        else {
                            return 1;}
                        }
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        return 72;
                        }
                    default:
                        return 20;}

                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'a':
            {
            int LA12_45 = input.LA(3);

            if ( (LA12_45=='t') ) {
                int LA12_105 = input.LA(4);

                if ( (LA12_105=='e') ) {
                    int LA12_146 = input.LA(5);

                    if ( (LA12_146=='r') ) {
                        int LA12_188 = input.LA(6);

                        if ( (LA12_188=='i') ) {
                            int LA12_231 = input.LA(7);

                            if ( (LA12_231=='a') ) {
                                int LA12_265 = input.LA(8);

                                if ( (LA12_265=='l') ) {
                                    switch ( input.LA(9) ) {
                                    case 'A':
                                        {
                                        int LA12_327 = input.LA(10);

                                        if ( (LA12_327=='s') ) {
                                            int LA12_349 = input.LA(11);

                                            if ( (LA12_349=='s') ) {
                                                int LA12_361 = input.LA(12);

                                                if ( (LA12_361=='o') ) {
                                                    int LA12_370 = input.LA(13);

                                                    if ( (LA12_370=='c') ) {
                                                        int LA12_378 = input.LA(14);

                                                        if ( (LA12_378=='i') ) {
                                                            int LA12_384 = input.LA(15);

                                                            if ( (LA12_384=='a') ) {
                                                                int LA12_390 = input.LA(16);

                                                                if ( (LA12_390=='t') ) {
                                                                    int LA12_394 = input.LA(17);

                                                                    if ( (LA12_394=='i') ) {
                                                                        int LA12_398 = input.LA(18);

                                                                        if ( (LA12_398=='o') ) {
                                                                            int LA12_402 = input.LA(19);

                                                                            if ( (LA12_402=='n') ) {
                                                                                int LA12_405 = input.LA(20);

                                                                                if ( ((LA12_405>='0' && LA12_405<='9')||(LA12_405>='A' && LA12_405<='Z')||LA12_405=='_'||(LA12_405>='a' && LA12_405<='z')) ) {
                                                                                    return 72;
                                                                                }
                                                                                else {
                                                                                    return 38;}
                                                                            }
                                                                            else {
                                                                                return 72;}
                                                                        }
                                                                        else {
                                                                            return 72;}
                                                                    }
                                                                    else {
                                                                        return 72;}
                                                                }
                                                                else {
                                                                    return 72;}
                                                            }
                                                            else {
                                                                return 72;}
                                                        }
                                                        else {
                                                            return 72;}
                                                    }
                                                    else {
                                                        return 72;}
                                                }
                                                else {
                                                    return 72;}
                                            }
                                            else {
                                                return 72;}
                                        }
                                        else {
                                            return 72;}
                                        }
                                    case ':':
                                        {
                                        return 35;
                                        }
                                    default:
                                        return 72;}

                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper002() throws RecognitionException {
        return 2;
    }

    private int mTokensHelper003() throws RecognitionException {
        int LA12_3 = input.LA(2);

        if ( (LA12_3=='m') ) {
            int LA12_48 = input.LA(3);

            if ( (LA12_48=='p') ) {
                int LA12_106 = input.LA(4);

                if ( (LA12_106=='o') ) {
                    int LA12_147 = input.LA(5);

                    if ( (LA12_147=='r') ) {
                        int LA12_189 = input.LA(6);

                        if ( (LA12_189=='t') ) {
                            int LA12_232 = input.LA(7);

                            if ( ((LA12_232>='0' && LA12_232<='9')||(LA12_232>='A' && LA12_232<='Z')||LA12_232=='_'||(LA12_232>='a' && LA12_232<='z')) ) {
                                return 72;
                            }
                            else {
                                return 3;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
        }
        else {
            return 72;}
    }

    private int mTokensHelper004() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'c':
            {
            int LA12_49 = input.LA(3);

            if ( (LA12_49=='t') ) {
                int LA12_107 = input.LA(4);

                if ( (LA12_107=='i') ) {
                    int LA12_148 = input.LA(5);

                    if ( (LA12_148=='v') ) {
                        int LA12_190 = input.LA(6);

                        if ( (LA12_190=='e') ) {
                            int LA12_233 = input.LA(7);

                            if ( ((LA12_233>='0' && LA12_233<='9')||(LA12_233>='A' && LA12_233<='Z')||LA12_233=='_'||(LA12_233>='a' && LA12_233<='z')) ) {
                                return 72;
                            }
                            else {
                                return 4;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'b':
            {
            int LA12_50 = input.LA(3);

            if ( (LA12_50=='s') ) {
                int LA12_108 = input.LA(4);

                if ( (LA12_108=='t') ) {
                    int LA12_149 = input.LA(5);

                    if ( (LA12_149=='r') ) {
                        int LA12_191 = input.LA(6);

                        if ( (LA12_191=='a') ) {
                            int LA12_234 = input.LA(7);

                            if ( (LA12_234=='c') ) {
                                int LA12_268 = input.LA(8);

                                if ( (LA12_268=='t') ) {
                                    int LA12_299 = input.LA(9);

                                    if ( ((LA12_299>='0' && LA12_299<='9')||(LA12_299>='A' && LA12_299<='Z')||LA12_299=='_'||(LA12_299>='a' && LA12_299<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 5;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 's':
            {
            int LA12_51 = input.LA(3);

            if ( ((LA12_51>='0' && LA12_51<='9')||(LA12_51>='A' && LA12_51<='Z')||LA12_51=='_'||(LA12_51>='a' && LA12_51<='z')) ) {
                return 72;
            }
            else {
                return 26;}
            }
        case 'g':
            {
            int LA12_52 = input.LA(3);

            if ( (LA12_52=='g') ) {
                int LA12_110 = input.LA(4);

                if ( (LA12_110=='r') ) {
                    int LA12_150 = input.LA(5);

                    if ( (LA12_150=='e') ) {
                        int LA12_192 = input.LA(6);

                        if ( (LA12_192=='g') ) {
                            int LA12_235 = input.LA(7);

                            if ( (LA12_235=='a') ) {
                                int LA12_269 = input.LA(8);

                                if ( (LA12_269=='t') ) {
                                    int LA12_300 = input.LA(9);

                                    if ( (LA12_300=='i') ) {
                                        int LA12_330 = input.LA(10);

                                        if ( (LA12_330=='o') ) {
                                            int LA12_350 = input.LA(11);

                                            if ( (LA12_350=='n') ) {
                                                int LA12_362 = input.LA(12);

                                                if ( ((LA12_362>='0' && LA12_362<='9')||(LA12_362>='A' && LA12_362<='Z')||LA12_362=='_'||(LA12_362>='a' && LA12_362<='z')) ) {
                                                    return 72;
                                                }
                                                else {
                                                    return 59;}
                                            }
                                            else {
                                                return 72;}
                                        }
                                        else {
                                            return 72;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper005() throws RecognitionException {
        int LA12_5 = input.LA(2);

        if ( (LA12_5=='i') ) {
            int LA12_53 = input.LA(3);

            if ( (LA12_53=='n') ) {
                int LA12_111 = input.LA(4);

                if ( (LA12_111=='d') ) {
                    int LA12_151 = input.LA(5);

                    if ( ((LA12_151>='0' && LA12_151<='9')||(LA12_151>='A' && LA12_151<='Z')||LA12_151=='_'||(LA12_151>='a' && LA12_151<='z')) ) {
                        return 72;
                    }
                    else {
                        return 6;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
        }
        else {
            return 72;}
    }

    private int mTokensHelper006() throws RecognitionException {
        return 7;
    }

    private int mTokensHelper007() throws RecognitionException {
        return 8;
    }

    private int mTokensHelper008() throws RecognitionException {
        return 9;
    }

    private int mTokensHelper009() throws RecognitionException {
        return 10;
    }

    private int mTokensHelper010() throws RecognitionException {
        int LA12_10 = input.LA(2);

        if ( (LA12_10=='u') ) {
            int LA12_58 = input.LA(3);

            if ( (LA12_58=='a') ) {
                int LA12_112 = input.LA(4);

                if ( (LA12_112=='n') ) {
                    int LA12_152 = input.LA(5);

                    if ( (LA12_152=='t') ) {
                        int LA12_194 = input.LA(6);

                        if ( (LA12_194=='i') ) {
                            int LA12_236 = input.LA(7);

                            if ( (LA12_236=='t') ) {
                                int LA12_270 = input.LA(8);

                                if ( (LA12_270=='y') ) {
                                    int LA12_301 = input.LA(9);

                                    if ( ((LA12_301>='0' && LA12_301<='9')||(LA12_301>='A' && LA12_301<='Z')||LA12_301=='_'||(LA12_301>='a' && LA12_301<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 11;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
        }
        else {
            return 72;}
    }

    private int mTokensHelper011() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'x':
            {
            int LA12_59 = input.LA(3);

            if ( (LA12_59=='t') ) {
                int LA12_113 = input.LA(4);

                if ( (LA12_113=='e') ) {
                    int LA12_153 = input.LA(5);

                    if ( (LA12_153=='n') ) {
                        int LA12_195 = input.LA(6);

                        if ( (LA12_195=='s') ) {
                            int LA12_237 = input.LA(7);

                            if ( (LA12_237=='i') ) {
                                int LA12_271 = input.LA(8);

                                if ( (LA12_271=='o') ) {
                                    int LA12_302 = input.LA(9);

                                    if ( (LA12_302=='n') ) {
                                        int LA12_332 = input.LA(10);

                                        if ( (LA12_332=='a') ) {
                                            int LA12_351 = input.LA(11);

                                            if ( (LA12_351=='l') ) {
                                                int LA12_363 = input.LA(12);

                                                if ( ((LA12_363>='0' && LA12_363<='9')||(LA12_363>='A' && LA12_363<='Z')||LA12_363=='_'||(LA12_363>='a' && LA12_363<='z')) ) {
                                                    return 72;
                                                }
                                                else {
                                                    return 12;}
                                            }
                                            else {
                                                return 72;}
                                        }
                                        else {
                                            return 72;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'n':
            {
            int LA12_60 = input.LA(3);

            if ( (LA12_60=='u') ) {
                int LA12_114 = input.LA(4);

                if ( (LA12_114=='m') ) {
                    int LA12_154 = input.LA(5);

                    if ( ((LA12_154>='0' && LA12_154<='9')||(LA12_154>='A' && LA12_154<='Z')||LA12_154=='_'||(LA12_154>='a' && LA12_154<='z')) ) {
                        return 72;
                    }
                    else {
                        return 63;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper012() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'o':
            {
            switch ( input.LA(3) ) {
            case 'l':
                {
                int LA12_115 = input.LA(4);

                if ( (LA12_115=='l') ) {
                    int LA12_155 = input.LA(5);

                    if ( (LA12_155=='e') ) {
                        int LA12_197 = input.LA(6);

                        if ( (LA12_197=='c') ) {
                            int LA12_238 = input.LA(7);

                            if ( (LA12_238=='t') ) {
                                int LA12_272 = input.LA(8);

                                if ( (LA12_272=='i') ) {
                                    int LA12_303 = input.LA(9);

                                    if ( (LA12_303=='v') ) {
                                        int LA12_333 = input.LA(10);

                                        if ( (LA12_333=='e') ) {
                                            int LA12_352 = input.LA(11);

                                            if ( ((LA12_352>='0' && LA12_352<='9')||(LA12_352>='A' && LA12_352<='Z')||LA12_352=='_'||(LA12_352>='a' && LA12_352<='z')) ) {
                                                return 72;
                                            }
                                            else {
                                                return 13;}
                                        }
                                        else {
                                            return 72;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
                }
            case 'm':
                {
                int LA12_116 = input.LA(4);

                if ( (LA12_116=='p') ) {
                    switch ( input.LA(5) ) {
                    case 'l':
                        {
                        int LA12_198 = input.LA(6);

                        if ( (LA12_198=='e') ) {
                            int LA12_239 = input.LA(7);

                            if ( (LA12_239=='t') ) {
                                int LA12_273 = input.LA(8);

                                if ( (LA12_273=='e') ) {
                                    int LA12_304 = input.LA(9);

                                    if ( ((LA12_304>='0' && LA12_304<='9')||(LA12_304>='A' && LA12_304<='Z')||LA12_304=='_'||(LA12_304>='a' && LA12_304<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 45;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                        }
                    case 'o':
                        {
                        int LA12_199 = input.LA(6);

                        if ( (LA12_199=='s') ) {
                            int LA12_240 = input.LA(7);

                            if ( (LA12_240=='i') ) {
                                int LA12_274 = input.LA(8);

                                if ( (LA12_274=='t') ) {
                                    int LA12_305 = input.LA(9);

                                    if ( (LA12_305=='e') ) {
                                        int LA12_335 = input.LA(10);

                                        if ( ((LA12_335>='0' && LA12_335<='9')||(LA12_335>='A' && LA12_335<='Z')||LA12_335=='_'||(LA12_335>='a' && LA12_335<='z')) ) {
                                            return 72;
                                        }
                                        else {
                                            return 71;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                        }
                    default:
                        return 72;}

                }
                else {
                    return 72;}
                }
            default:
                return 72;}

            }
        case 'a':
            {
            int LA12_62 = input.LA(3);

            if ( (LA12_62=='t') ) {
                int LA12_117 = input.LA(4);

                if ( (LA12_117=='e') ) {
                    int LA12_157 = input.LA(5);

                    if ( (LA12_157=='g') ) {
                        int LA12_200 = input.LA(6);

                        if ( (LA12_200=='o') ) {
                            int LA12_241 = input.LA(7);

                            if ( (LA12_241=='r') ) {
                                int LA12_275 = input.LA(8);

                                if ( (LA12_275=='y') ) {
                                    int LA12_306 = input.LA(9);

                                    if ( ((LA12_306>='0' && LA12_306<='9')||(LA12_306>='A' && LA12_306<='Z')||LA12_306=='_'||(LA12_306>='a' && LA12_306<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 15;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'h':
            {
            int LA12_63 = input.LA(3);

            if ( (LA12_63=='a') ) {
                int LA12_118 = input.LA(4);

                if ( (LA12_118=='r') ) {
                    int LA12_158 = input.LA(5);

                    if ( (LA12_158=='a') ) {
                        int LA12_201 = input.LA(6);

                        if ( (LA12_201=='c') ) {
                            int LA12_242 = input.LA(7);

                            if ( (LA12_242=='t') ) {
                                int LA12_276 = input.LA(8);

                                if ( (LA12_276=='e') ) {
                                    int LA12_307 = input.LA(9);

                                    if ( (LA12_307=='r') ) {
                                        int LA12_337 = input.LA(10);

                                        if ( (LA12_337=='i') ) {
                                            int LA12_354 = input.LA(11);

                                            if ( (LA12_354=='z') ) {
                                                switch ( input.LA(12) ) {
                                                case 'a':
                                                    {
                                                    int LA12_373 = input.LA(13);

                                                    if ( (LA12_373=='t') ) {
                                                        int LA12_379 = input.LA(14);

                                                        if ( (LA12_379=='i') ) {
                                                            int LA12_385 = input.LA(15);

                                                            if ( (LA12_385=='o') ) {
                                                                int LA12_391 = input.LA(16);

                                                                if ( (LA12_391=='n') ) {
                                                                    int LA12_395 = input.LA(17);

                                                                    if ( ((LA12_395>='0' && LA12_395<='9')||(LA12_395>='A' && LA12_395<='Z')||LA12_395=='_'||(LA12_395>='a' && LA12_395<='z')) ) {
                                                                        return 72;
                                                                    }
                                                                    else {
                                                                        return 28;}
                                                                }
                                                                else {
                                                                    return 72;}
                                                            }
                                                            else {
                                                                return 72;}
                                                        }
                                                        else {
                                                            return 72;}
                                                    }
                                                    else {
                                                        return 72;}
                                                    }
                                                case 'e':
                                                    {
                                                    int LA12_374 = input.LA(13);

                                                    if ( (LA12_374=='d') ) {
                                                        int LA12_380 = input.LA(14);

                                                        if ( (LA12_380==':') ) {
                                                            return 30;
                                                        }
                                                        else {
                                                            return 72;}
                                                    }
                                                    else {
                                                        return 72;}
                                                    }
                                                default:
                                                    return 72;}

                                            }
                                            else {
                                                return 72;}
                                        }
                                        else {
                                            return 72;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper013() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'u':
            {
            int LA12_64 = input.LA(3);

            if ( (LA12_64=='b') ) {
                switch ( input.LA(4) ) {
                case 's':
                    {
                    switch ( input.LA(5) ) {
                    case 'e':
                        {
                        int LA12_202 = input.LA(6);

                        if ( (LA12_202=='t') ) {
                            int LA12_243 = input.LA(7);

                            if ( (LA12_243==' ') ) {
                                return 60;
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                        }
                    case 't':
                        {
                        int LA12_203 = input.LA(6);

                        if ( (LA12_203=='i') ) {
                            int LA12_244 = input.LA(7);

                            if ( (LA12_244=='t') ) {
                                int LA12_278 = input.LA(8);

                                if ( (LA12_278=='u') ) {
                                    int LA12_308 = input.LA(9);

                                    if ( (LA12_308=='t') ) {
                                        int LA12_338 = input.LA(10);

                                        if ( (LA12_338=='a') ) {
                                            int LA12_355 = input.LA(11);

                                            if ( (LA12_355=='b') ) {
                                                int LA12_366 = input.LA(12);

                                                if ( (LA12_366=='l') ) {
                                                    int LA12_375 = input.LA(13);

                                                    if ( (LA12_375=='e') ) {
                                                        int LA12_381 = input.LA(14);

                                                        if ( ((LA12_381>='0' && LA12_381<='9')||(LA12_381>='A' && LA12_381<='Z')||LA12_381=='_'||(LA12_381>='a' && LA12_381<='z')) ) {
                                                            return 72;
                                                        }
                                                        else {
                                                            return 42;}
                                                    }
                                                    else {
                                                        return 72;}
                                                }
                                                else {
                                                    return 72;}
                                            }
                                            else {
                                                return 72;}
                                        }
                                        else {
                                            return 72;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                        }
                    default:
                        return 72;}

                    }
                case 'K':
                    {
                    int LA12_160 = input.LA(5);

                    if ( (LA12_160=='i') ) {
                        int LA12_204 = input.LA(6);

                        if ( (LA12_204=='n') ) {
                            int LA12_245 = input.LA(7);

                            if ( (LA12_245=='d') ) {
                                int LA12_279 = input.LA(8);

                                if ( ((LA12_279>='0' && LA12_279<='9')||(LA12_279>='A' && LA12_279<='Z')||LA12_279=='_'||(LA12_279>='a' && LA12_279<='z')) ) {
                                    return 72;
                                }
                                else {
                                    return 14;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                    }
                default:
                    return 72;}

            }
            else {
                return 72;}
            }
        case 't':
            {
            int LA12_65 = input.LA(3);

            if ( (LA12_65=='a') ) {
                int LA12_120 = input.LA(4);

                if ( (LA12_120=='t') ) {
                    int LA12_161 = input.LA(5);

                    if ( (LA12_161=='i') ) {
                        int LA12_205 = input.LA(6);

                        if ( (LA12_205=='c') ) {
                            int LA12_246 = input.LA(7);

                            if ( ((LA12_246>='0' && LA12_246<='9')||(LA12_246>='A' && LA12_246<='Z')||LA12_246=='_'||(LA12_246>='a' && LA12_246<='z')) ) {
                                return 72;
                            }
                            else {
                                return 53;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'h':
            {
            int LA12_66 = input.LA(3);

            if ( (LA12_66=='a') ) {
                int LA12_121 = input.LA(4);

                if ( (LA12_121=='r') ) {
                    int LA12_162 = input.LA(5);

                    if ( (LA12_162=='e') ) {
                        int LA12_206 = input.LA(6);

                        if ( (LA12_206=='d') ) {
                            int LA12_247 = input.LA(7);

                            if ( ((LA12_247>='0' && LA12_247<='9')||(LA12_247>='A' && LA12_247<='Z')||LA12_247=='_'||(LA12_247>='a' && LA12_247<='z')) ) {
                                return 72;
                            }
                            else {
                                return 70;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper014() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'h':
            {
            int LA12_67 = input.LA(3);

            if ( (LA12_67=='a') ) {
                int LA12_122 = input.LA(4);

                if ( (LA12_122=='s') ) {
                    int LA12_163 = input.LA(5);

                    if ( (LA12_163=='e') ) {
                        int LA12_207 = input.LA(6);

                        if ( ((LA12_207>='0' && LA12_207<='9')||(LA12_207>='A' && LA12_207<='Z')||LA12_207=='_'||(LA12_207>='a' && LA12_207<='z')) ) {
                            return 72;
                        }
                        else {
                            return 16;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'r':
            {
            int LA12_68 = input.LA(3);

            if ( (LA12_68=='o') ) {
                int LA12_123 = input.LA(4);

                if ( (LA12_123=='p') ) {
                    int LA12_164 = input.LA(5);

                    if ( (LA12_164=='e') ) {
                        int LA12_208 = input.LA(6);

                        if ( (LA12_208=='r') ) {
                            int LA12_249 = input.LA(7);

                            if ( (LA12_249=='t') ) {
                                int LA12_282 = input.LA(8);

                                if ( (LA12_282=='y') ) {
                                    int LA12_310 = input.LA(9);

                                    if ( ((LA12_310>='0' && LA12_310<='9')||(LA12_310>='A' && LA12_310<='Z')||LA12_310=='_'||(LA12_310>='a' && LA12_310<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 62;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper015() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            switch ( input.LA(3) ) {
            case 'a':
                {
                int LA12_124 = input.LA(4);

                if ( (LA12_124=='d') ) {
                    int LA12_165 = input.LA(5);

                    if ( (LA12_165=='-') ) {
                        return 56;
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
                }
            case 'l':
                {
                int LA12_125 = input.LA(4);

                if ( (LA12_125=='a') ) {
                    int LA12_166 = input.LA(5);

                    if ( (LA12_166=='t') ) {
                        int LA12_210 = input.LA(6);

                        if ( (LA12_210=='o') ) {
                            int LA12_250 = input.LA(7);

                            if ( (LA12_250=='r') ) {
                                switch ( input.LA(8) ) {
                                case ':':
                                    {
                                    return 32;
                                    }
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                case 'A':
                                case 'B':
                                case 'C':
                                case 'D':
                                case 'E':
                                case 'F':
                                case 'G':
                                case 'H':
                                case 'I':
                                case 'J':
                                case 'K':
                                case 'L':
                                case 'M':
                                case 'N':
                                case 'O':
                                case 'P':
                                case 'Q':
                                case 'R':
                                case 'S':
                                case 'T':
                                case 'U':
                                case 'V':
                                case 'W':
                                case 'X':
                                case 'Y':
                                case 'Z':
                                case '_':
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                case 'g':
                                case 'h':
                                case 'i':
                                case 'j':
                                case 'k':
                                case 'l':
                                case 'm':
                                case 'n':
                                case 'o':
                                case 'p':
                                case 'q':
                                case 'r':
                                case 's':
                                case 't':
                                case 'u':
                                case 'v':
                                case 'w':
                                case 'x':
                                case 'y':
                                case 'z':
                                    {
                                    return 72;
                                    }
                                default:
                                    return 21;}

                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
                }
            case 'd':
                {
                int LA12_126 = input.LA(4);

                if ( (LA12_126=='e') ) {
                    int LA12_167 = input.LA(5);

                    if ( (LA12_167=='f') ) {
                        int LA12_211 = input.LA(6);

                        if ( (LA12_211=='i') ) {
                            int LA12_251 = input.LA(7);

                            if ( (LA12_251=='n') ) {
                                int LA12_284 = input.LA(8);

                                if ( (LA12_284=='e') ) {
                                    int LA12_313 = input.LA(9);

                                    if ( (LA12_313=='s') ) {
                                        int LA12_340 = input.LA(10);

                                        if ( ((LA12_340>='0' && LA12_340<='9')||(LA12_340>='A' && LA12_340<='Z')||LA12_340=='_'||(LA12_340>='a' && LA12_340<='z')) ) {
                                            return 72;
                                        }
                                        else {
                                            return 61;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
                }
            default:
                return 72;}

            }
        case 'o':
            {
            int LA12_70 = input.LA(3);

            if ( (LA12_70=='l') ) {
                int LA12_127 = input.LA(4);

                if ( (LA12_127=='e') ) {
                    switch ( input.LA(5) ) {
                    case 'M':
                        {
                        int LA12_212 = input.LA(6);

                        if ( (LA12_212=='i') ) {
                            int LA12_252 = input.LA(7);

                            if ( (LA12_252=='x') ) {
                                int LA12_285 = input.LA(8);

                                if ( (LA12_285=='i') ) {
                                    int LA12_314 = input.LA(9);

                                    if ( (LA12_314=='n') ) {
                                        int LA12_341 = input.LA(10);

                                        if ( ((LA12_341>='0' && LA12_341<='9')||(LA12_341>='A' && LA12_341<='Z')||LA12_341=='_'||(LA12_341>='a' && LA12_341<='z')) ) {
                                            return 72;
                                        }
                                        else {
                                            return 19;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                        }
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        return 72;
                        }
                    default:
                        return 17;}

                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper016() throws RecognitionException {
        return 23;
    }

    private int mTokensHelper017() throws RecognitionException {
        int LA12_17 = input.LA(2);

        if ( (LA12_17=='.') ) {
            return 24;
        }
        else {
            return 78;}
    }

    private int mTokensHelper018() throws RecognitionException {
        return 25;
    }

    private int mTokensHelper019() throws RecognitionException {
        int LA12_19 = input.LA(2);

        if ( (LA12_19=='>') ) {
            return 27;
        }
        else {
            return 50;}
    }

    private int mTokensHelper020() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            switch ( input.LA(3) ) {
            case 'r':
                {
                int LA12_128 = input.LA(4);

                if ( (LA12_128=='i') ) {
                    int LA12_169 = input.LA(5);

                    if ( (LA12_169=='v') ) {
                        switch ( input.LA(6) ) {
                        case 'e':
                            {
                            int LA12_253 = input.LA(7);

                            if ( (LA12_253=='d') ) {
                                switch ( input.LA(8) ) {
                                case '-':
                                    {
                                    return 57;
                                    }
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                case 'A':
                                case 'B':
                                case 'C':
                                case 'D':
                                case 'E':
                                case 'F':
                                case 'G':
                                case 'H':
                                case 'I':
                                case 'J':
                                case 'K':
                                case 'L':
                                case 'M':
                                case 'N':
                                case 'O':
                                case 'P':
                                case 'Q':
                                case 'R':
                                case 'S':
                                case 'T':
                                case 'U':
                                case 'V':
                                case 'W':
                                case 'X':
                                case 'Y':
                                case 'Z':
                                case '_':
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                case 'g':
                                case 'h':
                                case 'i':
                                case 'j':
                                case 'k':
                                case 'l':
                                case 'm':
                                case 'n':
                                case 'o':
                                case 'p':
                                case 'q':
                                case 'r':
                                case 's':
                                case 't':
                                case 'u':
                                case 'v':
                                case 'w':
                                case 'x':
                                case 'y':
                                case 'z':
                                    {
                                    return 72;
                                    }
                                default:
                                    return 36;}

                            }
                            else {
                                return 72;}
                            }
                        case 'a':
                            {
                            int LA12_254 = input.LA(7);

                            if ( (LA12_254=='t') ) {
                                int LA12_287 = input.LA(8);

                                if ( (LA12_287=='i') ) {
                                    int LA12_317 = input.LA(9);

                                    if ( (LA12_317=='o') ) {
                                        int LA12_342 = input.LA(10);

                                        if ( (LA12_342=='n') ) {
                                            int LA12_358 = input.LA(11);

                                            if ( ((LA12_358>='0' && LA12_358<='9')||(LA12_358>='A' && LA12_358<='Z')||LA12_358=='_'||(LA12_358>='a' && LA12_358<='z')) ) {
                                                return 72;
                                            }
                                            else {
                                                return 34;}
                                        }
                                        else {
                                            return 72;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                            }
                        default:
                            return 72;}

                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
                }
            case 'f':
                {
                int LA12_129 = input.LA(4);

                if ( (LA12_129=='a') ) {
                    int LA12_170 = input.LA(5);

                    if ( (LA12_170=='u') ) {
                        int LA12_215 = input.LA(6);

                        if ( (LA12_215=='l') ) {
                            int LA12_255 = input.LA(7);

                            if ( (LA12_255=='t') ) {
                                int LA12_288 = input.LA(8);

                                if ( (LA12_288=='s') ) {
                                    int LA12_318 = input.LA(9);

                                    if ( (LA12_318==' ') ) {
                                        return 58;
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
                }
            default:
                return 72;}

            }
        case 'i':
            {
            int LA12_77 = input.LA(3);

            if ( (LA12_77=='s') ) {
                int LA12_130 = input.LA(4);

                if ( (LA12_130=='j') ) {
                    int LA12_171 = input.LA(5);

                    if ( (LA12_171=='o') ) {
                        int LA12_216 = input.LA(6);

                        if ( (LA12_216=='i') ) {
                            int LA12_256 = input.LA(7);

                            if ( (LA12_256=='n') ) {
                                int LA12_289 = input.LA(8);

                                if ( (LA12_289=='t') ) {
                                    int LA12_319 = input.LA(9);

                                    if ( ((LA12_319>='0' && LA12_319<='9')||(LA12_319>='A' && LA12_319<='Z')||LA12_319=='_'||(LA12_319>='a' && LA12_319<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 46;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'a':
            {
            int LA12_78 = input.LA(3);

            if ( (LA12_78=='t') ) {
                int LA12_131 = input.LA(4);

                if ( (LA12_131=='a') ) {
                    int LA12_172 = input.LA(5);

                    if ( (LA12_172=='t') ) {
                        int LA12_217 = input.LA(6);

                        if ( (LA12_217=='y') ) {
                            int LA12_257 = input.LA(7);

                            if ( (LA12_257=='p') ) {
                                int LA12_290 = input.LA(8);

                                if ( (LA12_290=='e') ) {
                                    int LA12_320 = input.LA(9);

                                    if ( ((LA12_320>='0' && LA12_320<='9')||(LA12_320>='A' && LA12_320<='Z')||LA12_320=='_'||(LA12_320>='a' && LA12_320<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 40;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper021() throws RecognitionException {
        int LA12_21 = input.LA(2);

        if ( (LA12_21=='e') ) {
            int LA12_79 = input.LA(3);

            if ( (LA12_79=='a') ) {
                int LA12_132 = input.LA(4);

                if ( (LA12_132=='f') ) {
                    int LA12_173 = input.LA(5);

                    if ( ((LA12_173>='0' && LA12_173<='9')||(LA12_173>='A' && LA12_173<='Z')||LA12_173=='_'||(LA12_173>='a' && LA12_173<='z')) ) {
                        return 72;
                    }
                    else {
                        return 37;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
        }
        else {
            return 72;}
    }

    private int mTokensHelper022() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'a':
            {
            int LA12_80 = input.LA(3);

            if ( (LA12_80=='l') ) {
                int LA12_133 = input.LA(4);

                if ( (LA12_133=='s') ) {
                    int LA12_174 = input.LA(5);

                    if ( (LA12_174=='e') ) {
                        int LA12_219 = input.LA(6);

                        if ( ((LA12_219>='0' && LA12_219<='9')||(LA12_219>='A' && LA12_219<='Z')||LA12_219=='_'||(LA12_219>='a' && LA12_219<='z')) ) {
                            return 72;
                        }
                        else {
                            return 67;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'o':
            {
            int LA12_81 = input.LA(3);

            if ( (LA12_81=='r') ) {
                int LA12_134 = input.LA(4);

                if ( (LA12_134=='m') ) {
                    int LA12_175 = input.LA(5);

                    if ( (LA12_175=='a') ) {
                        int LA12_220 = input.LA(6);

                        if ( (LA12_220=='l') ) {
                            int LA12_259 = input.LA(7);

                            if ( (LA12_259=='A') ) {
                                int LA12_291 = input.LA(8);

                                if ( (LA12_291=='s') ) {
                                    int LA12_321 = input.LA(9);

                                    if ( (LA12_321=='s') ) {
                                        int LA12_346 = input.LA(10);

                                        if ( (LA12_346=='o') ) {
                                            int LA12_359 = input.LA(11);

                                            if ( (LA12_359=='c') ) {
                                                int LA12_368 = input.LA(12);

                                                if ( (LA12_368=='i') ) {
                                                    int LA12_376 = input.LA(13);

                                                    if ( (LA12_376=='a') ) {
                                                        int LA12_382 = input.LA(14);

                                                        if ( (LA12_382=='t') ) {
                                                            int LA12_388 = input.LA(15);

                                                            if ( (LA12_388=='i') ) {
                                                                int LA12_392 = input.LA(16);

                                                                if ( (LA12_392=='o') ) {
                                                                    int LA12_396 = input.LA(17);

                                                                    if ( (LA12_396=='n') ) {
                                                                        int LA12_400 = input.LA(18);

                                                                        if ( ((LA12_400>='0' && LA12_400<='9')||(LA12_400>='A' && LA12_400<='Z')||LA12_400=='_'||(LA12_400>='a' && LA12_400<='z')) ) {
                                                                            return 72;
                                                                        }
                                                                        else {
                                                                            return 39;}
                                                                    }
                                                                    else {
                                                                        return 72;}
                                                                }
                                                                else {
                                                                    return 72;}
                                                            }
                                                            else {
                                                                return 72;}
                                                        }
                                                        else {
                                                            return 72;}
                                                    }
                                                    else {
                                                        return 72;}
                                                }
                                                else {
                                                    return 72;}
                                            }
                                            else {
                                                return 72;}
                                        }
                                        else {
                                            return 72;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper023() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            int LA12_82 = input.LA(3);

            if ( (LA12_82=='u') ) {
                int LA12_135 = input.LA(4);

                if ( (LA12_135=='e') ) {
                    int LA12_176 = input.LA(5);

                    if ( ((LA12_176>='0' && LA12_176<='9')||(LA12_176>='A' && LA12_176<='Z')||LA12_176=='_'||(LA12_176>='a' && LA12_176<='z')) ) {
                        return 72;
                    }
                    else {
                        return 66;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'y':
            {
            int LA12_83 = input.LA(3);

            if ( (LA12_83=='p') ) {
                int LA12_136 = input.LA(4);

                if ( (LA12_136=='e') ) {
                    int LA12_177 = input.LA(5);

                    if ( ((LA12_177>='0' && LA12_177<='9')||(LA12_177>='A' && LA12_177<='Z')||LA12_177=='_'||(LA12_177>='a' && LA12_177<='z')) ) {
                        return 72;
                    }
                    else {
                        return 41;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper024() throws RecognitionException {
        return 43;
    }

    private int mTokensHelper025() throws RecognitionException {
        return 44;
    }

    private int mTokensHelper026() throws RecognitionException {
        int LA12_26 = input.LA(2);

        if ( (LA12_26=='e') ) {
            int LA12_86 = input.LA(3);

            if ( (LA12_86=='n') ) {
                int LA12_137 = input.LA(4);

                if ( (LA12_137=='e') ) {
                    int LA12_178 = input.LA(5);

                    if ( (LA12_178=='r') ) {
                        int LA12_223 = input.LA(6);

                        if ( (LA12_223=='a') ) {
                            int LA12_260 = input.LA(7);

                            if ( (LA12_260=='l') ) {
                                int LA12_292 = input.LA(8);

                                if ( (LA12_292=='i') ) {
                                    int LA12_322 = input.LA(9);

                                    if ( (LA12_322=='z') ) {
                                        int LA12_347 = input.LA(10);

                                        if ( (LA12_347=='a') ) {
                                            int LA12_360 = input.LA(11);

                                            if ( (LA12_360=='t') ) {
                                                int LA12_369 = input.LA(12);

                                                if ( (LA12_369=='i') ) {
                                                    int LA12_377 = input.LA(13);

                                                    if ( (LA12_377=='o') ) {
                                                        int LA12_383 = input.LA(14);

                                                        if ( (LA12_383=='n') ) {
                                                            int LA12_389 = input.LA(15);

                                                            if ( (LA12_389=='S') ) {
                                                                int LA12_393 = input.LA(16);

                                                                if ( (LA12_393=='e') ) {
                                                                    int LA12_397 = input.LA(17);

                                                                    if ( (LA12_397=='t') ) {
                                                                        int LA12_401 = input.LA(18);

                                                                        if ( ((LA12_401>='0' && LA12_401<='9')||(LA12_401>='A' && LA12_401<='Z')||LA12_401=='_'||(LA12_401>='a' && LA12_401<='z')) ) {
                                                                            return 72;
                                                                        }
                                                                        else {
                                                                            return 47;}
                                                                    }
                                                                    else {
                                                                        return 72;}
                                                                }
                                                                else {
                                                                    return 72;}
                                                            }
                                                            else {
                                                                return 72;}
                                                        }
                                                        else {
                                                            return 72;}
                                                    }
                                                    else {
                                                        return 72;}
                                                }
                                                else {
                                                    return 72;}
                                            }
                                            else {
                                                return 72;}
                                        }
                                        else {
                                            return 72;}
                                    }
                                    else {
                                        return 72;}
                                }
                                else {
                                    return 72;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
        }
        else {
            return 72;}
    }

    private int mTokensHelper027() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            int LA12_87 = input.LA(3);

            if ( (LA12_87=='d') ) {
                int LA12_138 = input.LA(4);

                if ( (LA12_138=='e') ) {
                    int LA12_179 = input.LA(5);

                    if ( (LA12_179=='r') ) {
                        int LA12_224 = input.LA(6);

                        if ( (LA12_224=='e') ) {
                            int LA12_261 = input.LA(7);

                            if ( (LA12_261=='d') ) {
                                int LA12_293 = input.LA(8);

                                if ( ((LA12_293>='0' && LA12_293<='9')||(LA12_293>='A' && LA12_293<='Z')||LA12_293=='_'||(LA12_293>='a' && LA12_293<='z')) ) {
                                    return 72;
                                }
                                else {
                                    return 54;}
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'p':
            {
            int LA12_88 = input.LA(3);

            if ( ((LA12_88>='0' && LA12_88<='9')||(LA12_88>='A' && LA12_88<='Z')||LA12_88=='_'||(LA12_88>='a' && LA12_88<='z')) ) {
                return 72;
            }
            else {
                return 48;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper028() throws RecognitionException {
        return 49;
    }

    private int mTokensHelper029() throws RecognitionException {
        return 51;
    }

    private int mTokensHelper030() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '/':
            {
            return 76;
            }
        case '*':
            {
            return 75;
            }
        default:
            return 52;}

    }

    private int mTokensHelper031() throws RecognitionException {
        int LA12_31 = input.LA(2);

        if ( (LA12_31=='n') ) {
            int LA12_94 = input.LA(3);

            if ( (LA12_94=='i') ) {
                int LA12_140 = input.LA(4);

                if ( (LA12_140=='q') ) {
                    int LA12_180 = input.LA(5);

                    if ( (LA12_180=='u') ) {
                        int LA12_225 = input.LA(6);

                        if ( (LA12_225=='e') ) {
                            int LA12_262 = input.LA(7);

                            if ( ((LA12_262>='0' && LA12_262<='9')||(LA12_262>='A' && LA12_262<='Z')||LA12_262=='_'||(LA12_262>='a' && LA12_262<='z')) ) {
                                return 72;
                            }
                            else {
                                return 55;}
                        }
                        else {
                            return 72;}
                    }
                    else {
                        return 72;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
        }
        else {
            return 72;}
    }

    private int mTokensHelper032() throws RecognitionException {
        int LA12_32 = input.LA(2);

        if ( (LA12_32=='>') ) {
            return 65;
        }
        else {
            return 64;}
    }

    private int mTokensHelper033() throws RecognitionException {
        int LA12_33 = input.LA(2);

        if ( (LA12_33=='U') ) {
            int LA12_97 = input.LA(3);

            if ( (LA12_97=='L') ) {
                int LA12_141 = input.LA(4);

                if ( (LA12_141=='L') ) {
                    int LA12_181 = input.LA(5);

                    if ( ((LA12_181>='0' && LA12_181<='9')||(LA12_181>='A' && LA12_181<='Z')||LA12_181=='_'||(LA12_181>='a' && LA12_181<='z')) ) {
                        return 72;
                    }
                    else {
                        return 68;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
        }
        else {
            return 72;}
    }

    private int mTokensHelper034() throws RecognitionException {
        int LA12_34 = input.LA(2);

        if ( (LA12_34=='o') ) {
            int LA12_98 = input.LA(3);

            if ( (LA12_98=='n') ) {
                int LA12_142 = input.LA(4);

                if ( (LA12_142=='e') ) {
                    int LA12_182 = input.LA(5);

                    if ( ((LA12_182>='0' && LA12_182<='9')||(LA12_182>='A' && LA12_182<='Z')||LA12_182=='_'||(LA12_182>='a' && LA12_182<='z')) ) {
                        return 72;
                    }
                    else {
                        return 69;}
                }
                else {
                    return 72;}
            }
            else {
                return 72;}
        }
        else {
            return 72;}
    }

    private int mTokensHelper035() throws RecognitionException {
        int LA12_35 = input.LA(2);

        if ( ((LA12_35>='A' && LA12_35<='Z')||LA12_35=='_'||(LA12_35>='a' && LA12_35<='z')) ) {
            return 72;
        }
        else {
            return 78;}
    }

    private int mTokensHelper036() throws RecognitionException {
        return 72;
    }

    private int mTokensHelper037() throws RecognitionException {
        return 73;
    }

    private int mTokensHelper038() throws RecognitionException {
        int LA12_38 = input.LA(2);

        if ( ((LA12_38>='\u0000' && LA12_38<='\uFFFE')) ) {
            return 74;
        }
        else {
            return 78;}
    }

    private int mTokensHelper039() throws RecognitionException {
        int LA12_39 = input.LA(2);

        if ( ((LA12_39>='\u0000' && LA12_39<='\uFFFE')) ) {
            return 74;
        }
        else {
            return 78;}
    }

    private int mTokensHelper040() throws RecognitionException {
        return 77;
    }

    private int mTokensHelper041() throws RecognitionException {
        return 78;
    }

    private int mTokensHelper042() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

        throw nvae;
    }



 

}