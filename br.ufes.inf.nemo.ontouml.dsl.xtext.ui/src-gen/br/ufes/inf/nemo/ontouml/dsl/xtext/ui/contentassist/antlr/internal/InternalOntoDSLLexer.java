package br.ufes.inf.nemo.ontouml.dsl.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


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
    public String getGrammarFileName() { return "../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:10:5: ( '*' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:10:7: '*'
            {
            match('*'); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:11:5: ( '+' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:11:7: '+'
            {
            match('+'); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:12:5: ( '-' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:12:7: '-'
            {
            match('-'); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:13:5: ( '/' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:13:7: '/'
            {
            match('/'); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:14:5: ( 'true' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:14:7: 'true'
            {
            match("true"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:15:5: ( 'false' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:15:7: 'false'
            {
            match("false"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:16:5: ( 'none' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:16:7: 'none'
            {
            match("none"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:17:5: ( 'shared' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:17:7: 'shared'
            {
            match("shared"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:18:5: ( 'composite' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:18:7: 'composite'
            {
            match("composite"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:19:5: ( 'model' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:19:7: 'model'
            {
            match("model"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20:5: ( ';' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20:7: ';'
            {
            match(';'); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:21:5: ( 'import' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:21:7: 'import'
            {
            match("import"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:22:5: ( 'kind' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:22:7: 'kind'
            {
            match("kind"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:23:5: ( '{' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:23:7: '{'
            {
            match('{'); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:24:5: ( '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:24:7: '}'
            {
            match('}'); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:25:5: ( ':' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:25:7: ':'
            {
            match(':'); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:26:5: ( ',' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:26:7: ','
            {
            match(','); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:27:5: ( 'quantity' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:27:7: 'quantity'
            {
            match("quantity"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:28:5: ( 'collective' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:28:7: 'collective'
            {
            match("collective"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:29:5: ( 'subKind' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:29:7: 'subKind'
            {
            match("subKind"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:30:5: ( 'category' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:30:7: 'category'
            {
            match("category"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:31:5: ( 'phase' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:31:7: 'phase'
            {
            match("phase"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:32:5: ( 'role' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:32:7: 'role'
            {
            match("role"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:33:5: ( 'mixin' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:33:7: 'mixin'
            {
            match("mixin"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:34:5: ( 'roleMixin' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:34:7: 'roleMixin'
            {
            match("roleMixin"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:35:5: ( 'mode' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:35:7: 'mode'
            {
            match("mode"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:36:5: ( 'relator' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:36:7: 'relator'
            {
            match("relator"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:37:5: ( 'mediates' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:37:7: 'mediates'
            {
            match("mediates"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:38:5: ( '[' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:38:7: '['
            {
            match('['); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:39:5: ( '..' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:39:7: '..'
            {
            match(".."); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:40:5: ( ']' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:40:7: ']'
            {
            match(']'); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:41:5: ( '->' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:41:7: '->'
            {
            match("->"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:42:5: ( 'as' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:42:7: 'as'
            {
            match("as"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:43:5: ( 'characterization' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:43:7: 'characterization'
            {
            match("characterization"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:44:5: ( 'mode:' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:44:7: 'mode:'
            {
            match("mode:"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:45:5: ( 'characterized:' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:45:7: 'characterized:'
            {
            match("characterized:"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:46:5: ( 'mediation' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:46:7: 'mediation'
            {
            match("mediation"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:47:5: ( 'relator:' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:47:7: 'relator:'
            {
            match("relator:"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:48:5: ( 'mediated:' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:48:7: 'mediated:'
            {
            match("mediated:"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:49:5: ( 'derivation' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:49:7: 'derivation'
            {
            match("derivation"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:50:5: ( 'material:' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:50:7: 'material:'
            {
            match("material:"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:51:5: ( 'materialAssociation' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:51:7: 'materialAssociation'
            {
            match("materialAssociation"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:52:5: ( 'formalAssociation' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:52:7: 'formalAssociation'
            {
            match("formalAssociation"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:53:5: ( 'datatype' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:53:7: 'datatype'
            {
            match("datatype"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:54:5: ( 'type' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:54:7: 'type'
            {
            match("type"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:55:5: ( '(' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:55:7: '('
            {
            match('('); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:56:5: ( ')' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:56:7: ')'
            {
            match(')'); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:57:5: ( 'generalizationSet' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:57:7: 'generalizationSet'
            {
            match("generalizationSet"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:58:5: ( 'op' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:58:7: 'op'
            {
            match("op"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:59:5: ( 'defaults to' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:59:7: 'defaults to'
            {
            match("defaults to"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:60:5: ( 'aggregation' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:60:7: 'aggregation'
            {
            match("aggregation"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:61:5: ( 'subset of' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:61:7: 'subset of'
            {
            match("subset of"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:62:5: ( 'redefines' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:62:7: 'redefines'
            {
            match("redefines"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:63:5: ( 'property' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:63:7: 'property'
            {
            match("property"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:64:5: ( 'enum' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:64:7: 'enum'
            {
            match("enum"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:65:5: ( '=' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:65:7: '='
            {
            match('='); 

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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:66:5: ( '=>' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:66:7: '=>'
            {
            match("=>"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:67:5: ( 'NULL' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:67:7: 'NULL'
            {
            match("NULL"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:68:5: ( 'active' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:68:7: 'active'
            {
            match("active"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:69:5: ( 'abstract' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:69:7: 'abstract'
            {
            match("abstract"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:70:5: ( 'extensional' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:70:7: 'extensional'
            {
            match("extensional"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:71:5: ( 'derived' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:71:7: 'derived'
            {
            match("derived"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:72:5: ( 'leaf' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:72:7: 'leaf'
            {
            match("leaf"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:73:5: ( 'substitutable' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:73:7: 'substitutable'
            {
            match("substitutable"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:74:5: ( 'complete' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:74:7: 'complete'
            {
            match("complete"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:75:5: ( 'disjoint' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:75:7: 'disjoint'
            {
            match("disjoint"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:76:5: ( 'static' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:76:7: 'static'
            {
            match("static"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:77:5: ( 'ordered' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:77:7: 'ordered'
            {
            match("ordered"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:78:5: ( 'unique' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:78:7: 'unique'
            {
            match("unique"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:79:5: ( 'read-only' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:79:7: 'read-only'
            {
            match("read-only"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:80:5: ( 'derived-union' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:80:7: 'derived-union'
            {
            match("derived-union"); 


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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20487:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20487:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20487:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20487:11: '^'
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

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20487:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:
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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20489:10: ( ( '0' .. '9' )+ )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20489:12: ( '0' .. '9' )+
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20489:12: ( '0' .. '9' )+
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
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20489:13: '0' .. '9'
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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20491:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20491:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20491:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("20491:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20491:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20491:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20491:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20491:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20491:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20491:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20491:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20491:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20493:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20493:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20493:24: ( options {greedy=false; } : . )*
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
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20493:52: .
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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20495:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20495:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20495:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20495:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20495:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20495:41: ( '\\r' )? '\\n'
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20495:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20495:41: '\\r'
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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20497:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20497:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20497:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:
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
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20499:16: ( . )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:20499:18: .
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
        // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=78;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='*') ) {
            alt12 = mTokensHelper001();
        }
        else if ( (LA12_0=='+') ) {
            alt12 = mTokensHelper002();
        }
        else if ( (LA12_0=='-') ) {
            alt12 = mTokensHelper003();
        }
        else if ( (LA12_0=='/') ) {
            alt12 = mTokensHelper004();
        }
        else if ( (LA12_0=='t') ) {
            alt12 = mTokensHelper005();
        }
        else if ( (LA12_0=='f') ) {
            alt12 = mTokensHelper006();
        }
        else if ( (LA12_0=='n') ) {
            alt12 = mTokensHelper007();
        }
        else if ( (LA12_0=='s') ) {
            alt12 = mTokensHelper008();
        }
        else if ( (LA12_0=='c') ) {
            alt12 = mTokensHelper009();
        }
        else if ( (LA12_0=='m') ) {
            alt12 = mTokensHelper010();
        }
        else if ( (LA12_0==';') ) {
            alt12 = mTokensHelper011();
        }
        else if ( (LA12_0=='i') ) {
            alt12 = mTokensHelper012();
        }
        else if ( (LA12_0=='k') ) {
            alt12 = mTokensHelper013();
        }
        else if ( (LA12_0=='{') ) {
            alt12 = mTokensHelper014();
        }
        else if ( (LA12_0=='}') ) {
            alt12 = mTokensHelper015();
        }
        else if ( (LA12_0==':') ) {
            alt12 = mTokensHelper016();
        }
        else if ( (LA12_0==',') ) {
            alt12 = mTokensHelper017();
        }
        else if ( (LA12_0=='q') ) {
            alt12 = mTokensHelper018();
        }
        else if ( (LA12_0=='p') ) {
            alt12 = mTokensHelper019();
        }
        else if ( (LA12_0=='r') ) {
            alt12 = mTokensHelper020();
        }
        else if ( (LA12_0=='[') ) {
            alt12 = mTokensHelper021();
        }
        else if ( (LA12_0=='.') ) {
            alt12 = mTokensHelper022();
        }
        else if ( (LA12_0==']') ) {
            alt12 = mTokensHelper023();
        }
        else if ( (LA12_0=='a') ) {
            alt12 = mTokensHelper024();
        }
        else if ( (LA12_0=='d') ) {
            alt12 = mTokensHelper025();
        }
        else if ( (LA12_0=='(') ) {
            alt12 = mTokensHelper026();
        }
        else if ( (LA12_0==')') ) {
            alt12 = mTokensHelper027();
        }
        else if ( (LA12_0=='g') ) {
            alt12 = mTokensHelper028();
        }
        else if ( (LA12_0=='o') ) {
            alt12 = mTokensHelper029();
        }
        else if ( (LA12_0=='e') ) {
            alt12 = mTokensHelper030();
        }
        else if ( (LA12_0=='=') ) {
            alt12 = mTokensHelper031();
        }
        else if ( (LA12_0=='N') ) {
            alt12 = mTokensHelper032();
        }
        else if ( (LA12_0=='l') ) {
            alt12 = mTokensHelper033();
        }
        else if ( (LA12_0=='u') ) {
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
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:218: T63
                {
                mT63(); 

                }
                break;
            case 54 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:222: T64
                {
                mT64(); 

                }
                break;
            case 55 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:226: T65
                {
                mT65(); 

                }
                break;
            case 56 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:230: T66
                {
                mT66(); 

                }
                break;
            case 57 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:234: T67
                {
                mT67(); 

                }
                break;
            case 58 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:238: T68
                {
                mT68(); 

                }
                break;
            case 59 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:242: T69
                {
                mT69(); 

                }
                break;
            case 60 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:246: T70
                {
                mT70(); 

                }
                break;
            case 61 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:250: T71
                {
                mT71(); 

                }
                break;
            case 62 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:254: T72
                {
                mT72(); 

                }
                break;
            case 63 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:258: T73
                {
                mT73(); 

                }
                break;
            case 64 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:262: T74
                {
                mT74(); 

                }
                break;
            case 65 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:266: T75
                {
                mT75(); 

                }
                break;
            case 66 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:270: T76
                {
                mT76(); 

                }
                break;
            case 67 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:274: T77
                {
                mT77(); 

                }
                break;
            case 68 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:278: T78
                {
                mT78(); 

                }
                break;
            case 69 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:282: T79
                {
                mT79(); 

                }
                break;
            case 70 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:286: T80
                {
                mT80(); 

                }
                break;
            case 71 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:290: T81
                {
                mT81(); 

                }
                break;
            case 72 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:294: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 73 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:302: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 74 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:311: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:323: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:339: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 77 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:355: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // ../br.ufes.inf.nemo.ontouml.dsl.xtext.ui/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/ui/contentassist/antlr/internal/InternalOntoDSL.g:1:363: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        return 1;
    }

    private int mTokensHelper002() throws RecognitionException {
        return 2;
    }

    private int mTokensHelper003() throws RecognitionException {
        int LA12_3 = input.LA(2);

        if ( (LA12_3=='>') ) {
            return 32;
        }
        else {
            return 3;}
    }

    private int mTokensHelper004() throws RecognitionException {
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
            return 4;}

    }

    private int mTokensHelper005() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            int LA12_49 = input.LA(3);

            if ( (LA12_49=='u') ) {
                int LA12_102 = input.LA(4);

                if ( (LA12_102=='e') ) {
                    int LA12_143 = input.LA(5);

                    if ( ((LA12_143>='0' && LA12_143<='9')||(LA12_143>='A' && LA12_143<='Z')||LA12_143=='_'||(LA12_143>='a' && LA12_143<='z')) ) {
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
        case 'y':
            {
            int LA12_50 = input.LA(3);

            if ( (LA12_50=='p') ) {
                int LA12_103 = input.LA(4);

                if ( (LA12_103=='e') ) {
                    int LA12_144 = input.LA(5);

                    if ( ((LA12_144>='0' && LA12_144<='9')||(LA12_144>='A' && LA12_144<='Z')||LA12_144=='_'||(LA12_144>='a' && LA12_144<='z')) ) {
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
        default:
            return 72;}

    }

    private int mTokensHelper006() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'a':
            {
            int LA12_52 = input.LA(3);

            if ( (LA12_52=='l') ) {
                int LA12_104 = input.LA(4);

                if ( (LA12_104=='s') ) {
                    int LA12_145 = input.LA(5);

                    if ( (LA12_145=='e') ) {
                        int LA12_185 = input.LA(6);

                        if ( ((LA12_185>='0' && LA12_185<='9')||(LA12_185>='A' && LA12_185<='Z')||LA12_185=='_'||(LA12_185>='a' && LA12_185<='z')) ) {
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
        case 'o':
            {
            int LA12_53 = input.LA(3);

            if ( (LA12_53=='r') ) {
                int LA12_105 = input.LA(4);

                if ( (LA12_105=='m') ) {
                    int LA12_146 = input.LA(5);

                    if ( (LA12_146=='a') ) {
                        int LA12_186 = input.LA(6);

                        if ( (LA12_186=='l') ) {
                            int LA12_229 = input.LA(7);

                            if ( (LA12_229=='A') ) {
                                int LA12_263 = input.LA(8);

                                if ( (LA12_263=='s') ) {
                                    int LA12_295 = input.LA(9);

                                    if ( (LA12_295=='s') ) {
                                        int LA12_324 = input.LA(10);

                                        if ( (LA12_324=='o') ) {
                                            int LA12_348 = input.LA(11);

                                            if ( (LA12_348=='c') ) {
                                                int LA12_361 = input.LA(12);

                                                if ( (LA12_361=='i') ) {
                                                    int LA12_370 = input.LA(13);

                                                    if ( (LA12_370=='a') ) {
                                                        int LA12_378 = input.LA(14);

                                                        if ( (LA12_378=='t') ) {
                                                            int LA12_384 = input.LA(15);

                                                            if ( (LA12_384=='i') ) {
                                                                int LA12_390 = input.LA(16);

                                                                if ( (LA12_390=='o') ) {
                                                                    int LA12_394 = input.LA(17);

                                                                    if ( (LA12_394=='n') ) {
                                                                        int LA12_398 = input.LA(18);

                                                                        if ( ((LA12_398>='0' && LA12_398<='9')||(LA12_398>='A' && LA12_398<='Z')||LA12_398=='_'||(LA12_398>='a' && LA12_398<='z')) ) {
                                                                            return 72;
                                                                        }
                                                                        else {
                                                                            return 43;}
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

    private int mTokensHelper007() throws RecognitionException {
        int LA12_7 = input.LA(2);

        if ( (LA12_7=='o') ) {
            int LA12_54 = input.LA(3);

            if ( (LA12_54=='n') ) {
                int LA12_106 = input.LA(4);

                if ( (LA12_106=='e') ) {
                    int LA12_147 = input.LA(5);

                    if ( ((LA12_147>='0' && LA12_147<='9')||(LA12_147>='A' && LA12_147<='Z')||LA12_147=='_'||(LA12_147>='a' && LA12_147<='z')) ) {
                        return 72;
                    }
                    else {
                        return 7;}
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

    private int mTokensHelper008() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'u':
            {
            int LA12_55 = input.LA(3);

            if ( (LA12_55=='b') ) {
                switch ( input.LA(4) ) {
                case 'K':
                    {
                    int LA12_148 = input.LA(5);

                    if ( (LA12_148=='i') ) {
                        int LA12_188 = input.LA(6);

                        if ( (LA12_188=='n') ) {
                            int LA12_230 = input.LA(7);

                            if ( (LA12_230=='d') ) {
                                int LA12_264 = input.LA(8);

                                if ( ((LA12_264>='0' && LA12_264<='9')||(LA12_264>='A' && LA12_264<='Z')||LA12_264=='_'||(LA12_264>='a' && LA12_264<='z')) ) {
                                    return 72;
                                }
                                else {
                                    return 20;}
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
                    switch ( input.LA(5) ) {
                    case 'e':
                        {
                        int LA12_189 = input.LA(6);

                        if ( (LA12_189=='t') ) {
                            int LA12_231 = input.LA(7);

                            if ( (LA12_231==' ') ) {
                                return 52;
                            }
                            else {
                                return 72;}
                        }
                        else {
                            return 72;}
                        }
                    case 't':
                        {
                        int LA12_190 = input.LA(6);

                        if ( (LA12_190=='i') ) {
                            int LA12_232 = input.LA(7);

                            if ( (LA12_232=='t') ) {
                                int LA12_266 = input.LA(8);

                                if ( (LA12_266=='u') ) {
                                    int LA12_297 = input.LA(9);

                                    if ( (LA12_297=='t') ) {
                                        int LA12_325 = input.LA(10);

                                        if ( (LA12_325=='a') ) {
                                            int LA12_349 = input.LA(11);

                                            if ( (LA12_349=='b') ) {
                                                int LA12_362 = input.LA(12);

                                                if ( (LA12_362=='l') ) {
                                                    int LA12_371 = input.LA(13);

                                                    if ( (LA12_371=='e') ) {
                                                        int LA12_379 = input.LA(14);

                                                        if ( ((LA12_379>='0' && LA12_379<='9')||(LA12_379>='A' && LA12_379<='Z')||LA12_379=='_'||(LA12_379>='a' && LA12_379<='z')) ) {
                                                            return 72;
                                                        }
                                                        else {
                                                            return 64;}
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
                default:
                    return 72;}

            }
            else {
                return 72;}
            }
        case 'h':
            {
            int LA12_56 = input.LA(3);

            if ( (LA12_56=='a') ) {
                int LA12_108 = input.LA(4);

                if ( (LA12_108=='r') ) {
                    int LA12_150 = input.LA(5);

                    if ( (LA12_150=='e') ) {
                        int LA12_191 = input.LA(6);

                        if ( (LA12_191=='d') ) {
                            int LA12_233 = input.LA(7);

                            if ( ((LA12_233>='0' && LA12_233<='9')||(LA12_233>='A' && LA12_233<='Z')||LA12_233=='_'||(LA12_233>='a' && LA12_233<='z')) ) {
                                return 72;
                            }
                            else {
                                return 8;}
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
        case 't':
            {
            int LA12_57 = input.LA(3);

            if ( (LA12_57=='a') ) {
                int LA12_109 = input.LA(4);

                if ( (LA12_109=='t') ) {
                    int LA12_151 = input.LA(5);

                    if ( (LA12_151=='i') ) {
                        int LA12_192 = input.LA(6);

                        if ( (LA12_192=='c') ) {
                            int LA12_234 = input.LA(7);

                            if ( ((LA12_234>='0' && LA12_234<='9')||(LA12_234>='A' && LA12_234<='Z')||LA12_234=='_'||(LA12_234>='a' && LA12_234<='z')) ) {
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
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper009() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'o':
            {
            switch ( input.LA(3) ) {
            case 'm':
                {
                int LA12_110 = input.LA(4);

                if ( (LA12_110=='p') ) {
                    switch ( input.LA(5) ) {
                    case 'l':
                        {
                        int LA12_193 = input.LA(6);

                        if ( (LA12_193=='e') ) {
                            int LA12_235 = input.LA(7);

                            if ( (LA12_235=='t') ) {
                                int LA12_269 = input.LA(8);

                                if ( (LA12_269=='e') ) {
                                    int LA12_298 = input.LA(9);

                                    if ( ((LA12_298>='0' && LA12_298<='9')||(LA12_298>='A' && LA12_298<='Z')||LA12_298=='_'||(LA12_298>='a' && LA12_298<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 65;}
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
                        int LA12_194 = input.LA(6);

                        if ( (LA12_194=='s') ) {
                            int LA12_236 = input.LA(7);

                            if ( (LA12_236=='i') ) {
                                int LA12_270 = input.LA(8);

                                if ( (LA12_270=='t') ) {
                                    int LA12_299 = input.LA(9);

                                    if ( (LA12_299=='e') ) {
                                        int LA12_327 = input.LA(10);

                                        if ( ((LA12_327>='0' && LA12_327<='9')||(LA12_327>='A' && LA12_327<='Z')||LA12_327=='_'||(LA12_327>='a' && LA12_327<='z')) ) {
                                            return 72;
                                        }
                                        else {
                                            return 9;}
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
            case 'l':
                {
                int LA12_111 = input.LA(4);

                if ( (LA12_111=='l') ) {
                    int LA12_153 = input.LA(5);

                    if ( (LA12_153=='e') ) {
                        int LA12_195 = input.LA(6);

                        if ( (LA12_195=='c') ) {
                            int LA12_237 = input.LA(7);

                            if ( (LA12_237=='t') ) {
                                int LA12_271 = input.LA(8);

                                if ( (LA12_271=='i') ) {
                                    int LA12_300 = input.LA(9);

                                    if ( (LA12_300=='v') ) {
                                        int LA12_328 = input.LA(10);

                                        if ( (LA12_328=='e') ) {
                                            int LA12_351 = input.LA(11);

                                            if ( ((LA12_351>='0' && LA12_351<='9')||(LA12_351>='A' && LA12_351<='Z')||LA12_351=='_'||(LA12_351>='a' && LA12_351<='z')) ) {
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
        case 'a':
            {
            int LA12_59 = input.LA(3);

            if ( (LA12_59=='t') ) {
                int LA12_112 = input.LA(4);

                if ( (LA12_112=='e') ) {
                    int LA12_154 = input.LA(5);

                    if ( (LA12_154=='g') ) {
                        int LA12_196 = input.LA(6);

                        if ( (LA12_196=='o') ) {
                            int LA12_238 = input.LA(7);

                            if ( (LA12_238=='r') ) {
                                int LA12_272 = input.LA(8);

                                if ( (LA12_272=='y') ) {
                                    int LA12_301 = input.LA(9);

                                    if ( ((LA12_301>='0' && LA12_301<='9')||(LA12_301>='A' && LA12_301<='Z')||LA12_301=='_'||(LA12_301>='a' && LA12_301<='z')) ) {
                                        return 72;
                                    }
                                    else {
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
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'h':
            {
            int LA12_60 = input.LA(3);

            if ( (LA12_60=='a') ) {
                int LA12_113 = input.LA(4);

                if ( (LA12_113=='r') ) {
                    int LA12_155 = input.LA(5);

                    if ( (LA12_155=='a') ) {
                        int LA12_197 = input.LA(6);

                        if ( (LA12_197=='c') ) {
                            int LA12_239 = input.LA(7);

                            if ( (LA12_239=='t') ) {
                                int LA12_273 = input.LA(8);

                                if ( (LA12_273=='e') ) {
                                    int LA12_302 = input.LA(9);

                                    if ( (LA12_302=='r') ) {
                                        int LA12_330 = input.LA(10);

                                        if ( (LA12_330=='i') ) {
                                            int LA12_352 = input.LA(11);

                                            if ( (LA12_352=='z') ) {
                                                switch ( input.LA(12) ) {
                                                case 'e':
                                                    {
                                                    int LA12_372 = input.LA(13);

                                                    if ( (LA12_372=='d') ) {
                                                        int LA12_380 = input.LA(14);

                                                        if ( (LA12_380==':') ) {
                                                            return 36;
                                                        }
                                                        else {
                                                            return 72;}
                                                    }
                                                    else {
                                                        return 72;}
                                                    }
                                                case 'a':
                                                    {
                                                    int LA12_373 = input.LA(13);

                                                    if ( (LA12_373=='t') ) {
                                                        int LA12_381 = input.LA(14);

                                                        if ( (LA12_381=='i') ) {
                                                            int LA12_387 = input.LA(15);

                                                            if ( (LA12_387=='o') ) {
                                                                int LA12_391 = input.LA(16);

                                                                if ( (LA12_391=='n') ) {
                                                                    int LA12_395 = input.LA(17);

                                                                    if ( ((LA12_395>='0' && LA12_395<='9')||(LA12_395>='A' && LA12_395<='Z')||LA12_395=='_'||(LA12_395>='a' && LA12_395<='z')) ) {
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

    private int mTokensHelper010() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'o':
            {
            int LA12_61 = input.LA(3);

            if ( (LA12_61=='d') ) {
                int LA12_114 = input.LA(4);

                if ( (LA12_114=='e') ) {
                    switch ( input.LA(5) ) {
                    case 'l':
                        {
                        int LA12_198 = input.LA(6);

                        if ( ((LA12_198>='0' && LA12_198<='9')||(LA12_198>='A' && LA12_198<='Z')||LA12_198=='_'||(LA12_198>='a' && LA12_198<='z')) ) {
                            return 72;
                        }
                        else {
                            return 10;}
                        }
                    case ':':
                        {
                        return 35;
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
                        return 26;}

                }
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        case 'i':
            {
            int LA12_62 = input.LA(3);

            if ( (LA12_62=='x') ) {
                int LA12_115 = input.LA(4);

                if ( (LA12_115=='i') ) {
                    int LA12_157 = input.LA(5);

                    if ( (LA12_157=='n') ) {
                        int LA12_201 = input.LA(6);

                        if ( ((LA12_201>='0' && LA12_201<='9')||(LA12_201>='A' && LA12_201<='Z')||LA12_201=='_'||(LA12_201>='a' && LA12_201<='z')) ) {
                            return 72;
                        }
                        else {
                            return 24;}
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
            int LA12_63 = input.LA(3);

            if ( (LA12_63=='d') ) {
                int LA12_116 = input.LA(4);

                if ( (LA12_116=='i') ) {
                    int LA12_158 = input.LA(5);

                    if ( (LA12_158=='a') ) {
                        int LA12_202 = input.LA(6);

                        if ( (LA12_202=='t') ) {
                            switch ( input.LA(7) ) {
                            case 'i':
                                {
                                int LA12_274 = input.LA(8);

                                if ( (LA12_274=='o') ) {
                                    int LA12_303 = input.LA(9);

                                    if ( (LA12_303=='n') ) {
                                        int LA12_331 = input.LA(10);

                                        if ( ((LA12_331>='0' && LA12_331<='9')||(LA12_331>='A' && LA12_331<='Z')||LA12_331=='_'||(LA12_331>='a' && LA12_331<='z')) ) {
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
                            case 'e':
                                {
                                switch ( input.LA(8) ) {
                                case 'd':
                                    {
                                    int LA12_304 = input.LA(9);

                                    if ( (LA12_304==':') ) {
                                        return 39;
                                    }
                                    else {
                                        return 72;}
                                    }
                                case 's':
                                    {
                                    int LA12_305 = input.LA(9);

                                    if ( ((LA12_305>='0' && LA12_305<='9')||(LA12_305>='A' && LA12_305<='Z')||LA12_305=='_'||(LA12_305>='a' && LA12_305<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 28;}
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
        case 'a':
            {
            int LA12_64 = input.LA(3);

            if ( (LA12_64=='t') ) {
                int LA12_117 = input.LA(4);

                if ( (LA12_117=='e') ) {
                    int LA12_159 = input.LA(5);

                    if ( (LA12_159=='r') ) {
                        int LA12_203 = input.LA(6);

                        if ( (LA12_203=='i') ) {
                            int LA12_243 = input.LA(7);

                            if ( (LA12_243=='a') ) {
                                int LA12_276 = input.LA(8);

                                if ( (LA12_276=='l') ) {
                                    switch ( input.LA(9) ) {
                                    case 'A':
                                        {
                                        int LA12_334 = input.LA(10);

                                        if ( (LA12_334=='s') ) {
                                            int LA12_354 = input.LA(11);

                                            if ( (LA12_354=='s') ) {
                                                int LA12_365 = input.LA(12);

                                                if ( (LA12_365=='o') ) {
                                                    int LA12_374 = input.LA(13);

                                                    if ( (LA12_374=='c') ) {
                                                        int LA12_382 = input.LA(14);

                                                        if ( (LA12_382=='i') ) {
                                                            int LA12_388 = input.LA(15);

                                                            if ( (LA12_388=='a') ) {
                                                                int LA12_392 = input.LA(16);

                                                                if ( (LA12_392=='t') ) {
                                                                    int LA12_396 = input.LA(17);

                                                                    if ( (LA12_396=='i') ) {
                                                                        int LA12_400 = input.LA(18);

                                                                        if ( (LA12_400=='o') ) {
                                                                            int LA12_403 = input.LA(19);

                                                                            if ( (LA12_403=='n') ) {
                                                                                int LA12_405 = input.LA(20);

                                                                                if ( ((LA12_405>='0' && LA12_405<='9')||(LA12_405>='A' && LA12_405<='Z')||LA12_405=='_'||(LA12_405>='a' && LA12_405<='z')) ) {
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
                                            else {
                                                return 72;}
                                        }
                                        else {
                                            return 72;}
                                        }
                                    case ':':
                                        {
                                        return 41;
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

    private int mTokensHelper011() throws RecognitionException {
        return 11;
    }

    private int mTokensHelper012() throws RecognitionException {
        int LA12_12 = input.LA(2);

        if ( (LA12_12=='m') ) {
            int LA12_66 = input.LA(3);

            if ( (LA12_66=='p') ) {
                int LA12_118 = input.LA(4);

                if ( (LA12_118=='o') ) {
                    int LA12_160 = input.LA(5);

                    if ( (LA12_160=='r') ) {
                        int LA12_204 = input.LA(6);

                        if ( (LA12_204=='t') ) {
                            int LA12_244 = input.LA(7);

                            if ( ((LA12_244>='0' && LA12_244<='9')||(LA12_244>='A' && LA12_244<='Z')||LA12_244=='_'||(LA12_244>='a' && LA12_244<='z')) ) {
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

    private int mTokensHelper013() throws RecognitionException {
        int LA12_13 = input.LA(2);

        if ( (LA12_13=='i') ) {
            int LA12_67 = input.LA(3);

            if ( (LA12_67=='n') ) {
                int LA12_119 = input.LA(4);

                if ( (LA12_119=='d') ) {
                    int LA12_161 = input.LA(5);

                    if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
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

    private int mTokensHelper014() throws RecognitionException {
        return 14;
    }

    private int mTokensHelper015() throws RecognitionException {
        return 15;
    }

    private int mTokensHelper016() throws RecognitionException {
        return 16;
    }

    private int mTokensHelper017() throws RecognitionException {
        return 17;
    }

    private int mTokensHelper018() throws RecognitionException {
        int LA12_18 = input.LA(2);

        if ( (LA12_18=='u') ) {
            int LA12_72 = input.LA(3);

            if ( (LA12_72=='a') ) {
                int LA12_120 = input.LA(4);

                if ( (LA12_120=='n') ) {
                    int LA12_162 = input.LA(5);

                    if ( (LA12_162=='t') ) {
                        int LA12_206 = input.LA(6);

                        if ( (LA12_206=='i') ) {
                            int LA12_245 = input.LA(7);

                            if ( (LA12_245=='t') ) {
                                int LA12_278 = input.LA(8);

                                if ( (LA12_278=='y') ) {
                                    int LA12_307 = input.LA(9);

                                    if ( ((LA12_307>='0' && LA12_307<='9')||(LA12_307>='A' && LA12_307<='Z')||LA12_307=='_'||(LA12_307>='a' && LA12_307<='z')) ) {
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

    private int mTokensHelper019() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            int LA12_73 = input.LA(3);

            if ( (LA12_73=='o') ) {
                int LA12_121 = input.LA(4);

                if ( (LA12_121=='p') ) {
                    int LA12_163 = input.LA(5);

                    if ( (LA12_163=='e') ) {
                        int LA12_207 = input.LA(6);

                        if ( (LA12_207=='r') ) {
                            int LA12_246 = input.LA(7);

                            if ( (LA12_246=='t') ) {
                                int LA12_279 = input.LA(8);

                                if ( (LA12_279=='y') ) {
                                    int LA12_308 = input.LA(9);

                                    if ( ((LA12_308>='0' && LA12_308<='9')||(LA12_308>='A' && LA12_308<='Z')||LA12_308=='_'||(LA12_308>='a' && LA12_308<='z')) ) {
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
            else {
                return 72;}
            }
        case 'h':
            {
            int LA12_74 = input.LA(3);

            if ( (LA12_74=='a') ) {
                int LA12_122 = input.LA(4);

                if ( (LA12_122=='s') ) {
                    int LA12_164 = input.LA(5);

                    if ( (LA12_164=='e') ) {
                        int LA12_208 = input.LA(6);

                        if ( ((LA12_208>='0' && LA12_208<='9')||(LA12_208>='A' && LA12_208<='Z')||LA12_208=='_'||(LA12_208>='a' && LA12_208<='z')) ) {
                            return 72;
                        }
                        else {
                            return 22;}
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

    private int mTokensHelper020() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            switch ( input.LA(3) ) {
            case 'l':
                {
                int LA12_123 = input.LA(4);

                if ( (LA12_123=='a') ) {
                    int LA12_165 = input.LA(5);

                    if ( (LA12_165=='t') ) {
                        int LA12_209 = input.LA(6);

                        if ( (LA12_209=='o') ) {
                            int LA12_248 = input.LA(7);

                            if ( (LA12_248=='r') ) {
                                switch ( input.LA(8) ) {
                                case ':':
                                    {
                                    return 38;
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
                                    return 27;}

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
                int LA12_124 = input.LA(4);

                if ( (LA12_124=='e') ) {
                    int LA12_166 = input.LA(5);

                    if ( (LA12_166=='f') ) {
                        int LA12_210 = input.LA(6);

                        if ( (LA12_210=='i') ) {
                            int LA12_249 = input.LA(7);

                            if ( (LA12_249=='n') ) {
                                int LA12_281 = input.LA(8);

                                if ( (LA12_281=='e') ) {
                                    int LA12_311 = input.LA(9);

                                    if ( (LA12_311=='s') ) {
                                        int LA12_338 = input.LA(10);

                                        if ( ((LA12_338>='0' && LA12_338<='9')||(LA12_338>='A' && LA12_338<='Z')||LA12_338=='_'||(LA12_338>='a' && LA12_338<='z')) ) {
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
                    else {
                        return 72;}
                }
                else {
                    return 72;}
                }
            case 'a':
                {
                int LA12_125 = input.LA(4);

                if ( (LA12_125=='d') ) {
                    int LA12_167 = input.LA(5);

                    if ( (LA12_167=='-') ) {
                        return 70;
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
            int LA12_76 = input.LA(3);

            if ( (LA12_76=='l') ) {
                int LA12_126 = input.LA(4);

                if ( (LA12_126=='e') ) {
                    switch ( input.LA(5) ) {
                    case 'M':
                        {
                        int LA12_212 = input.LA(6);

                        if ( (LA12_212=='i') ) {
                            int LA12_250 = input.LA(7);

                            if ( (LA12_250=='x') ) {
                                int LA12_282 = input.LA(8);

                                if ( (LA12_282=='i') ) {
                                    int LA12_312 = input.LA(9);

                                    if ( (LA12_312=='n') ) {
                                        int LA12_339 = input.LA(10);

                                        if ( ((LA12_339>='0' && LA12_339<='9')||(LA12_339>='A' && LA12_339<='Z')||LA12_339=='_'||(LA12_339>='a' && LA12_339<='z')) ) {
                                            return 72;
                                        }
                                        else {
                                            return 25;}
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
                        return 23;}

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
        return 29;
    }

    private int mTokensHelper022() throws RecognitionException {
        int LA12_22 = input.LA(2);

        if ( (LA12_22=='.') ) {
            return 30;
        }
        else {
            return 78;}
    }

    private int mTokensHelper023() throws RecognitionException {
        return 31;
    }

    private int mTokensHelper024() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'b':
            {
            int LA12_80 = input.LA(3);

            if ( (LA12_80=='s') ) {
                int LA12_127 = input.LA(4);

                if ( (LA12_127=='t') ) {
                    int LA12_169 = input.LA(5);

                    if ( (LA12_169=='r') ) {
                        int LA12_214 = input.LA(6);

                        if ( (LA12_214=='a') ) {
                            int LA12_251 = input.LA(7);

                            if ( (LA12_251=='c') ) {
                                int LA12_283 = input.LA(8);

                                if ( (LA12_283=='t') ) {
                                    int LA12_313 = input.LA(9);

                                    if ( ((LA12_313>='0' && LA12_313<='9')||(LA12_313>='A' && LA12_313<='Z')||LA12_313=='_'||(LA12_313>='a' && LA12_313<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 60;}
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
        case 'c':
            {
            int LA12_81 = input.LA(3);

            if ( (LA12_81=='t') ) {
                int LA12_128 = input.LA(4);

                if ( (LA12_128=='i') ) {
                    int LA12_170 = input.LA(5);

                    if ( (LA12_170=='v') ) {
                        int LA12_215 = input.LA(6);

                        if ( (LA12_215=='e') ) {
                            int LA12_252 = input.LA(7);

                            if ( ((LA12_252>='0' && LA12_252<='9')||(LA12_252>='A' && LA12_252<='Z')||LA12_252=='_'||(LA12_252>='a' && LA12_252<='z')) ) {
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
        case 'g':
            {
            int LA12_82 = input.LA(3);

            if ( (LA12_82=='g') ) {
                int LA12_129 = input.LA(4);

                if ( (LA12_129=='r') ) {
                    int LA12_171 = input.LA(5);

                    if ( (LA12_171=='e') ) {
                        int LA12_216 = input.LA(6);

                        if ( (LA12_216=='g') ) {
                            int LA12_253 = input.LA(7);

                            if ( (LA12_253=='a') ) {
                                int LA12_285 = input.LA(8);

                                if ( (LA12_285=='t') ) {
                                    int LA12_314 = input.LA(9);

                                    if ( (LA12_314=='i') ) {
                                        int LA12_341 = input.LA(10);

                                        if ( (LA12_341=='o') ) {
                                            int LA12_357 = input.LA(11);

                                            if ( (LA12_357=='n') ) {
                                                int LA12_366 = input.LA(12);

                                                if ( ((LA12_366>='0' && LA12_366<='9')||(LA12_366>='A' && LA12_366<='Z')||LA12_366=='_'||(LA12_366>='a' && LA12_366<='z')) ) {
                                                    return 72;
                                                }
                                                else {
                                                    return 51;}
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
        case 's':
            {
            int LA12_83 = input.LA(3);

            if ( ((LA12_83>='0' && LA12_83<='9')||(LA12_83>='A' && LA12_83<='Z')||LA12_83=='_'||(LA12_83>='a' && LA12_83<='z')) ) {
                return 72;
            }
            else {
                return 33;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper025() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            switch ( input.LA(3) ) {
            case 'f':
                {
                int LA12_131 = input.LA(4);

                if ( (LA12_131=='a') ) {
                    int LA12_172 = input.LA(5);

                    if ( (LA12_172=='u') ) {
                        int LA12_217 = input.LA(6);

                        if ( (LA12_217=='l') ) {
                            int LA12_254 = input.LA(7);

                            if ( (LA12_254=='t') ) {
                                int LA12_286 = input.LA(8);

                                if ( (LA12_286=='s') ) {
                                    int LA12_315 = input.LA(9);

                                    if ( (LA12_315==' ') ) {
                                        return 50;
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
            case 'r':
                {
                int LA12_132 = input.LA(4);

                if ( (LA12_132=='i') ) {
                    int LA12_173 = input.LA(5);

                    if ( (LA12_173=='v') ) {
                        switch ( input.LA(6) ) {
                        case 'a':
                            {
                            int LA12_255 = input.LA(7);

                            if ( (LA12_255=='t') ) {
                                int LA12_287 = input.LA(8);

                                if ( (LA12_287=='i') ) {
                                    int LA12_316 = input.LA(9);

                                    if ( (LA12_316=='o') ) {
                                        int LA12_343 = input.LA(10);

                                        if ( (LA12_343=='n') ) {
                                            int LA12_358 = input.LA(11);

                                            if ( ((LA12_358>='0' && LA12_358<='9')||(LA12_358>='A' && LA12_358<='Z')||LA12_358=='_'||(LA12_358>='a' && LA12_358<='z')) ) {
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
                        case 'e':
                            {
                            int LA12_256 = input.LA(7);

                            if ( (LA12_256=='d') ) {
                                switch ( input.LA(8) ) {
                                case '-':
                                    {
                                    return 71;
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
                                    return 62;}

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
            default:
                return 72;}

            }
        case 'i':
            {
            int LA12_85 = input.LA(3);

            if ( (LA12_85=='s') ) {
                int LA12_133 = input.LA(4);

                if ( (LA12_133=='j') ) {
                    int LA12_174 = input.LA(5);

                    if ( (LA12_174=='o') ) {
                        int LA12_219 = input.LA(6);

                        if ( (LA12_219=='i') ) {
                            int LA12_257 = input.LA(7);

                            if ( (LA12_257=='n') ) {
                                int LA12_289 = input.LA(8);

                                if ( (LA12_289=='t') ) {
                                    int LA12_319 = input.LA(9);

                                    if ( ((LA12_319>='0' && LA12_319<='9')||(LA12_319>='A' && LA12_319<='Z')||LA12_319=='_'||(LA12_319>='a' && LA12_319<='z')) ) {
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
            int LA12_86 = input.LA(3);

            if ( (LA12_86=='t') ) {
                int LA12_134 = input.LA(4);

                if ( (LA12_134=='a') ) {
                    int LA12_175 = input.LA(5);

                    if ( (LA12_175=='t') ) {
                        int LA12_220 = input.LA(6);

                        if ( (LA12_220=='y') ) {
                            int LA12_258 = input.LA(7);

                            if ( (LA12_258=='p') ) {
                                int LA12_290 = input.LA(8);

                                if ( (LA12_290=='e') ) {
                                    int LA12_320 = input.LA(9);

                                    if ( ((LA12_320>='0' && LA12_320<='9')||(LA12_320>='A' && LA12_320<='Z')||LA12_320=='_'||(LA12_320>='a' && LA12_320<='z')) ) {
                                        return 72;
                                    }
                                    else {
                                        return 44;}
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

    private int mTokensHelper026() throws RecognitionException {
        return 46;
    }

    private int mTokensHelper027() throws RecognitionException {
        return 47;
    }

    private int mTokensHelper028() throws RecognitionException {
        int LA12_28 = input.LA(2);

        if ( (LA12_28=='e') ) {
            int LA12_89 = input.LA(3);

            if ( (LA12_89=='n') ) {
                int LA12_135 = input.LA(4);

                if ( (LA12_135=='e') ) {
                    int LA12_176 = input.LA(5);

                    if ( (LA12_176=='r') ) {
                        int LA12_221 = input.LA(6);

                        if ( (LA12_221=='a') ) {
                            int LA12_259 = input.LA(7);

                            if ( (LA12_259=='l') ) {
                                int LA12_291 = input.LA(8);

                                if ( (LA12_291=='i') ) {
                                    int LA12_321 = input.LA(9);

                                    if ( (LA12_321=='z') ) {
                                        int LA12_346 = input.LA(10);

                                        if ( (LA12_346=='a') ) {
                                            int LA12_359 = input.LA(11);

                                            if ( (LA12_359=='t') ) {
                                                int LA12_368 = input.LA(12);

                                                if ( (LA12_368=='i') ) {
                                                    int LA12_376 = input.LA(13);

                                                    if ( (LA12_376=='o') ) {
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
                                                                            return 48;}
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

    private int mTokensHelper029() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'p':
            {
            int LA12_90 = input.LA(3);

            if ( ((LA12_90>='0' && LA12_90<='9')||(LA12_90>='A' && LA12_90<='Z')||LA12_90=='_'||(LA12_90>='a' && LA12_90<='z')) ) {
                return 72;
            }
            else {
                return 49;}
            }
        case 'r':
            {
            int LA12_91 = input.LA(3);

            if ( (LA12_91=='d') ) {
                int LA12_137 = input.LA(4);

                if ( (LA12_137=='e') ) {
                    int LA12_177 = input.LA(5);

                    if ( (LA12_177=='r') ) {
                        int LA12_222 = input.LA(6);

                        if ( (LA12_222=='e') ) {
                            int LA12_260 = input.LA(7);

                            if ( (LA12_260=='d') ) {
                                int LA12_292 = input.LA(8);

                                if ( ((LA12_292>='0' && LA12_292<='9')||(LA12_292>='A' && LA12_292<='Z')||LA12_292=='_'||(LA12_292>='a' && LA12_292<='z')) ) {
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
                else {
                    return 72;}
            }
            else {
                return 72;}
            }
        default:
            return 72;}

    }

    private int mTokensHelper030() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'n':
            {
            int LA12_92 = input.LA(3);

            if ( (LA12_92=='u') ) {
                int LA12_138 = input.LA(4);

                if ( (LA12_138=='m') ) {
                    int LA12_178 = input.LA(5);

                    if ( ((LA12_178>='0' && LA12_178<='9')||(LA12_178>='A' && LA12_178<='Z')||LA12_178=='_'||(LA12_178>='a' && LA12_178<='z')) ) {
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
        case 'x':
            {
            int LA12_93 = input.LA(3);

            if ( (LA12_93=='t') ) {
                int LA12_139 = input.LA(4);

                if ( (LA12_139=='e') ) {
                    int LA12_179 = input.LA(5);

                    if ( (LA12_179=='n') ) {
                        int LA12_224 = input.LA(6);

                        if ( (LA12_224=='s') ) {
                            int LA12_261 = input.LA(7);

                            if ( (LA12_261=='i') ) {
                                int LA12_293 = input.LA(8);

                                if ( (LA12_293=='o') ) {
                                    int LA12_323 = input.LA(9);

                                    if ( (LA12_323=='n') ) {
                                        int LA12_347 = input.LA(10);

                                        if ( (LA12_347=='a') ) {
                                            int LA12_360 = input.LA(11);

                                            if ( (LA12_360=='l') ) {
                                                int LA12_369 = input.LA(12);

                                                if ( ((LA12_369>='0' && LA12_369<='9')||(LA12_369>='A' && LA12_369<='Z')||LA12_369=='_'||(LA12_369>='a' && LA12_369<='z')) ) {
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

    private int mTokensHelper031() throws RecognitionException {
        int LA12_31 = input.LA(2);

        if ( (LA12_31=='>') ) {
            return 57;
        }
        else {
            return 56;}
    }

    private int mTokensHelper032() throws RecognitionException {
        int LA12_32 = input.LA(2);

        if ( (LA12_32=='U') ) {
            int LA12_96 = input.LA(3);

            if ( (LA12_96=='L') ) {
                int LA12_140 = input.LA(4);

                if ( (LA12_140=='L') ) {
                    int LA12_180 = input.LA(5);

                    if ( ((LA12_180>='0' && LA12_180<='9')||(LA12_180>='A' && LA12_180<='Z')||LA12_180=='_'||(LA12_180>='a' && LA12_180<='z')) ) {
                        return 72;
                    }
                    else {
                        return 58;}
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

    private int mTokensHelper033() throws RecognitionException {
        int LA12_33 = input.LA(2);

        if ( (LA12_33=='e') ) {
            int LA12_97 = input.LA(3);

            if ( (LA12_97=='a') ) {
                int LA12_141 = input.LA(4);

                if ( (LA12_141=='f') ) {
                    int LA12_181 = input.LA(5);

                    if ( ((LA12_181>='0' && LA12_181<='9')||(LA12_181>='A' && LA12_181<='Z')||LA12_181=='_'||(LA12_181>='a' && LA12_181<='z')) ) {
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
        else {
            return 72;}
    }

    private int mTokensHelper034() throws RecognitionException {
        int LA12_34 = input.LA(2);

        if ( (LA12_34=='n') ) {
            int LA12_98 = input.LA(3);

            if ( (LA12_98=='i') ) {
                int LA12_142 = input.LA(4);

                if ( (LA12_142=='q') ) {
                    int LA12_182 = input.LA(5);

                    if ( (LA12_182=='u') ) {
                        int LA12_227 = input.LA(6);

                        if ( (LA12_227=='e') ) {
                            int LA12_262 = input.LA(7);

                            if ( ((LA12_262>='0' && LA12_262<='9')||(LA12_262>='A' && LA12_262<='Z')||LA12_262=='_'||(LA12_262>='a' && LA12_262<='z')) ) {
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