package br.ufes.inf.nemo.ontouml.dsl.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import br.ufes.inf.nemo.ontouml.dsl.xtext.services.OntoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "';'", "'import'", "'active'", "'abstract'", "'kind'", "':'", "','", "'{'", "'}'", "'quantity'", "'extensional'", "'collective'", "'subKind'", "'category'", "'phase'", "'role'", "'mixin'", "'roleMixin'", "'mode'", "'relator'", "'mediates'", "'['", "'..'", "']'", "'as'", "'->'", "'characterization'", "'mode:'", "'characterized:'", "'mediation'", "'relator:'", "'mediated:'", "'derivation'", "'material:'", "'derived'", "'leaf'", "'materialAssociation'", "'formalAssociation'", "'datatype'", "'type'", "'substitutable'", "'('", "')'", "'complete'", "'disjoint'", "'generalizationSet'", "'op'", "'+'", "'-'", "'*'", "'/'", "'static'", "'ordered'", "'unique'", "'read-only'", "'derived-union'", "'defaults to'", "'aggregation'", "'subset of'", "'redefines'", "'property'", "'enum'", "'='", "'=>'", "'true'", "'false'", "'NULL'", "'none'", "'shared'", "'composite'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalOntoDSLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g"; }



     	private OntoDSLGrammarAccess grammarAccess;
     	
        public InternalOntoDSLParser(TokenStream input, IAstFactory factory, OntoDSLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected OntoDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:79:2: (iv_ruleModel= ruleModel EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:80:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:87:1: ruleModel returns [EObject current=null] : ( () 'model' ( (lv_name_2_0= RULE_ID ) ) ';' ( (lv_packageImport_4_0= rulePackageImport ) )* ( (lv_packagedElement_5_0= rulePackageableElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_packageImport_4_0 = null;

        EObject lv_packagedElement_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:92:6: ( ( () 'model' ( (lv_name_2_0= RULE_ID ) ) ';' ( (lv_packageImport_4_0= rulePackageImport ) )* ( (lv_packagedElement_5_0= rulePackageableElement ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:93:1: ( () 'model' ( (lv_name_2_0= RULE_ID ) ) ';' ( (lv_packageImport_4_0= rulePackageImport ) )* ( (lv_packagedElement_5_0= rulePackageableElement ) )* )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:93:1: ( () 'model' ( (lv_name_2_0= RULE_ID ) ) ';' ( (lv_packageImport_4_0= rulePackageImport ) )* ( (lv_packagedElement_5_0= rulePackageableElement ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:93:2: () 'model' ( (lv_name_2_0= RULE_ID ) ) ';' ( (lv_packageImport_4_0= rulePackageImport ) )* ( (lv_packagedElement_5_0= rulePackageableElement ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:93:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:94:5: 
            {
             
                    temp=factory.create(grammarAccess.getModelAccess().getDslModelAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getModelAccess().getDslModelAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,11,FollowSets000.FOLLOW_11_in_ruleModel129); 

                    createLeafNode(grammarAccess.getModelAccess().getModelKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:108:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:109:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:109:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:110:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModel146); 

            			createLeafNode(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FollowSets000.FOLLOW_12_in_ruleModel161); 

                    createLeafNode(grammarAccess.getModelAccess().getSemicolonKeyword_3(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:136:1: ( (lv_packageImport_4_0= rulePackageImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:137:1: (lv_packageImport_4_0= rulePackageImport )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:137:1: (lv_packageImport_4_0= rulePackageImport )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:138:3: lv_packageImport_4_0= rulePackageImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPackageImportPackageImportParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePackageImport_in_ruleModel182);
            	    lv_packageImport_4_0=rulePackageImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"packageImport",
            	    	        		lv_packageImport_4_0, 
            	    	        		"PackageImport", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:160:3: ( (lv_packagedElement_5_0= rulePackageableElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=50 && LA2_0<=51)||LA2_0==73) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==14 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0)) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==16||LA2_0==21) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 1) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>=23 && LA2_0<=24)||(LA2_0>=26 && LA2_0<=27)||(LA2_0>=29 && LA2_0<=31)||LA2_0==38||LA2_0==41||LA2_0==44) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==49) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                    alt2=1;
                }
                else if ( (LA2_0==57) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:161:1: (lv_packagedElement_5_0= rulePackageableElement )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:161:1: (lv_packagedElement_5_0= rulePackageableElement )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:162:3: lv_packagedElement_5_0= rulePackageableElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_ruleModel204);
            	    lv_packagedElement_5_0=rulePackageableElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"packagedElement",
            	    	        		lv_packagedElement_5_0, 
            	    	        		"PackageableElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRulePackageableElement
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:192:1: entryRulePackageableElement returns [EObject current=null] : iv_rulePackageableElement= rulePackageableElement EOF ;
    public final EObject entryRulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageableElement = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:193:2: (iv_rulePackageableElement= rulePackageableElement EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:194:2: iv_rulePackageableElement= rulePackageableElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackageableElementRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_entryRulePackageableElement241);
            iv_rulePackageableElement=rulePackageableElement();
            _fsp--;

             current =iv_rulePackageableElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackageableElement251); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePackageableElement


    // $ANTLR start rulePackageableElement
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:201:1: rulePackageableElement returns [EObject current=null] : (this_Type_0= ruleType | this_Enumeration_1= ruleEnumeration | this_Class_2= ruleClass | this_Association_3= ruleAssociation | this_GeneralizationSet_4= ruleGeneralizationSet ) ;
    public final EObject rulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_Enumeration_1 = null;

        EObject this_Class_2 = null;

        EObject this_Association_3 = null;

        EObject this_GeneralizationSet_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:206:6: ( (this_Type_0= ruleType | this_Enumeration_1= ruleEnumeration | this_Class_2= ruleClass | this_Association_3= ruleAssociation | this_GeneralizationSet_4= ruleGeneralizationSet ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:207:1: (this_Type_0= ruleType | this_Enumeration_1= ruleEnumeration | this_Class_2= ruleClass | this_Association_3= ruleAssociation | this_GeneralizationSet_4= ruleGeneralizationSet )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:207:1: (this_Type_0= ruleType | this_Enumeration_1= ruleEnumeration | this_Class_2= ruleClass | this_Association_3= ruleAssociation | this_GeneralizationSet_4= ruleGeneralizationSet )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:208:5: this_Type_0= ruleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_rulePackageableElement298);
                    this_Type_0=ruleType();
                    _fsp--;

                     
                            current = this_Type_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:218:5: this_Enumeration_1= ruleEnumeration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getEnumerationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_rulePackageableElement325);
                    this_Enumeration_1=ruleEnumeration();
                    _fsp--;

                     
                            current = this_Enumeration_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:228:5: this_Class_2= ruleClass
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getClassParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClass_in_rulePackageableElement352);
                    this_Class_2=ruleClass();
                    _fsp--;

                     
                            current = this_Class_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:238:5: this_Association_3= ruleAssociation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getAssociationParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_rulePackageableElement379);
                    this_Association_3=ruleAssociation();
                    _fsp--;

                     
                            current = this_Association_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:248:5: this_GeneralizationSet_4= ruleGeneralizationSet
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getGeneralizationSetParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGeneralizationSet_in_rulePackageableElement406);
                    this_GeneralizationSet_4=ruleGeneralizationSet();
                    _fsp--;

                     
                            current = this_GeneralizationSet_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePackageableElement


    // $ANTLR start entryRuleClass
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:264:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:265:2: (iv_ruleClass= ruleClass EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:266:2: iv_ruleClass= ruleClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleClass_in_entryRuleClass441);
            iv_ruleClass=ruleClass();
            _fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClass451); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClass


    // $ANTLR start ruleClass
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:273:1: ruleClass returns [EObject current=null] : (this_Kind_0= ruleKind | this_Quantity_1= ruleQuantity | this_Collective_2= ruleCollective | this_SubKind_3= ruleSubKind | this_Category_4= ruleCategory | this_Phase_5= rulePhase | this_Role_6= ruleRole | this_Mixin_7= ruleMixin | this_RoleMixin_8= ruleRoleMixin | this_Mode_9= ruleMode | this_Relator_10= ruleRelator ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        EObject this_Kind_0 = null;

        EObject this_Quantity_1 = null;

        EObject this_Collective_2 = null;

        EObject this_SubKind_3 = null;

        EObject this_Category_4 = null;

        EObject this_Phase_5 = null;

        EObject this_Role_6 = null;

        EObject this_Mixin_7 = null;

        EObject this_RoleMixin_8 = null;

        EObject this_Mode_9 = null;

        EObject this_Relator_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:278:6: ( (this_Kind_0= ruleKind | this_Quantity_1= ruleQuantity | this_Collective_2= ruleCollective | this_SubKind_3= ruleSubKind | this_Category_4= ruleCategory | this_Phase_5= rulePhase | this_Role_6= ruleRole | this_Mixin_7= ruleMixin | this_RoleMixin_8= ruleRoleMixin | this_Mode_9= ruleMode | this_Relator_10= ruleRelator ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:279:1: (this_Kind_0= ruleKind | this_Quantity_1= ruleQuantity | this_Collective_2= ruleCollective | this_SubKind_3= ruleSubKind | this_Category_4= ruleCategory | this_Phase_5= rulePhase | this_Role_6= ruleRole | this_Mixin_7= ruleMixin | this_RoleMixin_8= ruleRoleMixin | this_Mode_9= ruleMode | this_Relator_10= ruleRelator )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:279:1: (this_Kind_0= ruleKind | this_Quantity_1= ruleQuantity | this_Collective_2= ruleCollective | this_SubKind_3= ruleSubKind | this_Category_4= ruleCategory | this_Phase_5= rulePhase | this_Role_6= ruleRole | this_Mixin_7= ruleMixin | this_RoleMixin_8= ruleRoleMixin | this_Mode_9= ruleMode | this_Relator_10= ruleRelator )
            int alt4=11;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:280:5: this_Kind_0= ruleKind
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassAccess().getKindParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKind_in_ruleClass498);
                    this_Kind_0=ruleKind();
                    _fsp--;

                     
                            current = this_Kind_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:290:5: this_Quantity_1= ruleQuantity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassAccess().getQuantityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuantity_in_ruleClass525);
                    this_Quantity_1=ruleQuantity();
                    _fsp--;

                     
                            current = this_Quantity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:300:5: this_Collective_2= ruleCollective
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassAccess().getCollectiveParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCollective_in_ruleClass552);
                    this_Collective_2=ruleCollective();
                    _fsp--;

                     
                            current = this_Collective_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:310:5: this_SubKind_3= ruleSubKind
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassAccess().getSubKindParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubKind_in_ruleClass579);
                    this_SubKind_3=ruleSubKind();
                    _fsp--;

                     
                            current = this_SubKind_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:320:5: this_Category_4= ruleCategory
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassAccess().getCategoryParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCategory_in_ruleClass606);
                    this_Category_4=ruleCategory();
                    _fsp--;

                     
                            current = this_Category_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:330:5: this_Phase_5= rulePhase
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassAccess().getPhaseParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePhase_in_ruleClass633);
                    this_Phase_5=rulePhase();
                    _fsp--;

                     
                            current = this_Phase_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:340:5: this_Role_6= ruleRole
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassAccess().getRoleParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleClass660);
                    this_Role_6=ruleRole();
                    _fsp--;

                     
                            current = this_Role_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:350:5: this_Mixin_7= ruleMixin
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassAccess().getMixinParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMixin_in_ruleClass687);
                    this_Mixin_7=ruleMixin();
                    _fsp--;

                     
                            current = this_Mixin_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:360:5: this_RoleMixin_8= ruleRoleMixin
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassAccess().getRoleMixinParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRoleMixin_in_ruleClass714);
                    this_RoleMixin_8=ruleRoleMixin();
                    _fsp--;

                     
                            current = this_RoleMixin_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:370:5: this_Mode_9= ruleMode
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassAccess().getModeParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMode_in_ruleClass741);
                    this_Mode_9=ruleMode();
                    _fsp--;

                     
                            current = this_Mode_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:380:5: this_Relator_10= ruleRelator
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getClassAccess().getRelatorParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRelator_in_ruleClass768);
                    this_Relator_10=ruleRelator();
                    _fsp--;

                     
                            current = this_Relator_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClass


    // $ANTLR start entryRuleAssociation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:396:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:397:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:398:2: iv_ruleAssociation= ruleAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_entryRuleAssociation803);
            iv_ruleAssociation=ruleAssociation();
            _fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssociation813); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssociation


    // $ANTLR start ruleAssociation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:405:1: ruleAssociation returns [EObject current=null] : (this_Characterization_0= ruleCharacterization | this_Mediation_1= ruleMediation | this_Derivation_2= ruleDerivation | this_FormalAssociation_3= ruleFormalAssociation | this_MaterialAssociation_4= ruleMaterialAssociation ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_Characterization_0 = null;

        EObject this_Mediation_1 = null;

        EObject this_Derivation_2 = null;

        EObject this_FormalAssociation_3 = null;

        EObject this_MaterialAssociation_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:410:6: ( (this_Characterization_0= ruleCharacterization | this_Mediation_1= ruleMediation | this_Derivation_2= ruleDerivation | this_FormalAssociation_3= ruleFormalAssociation | this_MaterialAssociation_4= ruleMaterialAssociation ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:411:1: (this_Characterization_0= ruleCharacterization | this_Mediation_1= ruleMediation | this_Derivation_2= ruleDerivation | this_FormalAssociation_3= ruleFormalAssociation | this_MaterialAssociation_4= ruleMaterialAssociation )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:411:1: (this_Characterization_0= ruleCharacterization | this_Mediation_1= ruleMediation | this_Derivation_2= ruleDerivation | this_FormalAssociation_3= ruleFormalAssociation | this_MaterialAssociation_4= ruleMaterialAssociation )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:412:5: this_Characterization_0= ruleCharacterization
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAssociationAccess().getCharacterizationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleAssociation860);
                    this_Characterization_0=ruleCharacterization();
                    _fsp--;

                     
                            current = this_Characterization_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:422:5: this_Mediation_1= ruleMediation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAssociationAccess().getMediationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMediation_in_ruleAssociation887);
                    this_Mediation_1=ruleMediation();
                    _fsp--;

                     
                            current = this_Mediation_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:432:5: this_Derivation_2= ruleDerivation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAssociationAccess().getDerivationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDerivation_in_ruleAssociation914);
                    this_Derivation_2=ruleDerivation();
                    _fsp--;

                     
                            current = this_Derivation_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:442:5: this_FormalAssociation_3= ruleFormalAssociation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAssociationAccess().getFormalAssociationParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFormalAssociation_in_ruleAssociation941);
                    this_FormalAssociation_3=ruleFormalAssociation();
                    _fsp--;

                     
                            current = this_FormalAssociation_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:452:5: this_MaterialAssociation_4= ruleMaterialAssociation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAssociationAccess().getMaterialAssociationParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMaterialAssociation_in_ruleAssociation968);
                    this_MaterialAssociation_4=ruleMaterialAssociation();
                    _fsp--;

                     
                            current = this_MaterialAssociation_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssociation


    // $ANTLR start entryRulePackageImport
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:468:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:469:2: (iv_rulePackageImport= rulePackageImport EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:470:2: iv_rulePackageImport= rulePackageImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackageImportRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePackageImport_in_entryRulePackageImport1003);
            iv_rulePackageImport=rulePackageImport();
            _fsp--;

             current =iv_rulePackageImport; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackageImport1013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePackageImport


    // $ANTLR start rulePackageImport
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:477:1: rulePackageImport returns [EObject current=null] : ( 'import' ( ( RULE_STRING ) ) ';' ) ;
    public final EObject rulePackageImport() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:482:6: ( ( 'import' ( ( RULE_STRING ) ) ';' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:483:1: ( 'import' ( ( RULE_STRING ) ) ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:483:1: ( 'import' ( ( RULE_STRING ) ) ';' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:483:3: 'import' ( ( RULE_STRING ) ) ';'
            {
            match(input,13,FollowSets000.FOLLOW_13_in_rulePackageImport1048); 

                    createLeafNode(grammarAccess.getPackageImportAccess().getImportKeyword_0(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:487:1: ( ( RULE_STRING ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:488:1: ( RULE_STRING )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:488:1: ( RULE_STRING )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:489:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPackageImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePackageImport1066); 

            		createLeafNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_1_0(), "importedPackage"); 
            	

            }


            }

            match(input,12,FollowSets000.FOLLOW_12_in_rulePackageImport1076); 

                    createLeafNode(grammarAccess.getPackageImportAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePackageImport


    // $ANTLR start entryRuleKind
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:513:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:514:2: (iv_ruleKind= ruleKind EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:515:2: iv_ruleKind= ruleKind EOF
            {
             currentNode = createCompositeNode(grammarAccess.getKindRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleKind_in_entryRuleKind1112);
            iv_ruleKind=ruleKind();
            _fsp--;

             current =iv_ruleKind; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKind1122); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleKind


    // $ANTLR start ruleKind
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:522:1: ruleKind returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'kind' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalization_6_0 = null;

        EObject lv_generalization_8_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:527:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'kind' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:528:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'kind' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:528:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'kind' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:528:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'kind' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:528:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:530:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:530:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:531:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getKindAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:534:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:535:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:535:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( LA6_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:537:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:537:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:538:5: {...}? => ( ( (lv_isActive_1_0= 'active' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleKind", "getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:538:101: ( ( (lv_isActive_1_0= 'active' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:539:6: ( (lv_isActive_1_0= 'active' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:542:6: ( (lv_isActive_1_0= 'active' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:543:1: (lv_isActive_1_0= 'active' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:543:1: (lv_isActive_1_0= 'active' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:544:3: lv_isActive_1_0= 'active'
            	    {
            	    lv_isActive_1_0=(Token)input.LT(1);
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleKind1207); 

            	            createLeafNode(grammarAccess.getKindAccess().getIsActiveActiveKeyword_0_0_0(), "isActive"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKindRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isActive", true, "active", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKindAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:570:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:570:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:571:5: {...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleKind", "getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:571:101: ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:572:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:575:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:576:1: (lv_isAbstract_2_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:576:1: (lv_isAbstract_2_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:577:3: lv_isAbstract_2_0= 'abstract'
            	    {
            	    lv_isAbstract_2_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleKind1288); 

            	            createLeafNode(grammarAccess.getKindAccess().getIsAbstractAbstractKeyword_0_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKindRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKindAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getKindAccess().getUnorderedGroup_0());
            	

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleKind1350); 

                    createLeafNode(grammarAccess.getKindAccess().getKindKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:614:1: ( (lv_name_4_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:615:1: (lv_name_4_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:615:1: (lv_name_4_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:616:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKind1367); 

            			createLeafNode(grammarAccess.getKindAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getKindRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:638:2: ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:638:4: ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleKind1383); 

                            createLeafNode(grammarAccess.getKindAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:642:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:643:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:643:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:644:3: lv_generalization_6_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getKindAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleKind1404);
                    lv_generalization_6_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getKindRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_6_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:666:2: ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:666:4: ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleKind1415); 

                    	            createLeafNode(grammarAccess.getKindAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:670:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:671:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:671:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:672:3: lv_generalization_8_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getKindAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleKind1436);
                    	    lv_generalization_8_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getKindRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_8_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleKind1450); 

                    createLeafNode(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:698:1: ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==53||LA9_0==72) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:698:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:698:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:699:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:699:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:700:3: lv_ownedAttribute_10_0= ruleClassProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKindAccess().getOwnedAttributeClassPropertyParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_ruleKind1472);
            	    lv_ownedAttribute_10_0=ruleClassProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKindRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAttribute",
            	    	        		lv_ownedAttribute_10_0, 
            	    	        		"ClassProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_ruleKind1482); 

            	            createLeafNode(grammarAccess.getKindAccess().getSemicolonKeyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleKind1494); 

                    createLeafNode(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleKind


    // $ANTLR start entryRuleQuantity
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:738:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:739:2: (iv_ruleQuantity= ruleQuantity EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:740:2: iv_ruleQuantity= ruleQuantity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQuantityRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleQuantity_in_entryRuleQuantity1530);
            iv_ruleQuantity=ruleQuantity();
            _fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuantity1540); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQuantity


    // $ANTLR start ruleQuantity
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:747:1: ruleQuantity returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'quantity' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalization_6_0 = null;

        EObject lv_generalization_8_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:752:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'quantity' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:753:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'quantity' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:753:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'quantity' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:753:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'quantity' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:753:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:755:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:755:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:756:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getQuantityAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:759:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:760:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:760:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:762:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:762:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:763:5: {...}? => ( ( (lv_isActive_1_0= 'active' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQuantity", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:763:105: ( ( (lv_isActive_1_0= 'active' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:764:6: ( (lv_isActive_1_0= 'active' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:767:6: ( (lv_isActive_1_0= 'active' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:768:1: (lv_isActive_1_0= 'active' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:768:1: (lv_isActive_1_0= 'active' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:769:3: lv_isActive_1_0= 'active'
            	    {
            	    lv_isActive_1_0=(Token)input.LT(1);
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleQuantity1625); 

            	            createLeafNode(grammarAccess.getQuantityAccess().getIsActiveActiveKeyword_0_0_0(), "isActive"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getQuantityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isActive", true, "active", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuantityAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:795:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:795:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:796:5: {...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQuantity", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:796:105: ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:797:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:800:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:801:1: (lv_isAbstract_2_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:801:1: (lv_isAbstract_2_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:802:3: lv_isAbstract_2_0= 'abstract'
            	    {
            	    lv_isAbstract_2_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleQuantity1706); 

            	            createLeafNode(grammarAccess.getQuantityAccess().getIsAbstractAbstractKeyword_0_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getQuantityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuantityAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getQuantityAccess().getUnorderedGroup_0());
            	

            }

            match(input,21,FollowSets000.FOLLOW_21_in_ruleQuantity1768); 

                    createLeafNode(grammarAccess.getQuantityAccess().getQuantityKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:839:1: ( (lv_name_4_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:840:1: (lv_name_4_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:840:1: (lv_name_4_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:841:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQuantity1785); 

            			createLeafNode(grammarAccess.getQuantityAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQuantityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:863:2: ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:863:4: ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleQuantity1801); 

                            createLeafNode(grammarAccess.getQuantityAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:867:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:868:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:868:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:869:3: lv_generalization_6_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getQuantityAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleQuantity1822);
                    lv_generalization_6_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQuantityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_6_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:891:2: ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:891:4: ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleQuantity1833); 

                    	            createLeafNode(grammarAccess.getQuantityAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:895:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:896:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:896:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:897:3: lv_generalization_8_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getQuantityAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleQuantity1854);
                    	    lv_generalization_8_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getQuantityRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_8_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleQuantity1868); 

                    createLeafNode(grammarAccess.getQuantityAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:923:1: ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==53||LA13_0==72) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:923:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:923:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:924:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:924:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:925:3: lv_ownedAttribute_10_0= ruleClassProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getQuantityAccess().getOwnedAttributeClassPropertyParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_ruleQuantity1890);
            	    lv_ownedAttribute_10_0=ruleClassProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getQuantityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAttribute",
            	    	        		lv_ownedAttribute_10_0, 
            	    	        		"ClassProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_ruleQuantity1900); 

            	            createLeafNode(grammarAccess.getQuantityAccess().getSemicolonKeyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleQuantity1912); 

                    createLeafNode(grammarAccess.getQuantityAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQuantity


    // $ANTLR start entryRuleCollective
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:963:1: entryRuleCollective returns [EObject current=null] : iv_ruleCollective= ruleCollective EOF ;
    public final EObject entryRuleCollective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollective = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:964:2: (iv_ruleCollective= ruleCollective EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:965:2: iv_ruleCollective= ruleCollective EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectiveRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCollective_in_entryRuleCollective1948);
            iv_ruleCollective=ruleCollective();
            _fsp--;

             current =iv_ruleCollective; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollective1958); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollective


    // $ANTLR start ruleCollective
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:972:1: ruleCollective returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )* ) ) ) 'collective' ( (lv_name_5_0= RULE_ID ) ) ( ':' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_11_0= ruleClassProperty ) ) ';' )* '}' ) ;
    public final EObject ruleCollective() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_isExtensional_2_0=null;
        Token lv_isAbstract_3_0=null;
        Token lv_name_5_0=null;
        EObject lv_generalization_7_0 = null;

        EObject lv_generalization_9_0 = null;

        EObject lv_ownedAttribute_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:977:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )* ) ) ) 'collective' ( (lv_name_5_0= RULE_ID ) ) ( ':' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_11_0= ruleClassProperty ) ) ';' )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:978:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )* ) ) ) 'collective' ( (lv_name_5_0= RULE_ID ) ) ( ':' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_11_0= ruleClassProperty ) ) ';' )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:978:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )* ) ) ) 'collective' ( (lv_name_5_0= RULE_ID ) ) ( ':' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_11_0= ruleClassProperty ) ) ';' )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:978:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )* ) ) ) 'collective' ( (lv_name_5_0= RULE_ID ) ) ( ':' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_11_0= ruleClassProperty ) ) ';' )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:978:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:980:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:980:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:981:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCollectiveAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:984:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:985:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:985:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )*
            loop14:
            do {
                int alt14=4;
                int LA14_0 = input.LA(1);

                if ( LA14_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2) ) {
                    alt14=3;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:987:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:987:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:988:5: {...}? => ( ( (lv_isActive_1_0= 'active' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCollective", "getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:988:107: ( ( (lv_isActive_1_0= 'active' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:989:6: ( (lv_isActive_1_0= 'active' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:992:6: ( (lv_isActive_1_0= 'active' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:993:1: (lv_isActive_1_0= 'active' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:993:1: (lv_isActive_1_0= 'active' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:994:3: lv_isActive_1_0= 'active'
            	    {
            	    lv_isActive_1_0=(Token)input.LT(1);
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleCollective2043); 

            	            createLeafNode(grammarAccess.getCollectiveAccess().getIsActiveActiveKeyword_0_0_0(), "isActive"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCollectiveRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isActive", true, "active", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCollectiveAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1020:4: ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1020:4: ({...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1021:5: {...}? => ( ( (lv_isExtensional_2_0= 'extensional' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCollective", "getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1021:107: ( ( (lv_isExtensional_2_0= 'extensional' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1022:6: ( (lv_isExtensional_2_0= 'extensional' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1025:6: ( (lv_isExtensional_2_0= 'extensional' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1026:1: (lv_isExtensional_2_0= 'extensional' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1026:1: (lv_isExtensional_2_0= 'extensional' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1027:3: lv_isExtensional_2_0= 'extensional'
            	    {
            	    lv_isExtensional_2_0=(Token)input.LT(1);
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleCollective2124); 

            	            createLeafNode(grammarAccess.getCollectiveAccess().getIsExtensionalExtensionalKeyword_0_1_0(), "isExtensional"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCollectiveRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isExtensional", true, "extensional", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCollectiveAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1053:4: ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1053:4: ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1054:5: {...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCollective", "getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1054:107: ( ( (lv_isAbstract_3_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1055:6: ( (lv_isAbstract_3_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1058:6: ( (lv_isAbstract_3_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1059:1: (lv_isAbstract_3_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1059:1: (lv_isAbstract_3_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1060:3: lv_isAbstract_3_0= 'abstract'
            	    {
            	    lv_isAbstract_3_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleCollective2205); 

            	            createLeafNode(grammarAccess.getCollectiveAccess().getIsAbstractAbstractKeyword_0_2_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCollectiveRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCollectiveAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCollectiveAccess().getUnorderedGroup_0());
            	

            }

            match(input,23,FollowSets000.FOLLOW_23_in_ruleCollective2267); 

                    createLeafNode(grammarAccess.getCollectiveAccess().getCollectiveKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1097:1: ( (lv_name_5_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1098:1: (lv_name_5_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1098:1: (lv_name_5_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1099:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCollective2284); 

            			createLeafNode(grammarAccess.getCollectiveAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectiveRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_5_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1121:2: ( ':' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1121:4: ':' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleCollective2300); 

                            createLeafNode(grammarAccess.getCollectiveAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1125:1: ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1126:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1126:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1127:3: lv_generalization_7_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCollectiveAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCollective2321);
                    lv_generalization_7_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCollectiveRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_7_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1149:2: ( ',' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1149:4: ',' ( (lv_generalization_9_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleCollective2332); 

                    	            createLeafNode(grammarAccess.getCollectiveAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1153:1: ( (lv_generalization_9_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1154:1: (lv_generalization_9_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1154:1: (lv_generalization_9_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1155:3: lv_generalization_9_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectiveAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCollective2353);
                    	    lv_generalization_9_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCollectiveRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_9_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleCollective2367); 

                    createLeafNode(grammarAccess.getCollectiveAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1181:1: ( ( (lv_ownedAttribute_11_0= ruleClassProperty ) ) ';' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==53||LA17_0==72) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1181:2: ( (lv_ownedAttribute_11_0= ruleClassProperty ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1181:2: ( (lv_ownedAttribute_11_0= ruleClassProperty ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1182:1: (lv_ownedAttribute_11_0= ruleClassProperty )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1182:1: (lv_ownedAttribute_11_0= ruleClassProperty )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1183:3: lv_ownedAttribute_11_0= ruleClassProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCollectiveAccess().getOwnedAttributeClassPropertyParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_ruleCollective2389);
            	    lv_ownedAttribute_11_0=ruleClassProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCollectiveRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAttribute",
            	    	        		lv_ownedAttribute_11_0, 
            	    	        		"ClassProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_ruleCollective2399); 

            	            createLeafNode(grammarAccess.getCollectiveAccess().getSemicolonKeyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleCollective2411); 

                    createLeafNode(grammarAccess.getCollectiveAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollective


    // $ANTLR start entryRuleSubKind
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1221:1: entryRuleSubKind returns [EObject current=null] : iv_ruleSubKind= ruleSubKind EOF ;
    public final EObject entryRuleSubKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubKind = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1222:2: (iv_ruleSubKind= ruleSubKind EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1223:2: iv_ruleSubKind= ruleSubKind EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubKindRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSubKind_in_entryRuleSubKind2447);
            iv_ruleSubKind=ruleSubKind();
            _fsp--;

             current =iv_ruleSubKind; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubKind2457); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSubKind


    // $ANTLR start ruleSubKind
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1230:1: ruleSubKind returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'subKind' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) ;
    public final EObject ruleSubKind() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalization_6_0 = null;

        EObject lv_generalization_8_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1235:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'subKind' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1236:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'subKind' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1236:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'subKind' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1236:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'subKind' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1236:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1238:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1238:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1239:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSubKindAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1242:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1243:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1243:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( LA18_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1245:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1245:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1246:5: {...}? => ( ( (lv_isActive_1_0= 'active' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSubKind", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1246:104: ( ( (lv_isActive_1_0= 'active' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1247:6: ( (lv_isActive_1_0= 'active' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1250:6: ( (lv_isActive_1_0= 'active' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1251:1: (lv_isActive_1_0= 'active' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1251:1: (lv_isActive_1_0= 'active' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1252:3: lv_isActive_1_0= 'active'
            	    {
            	    lv_isActive_1_0=(Token)input.LT(1);
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleSubKind2542); 

            	            createLeafNode(grammarAccess.getSubKindAccess().getIsActiveActiveKeyword_0_0_0(), "isActive"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSubKindRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isActive", true, "active", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubKindAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1278:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1278:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1279:5: {...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSubKind", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1279:104: ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1280:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1283:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1284:1: (lv_isAbstract_2_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1284:1: (lv_isAbstract_2_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1285:3: lv_isAbstract_2_0= 'abstract'
            	    {
            	    lv_isAbstract_2_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleSubKind2623); 

            	            createLeafNode(grammarAccess.getSubKindAccess().getIsAbstractAbstractKeyword_0_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSubKindRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubKindAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSubKindAccess().getUnorderedGroup_0());
            	

            }

            match(input,24,FollowSets000.FOLLOW_24_in_ruleSubKind2685); 

                    createLeafNode(grammarAccess.getSubKindAccess().getSubKindKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1322:1: ( (lv_name_4_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1323:1: (lv_name_4_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1323:1: (lv_name_4_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1324:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubKind2702); 

            			createLeafNode(grammarAccess.getSubKindAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSubKindRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1346:2: ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1346:4: ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleSubKind2718); 

                            createLeafNode(grammarAccess.getSubKindAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1350:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1351:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1351:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1352:3: lv_generalization_6_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSubKindAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleSubKind2739);
                    lv_generalization_6_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSubKindRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_6_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1374:2: ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==18) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1374:4: ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleSubKind2750); 

                    	            createLeafNode(grammarAccess.getSubKindAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1378:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1379:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1379:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1380:3: lv_generalization_8_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSubKindAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleSubKind2771);
                    	    lv_generalization_8_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSubKindRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_8_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleSubKind2785); 

                    createLeafNode(grammarAccess.getSubKindAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1406:1: ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==53||LA21_0==72) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1406:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1406:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1407:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1407:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1408:3: lv_ownedAttribute_10_0= ruleClassProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSubKindAccess().getOwnedAttributeClassPropertyParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_ruleSubKind2807);
            	    lv_ownedAttribute_10_0=ruleClassProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSubKindRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAttribute",
            	    	        		lv_ownedAttribute_10_0, 
            	    	        		"ClassProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_ruleSubKind2817); 

            	            createLeafNode(grammarAccess.getSubKindAccess().getSemicolonKeyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleSubKind2829); 

                    createLeafNode(grammarAccess.getSubKindAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSubKind


    // $ANTLR start entryRuleCategory
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1446:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1447:2: (iv_ruleCategory= ruleCategory EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1448:2: iv_ruleCategory= ruleCategory EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCategoryRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_entryRuleCategory2865);
            iv_ruleCategory=ruleCategory();
            _fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCategory2875); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCategory


    // $ANTLR start ruleCategory
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1455:1: ruleCategory returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) ) 'category' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalization_6_0 = null;

        EObject lv_generalization_8_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1460:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) ) 'category' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1461:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) ) 'category' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1461:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) ) 'category' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1461:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) ) 'category' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1461:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1463:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1463:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1464:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCategoryAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1467:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1468:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1468:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( LA22_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1470:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1470:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1471:5: {...}? => ( ( (lv_isActive_1_0= 'active' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCategory", "getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1471:105: ( ( (lv_isActive_1_0= 'active' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1472:6: ( (lv_isActive_1_0= 'active' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1475:6: ( (lv_isActive_1_0= 'active' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1476:1: (lv_isActive_1_0= 'active' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1476:1: (lv_isActive_1_0= 'active' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1477:3: lv_isActive_1_0= 'active'
            	    {
            	    lv_isActive_1_0=(Token)input.LT(1);
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleCategory2960); 

            	            createLeafNode(grammarAccess.getCategoryAccess().getIsActiveActiveKeyword_0_0_0(), "isActive"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isActive", true, "active", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCategoryAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1503:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1503:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1504:5: {...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCategory", "getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1504:105: ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1505:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1508:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1509:1: (lv_isAbstract_2_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1509:1: (lv_isAbstract_2_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1510:3: lv_isAbstract_2_0= 'abstract'
            	    {
            	    lv_isAbstract_2_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleCategory3041); 

            	            createLeafNode(grammarAccess.getCategoryAccess().getIsAbstractAbstractKeyword_0_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCategoryAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCategoryAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleCategory", "getUnorderedGroupHelper().canLeave(grammarAccess.getCategoryAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCategoryAccess().getUnorderedGroup_0());
            	

            }

            match(input,25,FollowSets000.FOLLOW_25_in_ruleCategory3109); 

                    createLeafNode(grammarAccess.getCategoryAccess().getCategoryKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1548:1: ( (lv_name_4_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1549:1: (lv_name_4_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1549:1: (lv_name_4_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1550:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCategory3126); 

            			createLeafNode(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1572:2: ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1572:4: ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleCategory3142); 

                            createLeafNode(grammarAccess.getCategoryAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1576:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1577:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1577:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1578:3: lv_generalization_6_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCategoryAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCategory3163);
                    lv_generalization_6_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_6_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1600:2: ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1600:4: ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleCategory3174); 

                    	            createLeafNode(grammarAccess.getCategoryAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1604:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1605:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1605:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1606:3: lv_generalization_8_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCategoryAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCategory3195);
                    	    lv_generalization_8_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_8_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleCategory3209); 

                    createLeafNode(grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1632:1: ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==53||LA25_0==72) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1632:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1632:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1633:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1633:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1634:3: lv_ownedAttribute_10_0= ruleClassProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCategoryAccess().getOwnedAttributeClassPropertyParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_ruleCategory3231);
            	    lv_ownedAttribute_10_0=ruleClassProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAttribute",
            	    	        		lv_ownedAttribute_10_0, 
            	    	        		"ClassProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_ruleCategory3241); 

            	            createLeafNode(grammarAccess.getCategoryAccess().getSemicolonKeyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleCategory3253); 

                    createLeafNode(grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCategory


    // $ANTLR start entryRulePhase
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1672:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1673:2: (iv_rulePhase= rulePhase EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1674:2: iv_rulePhase= rulePhase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPhaseRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePhase_in_entryRulePhase3289);
            iv_rulePhase=rulePhase();
            _fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhase3299); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePhase


    // $ANTLR start rulePhase
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1681:1: rulePhase returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'phase' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalization_6_0 = null;

        EObject lv_generalization_8_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1686:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'phase' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1687:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'phase' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1687:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'phase' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1687:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'phase' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1687:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1689:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1689:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1690:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPhaseAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1693:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1694:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1694:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( LA26_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1696:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1696:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1697:5: {...}? => ( ( (lv_isActive_1_0= 'active' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePhase", "getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1697:102: ( ( (lv_isActive_1_0= 'active' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1698:6: ( (lv_isActive_1_0= 'active' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1701:6: ( (lv_isActive_1_0= 'active' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1702:1: (lv_isActive_1_0= 'active' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1702:1: (lv_isActive_1_0= 'active' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1703:3: lv_isActive_1_0= 'active'
            	    {
            	    lv_isActive_1_0=(Token)input.LT(1);
            	    match(input,14,FollowSets000.FOLLOW_14_in_rulePhase3384); 

            	            createLeafNode(grammarAccess.getPhaseAccess().getIsActiveActiveKeyword_0_0_0(), "isActive"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPhaseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isActive", true, "active", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPhaseAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1729:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1729:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1730:5: {...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePhase", "getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1730:102: ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1731:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1734:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1735:1: (lv_isAbstract_2_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1735:1: (lv_isAbstract_2_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1736:3: lv_isAbstract_2_0= 'abstract'
            	    {
            	    lv_isAbstract_2_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_rulePhase3465); 

            	            createLeafNode(grammarAccess.getPhaseAccess().getIsAbstractAbstractKeyword_0_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPhaseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPhaseAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPhaseAccess().getUnorderedGroup_0());
            	

            }

            match(input,26,FollowSets000.FOLLOW_26_in_rulePhase3527); 

                    createLeafNode(grammarAccess.getPhaseAccess().getPhaseKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1773:1: ( (lv_name_4_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1774:1: (lv_name_4_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1774:1: (lv_name_4_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1775:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePhase3544); 

            			createLeafNode(grammarAccess.getPhaseAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPhaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1797:2: ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1797:4: ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rulePhase3560); 

                            createLeafNode(grammarAccess.getPhaseAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1801:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1802:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1802:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1803:3: lv_generalization_6_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPhaseAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_rulePhase3581);
                    lv_generalization_6_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPhaseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_6_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1825:2: ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==18) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1825:4: ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_rulePhase3592); 

                    	            createLeafNode(grammarAccess.getPhaseAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1829:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1830:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1830:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1831:3: lv_generalization_8_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPhaseAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_rulePhase3613);
                    	    lv_generalization_8_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPhaseRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_8_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_rulePhase3627); 

                    createLeafNode(grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1857:1: ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==53||LA29_0==72) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1857:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1857:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1858:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1858:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1859:3: lv_ownedAttribute_10_0= ruleClassProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPhaseAccess().getOwnedAttributeClassPropertyParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_rulePhase3649);
            	    lv_ownedAttribute_10_0=ruleClassProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPhaseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAttribute",
            	    	        		lv_ownedAttribute_10_0, 
            	    	        		"ClassProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_rulePhase3659); 

            	            createLeafNode(grammarAccess.getPhaseAccess().getSemicolonKeyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_rulePhase3671); 

                    createLeafNode(grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePhase


    // $ANTLR start entryRuleRole
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1897:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1898:2: (iv_ruleRole= ruleRole EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1899:2: iv_ruleRole= ruleRole EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRoleRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole3707);
            iv_ruleRole=ruleRole();
            _fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole3717); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRole


    // $ANTLR start ruleRole
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1906:1: ruleRole returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'role' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalization_6_0 = null;

        EObject lv_generalization_8_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1911:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'role' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1912:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'role' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1912:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'role' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1912:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'role' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1912:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1914:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1914:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1915:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRoleAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1918:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1919:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1919:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( LA30_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1921:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1921:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1922:5: {...}? => ( ( (lv_isActive_1_0= 'active' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRole", "getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1922:101: ( ( (lv_isActive_1_0= 'active' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1923:6: ( (lv_isActive_1_0= 'active' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1926:6: ( (lv_isActive_1_0= 'active' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1927:1: (lv_isActive_1_0= 'active' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1927:1: (lv_isActive_1_0= 'active' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1928:3: lv_isActive_1_0= 'active'
            	    {
            	    lv_isActive_1_0=(Token)input.LT(1);
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleRole3802); 

            	            createLeafNode(grammarAccess.getRoleAccess().getIsActiveActiveKeyword_0_0_0(), "isActive"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isActive", true, "active", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRoleAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1954:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1954:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1955:5: {...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRole", "getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1955:101: ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1956:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1959:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1960:1: (lv_isAbstract_2_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1960:1: (lv_isAbstract_2_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1961:3: lv_isAbstract_2_0= 'abstract'
            	    {
            	    lv_isAbstract_2_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleRole3883); 

            	            createLeafNode(grammarAccess.getRoleAccess().getIsAbstractAbstractKeyword_0_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRoleAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRoleAccess().getUnorderedGroup_0());
            	

            }

            match(input,27,FollowSets000.FOLLOW_27_in_ruleRole3945); 

                    createLeafNode(grammarAccess.getRoleAccess().getRoleKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1998:1: ( (lv_name_4_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1999:1: (lv_name_4_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:1999:1: (lv_name_4_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2000:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRole3962); 

            			createLeafNode(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2022:2: ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2022:4: ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleRole3978); 

                            createLeafNode(grammarAccess.getRoleAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2026:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2027:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2027:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2028:3: lv_generalization_6_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRole3999);
                    lv_generalization_6_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_6_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2050:2: ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==18) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2050:4: ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleRole4010); 

                    	            createLeafNode(grammarAccess.getRoleAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2054:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2055:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2055:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2056:3: lv_generalization_8_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRole4031);
                    	    lv_generalization_8_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_8_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleRole4045); 

                    createLeafNode(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2082:1: ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==53||LA33_0==72) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2082:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2082:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2083:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2083:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2084:3: lv_ownedAttribute_10_0= ruleClassProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getOwnedAttributeClassPropertyParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_ruleRole4067);
            	    lv_ownedAttribute_10_0=ruleClassProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAttribute",
            	    	        		lv_ownedAttribute_10_0, 
            	    	        		"ClassProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_ruleRole4077); 

            	            createLeafNode(grammarAccess.getRoleAccess().getSemicolonKeyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleRole4089); 

                    createLeafNode(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRole


    // $ANTLR start entryRuleMixin
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2122:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2123:2: (iv_ruleMixin= ruleMixin EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2124:2: iv_ruleMixin= ruleMixin EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMixinRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleMixin_in_entryRuleMixin4125);
            iv_ruleMixin=ruleMixin();
            _fsp--;

             current =iv_ruleMixin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMixin4135); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMixin


    // $ANTLR start ruleMixin
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2131:1: ruleMixin returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) ) 'mixin' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) ;
    public final EObject ruleMixin() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalization_6_0 = null;

        EObject lv_generalization_8_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2136:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) ) 'mixin' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2137:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) ) 'mixin' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2137:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) ) 'mixin' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2137:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) ) 'mixin' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2137:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2139:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2139:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2140:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMixinAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2143:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2144:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2144:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=3;
                int LA34_0 = input.LA(1);

                if ( LA34_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1) ) {
                    alt34=2;
                }


                switch (alt34) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2146:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2146:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2147:5: {...}? => ( ( (lv_isActive_1_0= 'active' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMixin", "getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2147:102: ( ( (lv_isActive_1_0= 'active' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2148:6: ( (lv_isActive_1_0= 'active' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2151:6: ( (lv_isActive_1_0= 'active' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2152:1: (lv_isActive_1_0= 'active' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2152:1: (lv_isActive_1_0= 'active' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2153:3: lv_isActive_1_0= 'active'
            	    {
            	    lv_isActive_1_0=(Token)input.LT(1);
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleMixin4220); 

            	            createLeafNode(grammarAccess.getMixinAccess().getIsActiveActiveKeyword_0_0_0(), "isActive"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMixinRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isActive", true, "active", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMixinAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2179:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2179:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2180:5: {...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMixin", "getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2180:102: ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2181:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2184:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2185:1: (lv_isAbstract_2_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2185:1: (lv_isAbstract_2_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2186:3: lv_isAbstract_2_0= 'abstract'
            	    {
            	    lv_isAbstract_2_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleMixin4301); 

            	            createLeafNode(grammarAccess.getMixinAccess().getIsAbstractAbstractKeyword_0_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMixinRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMixinAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMixinAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleMixin", "getUnorderedGroupHelper().canLeave(grammarAccess.getMixinAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMixinAccess().getUnorderedGroup_0());
            	

            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleMixin4369); 

                    createLeafNode(grammarAccess.getMixinAccess().getMixinKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2224:1: ( (lv_name_4_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2225:1: (lv_name_4_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2225:1: (lv_name_4_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2226:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMixin4386); 

            			createLeafNode(grammarAccess.getMixinAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMixinRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2248:2: ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2248:4: ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleMixin4402); 

                            createLeafNode(grammarAccess.getMixinAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2252:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2253:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2253:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2254:3: lv_generalization_6_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMixinAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMixin4423);
                    lv_generalization_6_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMixinRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_6_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2276:2: ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==18) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2276:4: ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleMixin4434); 

                    	            createLeafNode(grammarAccess.getMixinAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2280:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2281:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2281:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2282:3: lv_generalization_8_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMixinAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMixin4455);
                    	    lv_generalization_8_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMixinRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_8_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleMixin4469); 

                    createLeafNode(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2308:1: ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==53||LA37_0==72) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2308:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2308:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2309:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2309:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2310:3: lv_ownedAttribute_10_0= ruleClassProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMixinAccess().getOwnedAttributeClassPropertyParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_ruleMixin4491);
            	    lv_ownedAttribute_10_0=ruleClassProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMixinRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAttribute",
            	    	        		lv_ownedAttribute_10_0, 
            	    	        		"ClassProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_ruleMixin4501); 

            	            createLeafNode(grammarAccess.getMixinAccess().getSemicolonKeyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleMixin4513); 

                    createLeafNode(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMixin


    // $ANTLR start entryRuleRoleMixin
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2348:1: entryRuleRoleMixin returns [EObject current=null] : iv_ruleRoleMixin= ruleRoleMixin EOF ;
    public final EObject entryRuleRoleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleMixin = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2349:2: (iv_ruleRoleMixin= ruleRoleMixin EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2350:2: iv_ruleRoleMixin= ruleRoleMixin EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRoleMixinRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleRoleMixin_in_entryRuleRoleMixin4549);
            iv_ruleRoleMixin=ruleRoleMixin();
            _fsp--;

             current =iv_ruleRoleMixin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoleMixin4559); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRoleMixin


    // $ANTLR start ruleRoleMixin
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2357:1: ruleRoleMixin returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'roleMixin' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) ;
    public final EObject ruleRoleMixin() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalization_6_0 = null;

        EObject lv_generalization_8_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2362:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'roleMixin' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2363:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'roleMixin' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2363:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'roleMixin' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2363:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'roleMixin' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2363:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2365:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2365:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2366:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2369:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2370:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2370:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( LA38_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2372:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2372:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2373:5: {...}? => ( ( (lv_isActive_1_0= 'active' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRoleMixin", "getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2373:106: ( ( (lv_isActive_1_0= 'active' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2374:6: ( (lv_isActive_1_0= 'active' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2377:6: ( (lv_isActive_1_0= 'active' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2378:1: (lv_isActive_1_0= 'active' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2378:1: (lv_isActive_1_0= 'active' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2379:3: lv_isActive_1_0= 'active'
            	    {
            	    lv_isActive_1_0=(Token)input.LT(1);
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleRoleMixin4644); 

            	            createLeafNode(grammarAccess.getRoleMixinAccess().getIsActiveActiveKeyword_0_0_0(), "isActive"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRoleMixinRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isActive", true, "active", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2405:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2405:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2406:5: {...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRoleMixin", "getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2406:106: ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2407:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2410:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2411:1: (lv_isAbstract_2_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2411:1: (lv_isAbstract_2_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2412:3: lv_isAbstract_2_0= 'abstract'
            	    {
            	    lv_isAbstract_2_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleRoleMixin4725); 

            	            createLeafNode(grammarAccess.getRoleMixinAccess().getIsAbstractAbstractKeyword_0_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRoleMixinRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0());
            	

            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleRoleMixin4787); 

                    createLeafNode(grammarAccess.getRoleMixinAccess().getRoleMixinKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2449:1: ( (lv_name_4_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2450:1: (lv_name_4_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2450:1: (lv_name_4_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2451:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRoleMixin4804); 

            			createLeafNode(grammarAccess.getRoleMixinAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRoleMixinRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2473:2: ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==17) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2473:4: ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleRoleMixin4820); 

                            createLeafNode(grammarAccess.getRoleMixinAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2477:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2478:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2478:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2479:3: lv_generalization_6_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRoleMixinAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRoleMixin4841);
                    lv_generalization_6_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRoleMixinRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_6_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2501:2: ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==18) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2501:4: ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleRoleMixin4852); 

                    	            createLeafNode(grammarAccess.getRoleMixinAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2505:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2506:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2506:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2507:3: lv_generalization_8_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRoleMixinAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRoleMixin4873);
                    	    lv_generalization_8_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRoleMixinRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_8_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleRoleMixin4887); 

                    createLeafNode(grammarAccess.getRoleMixinAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2533:1: ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==53||LA41_0==72) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2533:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2533:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2534:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2534:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2535:3: lv_ownedAttribute_10_0= ruleClassProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRoleMixinAccess().getOwnedAttributeClassPropertyParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_ruleRoleMixin4909);
            	    lv_ownedAttribute_10_0=ruleClassProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRoleMixinRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAttribute",
            	    	        		lv_ownedAttribute_10_0, 
            	    	        		"ClassProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_ruleRoleMixin4919); 

            	            createLeafNode(grammarAccess.getRoleMixinAccess().getSemicolonKeyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleRoleMixin4931); 

                    createLeafNode(grammarAccess.getRoleMixinAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRoleMixin


    // $ANTLR start entryRuleMode
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2573:1: entryRuleMode returns [EObject current=null] : iv_ruleMode= ruleMode EOF ;
    public final EObject entryRuleMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMode = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2574:2: (iv_ruleMode= ruleMode EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2575:2: iv_ruleMode= ruleMode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleMode_in_entryRuleMode4967);
            iv_ruleMode=ruleMode();
            _fsp--;

             current =iv_ruleMode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMode4977); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMode


    // $ANTLR start ruleMode
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2582:1: ruleMode returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'mode' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) ;
    public final EObject ruleMode() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalization_6_0 = null;

        EObject lv_generalization_8_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2587:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'mode' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2588:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'mode' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2588:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'mode' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2588:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'mode' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2588:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2590:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2590:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2591:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getModeAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2594:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2595:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2595:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( LA42_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0) ) {
                    alt42=1;
                }
                else if ( LA42_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1) ) {
                    alt42=2;
                }


                switch (alt42) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2597:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2597:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2598:5: {...}? => ( ( (lv_isActive_1_0= 'active' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMode", "getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2598:101: ( ( (lv_isActive_1_0= 'active' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2599:6: ( (lv_isActive_1_0= 'active' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2602:6: ( (lv_isActive_1_0= 'active' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2603:1: (lv_isActive_1_0= 'active' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2603:1: (lv_isActive_1_0= 'active' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2604:3: lv_isActive_1_0= 'active'
            	    {
            	    lv_isActive_1_0=(Token)input.LT(1);
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleMode5062); 

            	            createLeafNode(grammarAccess.getModeAccess().getIsActiveActiveKeyword_0_0_0(), "isActive"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isActive", true, "active", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModeAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2630:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2630:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2631:5: {...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMode", "getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2631:101: ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2632:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2635:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2636:1: (lv_isAbstract_2_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2636:1: (lv_isAbstract_2_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2637:3: lv_isAbstract_2_0= 'abstract'
            	    {
            	    lv_isAbstract_2_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleMode5143); 

            	            createLeafNode(grammarAccess.getModeAccess().getIsAbstractAbstractKeyword_0_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModeAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getModeAccess().getUnorderedGroup_0());
            	

            }

            match(input,30,FollowSets000.FOLLOW_30_in_ruleMode5205); 

                    createLeafNode(grammarAccess.getModeAccess().getModeKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2674:1: ( (lv_name_4_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2675:1: (lv_name_4_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2675:1: (lv_name_4_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2676:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMode5222); 

            			createLeafNode(grammarAccess.getModeAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2698:2: ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==17) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2698:4: ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleMode5238); 

                            createLeafNode(grammarAccess.getModeAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2702:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2703:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2703:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2704:3: lv_generalization_6_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModeAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMode5259);
                    lv_generalization_6_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_6_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2726:2: ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==18) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2726:4: ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleMode5270); 

                    	            createLeafNode(grammarAccess.getModeAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2730:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2731:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2731:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2732:3: lv_generalization_8_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModeAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMode5291);
                    	    lv_generalization_8_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getModeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_8_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleMode5305); 

                    createLeafNode(grammarAccess.getModeAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2758:1: ( ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';' )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==53||LA45_0==72) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2758:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2758:2: ( (lv_ownedAttribute_10_0= ruleClassProperty ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2759:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2759:1: (lv_ownedAttribute_10_0= ruleClassProperty )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2760:3: lv_ownedAttribute_10_0= ruleClassProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModeAccess().getOwnedAttributeClassPropertyParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_ruleMode5327);
            	    lv_ownedAttribute_10_0=ruleClassProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAttribute",
            	    	        		lv_ownedAttribute_10_0, 
            	    	        		"ClassProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_ruleMode5337); 

            	            createLeafNode(grammarAccess.getModeAccess().getSemicolonKeyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleMode5349); 

                    createLeafNode(grammarAccess.getModeAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMode


    // $ANTLR start entryRuleRelator
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2798:1: entryRuleRelator returns [EObject current=null] : iv_ruleRelator= ruleRelator EOF ;
    public final EObject entryRuleRelator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelator = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2799:2: (iv_ruleRelator= ruleRelator EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2800:2: iv_ruleRelator= ruleRelator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelatorRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleRelator_in_entryRuleRelator5385);
            iv_ruleRelator=ruleRelator();
            _fsp--;

             current =iv_ruleRelator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelator5395); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRelator


    // $ANTLR start ruleRelator
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2807:1: ruleRelator returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'relator' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' 'mediates' ( (lv_mediations_11_0= ruleSimpleMediation ) ) ( 'mediates' ( (lv_mediations_13_0= ruleSimpleMediation ) ) )+ ( ( (lv_ownedAttribute_14_0= ruleClassProperty ) ) ';' )* '}' ) ;
    public final EObject ruleRelator() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_isAbstract_2_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalization_6_0 = null;

        EObject lv_generalization_8_0 = null;

        EObject lv_mediations_11_0 = null;

        EObject lv_mediations_13_0 = null;

        EObject lv_ownedAttribute_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2812:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'relator' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' 'mediates' ( (lv_mediations_11_0= ruleSimpleMediation ) ) ( 'mediates' ( (lv_mediations_13_0= ruleSimpleMediation ) ) )+ ( ( (lv_ownedAttribute_14_0= ruleClassProperty ) ) ';' )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2813:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'relator' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' 'mediates' ( (lv_mediations_11_0= ruleSimpleMediation ) ) ( 'mediates' ( (lv_mediations_13_0= ruleSimpleMediation ) ) )+ ( ( (lv_ownedAttribute_14_0= ruleClassProperty ) ) ';' )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2813:1: ( ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'relator' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' 'mediates' ( (lv_mediations_11_0= ruleSimpleMediation ) ) ( 'mediates' ( (lv_mediations_13_0= ruleSimpleMediation ) ) )+ ( ( (lv_ownedAttribute_14_0= ruleClassProperty ) ) ';' )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2813:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'relator' ( (lv_name_4_0= RULE_ID ) ) ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )? '{' 'mediates' ( (lv_mediations_11_0= ruleSimpleMediation ) ) ( 'mediates' ( (lv_mediations_13_0= ruleSimpleMediation ) ) )+ ( ( (lv_ownedAttribute_14_0= ruleClassProperty ) ) ';' )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2813:2: ( ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2815:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2815:1: ( ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2816:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRelatorAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2819:2: ( ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2820:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2820:3: ( ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) )*
            loop46:
            do {
                int alt46=3;
                int LA46_0 = input.LA(1);

                if ( LA46_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1) ) {
                    alt46=2;
                }


                switch (alt46) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2822:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2822:4: ({...}? => ( ( (lv_isActive_1_0= 'active' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2823:5: {...}? => ( ( (lv_isActive_1_0= 'active' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRelator", "getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2823:104: ( ( (lv_isActive_1_0= 'active' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2824:6: ( (lv_isActive_1_0= 'active' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2827:6: ( (lv_isActive_1_0= 'active' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2828:1: (lv_isActive_1_0= 'active' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2828:1: (lv_isActive_1_0= 'active' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2829:3: lv_isActive_1_0= 'active'
            	    {
            	    lv_isActive_1_0=(Token)input.LT(1);
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleRelator5480); 

            	            createLeafNode(grammarAccess.getRelatorAccess().getIsActiveActiveKeyword_0_0_0(), "isActive"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isActive", true, "active", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRelatorAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2855:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2855:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2856:5: {...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRelator", "getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2856:104: ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2857:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2860:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2861:1: (lv_isAbstract_2_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2861:1: (lv_isAbstract_2_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2862:3: lv_isAbstract_2_0= 'abstract'
            	    {
            	    lv_isAbstract_2_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleRelator5561); 

            	            createLeafNode(grammarAccess.getRelatorAccess().getIsAbstractAbstractKeyword_0_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRelatorAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRelatorAccess().getUnorderedGroup_0());
            	

            }

            match(input,31,FollowSets000.FOLLOW_31_in_ruleRelator5623); 

                    createLeafNode(grammarAccess.getRelatorAccess().getRelatorKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2899:1: ( (lv_name_4_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2900:1: (lv_name_4_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2900:1: (lv_name_4_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2901:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRelator5640); 

            			createLeafNode(grammarAccess.getRelatorAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2923:2: ( ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==17) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2923:4: ':' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleRelator5656); 

                            createLeafNode(grammarAccess.getRelatorAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2927:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2928:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2928:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2929:3: lv_generalization_6_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRelatorAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRelator5677);
                    lv_generalization_6_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_6_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2951:2: ( ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==18) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2951:4: ',' ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleRelator5688); 

                    	            createLeafNode(grammarAccess.getRelatorAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2955:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2956:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2956:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2957:3: lv_generalization_8_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRelatorAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRelator5709);
                    	    lv_generalization_8_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_8_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleRelator5723); 

                    createLeafNode(grammarAccess.getRelatorAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            match(input,32,FollowSets000.FOLLOW_32_in_ruleRelator5733); 

                    createLeafNode(grammarAccess.getRelatorAccess().getMediatesKeyword_5(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2987:1: ( (lv_mediations_11_0= ruleSimpleMediation ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2988:1: (lv_mediations_11_0= ruleSimpleMediation )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2988:1: (lv_mediations_11_0= ruleSimpleMediation )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:2989:3: lv_mediations_11_0= ruleSimpleMediation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRelatorAccess().getMediationsSimpleMediationParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleMediation_in_ruleRelator5754);
            lv_mediations_11_0=ruleSimpleMediation();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"mediations",
            	        		lv_mediations_11_0, 
            	        		"SimpleMediation", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3011:2: ( 'mediates' ( (lv_mediations_13_0= ruleSimpleMediation ) ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==32) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3011:4: 'mediates' ( (lv_mediations_13_0= ruleSimpleMediation ) )
            	    {
            	    match(input,32,FollowSets000.FOLLOW_32_in_ruleRelator5765); 

            	            createLeafNode(grammarAccess.getRelatorAccess().getMediatesKeyword_7_0(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3015:1: ( (lv_mediations_13_0= ruleSimpleMediation ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3016:1: (lv_mediations_13_0= ruleSimpleMediation )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3016:1: (lv_mediations_13_0= ruleSimpleMediation )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3017:3: lv_mediations_13_0= ruleSimpleMediation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRelatorAccess().getMediationsSimpleMediationParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSimpleMediation_in_ruleRelator5786);
            	    lv_mediations_13_0=ruleSimpleMediation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"mediations",
            	    	        		lv_mediations_13_0, 
            	    	        		"SimpleMediation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3039:4: ( ( (lv_ownedAttribute_14_0= ruleClassProperty ) ) ';' )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==53||LA50_0==72) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3039:5: ( (lv_ownedAttribute_14_0= ruleClassProperty ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3039:5: ( (lv_ownedAttribute_14_0= ruleClassProperty ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3040:1: (lv_ownedAttribute_14_0= ruleClassProperty )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3040:1: (lv_ownedAttribute_14_0= ruleClassProperty )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3041:3: lv_ownedAttribute_14_0= ruleClassProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRelatorAccess().getOwnedAttributeClassPropertyParserRuleCall_8_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_ruleRelator5810);
            	    lv_ownedAttribute_14_0=ruleClassProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAttribute",
            	    	        		lv_ownedAttribute_14_0, 
            	    	        		"ClassProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_ruleRelator5820); 

            	            createLeafNode(grammarAccess.getRelatorAccess().getSemicolonKeyword_8_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleRelator5832); 

                    createLeafNode(grammarAccess.getRelatorAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRelator


    // $ANTLR start entryRuleCardinality
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3079:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3080:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3081:2: iv_ruleCardinality= ruleCardinality EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCardinalityRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCardinality_in_entryRuleCardinality5868);
            iv_ruleCardinality=ruleCardinality();
            _fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCardinality5878); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCardinality


    // $ANTLR start ruleCardinality
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3088:1: ruleCardinality returns [EObject current=null] : this_CardinalityImpl_0= ruleCardinalityImpl ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        EObject this_CardinalityImpl_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3093:6: (this_CardinalityImpl_0= ruleCardinalityImpl )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3095:5: this_CardinalityImpl_0= ruleCardinalityImpl
            {
             
                    currentNode=createCompositeNode(grammarAccess.getCardinalityAccess().getCardinalityImplParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleCardinalityImpl_in_ruleCardinality5924);
            this_CardinalityImpl_0=ruleCardinalityImpl();
            _fsp--;

             
                    current = this_CardinalityImpl_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCardinality


    // $ANTLR start entryRuleCardinalityImpl
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3111:1: entryRuleCardinalityImpl returns [EObject current=null] : iv_ruleCardinalityImpl= ruleCardinalityImpl EOF ;
    public final EObject entryRuleCardinalityImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinalityImpl = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3112:2: (iv_ruleCardinalityImpl= ruleCardinalityImpl EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3113:2: iv_ruleCardinalityImpl= ruleCardinalityImpl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCardinalityImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCardinalityImpl_in_entryRuleCardinalityImpl5958);
            iv_ruleCardinalityImpl=ruleCardinalityImpl();
            _fsp--;

             current =iv_ruleCardinalityImpl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCardinalityImpl5968); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCardinalityImpl


    // $ANTLR start ruleCardinalityImpl
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3120:1: ruleCardinalityImpl returns [EObject current=null] : ( '[' ( (lv_lower_1_0= RULE_INT ) ) '..' ( ( (lv_upper_3_0= ruleUnlimitedNaturalValue ) ) | ( (lv_upper_4_0= RULE_INT ) ) ) ']' ) ;
    public final EObject ruleCardinalityImpl() throws RecognitionException {
        EObject current = null;

        Token lv_lower_1_0=null;
        Token lv_upper_4_0=null;
        AntlrDatatypeRuleToken lv_upper_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3125:6: ( ( '[' ( (lv_lower_1_0= RULE_INT ) ) '..' ( ( (lv_upper_3_0= ruleUnlimitedNaturalValue ) ) | ( (lv_upper_4_0= RULE_INT ) ) ) ']' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3126:1: ( '[' ( (lv_lower_1_0= RULE_INT ) ) '..' ( ( (lv_upper_3_0= ruleUnlimitedNaturalValue ) ) | ( (lv_upper_4_0= RULE_INT ) ) ) ']' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3126:1: ( '[' ( (lv_lower_1_0= RULE_INT ) ) '..' ( ( (lv_upper_3_0= ruleUnlimitedNaturalValue ) ) | ( (lv_upper_4_0= RULE_INT ) ) ) ']' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3126:3: '[' ( (lv_lower_1_0= RULE_INT ) ) '..' ( ( (lv_upper_3_0= ruleUnlimitedNaturalValue ) ) | ( (lv_upper_4_0= RULE_INT ) ) ) ']'
            {
            match(input,33,FollowSets000.FOLLOW_33_in_ruleCardinalityImpl6003); 

                    createLeafNode(grammarAccess.getCardinalityImplAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3130:1: ( (lv_lower_1_0= RULE_INT ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3131:1: (lv_lower_1_0= RULE_INT )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3131:1: (lv_lower_1_0= RULE_INT )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3132:3: lv_lower_1_0= RULE_INT
            {
            lv_lower_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleCardinalityImpl6020); 

            			createLeafNode(grammarAccess.getCardinalityImplAccess().getLowerINTTerminalRuleCall_1_0(), "lower"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCardinalityImplRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lower",
            	        		lv_lower_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,34,FollowSets000.FOLLOW_34_in_ruleCardinalityImpl6035); 

                    createLeafNode(grammarAccess.getCardinalityImplAccess().getFullStopFullStopKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3158:1: ( ( (lv_upper_3_0= ruleUnlimitedNaturalValue ) ) | ( (lv_upper_4_0= RULE_INT ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==61) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_INT) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3158:1: ( ( (lv_upper_3_0= ruleUnlimitedNaturalValue ) ) | ( (lv_upper_4_0= RULE_INT ) ) )", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3158:2: ( (lv_upper_3_0= ruleUnlimitedNaturalValue ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3158:2: ( (lv_upper_3_0= ruleUnlimitedNaturalValue ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3159:1: (lv_upper_3_0= ruleUnlimitedNaturalValue )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3159:1: (lv_upper_3_0= ruleUnlimitedNaturalValue )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3160:3: lv_upper_3_0= ruleUnlimitedNaturalValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCardinalityImplAccess().getUpperUnlimitedNaturalValueParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalValue_in_ruleCardinalityImpl6057);
                    lv_upper_3_0=ruleUnlimitedNaturalValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCardinalityImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"upper",
                    	        		lv_upper_3_0, 
                    	        		"UnlimitedNaturalValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3183:6: ( (lv_upper_4_0= RULE_INT ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3183:6: ( (lv_upper_4_0= RULE_INT ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3184:1: (lv_upper_4_0= RULE_INT )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3184:1: (lv_upper_4_0= RULE_INT )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3185:3: lv_upper_4_0= RULE_INT
                    {
                    lv_upper_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleCardinalityImpl6080); 

                    			createLeafNode(grammarAccess.getCardinalityImplAccess().getUpperINTTerminalRuleCall_3_1_0(), "upper"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCardinalityImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"upper",
                    	        		lv_upper_4_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,35,FollowSets000.FOLLOW_35_in_ruleCardinalityImpl6096); 

                    createLeafNode(grammarAccess.getCardinalityImplAccess().getRightSquareBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCardinalityImpl


    // $ANTLR start entryRuleSimpleMediation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3219:1: entryRuleSimpleMediation returns [EObject current=null] : iv_ruleSimpleMediation= ruleSimpleMediation EOF ;
    public final EObject entryRuleSimpleMediation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleMediation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3220:2: (iv_ruleSimpleMediation= ruleSimpleMediation EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3221:2: iv_ruleSimpleMediation= ruleSimpleMediation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleMediationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleMediation_in_entryRuleSimpleMediation6132);
            iv_ruleSimpleMediation=ruleSimpleMediation();
            _fsp--;

             current =iv_ruleSimpleMediation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleMediation6142); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleMediation


    // $ANTLR start ruleSimpleMediation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3228:1: ruleSimpleMediation returns [EObject current=null] : ( ( 'as' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_cardinality_2_0= ruleCardinality ) )? '->' ( (lv_mediated_4_0= ruleAnonymousPropertyDefinition ) ) ) ;
    public final EObject ruleSimpleMediation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_cardinality_2_0 = null;

        EObject lv_mediated_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3233:6: ( ( ( 'as' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_cardinality_2_0= ruleCardinality ) )? '->' ( (lv_mediated_4_0= ruleAnonymousPropertyDefinition ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3234:1: ( ( 'as' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_cardinality_2_0= ruleCardinality ) )? '->' ( (lv_mediated_4_0= ruleAnonymousPropertyDefinition ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3234:1: ( ( 'as' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_cardinality_2_0= ruleCardinality ) )? '->' ( (lv_mediated_4_0= ruleAnonymousPropertyDefinition ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3234:2: ( 'as' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_cardinality_2_0= ruleCardinality ) )? '->' ( (lv_mediated_4_0= ruleAnonymousPropertyDefinition ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3234:2: ( 'as' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==36) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3234:4: 'as' ( (lv_name_1_0= RULE_ID ) )
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_ruleSimpleMediation6178); 

                            createLeafNode(grammarAccess.getSimpleMediationAccess().getAsKeyword_0_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3238:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3239:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3239:1: (lv_name_1_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3240:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleMediation6195); 

                    			createLeafNode(grammarAccess.getSimpleMediationAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSimpleMediationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3262:4: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==33) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3263:1: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3263:1: (lv_cardinality_2_0= ruleCardinality )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3264:3: lv_cardinality_2_0= ruleCardinality
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSimpleMediationAccess().getCardinalityCardinalityParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinality_in_ruleSimpleMediation6223);
                    lv_cardinality_2_0=ruleCardinality();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSimpleMediationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"cardinality",
                    	        		lv_cardinality_2_0, 
                    	        		"Cardinality", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,37,FollowSets000.FOLLOW_37_in_ruleSimpleMediation6234); 

                    createLeafNode(grammarAccess.getSimpleMediationAccess().getHyphenMinusGreaterThanSignKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3290:1: ( (lv_mediated_4_0= ruleAnonymousPropertyDefinition ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3291:1: (lv_mediated_4_0= ruleAnonymousPropertyDefinition )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3291:1: (lv_mediated_4_0= ruleAnonymousPropertyDefinition )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3292:3: lv_mediated_4_0= ruleAnonymousPropertyDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSimpleMediationAccess().getMediatedAnonymousPropertyDefinitionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnonymousPropertyDefinition_in_ruleSimpleMediation6255);
            lv_mediated_4_0=ruleAnonymousPropertyDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleMediationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"mediated",
            	        		lv_mediated_4_0, 
            	        		"AnonymousPropertyDefinition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleMediation


    // $ANTLR start entryRuleCharacterization
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3322:1: entryRuleCharacterization returns [EObject current=null] : iv_ruleCharacterization= ruleCharacterization EOF ;
    public final EObject entryRuleCharacterization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterization = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3323:2: (iv_ruleCharacterization= ruleCharacterization EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3324:2: iv_ruleCharacterization= ruleCharacterization EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCharacterizationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_entryRuleCharacterization6291);
            iv_ruleCharacterization=ruleCharacterization();
            _fsp--;

             current =iv_ruleCharacterization; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacterization6301); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCharacterization


    // $ANTLR start ruleCharacterization
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3331:1: ruleCharacterization returns [EObject current=null] : ( 'characterization' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' 'mode:' ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) 'characterized:' ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) '}' ) ;
    public final EObject ruleCharacterization() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_generalization_3_0 = null;

        EObject lv_generalization_5_0 = null;

        EObject lv_ownedEnd_8_0 = null;

        EObject lv_ownedEnd_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3336:6: ( ( 'characterization' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' 'mode:' ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) 'characterized:' ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3337:1: ( 'characterization' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' 'mode:' ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) 'characterized:' ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3337:1: ( 'characterization' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' 'mode:' ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) 'characterized:' ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3337:3: 'characterization' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' 'mode:' ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) 'characterized:' ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) '}'
            {
            match(input,38,FollowSets000.FOLLOW_38_in_ruleCharacterization6336); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getCharacterizationKeyword_0(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3341:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3342:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3342:1: (lv_name_1_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3343:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCharacterization6353); 

                    			createLeafNode(grammarAccess.getCharacterizationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3365:3: ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==17) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3365:5: ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleCharacterization6370); 

                            createLeafNode(grammarAccess.getCharacterizationAccess().getColonKeyword_2_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3369:1: ( (lv_generalization_3_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3370:1: (lv_generalization_3_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3370:1: (lv_generalization_3_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3371:3: lv_generalization_3_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCharacterizationAccess().getGeneralizationInlineGeneralizationParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCharacterization6391);
                    lv_generalization_3_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_3_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3393:2: ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==18) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3393:4: ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleCharacterization6402); 

                    	            createLeafNode(grammarAccess.getCharacterizationAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3397:1: ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3398:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3398:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3399:3: lv_generalization_5_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCharacterizationAccess().getGeneralizationInlineGeneralizationParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCharacterization6423);
                    	    lv_generalization_5_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_5_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleCharacterization6437); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,39,FollowSets000.FOLLOW_39_in_ruleCharacterization6447); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getModeKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3429:1: ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3429:2: ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3429:2: ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3430:1: (lv_ownedEnd_8_0= ruleInlinePropertyDefinition )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3430:1: (lv_ownedEnd_8_0= ruleInlinePropertyDefinition )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3431:3: lv_ownedEnd_8_0= ruleInlinePropertyDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCharacterizationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_5_0_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleCharacterization6469);
            lv_ownedEnd_8_0=ruleInlinePropertyDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedEnd",
            	        		lv_ownedEnd_8_0, 
            	        		"InlinePropertyDefinition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FollowSets000.FOLLOW_12_in_ruleCharacterization6479); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getSemicolonKeyword_5_1(), null); 
                

            }

            match(input,40,FollowSets000.FOLLOW_40_in_ruleCharacterization6490); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getCharacterizedKeyword_6(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3461:1: ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3461:2: ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3461:2: ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3462:1: (lv_ownedEnd_11_0= ruleInlinePropertyDefinition )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3462:1: (lv_ownedEnd_11_0= ruleInlinePropertyDefinition )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3463:3: lv_ownedEnd_11_0= ruleInlinePropertyDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCharacterizationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_7_0_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleCharacterization6512);
            lv_ownedEnd_11_0=ruleInlinePropertyDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedEnd",
            	        		lv_ownedEnd_11_0, 
            	        		"InlinePropertyDefinition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FollowSets000.FOLLOW_12_in_ruleCharacterization6522); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getSemicolonKeyword_7_1(), null); 
                

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleCharacterization6533); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getRightCurlyBracketKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCharacterization


    // $ANTLR start entryRuleMediation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3501:1: entryRuleMediation returns [EObject current=null] : iv_ruleMediation= ruleMediation EOF ;
    public final EObject entryRuleMediation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3502:2: (iv_ruleMediation= ruleMediation EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3503:2: iv_ruleMediation= ruleMediation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMediationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleMediation_in_entryRuleMediation6569);
            iv_ruleMediation=ruleMediation();
            _fsp--;

             current =iv_ruleMediation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMediation6579); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMediation


    // $ANTLR start ruleMediation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3510:1: ruleMediation returns [EObject current=null] : ( 'mediation' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' ( ( 'relator:' ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) ( 'mediated:' ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) ) '}' ) ;
    public final EObject ruleMediation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_generalization_3_0 = null;

        EObject lv_generalization_5_0 = null;

        EObject lv_ownedEnd_8_0 = null;

        EObject lv_ownedEnd_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3515:6: ( ( 'mediation' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' ( ( 'relator:' ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) ( 'mediated:' ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) ) '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3516:1: ( 'mediation' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' ( ( 'relator:' ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) ( 'mediated:' ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) ) '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3516:1: ( 'mediation' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' ( ( 'relator:' ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) ( 'mediated:' ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) ) '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3516:3: 'mediation' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' ( ( 'relator:' ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) ( 'mediated:' ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) ) '}'
            {
            match(input,41,FollowSets000.FOLLOW_41_in_ruleMediation6614); 

                    createLeafNode(grammarAccess.getMediationAccess().getMediationKeyword_0(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3520:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3521:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3521:1: (lv_name_1_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3522:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMediation6631); 

                    			createLeafNode(grammarAccess.getMediationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3544:3: ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==17) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3544:5: ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleMediation6648); 

                            createLeafNode(grammarAccess.getMediationAccess().getColonKeyword_2_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3548:1: ( (lv_generalization_3_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3549:1: (lv_generalization_3_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3549:1: (lv_generalization_3_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3550:3: lv_generalization_3_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMediationAccess().getGeneralizationInlineGeneralizationParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMediation6669);
                    lv_generalization_3_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_3_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3572:2: ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==18) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3572:4: ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleMediation6680); 

                    	            createLeafNode(grammarAccess.getMediationAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3576:1: ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3577:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3577:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3578:3: lv_generalization_5_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMediationAccess().getGeneralizationInlineGeneralizationParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMediation6701);
                    	    lv_generalization_5_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_5_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleMediation6715); 

                    createLeafNode(grammarAccess.getMediationAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3604:1: ( ( 'relator:' ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) ( 'mediated:' ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3604:2: ( 'relator:' ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) ( 'mediated:' ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3604:2: ( 'relator:' ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3604:4: 'relator:' ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';'
            {
            match(input,42,FollowSets000.FOLLOW_42_in_ruleMediation6727); 

                    createLeafNode(grammarAccess.getMediationAccess().getRelatorKeyword_4_0_0(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3608:1: ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3609:1: (lv_ownedEnd_8_0= ruleInlinePropertyDefinition )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3609:1: (lv_ownedEnd_8_0= ruleInlinePropertyDefinition )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3610:3: lv_ownedEnd_8_0= ruleInlinePropertyDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMediationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_4_0_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleMediation6748);
            lv_ownedEnd_8_0=ruleInlinePropertyDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedEnd",
            	        		lv_ownedEnd_8_0, 
            	        		"InlinePropertyDefinition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FollowSets000.FOLLOW_12_in_ruleMediation6758); 

                    createLeafNode(grammarAccess.getMediationAccess().getSemicolonKeyword_4_0_2(), null); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3636:2: ( 'mediated:' ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3636:4: 'mediated:' ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';'
            {
            match(input,43,FollowSets000.FOLLOW_43_in_ruleMediation6770); 

                    createLeafNode(grammarAccess.getMediationAccess().getMediatedKeyword_4_1_0(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3640:1: ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3641:1: (lv_ownedEnd_11_0= ruleInlinePropertyDefinition )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3641:1: (lv_ownedEnd_11_0= ruleInlinePropertyDefinition )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3642:3: lv_ownedEnd_11_0= ruleInlinePropertyDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMediationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_4_1_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleMediation6791);
            lv_ownedEnd_11_0=ruleInlinePropertyDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedEnd",
            	        		lv_ownedEnd_11_0, 
            	        		"InlinePropertyDefinition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FollowSets000.FOLLOW_12_in_ruleMediation6801); 

                    createLeafNode(grammarAccess.getMediationAccess().getSemicolonKeyword_4_1_2(), null); 
                

            }


            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleMediation6813); 

                    createLeafNode(grammarAccess.getMediationAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMediation


    // $ANTLR start entryRuleDerivation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3680:1: entryRuleDerivation returns [EObject current=null] : iv_ruleDerivation= ruleDerivation EOF ;
    public final EObject entryRuleDerivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3681:2: (iv_ruleDerivation= ruleDerivation EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3682:2: iv_ruleDerivation= ruleDerivation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDerivationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleDerivation_in_entryRuleDerivation6849);
            iv_ruleDerivation=ruleDerivation();
            _fsp--;

             current =iv_ruleDerivation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDerivation6859); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDerivation


    // $ANTLR start ruleDerivation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3689:1: ruleDerivation returns [EObject current=null] : ( 'derivation' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' 'material:' ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) 'relator:' ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) '}' ) ;
    public final EObject ruleDerivation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_generalization_3_0 = null;

        EObject lv_generalization_5_0 = null;

        EObject lv_ownedEnd_8_0 = null;

        EObject lv_ownedEnd_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3694:6: ( ( 'derivation' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' 'material:' ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) 'relator:' ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3695:1: ( 'derivation' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' 'material:' ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) 'relator:' ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3695:1: ( 'derivation' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' 'material:' ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) 'relator:' ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3695:3: 'derivation' ( (lv_name_1_0= RULE_ID ) )? ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? '{' 'material:' ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' ) 'relator:' ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' ) '}'
            {
            match(input,44,FollowSets000.FOLLOW_44_in_ruleDerivation6894); 

                    createLeafNode(grammarAccess.getDerivationAccess().getDerivationKeyword_0(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3699:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3700:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3700:1: (lv_name_1_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3701:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDerivation6911); 

                    			createLeafNode(grammarAccess.getDerivationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3723:3: ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==17) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3723:5: ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleDerivation6928); 

                            createLeafNode(grammarAccess.getDerivationAccess().getColonKeyword_2_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3727:1: ( (lv_generalization_3_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3728:1: (lv_generalization_3_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3728:1: (lv_generalization_3_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3729:3: lv_generalization_3_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDerivationAccess().getGeneralizationInlineGeneralizationParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleDerivation6949);
                    lv_generalization_3_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_3_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3751:2: ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==18) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3751:4: ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleDerivation6960); 

                    	            createLeafNode(grammarAccess.getDerivationAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3755:1: ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3756:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3756:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3757:3: lv_generalization_5_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDerivationAccess().getGeneralizationInlineGeneralizationParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleDerivation6981);
                    	    lv_generalization_5_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_5_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleDerivation6995); 

                    createLeafNode(grammarAccess.getDerivationAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,45,FollowSets000.FOLLOW_45_in_ruleDerivation7005); 

                    createLeafNode(grammarAccess.getDerivationAccess().getMaterialKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3787:1: ( ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3787:2: ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) ) ';'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3787:2: ( (lv_ownedEnd_8_0= ruleInlinePropertyDefinition ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3788:1: (lv_ownedEnd_8_0= ruleInlinePropertyDefinition )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3788:1: (lv_ownedEnd_8_0= ruleInlinePropertyDefinition )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3789:3: lv_ownedEnd_8_0= ruleInlinePropertyDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDerivationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_5_0_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleDerivation7027);
            lv_ownedEnd_8_0=ruleInlinePropertyDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedEnd",
            	        		lv_ownedEnd_8_0, 
            	        		"InlinePropertyDefinition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FollowSets000.FOLLOW_12_in_ruleDerivation7037); 

                    createLeafNode(grammarAccess.getDerivationAccess().getSemicolonKeyword_5_1(), null); 
                

            }

            match(input,42,FollowSets000.FOLLOW_42_in_ruleDerivation7048); 

                    createLeafNode(grammarAccess.getDerivationAccess().getRelatorKeyword_6(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3819:1: ( ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3819:2: ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) ) ';'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3819:2: ( (lv_ownedEnd_11_0= ruleInlinePropertyDefinition ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3820:1: (lv_ownedEnd_11_0= ruleInlinePropertyDefinition )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3820:1: (lv_ownedEnd_11_0= ruleInlinePropertyDefinition )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3821:3: lv_ownedEnd_11_0= ruleInlinePropertyDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDerivationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_7_0_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleDerivation7070);
            lv_ownedEnd_11_0=ruleInlinePropertyDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedEnd",
            	        		lv_ownedEnd_11_0, 
            	        		"InlinePropertyDefinition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FollowSets000.FOLLOW_12_in_ruleDerivation7080); 

                    createLeafNode(grammarAccess.getDerivationAccess().getSemicolonKeyword_7_1(), null); 
                

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleDerivation7091); 

                    createLeafNode(grammarAccess.getDerivationAccess().getRightCurlyBracketKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDerivation


    // $ANTLR start entryRuleMaterialAssociation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3867:1: entryRuleMaterialAssociation returns [EObject current=null] : iv_ruleMaterialAssociation= ruleMaterialAssociation EOF ;
    public final EObject entryRuleMaterialAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterialAssociation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3868:2: (iv_ruleMaterialAssociation= ruleMaterialAssociation EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3869:2: iv_ruleMaterialAssociation= ruleMaterialAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMaterialAssociationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleMaterialAssociation_in_entryRuleMaterialAssociation7135);
            iv_ruleMaterialAssociation=ruleMaterialAssociation();
            _fsp--;

             current =iv_ruleMaterialAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMaterialAssociation7145); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMaterialAssociation


    // $ANTLR start ruleMaterialAssociation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3876:1: ruleMaterialAssociation returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+ {...}?) ) ) 'materialAssociation' ( (lv_name_6_0= RULE_ID ) )? ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedEnd_12_0= ruleInlinePropertyDefinition ) ) ';' )+ '}' ) ;
    public final EObject ruleMaterialAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_isDerived_2_0=null;
        Token lv_isAbstract_3_0=null;
        Token lv_isLeaf_4_0=null;
        Token lv_name_6_0=null;
        EObject lv_generalization_8_0 = null;

        EObject lv_generalization_10_0 = null;

        EObject lv_ownedEnd_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3881:6: ( ( () ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+ {...}?) ) ) 'materialAssociation' ( (lv_name_6_0= RULE_ID ) )? ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedEnd_12_0= ruleInlinePropertyDefinition ) ) ';' )+ '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3882:1: ( () ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+ {...}?) ) ) 'materialAssociation' ( (lv_name_6_0= RULE_ID ) )? ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedEnd_12_0= ruleInlinePropertyDefinition ) ) ';' )+ '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3882:1: ( () ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+ {...}?) ) ) 'materialAssociation' ( (lv_name_6_0= RULE_ID ) )? ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedEnd_12_0= ruleInlinePropertyDefinition ) ) ';' )+ '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3882:2: () ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+ {...}?) ) ) 'materialAssociation' ( (lv_name_6_0= RULE_ID ) )? ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )? '{' ( ( (lv_ownedEnd_12_0= ruleInlinePropertyDefinition ) ) ';' )+ '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3882:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3883:5: 
            {
             
                    temp=factory.create(grammarAccess.getMaterialAssociationAccess().getMaterialAssociationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getMaterialAssociationAccess().getMaterialAssociationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3893:2: ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3895:1: ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3895:1: ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3896:2: ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3899:2: ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3900:3: ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3900:3: ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=4;
                int LA63_0 = input.LA(1);

                if ( LA63_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0) ) {
                    alt63=1;
                }
                else if ( LA63_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1) ) {
                    alt63=2;
                }
                else if ( LA63_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2) ) {
                    alt63=3;
                }


                switch (alt63) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3902:4: ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3902:4: ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3903:5: {...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3903:116: ( ( (lv_isDerived_2_0= 'derived' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3904:6: ( (lv_isDerived_2_0= 'derived' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3907:6: ( (lv_isDerived_2_0= 'derived' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3908:1: (lv_isDerived_2_0= 'derived' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3908:1: (lv_isDerived_2_0= 'derived' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3909:3: lv_isDerived_2_0= 'derived'
            	    {
            	    lv_isDerived_2_0=(Token)input.LT(1);
            	    match(input,46,FollowSets000.FOLLOW_46_in_ruleMaterialAssociation7239); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getIsDerivedDerivedKeyword_1_0_0(), "isDerived"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isDerived", true, "derived", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3935:4: ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3935:4: ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3936:5: {...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3936:116: ( ( (lv_isAbstract_3_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3937:6: ( (lv_isAbstract_3_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3940:6: ( (lv_isAbstract_3_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3941:1: (lv_isAbstract_3_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3941:1: (lv_isAbstract_3_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3942:3: lv_isAbstract_3_0= 'abstract'
            	    {
            	    lv_isAbstract_3_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleMaterialAssociation7320); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getIsAbstractAbstractKeyword_1_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3968:4: ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3968:4: ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3969:5: {...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3969:116: ( ( (lv_isLeaf_4_0= 'leaf' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3970:6: ( (lv_isLeaf_4_0= 'leaf' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3973:6: ( (lv_isLeaf_4_0= 'leaf' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3974:1: (lv_isLeaf_4_0= 'leaf' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3974:1: (lv_isLeaf_4_0= 'leaf' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:3975:3: lv_isLeaf_4_0= 'leaf'
            	    {
            	    lv_isLeaf_4_0=(Token)input.LT(1);
            	    match(input,47,FollowSets000.FOLLOW_47_in_ruleMaterialAssociation7401); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getIsLeafLeafKeyword_1_2_0(), "isLeaf"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isLeaf", true, "leaf", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canLeave(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1());
            	

            }

            match(input,48,FollowSets000.FOLLOW_48_in_ruleMaterialAssociation7469); 

                    createLeafNode(grammarAccess.getMaterialAssociationAccess().getMaterialAssociationKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4013:1: ( (lv_name_6_0= RULE_ID ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4014:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4014:1: (lv_name_6_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4015:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMaterialAssociation7486); 

                    			createLeafNode(grammarAccess.getMaterialAssociationAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_6_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4037:3: ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==17) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4037:5: ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleMaterialAssociation7503); 

                            createLeafNode(grammarAccess.getMaterialAssociationAccess().getColonKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4041:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4042:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4042:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4043:3: lv_generalization_8_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMaterialAssociationAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMaterialAssociation7524);
                    lv_generalization_8_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_8_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4065:2: ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==18) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4065:4: ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleMaterialAssociation7535); 

                    	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getCommaKeyword_4_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4069:1: ( (lv_generalization_10_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4070:1: (lv_generalization_10_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4070:1: (lv_generalization_10_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4071:3: lv_generalization_10_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMaterialAssociationAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMaterialAssociation7556);
                    	    lv_generalization_10_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_10_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleMaterialAssociation7570); 

                    createLeafNode(grammarAccess.getMaterialAssociationAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4097:1: ( ( (lv_ownedEnd_12_0= ruleInlinePropertyDefinition ) ) ';' )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID||LA67_0==53) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4097:2: ( (lv_ownedEnd_12_0= ruleInlinePropertyDefinition ) ) ';'
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4097:2: ( (lv_ownedEnd_12_0= ruleInlinePropertyDefinition ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4098:1: (lv_ownedEnd_12_0= ruleInlinePropertyDefinition )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4098:1: (lv_ownedEnd_12_0= ruleInlinePropertyDefinition )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4099:3: lv_ownedEnd_12_0= ruleInlinePropertyDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMaterialAssociationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_6_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleMaterialAssociation7592);
            	    lv_ownedEnd_12_0=ruleInlinePropertyDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedEnd",
            	    	        		lv_ownedEnd_12_0, 
            	    	        		"InlinePropertyDefinition", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FollowSets000.FOLLOW_12_in_ruleMaterialAssociation7602); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getSemicolonKeyword_6_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleMaterialAssociation7614); 

                    createLeafNode(grammarAccess.getMaterialAssociationAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMaterialAssociation


    // $ANTLR start entryRuleFormalAssociation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4137:1: entryRuleFormalAssociation returns [EObject current=null] : iv_ruleFormalAssociation= ruleFormalAssociation EOF ;
    public final EObject entryRuleFormalAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalAssociation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4138:2: (iv_ruleFormalAssociation= ruleFormalAssociation EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4139:2: iv_ruleFormalAssociation= ruleFormalAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormalAssociationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleFormalAssociation_in_entryRuleFormalAssociation7650);
            iv_ruleFormalAssociation=ruleFormalAssociation();
            _fsp--;

             current =iv_ruleFormalAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormalAssociation7660); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFormalAssociation


    // $ANTLR start ruleFormalAssociation
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4146:1: ruleFormalAssociation returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) ) 'formalAssociation' ( (lv_name_6_0= RULE_ID ) )? '{' '}' ) ;
    public final EObject ruleFormalAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_2_0=null;
        Token lv_isDerived_3_0=null;
        Token lv_isLeaf_4_0=null;
        Token lv_name_6_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4151:6: ( ( () ( ( ( ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) ) 'formalAssociation' ( (lv_name_6_0= RULE_ID ) )? '{' '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4152:1: ( () ( ( ( ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) ) 'formalAssociation' ( (lv_name_6_0= RULE_ID ) )? '{' '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4152:1: ( () ( ( ( ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) ) 'formalAssociation' ( (lv_name_6_0= RULE_ID ) )? '{' '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4152:2: () ( ( ( ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) ) 'formalAssociation' ( (lv_name_6_0= RULE_ID ) )? '{' '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4152:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4153:5: 
            {
             
                    temp=factory.create(grammarAccess.getFormalAssociationAccess().getFormalAssociationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getFormalAssociationAccess().getFormalAssociationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4163:2: ( ( ( ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4165:1: ( ( ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4165:1: ( ( ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4166:2: ( ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4169:2: ( ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4170:3: ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4170:3: ( ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )*
            loop68:
            do {
                int alt68=4;
                int LA68_0 = input.LA(1);

                if ( LA68_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0) ) {
                    alt68=1;
                }
                else if ( LA68_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1) ) {
                    alt68=2;
                }
                else if ( LA68_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2) ) {
                    alt68=3;
                }


                switch (alt68) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4172:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4172:4: ({...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4173:5: {...}? => ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFormalAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4173:114: ( ( (lv_isAbstract_2_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4174:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4177:6: ( (lv_isAbstract_2_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4178:1: (lv_isAbstract_2_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4178:1: (lv_isAbstract_2_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4179:3: lv_isAbstract_2_0= 'abstract'
            	    {
            	    lv_isAbstract_2_0=(Token)input.LT(1);
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleFormalAssociation7754); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getIsAbstractAbstractKeyword_1_0_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFormalAssociationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4205:4: ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4205:4: ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4206:5: {...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFormalAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4206:114: ( ( (lv_isDerived_3_0= 'derived' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4207:6: ( (lv_isDerived_3_0= 'derived' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4210:6: ( (lv_isDerived_3_0= 'derived' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4211:1: (lv_isDerived_3_0= 'derived' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4211:1: (lv_isDerived_3_0= 'derived' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4212:3: lv_isDerived_3_0= 'derived'
            	    {
            	    lv_isDerived_3_0=(Token)input.LT(1);
            	    match(input,46,FollowSets000.FOLLOW_46_in_ruleFormalAssociation7835); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getIsDerivedDerivedKeyword_1_1_0(), "isDerived"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFormalAssociationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isDerived", true, "derived", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4238:4: ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4238:4: ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4239:5: {...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFormalAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4239:114: ( ( (lv_isLeaf_4_0= 'leaf' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4240:6: ( (lv_isLeaf_4_0= 'leaf' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4243:6: ( (lv_isLeaf_4_0= 'leaf' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4244:1: (lv_isLeaf_4_0= 'leaf' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4244:1: (lv_isLeaf_4_0= 'leaf' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4245:3: lv_isLeaf_4_0= 'leaf'
            	    {
            	    lv_isLeaf_4_0=(Token)input.LT(1);
            	    match(input,47,FollowSets000.FOLLOW_47_in_ruleFormalAssociation7916); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getIsLeafLeafKeyword_1_2_0(), "isLeaf"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFormalAssociationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isLeaf", true, "leaf", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1());
            	

            }

            match(input,49,FollowSets000.FOLLOW_49_in_ruleFormalAssociation7978); 

                    createLeafNode(grammarAccess.getFormalAssociationAccess().getFormalAssociationKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4282:1: ( (lv_name_6_0= RULE_ID ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4283:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4283:1: (lv_name_6_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4284:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFormalAssociation7995); 

                    			createLeafNode(grammarAccess.getFormalAssociationAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFormalAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_6_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleFormalAssociation8011); 

                    createLeafNode(grammarAccess.getFormalAssociationAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            match(input,20,FollowSets000.FOLLOW_20_in_ruleFormalAssociation8021); 

                    createLeafNode(grammarAccess.getFormalAssociationAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFormalAssociation


    // $ANTLR start entryRuleNonExpressionValue
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4322:1: entryRuleNonExpressionValue returns [EObject current=null] : iv_ruleNonExpressionValue= ruleNonExpressionValue EOF ;
    public final EObject entryRuleNonExpressionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonExpressionValue = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4323:2: (iv_ruleNonExpressionValue= ruleNonExpressionValue EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4324:2: iv_ruleNonExpressionValue= ruleNonExpressionValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNonExpressionValueRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleNonExpressionValue_in_entryRuleNonExpressionValue8057);
            iv_ruleNonExpressionValue=ruleNonExpressionValue();
            _fsp--;

             current =iv_ruleNonExpressionValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNonExpressionValue8067); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNonExpressionValue


    // $ANTLR start ruleNonExpressionValue
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4331:1: ruleNonExpressionValue returns [EObject current=null] : (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue ) ;
    public final EObject ruleNonExpressionValue() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralInteger_0 = null;

        EObject this_LiteralString_1 = null;

        EObject this_LiteralNull_2 = null;

        EObject this_LiteralBoolean_3 = null;

        EObject this_InstanceValue_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4336:6: ( (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4337:1: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4337:1: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue )
            int alt70=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt70=1;
                }
                break;
            case RULE_STRING:
                {
                alt70=2;
                }
                break;
            case 78:
                {
                alt70=3;
                }
                break;
            case 76:
            case 77:
                {
                alt70=4;
                }
                break;
            case RULE_ID:
                {
                alt70=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4337:1: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue )", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4338:5: this_LiteralInteger_0= ruleLiteralInteger
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonExpressionValueAccess().getLiteralIntegerParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_ruleNonExpressionValue8114);
                    this_LiteralInteger_0=ruleLiteralInteger();
                    _fsp--;

                     
                            current = this_LiteralInteger_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4348:5: this_LiteralString_1= ruleLiteralString
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonExpressionValueAccess().getLiteralStringParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_ruleNonExpressionValue8141);
                    this_LiteralString_1=ruleLiteralString();
                    _fsp--;

                     
                            current = this_LiteralString_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4358:5: this_LiteralNull_2= ruleLiteralNull
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonExpressionValueAccess().getLiteralNullParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralNull_in_ruleNonExpressionValue8168);
                    this_LiteralNull_2=ruleLiteralNull();
                    _fsp--;

                     
                            current = this_LiteralNull_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4368:5: this_LiteralBoolean_3= ruleLiteralBoolean
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonExpressionValueAccess().getLiteralBooleanParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_ruleNonExpressionValue8195);
                    this_LiteralBoolean_3=ruleLiteralBoolean();
                    _fsp--;

                     
                            current = this_LiteralBoolean_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4378:5: this_InstanceValue_4= ruleInstanceValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonExpressionValueAccess().getInstanceValueParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInstanceValue_in_ruleNonExpressionValue8222);
                    this_InstanceValue_4=ruleInstanceValue();
                    _fsp--;

                     
                            current = this_InstanceValue_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNonExpressionValue


    // $ANTLR start entryRuleValueSpecification
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4394:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4395:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4396:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueSpecificationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification8257);
            iv_ruleValueSpecification=ruleValueSpecification();
            _fsp--;

             current =iv_ruleValueSpecification; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueSpecification8267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValueSpecification


    // $ANTLR start ruleValueSpecification
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4403:1: ruleValueSpecification returns [EObject current=null] : (this_NonExpressionValue_0= ruleNonExpressionValue | this_ExpressionValue_1= ruleExpressionValue ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_NonExpressionValue_0 = null;

        EObject this_ExpressionValue_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4408:6: ( (this_NonExpressionValue_0= ruleNonExpressionValue | this_ExpressionValue_1= ruleExpressionValue ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4409:1: (this_NonExpressionValue_0= ruleNonExpressionValue | this_ExpressionValue_1= ruleExpressionValue )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4409:1: (this_NonExpressionValue_0= ruleNonExpressionValue | this_ExpressionValue_1= ruleExpressionValue )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_INT)||(LA71_0>=76 && LA71_0<=78)) ) {
                alt71=1;
            }
            else if ( (LA71_0==53) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4409:1: (this_NonExpressionValue_0= ruleNonExpressionValue | this_ExpressionValue_1= ruleExpressionValue )", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4410:5: this_NonExpressionValue_0= ruleNonExpressionValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueSpecificationAccess().getNonExpressionValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNonExpressionValue_in_ruleValueSpecification8314);
                    this_NonExpressionValue_0=ruleNonExpressionValue();
                    _fsp--;

                     
                            current = this_NonExpressionValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4420:5: this_ExpressionValue_1= ruleExpressionValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueSpecificationAccess().getExpressionValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionValue_in_ruleValueSpecification8341);
                    this_ExpressionValue_1=ruleExpressionValue();
                    _fsp--;

                     
                            current = this_ExpressionValue_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValueSpecification


    // $ANTLR start entryRuleType
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4436:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4437:2: (iv_ruleType= ruleType EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4438:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType8376);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType8386); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4445:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_PrimitiveType_1= rulePrimitiveType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_PrimitiveType_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4450:6: ( (this_DataType_0= ruleDataType | this_PrimitiveType_1= rulePrimitiveType ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4451:1: (this_DataType_0= ruleDataType | this_PrimitiveType_1= rulePrimitiveType )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4451:1: (this_DataType_0= ruleDataType | this_PrimitiveType_1= rulePrimitiveType )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==50) ) {
                alt72=1;
            }
            else if ( (LA72_0==51) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4451:1: (this_DataType_0= ruleDataType | this_PrimitiveType_1= rulePrimitiveType )", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4452:5: this_DataType_0= ruleDataType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDataType_in_ruleType8433);
                    this_DataType_0=ruleDataType();
                    _fsp--;

                     
                            current = this_DataType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4462:5: this_PrimitiveType_1= rulePrimitiveType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveType_in_ruleType8460);
                    this_PrimitiveType_1=rulePrimitiveType();
                    _fsp--;

                     
                            current = this_PrimitiveType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleDataType
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4478:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4479:2: (iv_ruleDataType= ruleDataType EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4480:2: iv_ruleDataType= ruleDataType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataTypeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleDataType_in_entryRuleDataType8495);
            iv_ruleDataType=ruleDataType();
            _fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataType8505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataType


    // $ANTLR start ruleDataType
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4487:1: ruleDataType returns [EObject current=null] : ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? ( '{' ( ( (lv_ownedAttribute_7_0= ruleClassProperty ) ) ';' )+ '}' )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_generalization_3_0 = null;

        EObject lv_generalization_5_0 = null;

        EObject lv_ownedAttribute_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4492:6: ( ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? ( '{' ( ( (lv_ownedAttribute_7_0= ruleClassProperty ) ) ';' )+ '}' )? ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4493:1: ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? ( '{' ( ( (lv_ownedAttribute_7_0= ruleClassProperty ) ) ';' )+ '}' )? )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4493:1: ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? ( '{' ( ( (lv_ownedAttribute_7_0= ruleClassProperty ) ) ';' )+ '}' )? )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4493:3: 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? ( '{' ( ( (lv_ownedAttribute_7_0= ruleClassProperty ) ) ';' )+ '}' )?
            {
            match(input,50,FollowSets000.FOLLOW_50_in_ruleDataType8540); 

                    createLeafNode(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4497:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4498:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4498:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4499:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataType8557); 

            			createLeafNode(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4521:2: ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==17) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4521:4: ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleDataType8573); 

                            createLeafNode(grammarAccess.getDataTypeAccess().getColonKeyword_2_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4525:1: ( (lv_generalization_3_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4526:1: (lv_generalization_3_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4526:1: (lv_generalization_3_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4527:3: lv_generalization_3_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDataTypeAccess().getGeneralizationInlineGeneralizationParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleDataType8594);
                    lv_generalization_3_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_3_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4549:2: ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==18) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4549:4: ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleDataType8605); 

                    	            createLeafNode(grammarAccess.getDataTypeAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4553:1: ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4554:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4554:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4555:3: lv_generalization_5_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDataTypeAccess().getGeneralizationInlineGeneralizationParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleDataType8626);
                    	    lv_generalization_5_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDataTypeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_5_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4577:6: ( '{' ( ( (lv_ownedAttribute_7_0= ruleClassProperty ) ) ';' )+ '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==19) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4577:8: '{' ( ( (lv_ownedAttribute_7_0= ruleClassProperty ) ) ';' )+ '}'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleDataType8641); 

                            createLeafNode(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4581:1: ( ( (lv_ownedAttribute_7_0= ruleClassProperty ) ) ';' )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==53||LA75_0==72) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4581:2: ( (lv_ownedAttribute_7_0= ruleClassProperty ) ) ';'
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4581:2: ( (lv_ownedAttribute_7_0= ruleClassProperty ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4582:1: (lv_ownedAttribute_7_0= ruleClassProperty )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4582:1: (lv_ownedAttribute_7_0= ruleClassProperty )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4583:3: lv_ownedAttribute_7_0= ruleClassProperty
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDataTypeAccess().getOwnedAttributeClassPropertyParserRuleCall_3_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_ruleDataType8663);
                    	    lv_ownedAttribute_7_0=ruleClassProperty();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDataTypeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedAttribute",
                    	    	        		lv_ownedAttribute_7_0, 
                    	    	        		"ClassProperty", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    match(input,12,FollowSets000.FOLLOW_12_in_ruleDataType8673); 

                    	            createLeafNode(grammarAccess.getDataTypeAccess().getSemicolonKeyword_3_1_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleDataType8685); 

                            createLeafNode(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_3_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataType


    // $ANTLR start entryRulePrimitiveType
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4621:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4622:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4623:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveTypeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType8723);
            iv_rulePrimitiveType=rulePrimitiveType();
            _fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveType8733); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveType


    // $ANTLR start rulePrimitiveType
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4630:1: rulePrimitiveType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_generalization_3_0 = null;

        EObject lv_generalization_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4635:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4636:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4636:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )? )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4636:3: 'type' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )?
            {
            match(input,51,FollowSets000.FOLLOW_51_in_rulePrimitiveType8768); 

                    createLeafNode(grammarAccess.getPrimitiveTypeAccess().getTypeKeyword_0(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4640:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4641:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4641:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4642:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePrimitiveType8785); 

            			createLeafNode(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4664:2: ( ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==17) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4664:4: ':' ( (lv_generalization_3_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rulePrimitiveType8801); 

                            createLeafNode(grammarAccess.getPrimitiveTypeAccess().getColonKeyword_2_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4668:1: ( (lv_generalization_3_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4669:1: (lv_generalization_3_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4669:1: (lv_generalization_3_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4670:3: lv_generalization_3_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getGeneralizationInlineGeneralizationParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_rulePrimitiveType8822);
                    lv_generalization_3_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_3_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4692:2: ( ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==18) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4692:4: ',' ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_rulePrimitiveType8833); 

                    	            createLeafNode(grammarAccess.getPrimitiveTypeAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4696:1: ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4697:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4697:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4698:3: lv_generalization_5_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getGeneralizationInlineGeneralizationParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_rulePrimitiveType8854);
                    	    lv_generalization_5_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPrimitiveTypeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_5_0, 
                    	    	        		"InlineGeneralization", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveType


    // $ANTLR start entryRuleInlineGeneralization
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4730:1: entryRuleInlineGeneralization returns [EObject current=null] : iv_ruleInlineGeneralization= ruleInlineGeneralization EOF ;
    public final EObject entryRuleInlineGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineGeneralization = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4731:2: (iv_ruleInlineGeneralization= ruleInlineGeneralization EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4732:2: iv_ruleInlineGeneralization= ruleInlineGeneralization EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInlineGeneralizationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_entryRuleInlineGeneralization8896);
            iv_ruleInlineGeneralization=ruleInlineGeneralization();
            _fsp--;

             current =iv_ruleInlineGeneralization; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineGeneralization8906); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInlineGeneralization


    // $ANTLR start ruleInlineGeneralization
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4739:1: ruleInlineGeneralization returns [EObject current=null] : ( ( (lv_isSubstitutable_0_0= 'substitutable' ) )? ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) ;
    public final EObject ruleInlineGeneralization() throws RecognitionException {
        EObject current = null;

        Token lv_isSubstitutable_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4744:6: ( ( ( (lv_isSubstitutable_0_0= 'substitutable' ) )? ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4745:1: ( ( (lv_isSubstitutable_0_0= 'substitutable' ) )? ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4745:1: ( ( (lv_isSubstitutable_0_0= 'substitutable' ) )? ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4745:2: ( (lv_isSubstitutable_0_0= 'substitutable' ) )? ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4745:2: ( (lv_isSubstitutable_0_0= 'substitutable' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==52) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4746:1: (lv_isSubstitutable_0_0= 'substitutable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4746:1: (lv_isSubstitutable_0_0= 'substitutable' )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4747:3: lv_isSubstitutable_0_0= 'substitutable'
                    {
                    lv_isSubstitutable_0_0=(Token)input.LT(1);
                    match(input,52,FollowSets000.FOLLOW_52_in_ruleInlineGeneralization8949); 

                            createLeafNode(grammarAccess.getInlineGeneralizationAccess().getIsSubstitutableSubstitutableKeyword_0_0(), "isSubstitutable"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInlineGeneralizationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isSubstitutable", true, "substitutable", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4766:3: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4767:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4767:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4768:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInlineGeneralizationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlineGeneralization8981); 

            		createLeafNode(grammarAccess.getInlineGeneralizationAccess().getGeneralClassifierCrossReference_1_0(), "general"); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4780:2: ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==53) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4780:4: '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleInlineGeneralization8992); 

                            createLeafNode(grammarAccess.getInlineGeneralizationAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4784:1: ( ( RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4785:1: ( RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4785:1: ( RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4786:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getInlineGeneralizationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlineGeneralization9010); 

                    		createLeafNode(grammarAccess.getInlineGeneralizationAccess().getGeneralizationSetGeneralizationSetCrossReference_2_1_0(), "generalizationSet"); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4798:2: ( ',' ( ( RULE_ID ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==18) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4798:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleInlineGeneralization9021); 

                    	            createLeafNode(grammarAccess.getInlineGeneralizationAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4802:1: ( ( RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4803:1: ( RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4803:1: ( RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4804:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInlineGeneralizationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlineGeneralization9039); 

                    	    		createLeafNode(grammarAccess.getInlineGeneralizationAccess().getGeneralizationSetGeneralizationSetCrossReference_2_2_1_0(), "generalizationSet"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    match(input,54,FollowSets000.FOLLOW_54_in_ruleInlineGeneralization9051); 

                            createLeafNode(grammarAccess.getInlineGeneralizationAccess().getRightParenthesisKeyword_2_3(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInlineGeneralization


    // $ANTLR start entryRuleGeneralizationSet
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4830:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4831:2: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4832:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGeneralizationSetRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneralizationSet_in_entryRuleGeneralizationSet9091);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();
            _fsp--;

             current =iv_ruleGeneralizationSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneralizationSet9101); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGeneralizationSet


    // $ANTLR start ruleGeneralizationSet
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4839:1: ruleGeneralizationSet returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )* ) ) ) 'generalizationSet' ( (lv_name_4_0= RULE_ID ) ) '{' '}' ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token lv_isCovering_1_0=null;
        Token lv_isDisjoint_2_0=null;
        Token lv_name_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4844:6: ( ( ( ( ( ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )* ) ) ) 'generalizationSet' ( (lv_name_4_0= RULE_ID ) ) '{' '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4845:1: ( ( ( ( ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )* ) ) ) 'generalizationSet' ( (lv_name_4_0= RULE_ID ) ) '{' '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4845:1: ( ( ( ( ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )* ) ) ) 'generalizationSet' ( (lv_name_4_0= RULE_ID ) ) '{' '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4845:2: ( ( ( ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )* ) ) ) 'generalizationSet' ( (lv_name_4_0= RULE_ID ) ) '{' '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4845:2: ( ( ( ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4847:1: ( ( ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4847:1: ( ( ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4848:2: ( ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4851:2: ( ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4852:3: ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4852:3: ( ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )*
            loop82:
            do {
                int alt82=3;
                int LA82_0 = input.LA(1);

                if ( LA82_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                    alt82=1;
                }
                else if ( LA82_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                    alt82=2;
                }


                switch (alt82) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4854:4: ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4854:4: ({...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4855:5: {...}? => ( ( (lv_isCovering_1_0= 'complete' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4855:114: ( ( (lv_isCovering_1_0= 'complete' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4856:6: ( (lv_isCovering_1_0= 'complete' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4859:6: ( (lv_isCovering_1_0= 'complete' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4860:1: (lv_isCovering_1_0= 'complete' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4860:1: (lv_isCovering_1_0= 'complete' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4861:3: lv_isCovering_1_0= 'complete'
            	    {
            	    lv_isCovering_1_0=(Token)input.LT(1);
            	    match(input,55,FollowSets000.FOLLOW_55_in_ruleGeneralizationSet9186); 

            	            createLeafNode(grammarAccess.getGeneralizationSetAccess().getIsCoveringCompleteKeyword_0_0_0(), "isCovering"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGeneralizationSetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isCovering", true, "complete", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4887:4: ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4887:4: ({...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4888:5: {...}? => ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4888:114: ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4889:6: ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4892:6: ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4893:1: (lv_isDisjoint_2_0= 'disjoint' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4893:1: (lv_isDisjoint_2_0= 'disjoint' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4894:3: lv_isDisjoint_2_0= 'disjoint'
            	    {
            	    lv_isDisjoint_2_0=(Token)input.LT(1);
            	    match(input,56,FollowSets000.FOLLOW_56_in_ruleGeneralizationSet9267); 

            	            createLeafNode(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_1_0(), "isDisjoint"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGeneralizationSetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isDisjoint", true, "disjoint", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            	

            }

            match(input,57,FollowSets000.FOLLOW_57_in_ruleGeneralizationSet9329); 

                    createLeafNode(grammarAccess.getGeneralizationSetAccess().getGeneralizationSetKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4931:1: ( (lv_name_4_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4932:1: (lv_name_4_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4932:1: (lv_name_4_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4933:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneralizationSet9346); 

            			createLeafNode(grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGeneralizationSetRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleGeneralizationSet9361); 

                    createLeafNode(grammarAccess.getGeneralizationSetAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,20,FollowSets000.FOLLOW_20_in_ruleGeneralizationSet9371); 

                    createLeafNode(grammarAccess.getGeneralizationSetAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGeneralizationSet


    // $ANTLR start entryRuleExpressionSymbol
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4971:1: entryRuleExpressionSymbol returns [String current=null] : iv_ruleExpressionSymbol= ruleExpressionSymbol EOF ;
    public final String entryRuleExpressionSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionSymbol = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4972:2: (iv_ruleExpressionSymbol= ruleExpressionSymbol EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4973:2: iv_ruleExpressionSymbol= ruleExpressionSymbol EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionSymbolRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionSymbol_in_entryRuleExpressionSymbol9408);
            iv_ruleExpressionSymbol=ruleExpressionSymbol();
            _fsp--;

             current =iv_ruleExpressionSymbol.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionSymbol9419); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpressionSymbol


    // $ANTLR start ruleExpressionSymbol
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4980:1: ruleExpressionSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DefaultOperator_0= ruleDefaultOperator | (kw= 'op' kw= '[' this_ID_3= RULE_ID kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleExpressionSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_DefaultOperator_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4985:6: ( (this_DefaultOperator_0= ruleDefaultOperator | (kw= 'op' kw= '[' this_ID_3= RULE_ID kw= ']' ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4986:1: (this_DefaultOperator_0= ruleDefaultOperator | (kw= 'op' kw= '[' this_ID_3= RULE_ID kw= ']' ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4986:1: (this_DefaultOperator_0= ruleDefaultOperator | (kw= 'op' kw= '[' this_ID_3= RULE_ID kw= ']' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=59 && LA83_0<=62)) ) {
                alt83=1;
            }
            else if ( (LA83_0==58) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4986:1: (this_DefaultOperator_0= ruleDefaultOperator | (kw= 'op' kw= '[' this_ID_3= RULE_ID kw= ']' ) )", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4987:5: this_DefaultOperator_0= ruleDefaultOperator
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionSymbolAccess().getDefaultOperatorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDefaultOperator_in_ruleExpressionSymbol9466);
                    this_DefaultOperator_0=ruleDefaultOperator();
                    _fsp--;


                    		current.merge(this_DefaultOperator_0);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4998:6: (kw= 'op' kw= '[' this_ID_3= RULE_ID kw= ']' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4998:6: (kw= 'op' kw= '[' this_ID_3= RULE_ID kw= ']' )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:4999:2: kw= 'op' kw= '[' this_ID_3= RULE_ID kw= ']'
                    {
                    kw=(Token)input.LT(1);
                    match(input,58,FollowSets000.FOLLOW_58_in_ruleExpressionSymbol9491); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getExpressionSymbolAccess().getOpKeyword_1_0(), null); 
                        
                    kw=(Token)input.LT(1);
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleExpressionSymbol9504); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getExpressionSymbolAccess().getLeftSquareBracketKeyword_1_1(), null); 
                        
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExpressionSymbol9519); 

                    		current.merge(this_ID_3);
                        
                     
                        createLeafNode(grammarAccess.getExpressionSymbolAccess().getIDTerminalRuleCall_1_2(), null); 
                        
                    kw=(Token)input.LT(1);
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleExpressionSymbol9537); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getExpressionSymbolAccess().getRightSquareBracketKeyword_1_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpressionSymbol


    // $ANTLR start entryRuleDefaultOperator
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5031:1: entryRuleDefaultOperator returns [String current=null] : iv_ruleDefaultOperator= ruleDefaultOperator EOF ;
    public final String entryRuleDefaultOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefaultOperator = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5032:2: (iv_ruleDefaultOperator= ruleDefaultOperator EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5033:2: iv_ruleDefaultOperator= ruleDefaultOperator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefaultOperatorRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleDefaultOperator_in_entryRuleDefaultOperator9579);
            iv_ruleDefaultOperator=ruleDefaultOperator();
            _fsp--;

             current =iv_ruleDefaultOperator.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefaultOperator9590); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDefaultOperator


    // $ANTLR start ruleDefaultOperator
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5040:1: ruleDefaultOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleDefaultOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5045:6: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5046:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5046:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt84=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt84=1;
                }
                break;
            case 60:
                {
                alt84=2;
                }
                break;
            case 61:
                {
                alt84=3;
                }
                break;
            case 62:
                {
                alt84=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("5046:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5047:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,59,FollowSets000.FOLLOW_59_in_ruleDefaultOperator9628); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDefaultOperatorAccess().getPlusSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5054:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,60,FollowSets000.FOLLOW_60_in_ruleDefaultOperator9647); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDefaultOperatorAccess().getHyphenMinusKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5061:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,61,FollowSets000.FOLLOW_61_in_ruleDefaultOperator9666); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDefaultOperatorAccess().getAsteriskKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5068:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,62,FollowSets000.FOLLOW_62_in_ruleDefaultOperator9685); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDefaultOperatorAccess().getSolidusKeyword_3(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDefaultOperator


    // $ANTLR start entryRuleExpressionValue
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5081:1: entryRuleExpressionValue returns [EObject current=null] : iv_ruleExpressionValue= ruleExpressionValue EOF ;
    public final EObject entryRuleExpressionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionValue = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5082:2: (iv_ruleExpressionValue= ruleExpressionValue EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5083:2: iv_ruleExpressionValue= ruleExpressionValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionValueRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionValue_in_entryRuleExpressionValue9725);
            iv_ruleExpressionValue=ruleExpressionValue();
            _fsp--;

             current =iv_ruleExpressionValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionValue9735); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpressionValue


    // $ANTLR start ruleExpressionValue
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5090:1: ruleExpressionValue returns [EObject current=null] : ( () '(' ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) ) ')' ) ;
    public final EObject ruleExpressionValue() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        AntlrDatatypeRuleToken lv_symbol_3_0 = null;

        EObject lv_operand_4_0 = null;

        AntlrDatatypeRuleToken lv_symbol_5_0 = null;

        EObject lv_operand_6_0 = null;

        AntlrDatatypeRuleToken lv_symbol_7_0 = null;

        EObject lv_operand_9_0 = null;

        EObject lv_operand_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5095:6: ( ( () '(' ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) ) ')' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5096:1: ( () '(' ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) ) ')' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5096:1: ( () '(' ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) ) ')' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5096:2: () '(' ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) ) ')'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5096:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5097:5: 
            {
             
                    temp=factory.create(grammarAccess.getExpressionValueAccess().getExpressionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionValueAccess().getExpressionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,53,FollowSets000.FOLLOW_53_in_ruleExpressionValue9779); 

                    createLeafNode(grammarAccess.getExpressionValueAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5111:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )
            int alt86=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 53:
            case 76:
            case 77:
            case 78:
                {
                alt86=1;
                }
                break;
            case 59:
                {
                int LA86_2 = input.LA(2);

                if ( ((LA86_2>=RULE_ID && LA86_2<=RULE_INT)||LA86_2==53||(LA86_2>=76 && LA86_2<=78)) ) {
                    alt86=2;
                }
                else if ( (LA86_2==19) ) {
                    alt86=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("5111:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )", 86, 2, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                int LA86_3 = input.LA(2);

                if ( (LA86_3==19) ) {
                    alt86=3;
                }
                else if ( ((LA86_3>=RULE_ID && LA86_3<=RULE_INT)||LA86_3==53||(LA86_3>=76 && LA86_3<=78)) ) {
                    alt86=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("5111:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )", 86, 3, input);

                    throw nvae;
                }
                }
                break;
            case 61:
                {
                int LA86_4 = input.LA(2);

                if ( (LA86_4==19) ) {
                    alt86=3;
                }
                else if ( ((LA86_4>=RULE_ID && LA86_4<=RULE_INT)||LA86_4==53||(LA86_4>=76 && LA86_4<=78)) ) {
                    alt86=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("5111:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )", 86, 4, input);

                    throw nvae;
                }
                }
                break;
            case 62:
                {
                int LA86_5 = input.LA(2);

                if ( (LA86_5==19) ) {
                    alt86=3;
                }
                else if ( ((LA86_5>=RULE_ID && LA86_5<=RULE_INT)||LA86_5==53||(LA86_5>=76 && LA86_5<=78)) ) {
                    alt86=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("5111:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )", 86, 5, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                int LA86_6 = input.LA(2);

                if ( (LA86_6==33) ) {
                    int LA86_9 = input.LA(3);

                    if ( (LA86_9==RULE_ID) ) {
                        int LA86_10 = input.LA(4);

                        if ( (LA86_10==35) ) {
                            int LA86_11 = input.LA(5);

                            if ( (LA86_11==19) ) {
                                alt86=3;
                            }
                            else if ( ((LA86_11>=RULE_ID && LA86_11<=RULE_INT)||LA86_11==53||(LA86_11>=76 && LA86_11<=78)) ) {
                                alt86=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("5111:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )", 86, 11, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("5111:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )", 86, 10, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("5111:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )", 86, 9, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("5111:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )", 86, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("5111:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5111:2: ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5111:2: ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5111:3: ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5111:3: ( (lv_operand_2_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5112:1: (lv_operand_2_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5112:1: (lv_operand_2_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5113:3: lv_operand_2_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getOperandValueSpecificationParserRuleCall_2_0_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleExpressionValue9802);
                    lv_operand_2_0=ruleValueSpecification();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"operand",
                    	        		lv_operand_2_0, 
                    	        		"ValueSpecification", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5135:2: ( (lv_symbol_3_0= ruleExpressionSymbol ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5136:1: (lv_symbol_3_0= ruleExpressionSymbol )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5136:1: (lv_symbol_3_0= ruleExpressionSymbol )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5137:3: lv_symbol_3_0= ruleExpressionSymbol
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getSymbolExpressionSymbolParserRuleCall_2_0_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue9823);
                    lv_symbol_3_0=ruleExpressionSymbol();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"symbol",
                    	        		lv_symbol_3_0, 
                    	        		"ExpressionSymbol", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5159:2: ( (lv_operand_4_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5160:1: (lv_operand_4_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5160:1: (lv_operand_4_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5161:3: lv_operand_4_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getOperandValueSpecificationParserRuleCall_2_0_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleExpressionValue9844);
                    lv_operand_4_0=ruleValueSpecification();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"operand",
                    	        		lv_operand_4_0, 
                    	        		"ValueSpecification", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5184:6: ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5184:6: ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5184:7: ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5184:7: ( (lv_symbol_5_0= ruleExpressionSymbol ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5185:1: (lv_symbol_5_0= ruleExpressionSymbol )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5185:1: (lv_symbol_5_0= ruleExpressionSymbol )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5186:3: lv_symbol_5_0= ruleExpressionSymbol
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getSymbolExpressionSymbolParserRuleCall_2_1_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue9873);
                    lv_symbol_5_0=ruleExpressionSymbol();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"symbol",
                    	        		lv_symbol_5_0, 
                    	        		"ExpressionSymbol", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5208:2: ( (lv_operand_6_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5209:1: (lv_operand_6_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5209:1: (lv_operand_6_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5210:3: lv_operand_6_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getOperandValueSpecificationParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleExpressionValue9894);
                    lv_operand_6_0=ruleValueSpecification();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"operand",
                    	        		lv_operand_6_0, 
                    	        		"ValueSpecification", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5233:6: ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5233:6: ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5233:7: ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}'
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5233:7: ( (lv_symbol_7_0= ruleExpressionSymbol ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5234:1: (lv_symbol_7_0= ruleExpressionSymbol )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5234:1: (lv_symbol_7_0= ruleExpressionSymbol )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5235:3: lv_symbol_7_0= ruleExpressionSymbol
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getSymbolExpressionSymbolParserRuleCall_2_2_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue9923);
                    lv_symbol_7_0=ruleExpressionSymbol();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"symbol",
                    	        		lv_symbol_7_0, 
                    	        		"ExpressionSymbol", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,19,FollowSets000.FOLLOW_19_in_ruleExpressionValue9933); 

                            createLeafNode(grammarAccess.getExpressionValueAccess().getLeftCurlyBracketKeyword_2_2_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5261:1: ( (lv_operand_9_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5262:1: (lv_operand_9_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5262:1: (lv_operand_9_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5263:3: lv_operand_9_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getOperandValueSpecificationParserRuleCall_2_2_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleExpressionValue9954);
                    lv_operand_9_0=ruleValueSpecification();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"operand",
                    	        		lv_operand_9_0, 
                    	        		"ValueSpecification", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5285:2: ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==18) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5285:4: ',' ( (lv_operand_11_0= ruleValueSpecification ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleExpressionValue9965); 

                    	            createLeafNode(grammarAccess.getExpressionValueAccess().getCommaKeyword_2_2_3_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5289:1: ( (lv_operand_11_0= ruleValueSpecification ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5290:1: (lv_operand_11_0= ruleValueSpecification )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5290:1: (lv_operand_11_0= ruleValueSpecification )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5291:3: lv_operand_11_0= ruleValueSpecification
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getOperandValueSpecificationParserRuleCall_2_2_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleExpressionValue9986);
                    	    lv_operand_11_0=ruleValueSpecification();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getExpressionValueRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"operand",
                    	    	        		lv_operand_11_0, 
                    	    	        		"ValueSpecification", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt85 >= 1 ) break loop85;
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
                    } while (true);

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleExpressionValue9998); 

                            createLeafNode(grammarAccess.getExpressionValueAccess().getRightCurlyBracketKeyword_2_2_4(), null); 
                        

                    }


                    }
                    break;

            }

            match(input,54,FollowSets000.FOLLOW_54_in_ruleExpressionValue10010); 

                    createLeafNode(grammarAccess.getExpressionValueAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpressionValue


    // $ANTLR start entryRuleAnonymousPropertyDefinition
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5329:1: entryRuleAnonymousPropertyDefinition returns [EObject current=null] : iv_ruleAnonymousPropertyDefinition= ruleAnonymousPropertyDefinition EOF ;
    public final EObject entryRuleAnonymousPropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousPropertyDefinition = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5330:2: (iv_ruleAnonymousPropertyDefinition= ruleAnonymousPropertyDefinition EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5331:2: iv_ruleAnonymousPropertyDefinition= ruleAnonymousPropertyDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnonymousPropertyDefinitionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAnonymousPropertyDefinition_in_entryRuleAnonymousPropertyDefinition10046);
            iv_ruleAnonymousPropertyDefinition=ruleAnonymousPropertyDefinition();
            _fsp--;

             current =iv_ruleAnonymousPropertyDefinition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnonymousPropertyDefinition10056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnonymousPropertyDefinition


    // $ANTLR start ruleAnonymousPropertyDefinition
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5338:1: ruleAnonymousPropertyDefinition returns [EObject current=null] : ( () ( ( RULE_ID ) ) ( '[' ( (lv_lowerValue_3_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_5_0= ruleLiteralUnlimitedNatural ) ) ']' )? ) ;
    public final EObject ruleAnonymousPropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_lowerValue_3_0 = null;

        EObject lv_upperValue_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5343:6: ( ( () ( ( RULE_ID ) ) ( '[' ( (lv_lowerValue_3_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_5_0= ruleLiteralUnlimitedNatural ) ) ']' )? ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5344:1: ( () ( ( RULE_ID ) ) ( '[' ( (lv_lowerValue_3_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_5_0= ruleLiteralUnlimitedNatural ) ) ']' )? )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5344:1: ( () ( ( RULE_ID ) ) ( '[' ( (lv_lowerValue_3_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_5_0= ruleLiteralUnlimitedNatural ) ) ']' )? )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5344:2: () ( ( RULE_ID ) ) ( '[' ( (lv_lowerValue_3_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_5_0= ruleLiteralUnlimitedNatural ) ) ']' )?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5344:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5345:5: 
            {
             
                    temp=factory.create(grammarAccess.getAnonymousPropertyDefinitionAccess().getPropertyAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAnonymousPropertyDefinitionAccess().getPropertyAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5355:2: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5356:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5356:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5357:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAnonymousPropertyDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnonymousPropertyDefinition10108); 

            		createLeafNode(grammarAccess.getAnonymousPropertyDefinitionAccess().getTypeTypeCrossReference_1_0(), "type"); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5369:2: ( '[' ( (lv_lowerValue_3_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_5_0= ruleLiteralUnlimitedNatural ) ) ']' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==33) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5369:4: '[' ( (lv_lowerValue_3_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_5_0= ruleLiteralUnlimitedNatural ) ) ']'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleAnonymousPropertyDefinition10119); 

                            createLeafNode(grammarAccess.getAnonymousPropertyDefinitionAccess().getLeftSquareBracketKeyword_2_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5373:1: ( (lv_lowerValue_3_0= ruleLiteralInteger ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5374:1: (lv_lowerValue_3_0= ruleLiteralInteger )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5374:1: (lv_lowerValue_3_0= ruleLiteralInteger )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5375:3: lv_lowerValue_3_0= ruleLiteralInteger
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnonymousPropertyDefinitionAccess().getLowerValueLiteralIntegerParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_ruleAnonymousPropertyDefinition10140);
                    lv_lowerValue_3_0=ruleLiteralInteger();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnonymousPropertyDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lowerValue",
                    	        		lv_lowerValue_3_0, 
                    	        		"LiteralInteger", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,34,FollowSets000.FOLLOW_34_in_ruleAnonymousPropertyDefinition10150); 

                            createLeafNode(grammarAccess.getAnonymousPropertyDefinitionAccess().getFullStopFullStopKeyword_2_2(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5401:1: ( (lv_upperValue_5_0= ruleLiteralUnlimitedNatural ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5402:1: (lv_upperValue_5_0= ruleLiteralUnlimitedNatural )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5402:1: (lv_upperValue_5_0= ruleLiteralUnlimitedNatural )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5403:3: lv_upperValue_5_0= ruleLiteralUnlimitedNatural
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnonymousPropertyDefinitionAccess().getUpperValueLiteralUnlimitedNaturalParserRuleCall_2_3_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_ruleAnonymousPropertyDefinition10171);
                    lv_upperValue_5_0=ruleLiteralUnlimitedNatural();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnonymousPropertyDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"upperValue",
                    	        		lv_upperValue_5_0, 
                    	        		"LiteralUnlimitedNatural", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,35,FollowSets000.FOLLOW_35_in_ruleAnonymousPropertyDefinition10181); 

                            createLeafNode(grammarAccess.getAnonymousPropertyDefinitionAccess().getRightSquareBracketKeyword_2_4(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnonymousPropertyDefinition


    // $ANTLR start entryRuleInlinePropertyDefinition
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5437:1: entryRuleInlinePropertyDefinition returns [EObject current=null] : iv_ruleInlinePropertyDefinition= ruleInlinePropertyDefinition EOF ;
    public final EObject entryRuleInlinePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlinePropertyDefinition = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5438:2: (iv_ruleInlinePropertyDefinition= ruleInlinePropertyDefinition EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5439:2: iv_ruleInlinePropertyDefinition= ruleInlinePropertyDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInlinePropertyDefinitionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_entryRuleInlinePropertyDefinition10219);
            iv_ruleInlinePropertyDefinition=ruleInlinePropertyDefinition();
            _fsp--;

             current =iv_ruleInlinePropertyDefinition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlinePropertyDefinition10229); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInlinePropertyDefinition


    // $ANTLR start ruleInlinePropertyDefinition
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5446:1: ruleInlinePropertyDefinition returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) )? ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )? ( ( RULE_ID ) ) ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )? ( '{' ( 'defaults to' ( (lv_defaultValue_18_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_20_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? ) ;
    public final EObject ruleInlinePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_isStatic_4_0=null;
        Token lv_isOrdered_5_0=null;
        Token lv_isUnique_6_0=null;
        Token lv_isReadOnly_7_0=null;
        Token lv_isDerivedUnion_8_0=null;
        EObject lv_lowerValue_12_0 = null;

        EObject lv_upperValue_14_0 = null;

        EObject lv_defaultValue_18_0 = null;

        Enumerator lv_aggregation_20_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5451:6: ( ( () ( (lv_name_1_0= RULE_ID ) )? ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )? ( ( RULE_ID ) ) ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )? ( '{' ( 'defaults to' ( (lv_defaultValue_18_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_20_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5452:1: ( () ( (lv_name_1_0= RULE_ID ) )? ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )? ( ( RULE_ID ) ) ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )? ( '{' ( 'defaults to' ( (lv_defaultValue_18_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_20_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5452:1: ( () ( (lv_name_1_0= RULE_ID ) )? ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )? ( ( RULE_ID ) ) ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )? ( '{' ( 'defaults to' ( (lv_defaultValue_18_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_20_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5452:2: () ( (lv_name_1_0= RULE_ID ) )? ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )? ( ( RULE_ID ) ) ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )? ( '{' ( 'defaults to' ( (lv_defaultValue_18_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_20_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5452:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5453:5: 
            {
             
                    temp=factory.create(grammarAccess.getInlinePropertyDefinitionAccess().getPropertyAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getInlinePropertyDefinitionAccess().getPropertyAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5463:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID) ) {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==RULE_ID||LA88_1==53) ) {
                    alt88=1;
                }
            }
            switch (alt88) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5464:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5464:1: (lv_name_1_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5465:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition10280); 

                    			createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5487:3: ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==53) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5487:5: '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* ) ) ) ')'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleInlinePropertyDefinition10297); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5491:1: ( ( ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* ) ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5493:1: ( ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5493:1: ( ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5494:2: ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1());
                    	
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5497:2: ( ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )* )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5498:3: ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )*
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5498:3: ( ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) ) )*
                    loop89:
                    do {
                        int alt89=6;
                        int LA89_0 = input.LA(1);

                        if ( LA89_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 0) ) {
                            alt89=1;
                        }
                        else if ( LA89_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 1) ) {
                            alt89=2;
                        }
                        else if ( LA89_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 2) ) {
                            alt89=3;
                        }
                        else if ( LA89_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 3) ) {
                            alt89=4;
                        }
                        else if ( LA89_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 4) ) {
                            alt89=5;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5500:4: ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5500:4: ({...}? => ( ( (lv_isStatic_4_0= 'static' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5501:5: {...}? => ( ( (lv_isStatic_4_0= 'static' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleInlinePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 0)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5501:123: ( ( (lv_isStatic_4_0= 'static' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5502:6: ( (lv_isStatic_4_0= 'static' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 0);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5505:6: ( (lv_isStatic_4_0= 'static' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5506:1: (lv_isStatic_4_0= 'static' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5506:1: (lv_isStatic_4_0= 'static' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5507:3: lv_isStatic_4_0= 'static'
                    	    {
                    	    lv_isStatic_4_0=(Token)input.LT(1);
                    	    match(input,63,FollowSets000.FOLLOW_63_in_ruleInlinePropertyDefinition10357); 

                    	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getIsStaticStaticKeyword_2_1_0_0(), "isStatic"); 
                    	        

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		set(current, "isStatic", true, "static", lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5533:4: ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5533:4: ({...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5534:5: {...}? => ( ( (lv_isOrdered_5_0= 'ordered' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleInlinePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 1)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5534:123: ( ( (lv_isOrdered_5_0= 'ordered' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5535:6: ( (lv_isOrdered_5_0= 'ordered' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 1);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5538:6: ( (lv_isOrdered_5_0= 'ordered' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5539:1: (lv_isOrdered_5_0= 'ordered' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5539:1: (lv_isOrdered_5_0= 'ordered' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5540:3: lv_isOrdered_5_0= 'ordered'
                    	    {
                    	    lv_isOrdered_5_0=(Token)input.LT(1);
                    	    match(input,64,FollowSets000.FOLLOW_64_in_ruleInlinePropertyDefinition10438); 

                    	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getIsOrderedOrderedKeyword_2_1_1_0(), "isOrdered"); 
                    	        

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		set(current, "isOrdered", true, "ordered", lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5566:4: ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5566:4: ({...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5567:5: {...}? => ( ( (lv_isUnique_6_0= 'unique' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleInlinePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 2)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5567:123: ( ( (lv_isUnique_6_0= 'unique' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5568:6: ( (lv_isUnique_6_0= 'unique' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 2);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5571:6: ( (lv_isUnique_6_0= 'unique' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5572:1: (lv_isUnique_6_0= 'unique' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5572:1: (lv_isUnique_6_0= 'unique' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5573:3: lv_isUnique_6_0= 'unique'
                    	    {
                    	    lv_isUnique_6_0=(Token)input.LT(1);
                    	    match(input,65,FollowSets000.FOLLOW_65_in_ruleInlinePropertyDefinition10519); 

                    	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getIsUniqueUniqueKeyword_2_1_2_0(), "isUnique"); 
                    	        

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		set(current, "isUnique", true, "unique", lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5599:4: ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5599:4: ({...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5600:5: {...}? => ( ( (lv_isReadOnly_7_0= 'read-only' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleInlinePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 3)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5600:123: ( ( (lv_isReadOnly_7_0= 'read-only' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5601:6: ( (lv_isReadOnly_7_0= 'read-only' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 3);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5604:6: ( (lv_isReadOnly_7_0= 'read-only' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5605:1: (lv_isReadOnly_7_0= 'read-only' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5605:1: (lv_isReadOnly_7_0= 'read-only' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5606:3: lv_isReadOnly_7_0= 'read-only'
                    	    {
                    	    lv_isReadOnly_7_0=(Token)input.LT(1);
                    	    match(input,66,FollowSets000.FOLLOW_66_in_ruleInlinePropertyDefinition10600); 

                    	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getIsReadOnlyReadOnlyKeyword_2_1_3_0(), "isReadOnly"); 
                    	        

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		set(current, "isReadOnly", true, "read-only", lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5632:4: ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5632:4: ({...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5633:5: {...}? => ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleInlinePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 4)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5633:123: ( ( (lv_isDerivedUnion_8_0= 'derived-union' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5634:6: ( (lv_isDerivedUnion_8_0= 'derived-union' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1(), 4);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5637:6: ( (lv_isDerivedUnion_8_0= 'derived-union' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5638:1: (lv_isDerivedUnion_8_0= 'derived-union' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5638:1: (lv_isDerivedUnion_8_0= 'derived-union' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5639:3: lv_isDerivedUnion_8_0= 'derived-union'
                    	    {
                    	    lv_isDerivedUnion_8_0=(Token)input.LT(1);
                    	    match(input,67,FollowSets000.FOLLOW_67_in_ruleInlinePropertyDefinition10681); 

                    	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getIsDerivedUnionDerivedUnionKeyword_2_1_4_0(), "isDerivedUnion"); 
                    	        

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		set(current, "isDerivedUnion", true, "derived-union", lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_2_1());
                    	

                    }

                    match(input,54,FollowSets000.FOLLOW_54_in_ruleInlinePropertyDefinition10743); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5676:3: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5677:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5677:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5678:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition10763); 

            		createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getTypeTypeCrossReference_3_0(), "type"); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5690:2: ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==33) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5690:4: '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleInlinePropertyDefinition10774); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getLeftSquareBracketKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5694:1: ( (lv_lowerValue_12_0= ruleLiteralInteger ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5695:1: (lv_lowerValue_12_0= ruleLiteralInteger )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5695:1: (lv_lowerValue_12_0= ruleLiteralInteger )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5696:3: lv_lowerValue_12_0= ruleLiteralInteger
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInlinePropertyDefinitionAccess().getLowerValueLiteralIntegerParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_ruleInlinePropertyDefinition10795);
                    lv_lowerValue_12_0=ruleLiteralInteger();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lowerValue",
                    	        		lv_lowerValue_12_0, 
                    	        		"LiteralInteger", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,34,FollowSets000.FOLLOW_34_in_ruleInlinePropertyDefinition10805); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getFullStopFullStopKeyword_4_2(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5722:1: ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5723:1: (lv_upperValue_14_0= ruleLiteralUnlimitedNatural )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5723:1: (lv_upperValue_14_0= ruleLiteralUnlimitedNatural )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5724:3: lv_upperValue_14_0= ruleLiteralUnlimitedNatural
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInlinePropertyDefinitionAccess().getUpperValueLiteralUnlimitedNaturalParserRuleCall_4_3_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_ruleInlinePropertyDefinition10826);
                    lv_upperValue_14_0=ruleLiteralUnlimitedNatural();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"upperValue",
                    	        		lv_upperValue_14_0, 
                    	        		"LiteralUnlimitedNatural", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,35,FollowSets000.FOLLOW_35_in_ruleInlinePropertyDefinition10836); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRightSquareBracketKeyword_4_4(), null); 
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5750:3: ( '{' ( 'defaults to' ( (lv_defaultValue_18_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_20_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==19) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5750:5: '{' ( 'defaults to' ( (lv_defaultValue_18_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_20_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleInlinePropertyDefinition10849); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getLeftCurlyBracketKeyword_5_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5754:1: ( 'defaults to' ( (lv_defaultValue_18_0= ruleValueSpecification ) ) )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==68) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5754:3: 'defaults to' ( (lv_defaultValue_18_0= ruleValueSpecification ) )
                            {
                            match(input,68,FollowSets000.FOLLOW_68_in_ruleInlinePropertyDefinition10860); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getDefaultsToKeyword_5_1_0(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5758:1: ( (lv_defaultValue_18_0= ruleValueSpecification ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5759:1: (lv_defaultValue_18_0= ruleValueSpecification )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5759:1: (lv_defaultValue_18_0= ruleValueSpecification )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5760:3: lv_defaultValue_18_0= ruleValueSpecification
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getInlinePropertyDefinitionAccess().getDefaultValueValueSpecificationParserRuleCall_5_1_1_0(), currentNode); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleInlinePropertyDefinition10881);
                            lv_defaultValue_18_0=ruleValueSpecification();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"defaultValue",
                            	        		lv_defaultValue_18_0, 
                            	        		"ValueSpecification", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5782:4: ( 'aggregation' ( (lv_aggregation_20_0= ruleAggregationKind ) ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==69) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5782:6: 'aggregation' ( (lv_aggregation_20_0= ruleAggregationKind ) )
                            {
                            match(input,69,FollowSets000.FOLLOW_69_in_ruleInlinePropertyDefinition10894); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getAggregationKeyword_5_2_0(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5786:1: ( (lv_aggregation_20_0= ruleAggregationKind ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5787:1: (lv_aggregation_20_0= ruleAggregationKind )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5787:1: (lv_aggregation_20_0= ruleAggregationKind )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5788:3: lv_aggregation_20_0= ruleAggregationKind
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getInlinePropertyDefinitionAccess().getAggregationAggregationKindEnumRuleCall_5_2_1_0(), currentNode); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleAggregationKind_in_ruleInlinePropertyDefinition10915);
                            lv_aggregation_20_0=ruleAggregationKind();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"aggregation",
                            	        		lv_aggregation_20_0, 
                            	        		"AggregationKind", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5810:4: ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==70) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5810:6: 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                            {
                            match(input,70,FollowSets000.FOLLOW_70_in_ruleInlinePropertyDefinition10928); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getSubsetOfKeyword_5_3_0(), null); 
                                
                            match(input,53,FollowSets000.FOLLOW_53_in_ruleInlinePropertyDefinition10938); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getLeftParenthesisKeyword_5_3_1(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5818:1: ( ( RULE_ID ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5819:1: ( RULE_ID )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5819:1: ( RULE_ID )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5820:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition10956); 

                            		createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getSubsettedPropertyPropertyCrossReference_5_3_2_0(), "subsettedProperty"); 
                            	

                            }


                            }

                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5832:2: ( ',' ( ( RULE_ID ) ) )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==18) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5832:4: ',' ( ( RULE_ID ) )
                            	    {
                            	    match(input,18,FollowSets000.FOLLOW_18_in_ruleInlinePropertyDefinition10967); 

                            	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getCommaKeyword_5_3_3_0(), null); 
                            	        
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5836:1: ( ( RULE_ID ) )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5837:1: ( RULE_ID )
                            	    {
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5837:1: ( RULE_ID )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5838:3: RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode, current);
                            	    	        }
                            	            
                            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition10985); 

                            	    		createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getSubsettedPropertyPropertyCrossReference_5_3_3_1_0(), "subsettedProperty"); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop94;
                                }
                            } while (true);

                            match(input,54,FollowSets000.FOLLOW_54_in_ruleInlinePropertyDefinition10997); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRightParenthesisKeyword_5_3_4(), null); 
                                

                            }
                            break;

                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5854:3: ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==71) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5854:5: 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                            {
                            match(input,71,FollowSets000.FOLLOW_71_in_ruleInlinePropertyDefinition11010); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRedefinesKeyword_5_4_0(), null); 
                                
                            match(input,53,FollowSets000.FOLLOW_53_in_ruleInlinePropertyDefinition11020); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getLeftParenthesisKeyword_5_4_1(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5862:1: ( ( RULE_ID ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5863:1: ( RULE_ID )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5863:1: ( RULE_ID )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5864:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition11038); 

                            		createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRedefinedPropertyPropertyCrossReference_5_4_2_0(), "redefinedProperty"); 
                            	

                            }


                            }

                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5876:2: ( ',' ( ( RULE_ID ) ) )*
                            loop96:
                            do {
                                int alt96=2;
                                int LA96_0 = input.LA(1);

                                if ( (LA96_0==18) ) {
                                    alt96=1;
                                }


                                switch (alt96) {
                            	case 1 :
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5876:4: ',' ( ( RULE_ID ) )
                            	    {
                            	    match(input,18,FollowSets000.FOLLOW_18_in_ruleInlinePropertyDefinition11049); 

                            	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getCommaKeyword_5_4_3_0(), null); 
                            	        
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5880:1: ( ( RULE_ID ) )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5881:1: ( RULE_ID )
                            	    {
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5881:1: ( RULE_ID )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5882:3: RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode, current);
                            	    	        }
                            	            
                            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition11067); 

                            	    		createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRedefinedPropertyPropertyCrossReference_5_4_3_1_0(), "redefinedProperty"); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop96;
                                }
                            } while (true);

                            match(input,54,FollowSets000.FOLLOW_54_in_ruleInlinePropertyDefinition11079); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRightParenthesisKeyword_5_4_4(), null); 
                                

                            }
                            break;

                    }

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleInlinePropertyDefinition11091); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRightCurlyBracketKeyword_5_5(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInlinePropertyDefinition


    // $ANTLR start entryRuleClassProperty
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5910:1: entryRuleClassProperty returns [EObject current=null] : iv_ruleClassProperty= ruleClassProperty EOF ;
    public final EObject entryRuleClassProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassProperty = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5911:2: (iv_ruleClassProperty= ruleClassProperty EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5912:2: iv_ruleClassProperty= ruleClassProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassPropertyRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleClassProperty_in_entryRuleClassProperty11129);
            iv_ruleClassProperty=ruleClassProperty();
            _fsp--;

             current =iv_ruleClassProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassProperty11139); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClassProperty


    // $ANTLR start ruleClassProperty
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5919:1: ruleClassProperty returns [EObject current=null] : ( () ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )? 'property' ( (lv_name_10_0= RULE_ID ) ) ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )? ':' ( ( RULE_ID ) ) ( '{' ( 'defaults to' ( (lv_defaultValue_20_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_22_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? ) ;
    public final EObject ruleClassProperty() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_3_0=null;
        Token lv_isOrdered_4_0=null;
        Token lv_isUnique_5_0=null;
        Token lv_isReadOnly_6_0=null;
        Token lv_isDerivedUnion_7_0=null;
        Token lv_name_10_0=null;
        EObject lv_lowerValue_12_0 = null;

        EObject lv_upperValue_14_0 = null;

        EObject lv_defaultValue_20_0 = null;

        Enumerator lv_aggregation_22_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5924:6: ( ( () ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )? 'property' ( (lv_name_10_0= RULE_ID ) ) ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )? ':' ( ( RULE_ID ) ) ( '{' ( 'defaults to' ( (lv_defaultValue_20_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_22_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5925:1: ( () ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )? 'property' ( (lv_name_10_0= RULE_ID ) ) ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )? ':' ( ( RULE_ID ) ) ( '{' ( 'defaults to' ( (lv_defaultValue_20_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_22_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5925:1: ( () ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )? 'property' ( (lv_name_10_0= RULE_ID ) ) ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )? ':' ( ( RULE_ID ) ) ( '{' ( 'defaults to' ( (lv_defaultValue_20_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_22_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5925:2: () ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )? 'property' ( (lv_name_10_0= RULE_ID ) ) ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )? ':' ( ( RULE_ID ) ) ( '{' ( 'defaults to' ( (lv_defaultValue_20_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_22_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5925:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5926:5: 
            {
             
                    temp=factory.create(grammarAccess.getClassPropertyAccess().getPropertyAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getClassPropertyAccess().getPropertyAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5936:2: ( '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* ) ) ) ')' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==53) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5936:4: '(' ( ( ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* ) ) ) ')'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleClassProperty11184); 

                            createLeafNode(grammarAccess.getClassPropertyAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5940:1: ( ( ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* ) ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5942:1: ( ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5942:1: ( ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5943:2: ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1());
                    	
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5946:2: ( ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )* )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5947:3: ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )*
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5947:3: ( ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) ) )*
                    loop99:
                    do {
                        int alt99=6;
                        int LA99_0 = input.LA(1);

                        if ( LA99_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 0) ) {
                            alt99=1;
                        }
                        else if ( LA99_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 1) ) {
                            alt99=2;
                        }
                        else if ( LA99_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 2) ) {
                            alt99=3;
                        }
                        else if ( LA99_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 3) ) {
                            alt99=4;
                        }
                        else if ( LA99_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 4) ) {
                            alt99=5;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5949:4: ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5949:4: ({...}? => ( ( (lv_isStatic_3_0= 'static' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5950:5: {...}? => ( ( (lv_isStatic_3_0= 'static' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleClassProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5950:112: ( ( (lv_isStatic_3_0= 'static' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5951:6: ( (lv_isStatic_3_0= 'static' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 0);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5954:6: ( (lv_isStatic_3_0= 'static' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5955:1: (lv_isStatic_3_0= 'static' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5955:1: (lv_isStatic_3_0= 'static' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5956:3: lv_isStatic_3_0= 'static'
                    	    {
                    	    lv_isStatic_3_0=(Token)input.LT(1);
                    	    match(input,63,FollowSets000.FOLLOW_63_in_ruleClassProperty11244); 

                    	            createLeafNode(grammarAccess.getClassPropertyAccess().getIsStaticStaticKeyword_1_1_0_0(), "isStatic"); 
                    	        

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		set(current, "isStatic", true, "static", lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5982:4: ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5982:4: ({...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5983:5: {...}? => ( ( (lv_isOrdered_4_0= 'ordered' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleClassProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5983:112: ( ( (lv_isOrdered_4_0= 'ordered' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5984:6: ( (lv_isOrdered_4_0= 'ordered' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 1);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5987:6: ( (lv_isOrdered_4_0= 'ordered' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5988:1: (lv_isOrdered_4_0= 'ordered' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5988:1: (lv_isOrdered_4_0= 'ordered' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:5989:3: lv_isOrdered_4_0= 'ordered'
                    	    {
                    	    lv_isOrdered_4_0=(Token)input.LT(1);
                    	    match(input,64,FollowSets000.FOLLOW_64_in_ruleClassProperty11325); 

                    	            createLeafNode(grammarAccess.getClassPropertyAccess().getIsOrderedOrderedKeyword_1_1_1_0(), "isOrdered"); 
                    	        

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		set(current, "isOrdered", true, "ordered", lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6015:4: ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6015:4: ({...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6016:5: {...}? => ( ( (lv_isUnique_5_0= 'unique' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleClassProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 2)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6016:112: ( ( (lv_isUnique_5_0= 'unique' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6017:6: ( (lv_isUnique_5_0= 'unique' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 2);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6020:6: ( (lv_isUnique_5_0= 'unique' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6021:1: (lv_isUnique_5_0= 'unique' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6021:1: (lv_isUnique_5_0= 'unique' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6022:3: lv_isUnique_5_0= 'unique'
                    	    {
                    	    lv_isUnique_5_0=(Token)input.LT(1);
                    	    match(input,65,FollowSets000.FOLLOW_65_in_ruleClassProperty11406); 

                    	            createLeafNode(grammarAccess.getClassPropertyAccess().getIsUniqueUniqueKeyword_1_1_2_0(), "isUnique"); 
                    	        

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		set(current, "isUnique", true, "unique", lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6048:4: ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6048:4: ({...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6049:5: {...}? => ( ( (lv_isReadOnly_6_0= 'read-only' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleClassProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 3)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6049:112: ( ( (lv_isReadOnly_6_0= 'read-only' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6050:6: ( (lv_isReadOnly_6_0= 'read-only' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 3);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6053:6: ( (lv_isReadOnly_6_0= 'read-only' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6054:1: (lv_isReadOnly_6_0= 'read-only' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6054:1: (lv_isReadOnly_6_0= 'read-only' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6055:3: lv_isReadOnly_6_0= 'read-only'
                    	    {
                    	    lv_isReadOnly_6_0=(Token)input.LT(1);
                    	    match(input,66,FollowSets000.FOLLOW_66_in_ruleClassProperty11487); 

                    	            createLeafNode(grammarAccess.getClassPropertyAccess().getIsReadOnlyReadOnlyKeyword_1_1_3_0(), "isReadOnly"); 
                    	        

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		set(current, "isReadOnly", true, "read-only", lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6081:4: ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6081:4: ({...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6082:5: {...}? => ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleClassProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 4)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6082:112: ( ( (lv_isDerivedUnion_7_0= 'derived-union' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6083:6: ( (lv_isDerivedUnion_7_0= 'derived-union' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1(), 4);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6086:6: ( (lv_isDerivedUnion_7_0= 'derived-union' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6087:1: (lv_isDerivedUnion_7_0= 'derived-union' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6087:1: (lv_isDerivedUnion_7_0= 'derived-union' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6088:3: lv_isDerivedUnion_7_0= 'derived-union'
                    	    {
                    	    lv_isDerivedUnion_7_0=(Token)input.LT(1);
                    	    match(input,67,FollowSets000.FOLLOW_67_in_ruleClassProperty11568); 

                    	            createLeafNode(grammarAccess.getClassPropertyAccess().getIsDerivedUnionDerivedUnionKeyword_1_1_4_0(), "isDerivedUnion"); 
                    	        

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		set(current, "isDerivedUnion", true, "derived-union", lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getClassPropertyAccess().getUnorderedGroup_1_1());
                    	

                    }

                    match(input,54,FollowSets000.FOLLOW_54_in_ruleClassProperty11630); 

                            createLeafNode(grammarAccess.getClassPropertyAccess().getRightParenthesisKeyword_1_2(), null); 
                        

                    }
                    break;

            }

            match(input,72,FollowSets000.FOLLOW_72_in_ruleClassProperty11642); 

                    createLeafNode(grammarAccess.getClassPropertyAccess().getPropertyKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6129:1: ( (lv_name_10_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6130:1: (lv_name_10_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6130:1: (lv_name_10_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6131:3: lv_name_10_0= RULE_ID
            {
            lv_name_10_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassProperty11659); 

            			createLeafNode(grammarAccess.getClassPropertyAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_10_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6153:2: ( '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==33) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6153:4: '[' ( (lv_lowerValue_12_0= ruleLiteralInteger ) ) '..' ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) ) ']'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleClassProperty11675); 

                            createLeafNode(grammarAccess.getClassPropertyAccess().getLeftSquareBracketKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6157:1: ( (lv_lowerValue_12_0= ruleLiteralInteger ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6158:1: (lv_lowerValue_12_0= ruleLiteralInteger )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6158:1: (lv_lowerValue_12_0= ruleLiteralInteger )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6159:3: lv_lowerValue_12_0= ruleLiteralInteger
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClassPropertyAccess().getLowerValueLiteralIntegerParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_ruleClassProperty11696);
                    lv_lowerValue_12_0=ruleLiteralInteger();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lowerValue",
                    	        		lv_lowerValue_12_0, 
                    	        		"LiteralInteger", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,34,FollowSets000.FOLLOW_34_in_ruleClassProperty11706); 

                            createLeafNode(grammarAccess.getClassPropertyAccess().getFullStopFullStopKeyword_4_2(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6185:1: ( (lv_upperValue_14_0= ruleLiteralUnlimitedNatural ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6186:1: (lv_upperValue_14_0= ruleLiteralUnlimitedNatural )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6186:1: (lv_upperValue_14_0= ruleLiteralUnlimitedNatural )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6187:3: lv_upperValue_14_0= ruleLiteralUnlimitedNatural
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClassPropertyAccess().getUpperValueLiteralUnlimitedNaturalParserRuleCall_4_3_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_ruleClassProperty11727);
                    lv_upperValue_14_0=ruleLiteralUnlimitedNatural();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"upperValue",
                    	        		lv_upperValue_14_0, 
                    	        		"LiteralUnlimitedNatural", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,35,FollowSets000.FOLLOW_35_in_ruleClassProperty11737); 

                            createLeafNode(grammarAccess.getClassPropertyAccess().getRightSquareBracketKeyword_4_4(), null); 
                        

                    }
                    break;

            }

            match(input,17,FollowSets000.FOLLOW_17_in_ruleClassProperty11749); 

                    createLeafNode(grammarAccess.getClassPropertyAccess().getColonKeyword_5(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6217:1: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6218:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6218:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6219:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassProperty11767); 

            		createLeafNode(grammarAccess.getClassPropertyAccess().getTypeTypeCrossReference_6_0(), "type"); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6231:2: ( '{' ( 'defaults to' ( (lv_defaultValue_20_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_22_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==19) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6231:4: '{' ( 'defaults to' ( (lv_defaultValue_20_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_22_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleClassProperty11778); 

                            createLeafNode(grammarAccess.getClassPropertyAccess().getLeftCurlyBracketKeyword_7_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6235:1: ( 'defaults to' ( (lv_defaultValue_20_0= ruleValueSpecification ) ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==68) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6235:3: 'defaults to' ( (lv_defaultValue_20_0= ruleValueSpecification ) )
                            {
                            match(input,68,FollowSets000.FOLLOW_68_in_ruleClassProperty11789); 

                                    createLeafNode(grammarAccess.getClassPropertyAccess().getDefaultsToKeyword_7_1_0(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6239:1: ( (lv_defaultValue_20_0= ruleValueSpecification ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6240:1: (lv_defaultValue_20_0= ruleValueSpecification )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6240:1: (lv_defaultValue_20_0= ruleValueSpecification )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6241:3: lv_defaultValue_20_0= ruleValueSpecification
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getClassPropertyAccess().getDefaultValueValueSpecificationParserRuleCall_7_1_1_0(), currentNode); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleClassProperty11810);
                            lv_defaultValue_20_0=ruleValueSpecification();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"defaultValue",
                            	        		lv_defaultValue_20_0, 
                            	        		"ValueSpecification", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6263:4: ( 'aggregation' ( (lv_aggregation_22_0= ruleAggregationKind ) ) )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==69) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6263:6: 'aggregation' ( (lv_aggregation_22_0= ruleAggregationKind ) )
                            {
                            match(input,69,FollowSets000.FOLLOW_69_in_ruleClassProperty11823); 

                                    createLeafNode(grammarAccess.getClassPropertyAccess().getAggregationKeyword_7_2_0(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6267:1: ( (lv_aggregation_22_0= ruleAggregationKind ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6268:1: (lv_aggregation_22_0= ruleAggregationKind )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6268:1: (lv_aggregation_22_0= ruleAggregationKind )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6269:3: lv_aggregation_22_0= ruleAggregationKind
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getClassPropertyAccess().getAggregationAggregationKindEnumRuleCall_7_2_1_0(), currentNode); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleAggregationKind_in_ruleClassProperty11844);
                            lv_aggregation_22_0=ruleAggregationKind();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"aggregation",
                            	        		lv_aggregation_22_0, 
                            	        		"AggregationKind", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6291:4: ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==70) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6291:6: 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                            {
                            match(input,70,FollowSets000.FOLLOW_70_in_ruleClassProperty11857); 

                                    createLeafNode(grammarAccess.getClassPropertyAccess().getSubsetOfKeyword_7_3_0(), null); 
                                
                            match(input,53,FollowSets000.FOLLOW_53_in_ruleClassProperty11867); 

                                    createLeafNode(grammarAccess.getClassPropertyAccess().getLeftParenthesisKeyword_7_3_1(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6299:1: ( ( RULE_ID ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6300:1: ( RULE_ID )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6300:1: ( RULE_ID )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6301:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassProperty11885); 

                            		createLeafNode(grammarAccess.getClassPropertyAccess().getSubsettedPropertyPropertyCrossReference_7_3_2_0(), "subsettedProperty"); 
                            	

                            }


                            }

                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6313:2: ( ',' ( ( RULE_ID ) ) )*
                            loop104:
                            do {
                                int alt104=2;
                                int LA104_0 = input.LA(1);

                                if ( (LA104_0==18) ) {
                                    alt104=1;
                                }


                                switch (alt104) {
                            	case 1 :
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6313:4: ',' ( ( RULE_ID ) )
                            	    {
                            	    match(input,18,FollowSets000.FOLLOW_18_in_ruleClassProperty11896); 

                            	            createLeafNode(grammarAccess.getClassPropertyAccess().getCommaKeyword_7_3_3_0(), null); 
                            	        
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6317:1: ( ( RULE_ID ) )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6318:1: ( RULE_ID )
                            	    {
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6318:1: ( RULE_ID )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6319:3: RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode, current);
                            	    	        }
                            	            
                            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassProperty11914); 

                            	    		createLeafNode(grammarAccess.getClassPropertyAccess().getSubsettedPropertyPropertyCrossReference_7_3_3_1_0(), "subsettedProperty"); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop104;
                                }
                            } while (true);

                            match(input,54,FollowSets000.FOLLOW_54_in_ruleClassProperty11926); 

                                    createLeafNode(grammarAccess.getClassPropertyAccess().getRightParenthesisKeyword_7_3_4(), null); 
                                

                            }
                            break;

                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6335:3: ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==71) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6335:5: 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                            {
                            match(input,71,FollowSets000.FOLLOW_71_in_ruleClassProperty11939); 

                                    createLeafNode(grammarAccess.getClassPropertyAccess().getRedefinesKeyword_7_4_0(), null); 
                                
                            match(input,53,FollowSets000.FOLLOW_53_in_ruleClassProperty11949); 

                                    createLeafNode(grammarAccess.getClassPropertyAccess().getLeftParenthesisKeyword_7_4_1(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6343:1: ( ( RULE_ID ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6344:1: ( RULE_ID )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6344:1: ( RULE_ID )
                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6345:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassProperty11967); 

                            		createLeafNode(grammarAccess.getClassPropertyAccess().getRedefinedPropertyPropertyCrossReference_7_4_2_0(), "redefinedProperty"); 
                            	

                            }


                            }

                            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6357:2: ( ',' ( ( RULE_ID ) ) )*
                            loop106:
                            do {
                                int alt106=2;
                                int LA106_0 = input.LA(1);

                                if ( (LA106_0==18) ) {
                                    alt106=1;
                                }


                                switch (alt106) {
                            	case 1 :
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6357:4: ',' ( ( RULE_ID ) )
                            	    {
                            	    match(input,18,FollowSets000.FOLLOW_18_in_ruleClassProperty11978); 

                            	            createLeafNode(grammarAccess.getClassPropertyAccess().getCommaKeyword_7_4_3_0(), null); 
                            	        
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6361:1: ( ( RULE_ID ) )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6362:1: ( RULE_ID )
                            	    {
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6362:1: ( RULE_ID )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6363:3: RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = factory.create(grammarAccess.getClassPropertyRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode, current);
                            	    	        }
                            	            
                            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassProperty11996); 

                            	    		createLeafNode(grammarAccess.getClassPropertyAccess().getRedefinedPropertyPropertyCrossReference_7_4_3_1_0(), "redefinedProperty"); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop106;
                                }
                            } while (true);

                            match(input,54,FollowSets000.FOLLOW_54_in_ruleClassProperty12008); 

                                    createLeafNode(grammarAccess.getClassPropertyAccess().getRightParenthesisKeyword_7_4_4(), null); 
                                

                            }
                            break;

                    }

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleClassProperty12020); 

                            createLeafNode(grammarAccess.getClassPropertyAccess().getRightCurlyBracketKeyword_7_5(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClassProperty


    // $ANTLR start entryRuleEnumeration
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6391:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6392:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6393:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_entryRuleEnumeration12058);
            iv_ruleEnumeration=ruleEnumeration();
            _fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumeration12068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6400:1: ruleEnumeration returns [EObject current=null] : ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_ownedLiteral_3_0= ruleEnumerationLiteral ) ) ( ',' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) ) )* '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_ownedLiteral_3_0 = null;

        EObject lv_ownedLiteral_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6405:6: ( ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_ownedLiteral_3_0= ruleEnumerationLiteral ) ) ( ',' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) ) )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6406:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_ownedLiteral_3_0= ruleEnumerationLiteral ) ) ( ',' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) ) )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6406:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_ownedLiteral_3_0= ruleEnumerationLiteral ) ) ( ',' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) ) )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6406:3: 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_ownedLiteral_3_0= ruleEnumerationLiteral ) ) ( ',' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) ) )* '}'
            {
            match(input,73,FollowSets000.FOLLOW_73_in_ruleEnumeration12103); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getEnumKeyword_0(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6410:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6411:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6411:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6412:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumeration12120); 

            			createLeafNode(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleEnumeration12135); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6438:1: ( (lv_ownedLiteral_3_0= ruleEnumerationLiteral ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6439:1: (lv_ownedLiteral_3_0= ruleEnumerationLiteral )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6439:1: (lv_ownedLiteral_3_0= ruleEnumerationLiteral )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6440:3: lv_ownedLiteral_3_0= ruleEnumerationLiteral
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getOwnedLiteralEnumerationLiteralParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration12156);
            lv_ownedLiteral_3_0=ruleEnumerationLiteral();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedLiteral",
            	        		lv_ownedLiteral_3_0, 
            	        		"EnumerationLiteral", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6462:2: ( ',' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==18) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6462:4: ',' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) )
            	    {
            	    match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumeration12167); 

            	            createLeafNode(grammarAccess.getEnumerationAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6466:1: ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6467:1: (lv_ownedLiteral_5_0= ruleEnumerationLiteral )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6467:1: (lv_ownedLiteral_5_0= ruleEnumerationLiteral )
            	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6468:3: lv_ownedLiteral_5_0= ruleEnumerationLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getOwnedLiteralEnumerationLiteralParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration12188);
            	    lv_ownedLiteral_5_0=ruleEnumerationLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedLiteral",
            	    	        		lv_ownedLiteral_5_0, 
            	    	        		"EnumerationLiteral", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleEnumeration12200); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRuleEnumerationLiteral
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6502:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6503:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6504:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationLiteralRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral12236);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();
            _fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationLiteral12246); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumerationLiteral


    // $ANTLR start ruleEnumerationLiteral
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6511:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_specification_3_0= ruleValueSpecification ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_specification_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6516:6: ( ( () ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_specification_3_0= ruleValueSpecification ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6517:1: ( () ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_specification_3_0= ruleValueSpecification ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6517:1: ( () ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_specification_3_0= ruleValueSpecification ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6517:2: () ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_specification_3_0= ruleValueSpecification ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6517:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6518:5: 
            {
             
                    temp=factory.create(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6528:2: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6529:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6529:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6530:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumerationLiteral12297); 

            			createLeafNode(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,74,FollowSets000.FOLLOW_74_in_ruleEnumerationLiteral12312); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6556:1: ( (lv_specification_3_0= ruleValueSpecification ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6557:1: (lv_specification_3_0= ruleValueSpecification )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6557:1: (lv_specification_3_0= ruleValueSpecification )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6558:3: lv_specification_3_0= ruleValueSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumerationLiteralAccess().getSpecificationValueSpecificationParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleEnumerationLiteral12333);
            lv_specification_3_0=ruleValueSpecification();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"specification",
            	        		lv_specification_3_0, 
            	        		"ValueSpecification", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start entryRuleSlot
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6590:1: entryRuleSlot returns [EObject current=null] : iv_ruleSlot= ruleSlot EOF ;
    public final EObject entryRuleSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlot = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6591:2: (iv_ruleSlot= ruleSlot EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6592:2: iv_ruleSlot= ruleSlot EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSlotRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSlot_in_entryRuleSlot12371);
            iv_ruleSlot=ruleSlot();
            _fsp--;

             current =iv_ruleSlot; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlot12381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSlot


    // $ANTLR start ruleSlot
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6599:1: ruleSlot returns [EObject current=null] : ( ( ( RULE_ID ) ) '=>' ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) ) ) ;
    public final EObject ruleSlot() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6604:6: ( ( ( ( RULE_ID ) ) '=>' ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6605:1: ( ( ( RULE_ID ) ) '=>' ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6605:1: ( ( ( RULE_ID ) ) '=>' ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6605:2: ( ( RULE_ID ) ) '=>' ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6605:2: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6606:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6606:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6607:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSlotRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSlot12424); 

            		createLeafNode(grammarAccess.getSlotAccess().getDefiningFeatureStructuralFeatureCrossReference_0_0(), "definingFeature"); 
            	

            }


            }

            match(input,75,FollowSets000.FOLLOW_75_in_ruleSlot12434); 

                    createLeafNode(grammarAccess.getSlotAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6623:1: ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( ((LA111_0>=RULE_ID && LA111_0<=RULE_INT)||LA111_0==53||(LA111_0>=76 && LA111_0<=78)) ) {
                alt111=1;
            }
            else if ( (LA111_0==33) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6623:1: ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) )", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6623:2: ( (lv_value_2_0= ruleValueSpecification ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6623:2: ( (lv_value_2_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6624:1: (lv_value_2_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6624:1: (lv_value_2_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6625:3: lv_value_2_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSlotAccess().getValueValueSpecificationParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleSlot12456);
                    lv_value_2_0=ruleValueSpecification();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSlotRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_2_0, 
                    	        		"ValueSpecification", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6648:6: ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6648:6: ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6648:8: '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleSlot12473); 

                            createLeafNode(grammarAccess.getSlotAccess().getLeftSquareBracketKeyword_2_1_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6652:1: ( (lv_value_4_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6653:1: (lv_value_4_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6653:1: (lv_value_4_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6654:3: lv_value_4_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSlotAccess().getValueValueSpecificationParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleSlot12494);
                    lv_value_4_0=ruleValueSpecification();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSlotRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_4_0, 
                    	        		"ValueSpecification", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6676:2: ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==18) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6676:4: ',' ( (lv_value_6_0= ruleValueSpecification ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleSlot12505); 

                    	            createLeafNode(grammarAccess.getSlotAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6680:1: ( (lv_value_6_0= ruleValueSpecification ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6681:1: (lv_value_6_0= ruleValueSpecification )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6681:1: (lv_value_6_0= ruleValueSpecification )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6682:3: lv_value_6_0= ruleValueSpecification
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSlotAccess().getValueValueSpecificationParserRuleCall_2_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleSlot12526);
                    	    lv_value_6_0=ruleValueSpecification();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSlotRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"value",
                    	    	        		lv_value_6_0, 
                    	    	        		"ValueSpecification", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    match(input,35,FollowSets000.FOLLOW_35_in_ruleSlot12538); 

                            createLeafNode(grammarAccess.getSlotAccess().getRightSquareBracketKeyword_2_1_3(), null); 
                        

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSlot


    // $ANTLR start entryRuleInstanceValue
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6716:1: entryRuleInstanceValue returns [EObject current=null] : iv_ruleInstanceValue= ruleInstanceValue EOF ;
    public final EObject entryRuleInstanceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceValue = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6717:2: (iv_ruleInstanceValue= ruleInstanceValue EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6718:2: iv_ruleInstanceValue= ruleInstanceValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstanceValueRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleInstanceValue_in_entryRuleInstanceValue12576);
            iv_ruleInstanceValue=ruleInstanceValue();
            _fsp--;

             current =iv_ruleInstanceValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInstanceValue12586); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInstanceValue


    // $ANTLR start ruleInstanceValue
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6725:1: ruleInstanceValue returns [EObject current=null] : ( ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ) ;
    public final EObject ruleInstanceValue() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6730:6: ( ( ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6731:1: ( ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6731:1: ( ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6731:2: ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6731:2: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6732:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6732:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6733:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInstanceValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInstanceValue12629); 

            		createLeafNode(grammarAccess.getInstanceValueAccess().getInstanceInstanceSpecificationCrossReference_0_0(), "instance"); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6745:2: ( '(' ( ( RULE_ID ) ) ')' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==53) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6745:4: '(' ( ( RULE_ID ) ) ')'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleInstanceValue12640); 

                            createLeafNode(grammarAccess.getInstanceValueAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6749:1: ( ( RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6750:1: ( RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6750:1: ( RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6751:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getInstanceValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInstanceValue12658); 

                    		createLeafNode(grammarAccess.getInstanceValueAccess().getTypeTypeCrossReference_1_1_0(), "type"); 
                    	

                    }


                    }

                    match(input,54,FollowSets000.FOLLOW_54_in_ruleInstanceValue12668); 

                            createLeafNode(grammarAccess.getInstanceValueAccess().getRightParenthesisKeyword_1_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInstanceValue


    // $ANTLR start entryRuleLiteralInteger
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6775:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6776:2: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6777:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralIntegerRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger12706);
            iv_ruleLiteralInteger=ruleLiteralInteger();
            _fsp--;

             current =iv_ruleLiteralInteger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralInteger12716); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralInteger


    // $ANTLR start ruleLiteralInteger
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6784:1: ruleLiteralInteger returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6789:6: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6790:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6790:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6790:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6790:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6791:5: 
            {
             
                    temp=factory.create(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6801:2: ( (lv_value_1_0= RULE_INT ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6802:1: (lv_value_1_0= RULE_INT )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6802:1: (lv_value_1_0= RULE_INT )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6803:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLiteralInteger12767); 

            			createLeafNode(grammarAccess.getLiteralIntegerAccess().getValueINTTerminalRuleCall_1_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLiteralIntegerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralInteger


    // $ANTLR start entryRuleLiteralString
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6833:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6834:2: (iv_ruleLiteralString= ruleLiteralString EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6835:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralStringRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_entryRuleLiteralString12808);
            iv_ruleLiteralString=ruleLiteralString();
            _fsp--;

             current =iv_ruleLiteralString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralString12818); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralString


    // $ANTLR start ruleLiteralString
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6842:1: ruleLiteralString returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6847:6: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6848:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6848:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6848:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6848:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6849:5: 
            {
             
                    temp=factory.create(grammarAccess.getLiteralStringAccess().getLiteralStringAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLiteralStringAccess().getLiteralStringAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6859:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6860:1: (lv_value_1_0= RULE_STRING )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6860:1: (lv_value_1_0= RULE_STRING )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6861:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLiteralString12869); 

            			createLeafNode(grammarAccess.getLiteralStringAccess().getValueSTRINGTerminalRuleCall_1_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLiteralStringRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralString


    // $ANTLR start entryRuleLiteralBoolean
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6891:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6892:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6893:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean12910);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();
            _fsp--;

             current =iv_ruleLiteralBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralBoolean12920); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralBoolean


    // $ANTLR start ruleLiteralBoolean
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6900:1: ruleLiteralBoolean returns [EObject current=null] : ( () ( (lv_value_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6905:6: ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6906:1: ( () ( (lv_value_1_0= ruleBoolean ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6906:1: ( () ( (lv_value_1_0= ruleBoolean ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6906:2: () ( (lv_value_1_0= ruleBoolean ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6906:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6907:5: 
            {
             
                    temp=factory.create(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6917:2: ( (lv_value_1_0= ruleBoolean ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6918:1: (lv_value_1_0= ruleBoolean )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6918:1: (lv_value_1_0= ruleBoolean )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6919:3: lv_value_1_0= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleLiteralBoolean12975);
            lv_value_1_0=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLiteralBooleanRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_1_0, 
            	        		"Boolean", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralBoolean


    // $ANTLR start entryRuleBoolean
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6949:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6950:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6951:2: iv_ruleBoolean= ruleBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean13012);
            iv_ruleBoolean=ruleBoolean();
            _fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean13023); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBoolean


    // $ANTLR start ruleBoolean
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6958:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6963:6: ( (kw= 'true' | kw= 'false' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6964:1: (kw= 'true' | kw= 'false' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6964:1: (kw= 'true' | kw= 'false' )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==76) ) {
                alt113=1;
            }
            else if ( (LA113_0==77) ) {
                alt113=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6964:1: (kw= 'true' | kw= 'false' )", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6965:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,76,FollowSets000.FOLLOW_76_in_ruleBoolean13061); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBooleanAccess().getTrueKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6972:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,77,FollowSets000.FOLLOW_77_in_ruleBoolean13080); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBooleanAccess().getFalseKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBoolean


    // $ANTLR start entryRuleLiteralUnlimitedNatural
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6985:1: entryRuleLiteralUnlimitedNatural returns [EObject current=null] : iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF ;
    public final EObject entryRuleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUnlimitedNatural = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6986:2: (iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6987:2: iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural13120);
            iv_ruleLiteralUnlimitedNatural=ruleLiteralUnlimitedNatural();
            _fsp--;

             current =iv_ruleLiteralUnlimitedNatural; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural13130); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralUnlimitedNatural


    // $ANTLR start ruleLiteralUnlimitedNatural
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6994:1: ruleLiteralUnlimitedNatural returns [EObject current=null] : ( ( (lv_value_0_0= ruleUnlimitedNaturalValue ) ) | ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:6999:6: ( ( ( (lv_value_0_0= ruleUnlimitedNaturalValue ) ) | ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7000:1: ( ( (lv_value_0_0= ruleUnlimitedNaturalValue ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7000:1: ( ( (lv_value_0_0= ruleUnlimitedNaturalValue ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==61) ) {
                alt114=1;
            }
            else if ( (LA114_0==RULE_INT) ) {
                alt114=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("7000:1: ( ( (lv_value_0_0= ruleUnlimitedNaturalValue ) ) | ( (lv_value_1_0= RULE_INT ) ) )", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7000:2: ( (lv_value_0_0= ruleUnlimitedNaturalValue ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7000:2: ( (lv_value_0_0= ruleUnlimitedNaturalValue ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7001:1: (lv_value_0_0= ruleUnlimitedNaturalValue )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7001:1: (lv_value_0_0= ruleUnlimitedNaturalValue )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7002:3: lv_value_0_0= ruleUnlimitedNaturalValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueUnlimitedNaturalValueParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalValue_in_ruleLiteralUnlimitedNatural13176);
                    lv_value_0_0=ruleUnlimitedNaturalValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLiteralUnlimitedNaturalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_0_0, 
                    	        		"UnlimitedNaturalValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7025:6: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7025:6: ( (lv_value_1_0= RULE_INT ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7026:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7026:1: (lv_value_1_0= RULE_INT )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7027:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLiteralUnlimitedNatural13199); 

                    			createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueINTTerminalRuleCall_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLiteralUnlimitedNaturalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_1_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralUnlimitedNatural


    // $ANTLR start entryRuleUnlimitedNaturalValue
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7057:1: entryRuleUnlimitedNaturalValue returns [String current=null] : iv_ruleUnlimitedNaturalValue= ruleUnlimitedNaturalValue EOF ;
    public final String entryRuleUnlimitedNaturalValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnlimitedNaturalValue = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7058:2: (iv_ruleUnlimitedNaturalValue= ruleUnlimitedNaturalValue EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7059:2: iv_ruleUnlimitedNaturalValue= ruleUnlimitedNaturalValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnlimitedNaturalValueRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalValue_in_entryRuleUnlimitedNaturalValue13241);
            iv_ruleUnlimitedNaturalValue=ruleUnlimitedNaturalValue();
            _fsp--;

             current =iv_ruleUnlimitedNaturalValue.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalValue13252); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnlimitedNaturalValue


    // $ANTLR start ruleUnlimitedNaturalValue
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7066:1: ruleUnlimitedNaturalValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleUnlimitedNaturalValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7071:6: (kw= '*' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7073:2: kw= '*'
            {
            kw=(Token)input.LT(1);
            match(input,61,FollowSets000.FOLLOW_61_in_ruleUnlimitedNaturalValue13289); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getUnlimitedNaturalValueAccess().getAsteriskKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnlimitedNaturalValue


    // $ANTLR start entryRuleLiteralNull
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7086:1: entryRuleLiteralNull returns [EObject current=null] : iv_ruleLiteralNull= ruleLiteralNull EOF ;
    public final EObject entryRuleLiteralNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNull = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7087:2: (iv_ruleLiteralNull= ruleLiteralNull EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7088:2: iv_ruleLiteralNull= ruleLiteralNull EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralNullRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull13328);
            iv_ruleLiteralNull=ruleLiteralNull();
            _fsp--;

             current =iv_ruleLiteralNull; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralNull13338); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralNull


    // $ANTLR start ruleLiteralNull
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7095:1: ruleLiteralNull returns [EObject current=null] : ( () 'NULL' ) ;
    public final EObject ruleLiteralNull() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7100:6: ( ( () 'NULL' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7101:1: ( () 'NULL' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7101:1: ( () 'NULL' )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7101:2: () 'NULL'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7101:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7102:5: 
            {
             
                    temp=factory.create(grammarAccess.getLiteralNullAccess().getLiteralNullAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLiteralNullAccess().getLiteralNullAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,78,FollowSets000.FOLLOW_78_in_ruleLiteralNull13382); 

                    createLeafNode(grammarAccess.getLiteralNullAccess().getNULLKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralNull


    // $ANTLR start ruleAggregationKind
    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7124:1: ruleAggregationKind returns [Enumerator current=null] : ( ( 'none' ) | ( 'shared' ) | ( 'composite' ) ) ;
    public final Enumerator ruleAggregationKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7128:6: ( ( ( 'none' ) | ( 'shared' ) | ( 'composite' ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7129:1: ( ( 'none' ) | ( 'shared' ) | ( 'composite' ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7129:1: ( ( 'none' ) | ( 'shared' ) | ( 'composite' ) )
            int alt115=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt115=1;
                }
                break;
            case 80:
                {
                alt115=2;
                }
                break;
            case 81:
                {
                alt115=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("7129:1: ( ( 'none' ) | ( 'shared' ) | ( 'composite' ) )", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7129:2: ( 'none' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7129:2: ( 'none' )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7129:4: 'none'
                    {
                    match(input,79,FollowSets000.FOLLOW_79_in_ruleAggregationKind13430); 

                            current = grammarAccess.getAggregationKindAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAggregationKindAccess().getNoneEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7135:6: ( 'shared' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7135:6: ( 'shared' )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7135:8: 'shared'
                    {
                    match(input,80,FollowSets000.FOLLOW_80_in_ruleAggregationKind13445); 

                            current = grammarAccess.getAggregationKindAccess().getSharedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAggregationKindAccess().getSharedEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7141:6: ( 'composite' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7141:6: ( 'composite' )
                    // ../br.ufes.inf.nemo.ontouml.dsl.xtext/src-gen/br/ufes/inf/nemo/ontouml/dsl/xtext/parser/antlr/internal/InternalOntoDSL.g:7141:8: 'composite'
                    {
                    match(input,81,FollowSets000.FOLLOW_81_in_ruleAggregationKind13460); 

                            current = grammarAccess.getAggregationKindAccess().getCompositeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAggregationKindAccess().getCompositeEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAggregationKind


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA3_eotS =
        "\37\uffff";
    static final String DFA3_eofS =
        "\37\uffff";
    static final String DFA3_minS =
        "\1\16\3\uffff\1\16\32\uffff";
    static final String DFA3_maxS =
        "\1\111\3\uffff\1\61\32\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\3\3\4\4\3\5\5\3\3\4\4\3\1\4\3\3";
    static final String DFA3_specialS =
        "\1\0\3\uffff\1\1\32\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\1\4\1\5\4\uffff\1\5\1\6\2\7\1\uffff\2\7\1\uffff\3\7\6\uffff"+
            "\1\10\2\uffff\1\10\2\uffff\1\10\1\uffff\1\11\1\12\1\uffff\1"+
            "\13\2\1\3\uffff\1\14\1\15\1\16\17\uffff\1\2",
            "",
            "",
            "",
            "\1\20\1\4\1\35\4\uffff\1\27\2\30\1\36\1\17\1\31\1\21\1\32\1"+
            "\22\1\23\1\34\16\uffff\1\25\1\26\1\33\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "207:1: (this_Type_0= ruleType | this_Enumeration_1= ruleEnumeration | this_Class_2= ruleClass | this_Association_3= ruleAssociation | this_GeneralizationSet_4= ruleGeneralizationSet )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_0 = input.LA(1);

                         
                        int index3_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_0>=50 && LA3_0<=51)) ) {s = 1;}

                        else if ( (LA3_0==73) ) {s = 2;}

                        else if ( LA3_0 ==14 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0)) ) {s = 3;}

                        else if ( LA3_0 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1)) ) {s = 4;}

                        else if ( (LA3_0==16||LA3_0==21) ) {s = 5;}

                        else if ( LA3_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 1) ) {s = 6;}

                        else if ( ((LA3_0>=23 && LA3_0<=24)||(LA3_0>=26 && LA3_0<=27)||(LA3_0>=29 && LA3_0<=31)) ) {s = 7;}

                        else if ( (LA3_0==38||LA3_0==41||LA3_0==44) ) {s = 8;}

                        else if ( LA3_0 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {s = 9;}

                        else if ( LA3_0 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {s = 10;}

                        else if ( (LA3_0==49) ) {s = 11;}

                        else if ( LA3_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {s = 12;}

                        else if ( LA3_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {s = 13;}

                        else if ( (LA3_0==57) ) {s = 14;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA3_4 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1) ) {s = 15;}

                        else if ( LA3_4 ==14 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1)) ) {s = 16;}

                        else if ( LA3_4 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1)) ) {s = 4;}

                        else if ( LA3_4 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1) ) {s = 17;}

                        else if ( LA3_4 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1) ) {s = 18;}

                        else if ( LA3_4 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1) ) {s = 19;}

                        else if ( LA3_4 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0) ) {s = 20;}

                        else if ( LA3_4 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 21;}

                        else if ( LA3_4 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 22;}

                        else if ( LA3_4 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1) ) {s = 23;}

                        else if ( LA3_4 >=22 && LA3_4<=23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2) ) {s = 24;}

                        else if ( LA3_4 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1) ) {s = 25;}

                        else if ( LA3_4 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1) ) {s = 26;}

                        else if ( LA3_4 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1) ) {s = 27;}

                        else if ( LA3_4 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1) ) {s = 28;}

                        else if ( LA3_4 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1) ) {s = 29;}

                        else if ( LA3_4 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1) ) {s = 30;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA4_eotS =
        "\47\uffff";
    static final String DFA4_eofS =
        "\47\uffff";
    static final String DFA4_minS =
        "\3\16\13\uffff\1\16\13\uffff\1\16\14\uffff";
    static final String DFA4_maxS =
        "\3\37\13\uffff\1\37\13\uffff\1\37\14\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\1\1\2\2\3\1\4\1\6\1\7\1\11\1\12\1\13\1\4\1\uffff\1\12"+
        "\1\2\1\10\1\1\1\7\1\3\1\6\1\13\1\11\1\5\1\6\1\uffff\1\13\1\10\1"+
        "\3\1\11\1\5\1\12\1\4\1\2\1\1\1\7\2\3";
    static final String DFA4_specialS =
        "\1\0\1\2\1\3\13\uffff\1\4\13\uffff\1\1\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\3\4\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\uffff"+
            "\1\12\1\13\1\14",
            "\1\1\1\16\1\22\4\uffff\1\20\2\24\1\15\1\30\1\25\1\23\1\21\1"+
            "\27\1\17\1\26",
            "\1\32\1\2\1\43\4\uffff\1\42\2\35\1\41\1\37\1\31\1\44\1\34\1"+
            "\36\1\40\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\1\16\1\22\4\uffff\1\20\1\45\1\24\1\15\1\30\1\25\1\23\1"+
            "\21\1\27\1\17\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32\1\2\1\43\4\uffff\1\42\1\46\1\35\1\41\1\37\1\31\1\44\1"+
            "\34\1\36\1\40\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "279:1: (this_Kind_0= ruleKind | this_Quantity_1= ruleQuantity | this_Collective_2= ruleCollective | this_SubKind_3= ruleSubKind | this_Category_4= ruleCategory | this_Phase_5= rulePhase | this_Role_6= ruleRole | this_Mixin_7= ruleMixin | this_RoleMixin_8= ruleRoleMixin | this_Mode_9= ruleMode | this_Relator_10= ruleRelator )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_0 = input.LA(1);

                         
                        int index4_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_0 ==14 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0)) ) {s = 1;}

                        else if ( LA4_0 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1)) ) {s = 2;}

                        else if ( (LA4_0==16) ) {s = 3;}

                        else if ( (LA4_0==21) ) {s = 4;}

                        else if ( LA4_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 1) ) {s = 5;}

                        else if ( (LA4_0==23) ) {s = 6;}

                        else if ( (LA4_0==24) ) {s = 7;}

                        else if ( (LA4_0==26) ) {s = 8;}

                        else if ( (LA4_0==27) ) {s = 9;}

                        else if ( (LA4_0==29) ) {s = 10;}

                        else if ( (LA4_0==30) ) {s = 11;}

                        else if ( (LA4_0==31) ) {s = 12;}

                         
                        input.seek(index4_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_26 = input.LA(1);

                         
                        int index4_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_26 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1) ) {s = 33;}

                        else if ( LA4_26 ==14 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1)) ) {s = 26;}

                        else if ( LA4_26 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1)) ) {s = 2;}

                        else if ( LA4_26 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1) ) {s = 32;}

                        else if ( LA4_26 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1) ) {s = 34;}

                        else if ( LA4_26 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1) ) {s = 28;}

                        else if ( LA4_26 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1) ) {s = 35;}

                        else if ( LA4_26 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1) ) {s = 36;}

                        else if ( LA4_26 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2) ) {s = 29;}

                        else if ( LA4_26 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2) ) {s = 38;}

                        else if ( LA4_26 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1) ) {s = 25;}

                        else if ( LA4_26 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1) ) {s = 27;}

                        else if ( LA4_26 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1) ) {s = 30;}

                        else if ( LA4_26 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1) ) {s = 31;}

                         
                        input.seek(index4_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_1 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0) ) {s = 13;}

                        else if ( LA4_1 ==14 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0)) ) {s = 1;}

                        else if ( LA4_1 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0)) ) {s = 14;}

                        else if ( LA4_1 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0) ) {s = 15;}

                        else if ( LA4_1 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0) ) {s = 16;}

                        else if ( LA4_1 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0) ) {s = 17;}

                        else if ( LA4_1 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0) ) {s = 18;}

                        else if ( LA4_1 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0) ) {s = 19;}

                        else if ( LA4_1 >=22 && LA4_1<=23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0) ) {s = 20;}

                        else if ( LA4_1 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0) ) {s = 21;}

                        else if ( LA4_1 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0) ) {s = 22;}

                        else if ( LA4_1 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0) ) {s = 23;}

                        else if ( LA4_1 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0) ) {s = 24;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_2 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1) ) {s = 25;}

                        else if ( LA4_2 ==14 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1)) ) {s = 26;}

                        else if ( LA4_2 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1)) ) {s = 2;}

                        else if ( LA4_2 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 1) ) {s = 27;}

                        else if ( LA4_2 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 1) ) {s = 28;}

                        else if ( LA4_2 >=22 && LA4_2<=23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 2) ) {s = 29;}

                        else if ( LA4_2 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 1) ) {s = 30;}

                        else if ( LA4_2 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 1) ) {s = 31;}

                        else if ( LA4_2 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 1) ) {s = 32;}

                        else if ( LA4_2 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 1) ) {s = 33;}

                        else if ( LA4_2 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 1) ) {s = 34;}

                        else if ( LA4_2 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 1) ) {s = 35;}

                        else if ( LA4_2 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 1) ) {s = 36;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_14 = input.LA(1);

                         
                        int index4_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_14 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0) ) {s = 21;}

                        else if ( LA4_14 ==14 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0)) ) {s = 1;}

                        else if ( LA4_14 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getPhaseAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0)) ) {s = 14;}

                        else if ( LA4_14 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelatorAccess().getUnorderedGroup_0(), 0) ) {s = 22;}

                        else if ( LA4_14 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMixinAccess().getUnorderedGroup_0(), 0) ) {s = 17;}

                        else if ( LA4_14 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0) ) {s = 20;}

                        else if ( LA4_14 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCollectiveAccess().getUnorderedGroup_0(), 0) ) {s = 37;}

                        else if ( LA4_14 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleMixinAccess().getUnorderedGroup_0(), 0) ) {s = 23;}

                        else if ( LA4_14 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoryAccess().getUnorderedGroup_0(), 0) ) {s = 24;}

                        else if ( LA4_14 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getModeAccess().getUnorderedGroup_0(), 0) ) {s = 15;}

                        else if ( LA4_14 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubKindAccess().getUnorderedGroup_0(), 0) ) {s = 13;}

                        else if ( LA4_14 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuantityAccess().getUnorderedGroup_0(), 0) ) {s = 16;}

                        else if ( LA4_14 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getKindAccess().getUnorderedGroup_0(), 0) ) {s = 18;}

                        else if ( LA4_14 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRoleAccess().getUnorderedGroup_0(), 0) ) {s = 19;}

                         
                        input.seek(index4_14);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA5_eotS =
        "\24\uffff";
    static final String DFA5_eofS =
        "\24\uffff";
    static final String DFA5_minS =
        "\1\17\3\uffff\3\17\2\uffff\2\17\2\uffff\2\17\2\uffff\2\17\1\uffff";
    static final String DFA5_maxS =
        "\1\61\3\uffff\3\61\2\uffff\2\61\2\uffff\2\61\2\uffff\2\61\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\2\4\2\uffff\2\5\2\uffff\2\4\2\uffff"+
        "\1\5";
    static final String DFA5_specialS =
        "\1\11\3\uffff\1\6\1\7\1\1\2\uffff\1\10\1\2\2\uffff\1\5\1\0\2\uffff"+
        "\1\4\1\3\1\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\26\uffff\1\1\2\uffff\1\2\2\uffff\1\3\1\uffff\1\5\1\6\1"+
            "\uffff\1\7",
            "",
            "",
            "",
            "\1\4\36\uffff\1\11\1\12\1\13\1\10",
            "\1\15\36\uffff\1\5\1\16\1\14\1\17",
            "\1\21\36\uffff\1\22\1\6\1\23\1\20",
            "",
            "",
            "\1\4\36\uffff\1\11\1\12\1\13\1\10",
            "\1\4\36\uffff\1\11\1\12\1\13\1\10",
            "",
            "",
            "\1\15\36\uffff\1\5\1\16\1\14\1\17",
            "\1\15\36\uffff\1\5\1\16\1\14\1\17",
            "",
            "",
            "\1\21\36\uffff\1\22\1\6\1\23\1\20",
            "\1\21\36\uffff\1\22\1\6\1\23\1\20",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "411:1: (this_Characterization_0= ruleCharacterization | this_Mediation_1= ruleMediation | this_Derivation_2= ruleDerivation | this_FormalAssociation_3= ruleFormalAssociation | this_MaterialAssociation_4= ruleMaterialAssociation )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_14 = input.LA(1);

                         
                        int index5_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA5_14 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1) ) {s = 15;}

                        else if ( LA5_14 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {s = 13;}

                        else if ( LA5_14 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {s = 5;}

                        else if ( LA5_14 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {s = 14;}

                        else if ( LA5_14 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0) ) {s = 12;}

                         
                        input.seek(index5_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_6 = input.LA(1);

                         
                        int index5_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA5_6 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2) ) {s = 16;}

                        else if ( LA5_6 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {s = 17;}

                        else if ( LA5_6 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {s = 18;}

                        else if ( LA5_6 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {s = 6;}

                        else if ( LA5_6 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2) ) {s = 19;}

                         
                        input.seek(index5_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_10 = input.LA(1);

                         
                        int index5_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA5_10 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0) ) {s = 8;}

                        else if ( LA5_10 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 4;}

                        else if ( LA5_10 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 9;}

                        else if ( LA5_10 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 10;}

                        else if ( LA5_10 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1) ) {s = 11;}

                         
                        input.seek(index5_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_18 = input.LA(1);

                         
                        int index5_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA5_18 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2) ) {s = 19;}

                        else if ( LA5_18 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {s = 18;}

                        else if ( LA5_18 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {s = 17;}

                        else if ( LA5_18 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {s = 6;}

                        else if ( LA5_18 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2) ) {s = 16;}

                         
                        input.seek(index5_18);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_17 = input.LA(1);

                         
                        int index5_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA5_17 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2) ) {s = 16;}

                        else if ( LA5_17 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {s = 17;}

                        else if ( LA5_17 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {s = 18;}

                        else if ( LA5_17 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {s = 6;}

                        else if ( LA5_17 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2) ) {s = 19;}

                         
                        input.seek(index5_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_13 = input.LA(1);

                         
                        int index5_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA5_13 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1) ) {s = 15;}

                        else if ( LA5_13 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {s = 13;}

                        else if ( LA5_13 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {s = 5;}

                        else if ( LA5_13 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {s = 14;}

                        else if ( LA5_13 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0) ) {s = 12;}

                         
                        input.seek(index5_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_4 = input.LA(1);

                         
                        int index5_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA5_4 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0) ) {s = 8;}

                        else if ( LA5_4 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 4;}

                        else if ( LA5_4 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 9;}

                        else if ( LA5_4 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 10;}

                        else if ( LA5_4 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1) ) {s = 11;}

                         
                        input.seek(index5_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA5_5 = input.LA(1);

                         
                        int index5_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA5_5 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0) ) {s = 12;}

                        else if ( LA5_5 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {s = 5;}

                        else if ( LA5_5 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {s = 13;}

                        else if ( LA5_5 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {s = 14;}

                        else if ( LA5_5 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1) ) {s = 15;}

                         
                        input.seek(index5_5);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA5_9 = input.LA(1);

                         
                        int index5_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA5_9 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1) ) {s = 11;}

                        else if ( LA5_9 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 9;}

                        else if ( LA5_9 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 4;}

                        else if ( LA5_9 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 10;}

                        else if ( LA5_9 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0) ) {s = 8;}

                         
                        input.seek(index5_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA5_0 = input.LA(1);

                         
                        int index5_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_0==38) ) {s = 1;}

                        else if ( (LA5_0==41) ) {s = 2;}

                        else if ( (LA5_0==44) ) {s = 3;}

                        else if ( LA5_0 ==15 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 0)) ) {s = 4;}

                        else if ( LA5_0 ==46 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 1)) ) {s = 5;}

                        else if ( LA5_0 ==47 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_1(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_1(), 2)) ) {s = 6;}

                        else if ( (LA5_0==49) ) {s = 7;}

                         
                        input.seek(index5_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel129 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModel146 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel161 = new BitSet(new long[]{0x038ED240EDE1E002L,0x0000000000000200L});
        public static final BitSet FOLLOW_rulePackageImport_in_ruleModel182 = new BitSet(new long[]{0x038ED240EDE1E002L,0x0000000000000200L});
        public static final BitSet FOLLOW_rulePackageableElement_in_ruleModel204 = new BitSet(new long[]{0x038ED240EDE1C002L,0x0000000000000200L});
        public static final BitSet FOLLOW_rulePackageableElement_in_entryRulePackageableElement241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackageableElement251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_rulePackageableElement298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_rulePackageableElement325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_rulePackageableElement352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_rulePackageableElement379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralizationSet_in_rulePackageableElement406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_entryRuleClass441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClass451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_ruleClass498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantity_in_ruleClass525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollective_in_ruleClass552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubKind_in_ruleClass579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_ruleClass606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhase_in_ruleClass633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_ruleClass660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_ruleClass687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoleMixin_in_ruleClass714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMode_in_ruleClass741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelator_in_ruleClass768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssociation813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleAssociation860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMediation_in_ruleAssociation887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDerivation_in_ruleAssociation914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormalAssociation_in_ruleAssociation941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMaterialAssociation_in_ruleAssociation968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageImport_in_entryRulePackageImport1003 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackageImport1013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rulePackageImport1048 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePackageImport1066 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackageImport1076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_entryRuleKind1112 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKind1122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleKind1207 = new BitSet(new long[]{0x000000000001C000L});
        public static final BitSet FOLLOW_15_in_ruleKind1288 = new BitSet(new long[]{0x000000000001C000L});
        public static final BitSet FOLLOW_16_in_ruleKind1350 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKind1367 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleKind1383 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleKind1404 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleKind1415 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleKind1436 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleKind1450 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_ruleKind1472 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleKind1482 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_ruleKind1494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantity_in_entryRuleQuantity1530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuantity1540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleQuantity1625 = new BitSet(new long[]{0x000000000020C000L});
        public static final BitSet FOLLOW_15_in_ruleQuantity1706 = new BitSet(new long[]{0x000000000020C000L});
        public static final BitSet FOLLOW_21_in_ruleQuantity1768 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQuantity1785 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleQuantity1801 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleQuantity1822 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleQuantity1833 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleQuantity1854 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleQuantity1868 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_ruleQuantity1890 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQuantity1900 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_ruleQuantity1912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollective_in_entryRuleCollective1948 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollective1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleCollective2043 = new BitSet(new long[]{0x0000000000C0C000L});
        public static final BitSet FOLLOW_22_in_ruleCollective2124 = new BitSet(new long[]{0x0000000000C0C000L});
        public static final BitSet FOLLOW_15_in_ruleCollective2205 = new BitSet(new long[]{0x0000000000C0C000L});
        public static final BitSet FOLLOW_23_in_ruleCollective2267 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCollective2284 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleCollective2300 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCollective2321 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleCollective2332 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCollective2353 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleCollective2367 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_ruleCollective2389 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCollective2399 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_ruleCollective2411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubKind_in_entryRuleSubKind2447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubKind2457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleSubKind2542 = new BitSet(new long[]{0x000000000100C000L});
        public static final BitSet FOLLOW_15_in_ruleSubKind2623 = new BitSet(new long[]{0x000000000100C000L});
        public static final BitSet FOLLOW_24_in_ruleSubKind2685 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubKind2702 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleSubKind2718 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleSubKind2739 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleSubKind2750 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleSubKind2771 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleSubKind2785 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_ruleSubKind2807 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSubKind2817 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_ruleSubKind2829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory2865 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCategory2875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleCategory2960 = new BitSet(new long[]{0x000000000200C000L});
        public static final BitSet FOLLOW_15_in_ruleCategory3041 = new BitSet(new long[]{0x000000000200C000L});
        public static final BitSet FOLLOW_25_in_ruleCategory3109 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCategory3126 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleCategory3142 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCategory3163 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleCategory3174 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCategory3195 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleCategory3209 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_ruleCategory3231 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCategory3241 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_ruleCategory3253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhase_in_entryRulePhase3289 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhase3299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rulePhase3384 = new BitSet(new long[]{0x000000000400C000L});
        public static final BitSet FOLLOW_15_in_rulePhase3465 = new BitSet(new long[]{0x000000000400C000L});
        public static final BitSet FOLLOW_26_in_rulePhase3527 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePhase3544 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_rulePhase3560 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_rulePhase3581 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_rulePhase3592 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_rulePhase3613 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_rulePhase3627 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_rulePhase3649 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePhase3659 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_rulePhase3671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole3707 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole3717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleRole3802 = new BitSet(new long[]{0x000000000800C000L});
        public static final BitSet FOLLOW_15_in_ruleRole3883 = new BitSet(new long[]{0x000000000800C000L});
        public static final BitSet FOLLOW_27_in_ruleRole3945 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRole3962 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleRole3978 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRole3999 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleRole4010 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRole4031 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleRole4045 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_ruleRole4067 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRole4077 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_ruleRole4089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin4125 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMixin4135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleMixin4220 = new BitSet(new long[]{0x000000001000C000L});
        public static final BitSet FOLLOW_15_in_ruleMixin4301 = new BitSet(new long[]{0x000000001000C000L});
        public static final BitSet FOLLOW_28_in_ruleMixin4369 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMixin4386 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleMixin4402 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMixin4423 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleMixin4434 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMixin4455 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleMixin4469 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_ruleMixin4491 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMixin4501 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_ruleMixin4513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoleMixin_in_entryRuleRoleMixin4549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoleMixin4559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleRoleMixin4644 = new BitSet(new long[]{0x000000002000C000L});
        public static final BitSet FOLLOW_15_in_ruleRoleMixin4725 = new BitSet(new long[]{0x000000002000C000L});
        public static final BitSet FOLLOW_29_in_ruleRoleMixin4787 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRoleMixin4804 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleRoleMixin4820 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRoleMixin4841 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleRoleMixin4852 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRoleMixin4873 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleRoleMixin4887 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_ruleRoleMixin4909 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRoleMixin4919 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_ruleRoleMixin4931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMode_in_entryRuleMode4967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMode4977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleMode5062 = new BitSet(new long[]{0x000000004000C000L});
        public static final BitSet FOLLOW_15_in_ruleMode5143 = new BitSet(new long[]{0x000000004000C000L});
        public static final BitSet FOLLOW_30_in_ruleMode5205 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMode5222 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleMode5238 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMode5259 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleMode5270 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMode5291 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleMode5305 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_ruleMode5327 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMode5337 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_ruleMode5349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelator_in_entryRuleRelator5385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelator5395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleRelator5480 = new BitSet(new long[]{0x000000008000C000L});
        public static final BitSet FOLLOW_15_in_ruleRelator5561 = new BitSet(new long[]{0x000000008000C000L});
        public static final BitSet FOLLOW_31_in_ruleRelator5623 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRelator5640 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleRelator5656 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRelator5677 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleRelator5688 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRelator5709 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleRelator5723 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleRelator5733 = new BitSet(new long[]{0x0000003200000000L});
        public static final BitSet FOLLOW_ruleSimpleMediation_in_ruleRelator5754 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleRelator5765 = new BitSet(new long[]{0x0000003200000000L});
        public static final BitSet FOLLOW_ruleSimpleMediation_in_ruleRelator5786 = new BitSet(new long[]{0x0020000100100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_ruleRelator5810 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRelator5820 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_ruleRelator5832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality5868 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCardinality5878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardinalityImpl_in_ruleCardinality5924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardinalityImpl_in_entryRuleCardinalityImpl5958 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCardinalityImpl5968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleCardinalityImpl6003 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleCardinalityImpl6020 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleCardinalityImpl6035 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalValue_in_ruleCardinalityImpl6057 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleCardinalityImpl6080 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleCardinalityImpl6096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleMediation_in_entryRuleSimpleMediation6132 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMediation6142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleSimpleMediation6178 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleMediation6195 = new BitSet(new long[]{0x0000002200000000L});
        public static final BitSet FOLLOW_ruleCardinality_in_ruleSimpleMediation6223 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleSimpleMediation6234 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAnonymousPropertyDefinition_in_ruleSimpleMediation6255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterization_in_entryRuleCharacterization6291 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacterization6301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCharacterization6336 = new BitSet(new long[]{0x00000000000A0010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCharacterization6353 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleCharacterization6370 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCharacterization6391 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleCharacterization6402 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCharacterization6423 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleCharacterization6437 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleCharacterization6447 = new BitSet(new long[]{0x0020000000000010L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleCharacterization6469 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCharacterization6479 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleCharacterization6490 = new BitSet(new long[]{0x0020000000000010L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleCharacterization6512 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCharacterization6522 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCharacterization6533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMediation_in_entryRuleMediation6569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMediation6579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleMediation6614 = new BitSet(new long[]{0x00000000000A0010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMediation6631 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleMediation6648 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMediation6669 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleMediation6680 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMediation6701 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleMediation6715 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleMediation6727 = new BitSet(new long[]{0x0020000000000010L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleMediation6748 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMediation6758 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleMediation6770 = new BitSet(new long[]{0x0020000000000010L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleMediation6791 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMediation6801 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMediation6813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDerivation_in_entryRuleDerivation6849 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDerivation6859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleDerivation6894 = new BitSet(new long[]{0x00000000000A0010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDerivation6911 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleDerivation6928 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleDerivation6949 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleDerivation6960 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleDerivation6981 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleDerivation6995 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleDerivation7005 = new BitSet(new long[]{0x0020000000000010L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleDerivation7027 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDerivation7037 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleDerivation7048 = new BitSet(new long[]{0x0020000000000010L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleDerivation7070 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDerivation7080 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleDerivation7091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMaterialAssociation_in_entryRuleMaterialAssociation7135 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMaterialAssociation7145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleMaterialAssociation7239 = new BitSet(new long[]{0x0001C00000008000L});
        public static final BitSet FOLLOW_15_in_ruleMaterialAssociation7320 = new BitSet(new long[]{0x0001C00000008000L});
        public static final BitSet FOLLOW_47_in_ruleMaterialAssociation7401 = new BitSet(new long[]{0x0001C00000008000L});
        public static final BitSet FOLLOW_48_in_ruleMaterialAssociation7469 = new BitSet(new long[]{0x00000000000A0010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMaterialAssociation7486 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleMaterialAssociation7503 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMaterialAssociation7524 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleMaterialAssociation7535 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMaterialAssociation7556 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleMaterialAssociation7570 = new BitSet(new long[]{0x0020000000000010L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleMaterialAssociation7592 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMaterialAssociation7602 = new BitSet(new long[]{0x0020000000100010L});
        public static final BitSet FOLLOW_20_in_ruleMaterialAssociation7614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormalAssociation_in_entryRuleFormalAssociation7650 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormalAssociation7660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleFormalAssociation7754 = new BitSet(new long[]{0x0002C00000008000L});
        public static final BitSet FOLLOW_46_in_ruleFormalAssociation7835 = new BitSet(new long[]{0x0002C00000008000L});
        public static final BitSet FOLLOW_47_in_ruleFormalAssociation7916 = new BitSet(new long[]{0x0002C00000008000L});
        public static final BitSet FOLLOW_49_in_ruleFormalAssociation7978 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFormalAssociation7995 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFormalAssociation8011 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFormalAssociation8021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonExpressionValue_in_entryRuleNonExpressionValue8057 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNonExpressionValue8067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_ruleNonExpressionValue8114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_ruleNonExpressionValue8141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralNull_in_ruleNonExpressionValue8168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_ruleNonExpressionValue8195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstanceValue_in_ruleNonExpressionValue8222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification8257 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification8267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonExpressionValue_in_ruleValueSpecification8314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionValue_in_ruleValueSpecification8341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType8376 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType8386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_ruleType8433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType8460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType8495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataType8505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleDataType8540 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataType8557 = new BitSet(new long[]{0x00000000000A0002L});
        public static final BitSet FOLLOW_17_in_ruleDataType8573 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleDataType8594 = new BitSet(new long[]{0x00000000000C0002L});
        public static final BitSet FOLLOW_18_in_ruleDataType8605 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleDataType8626 = new BitSet(new long[]{0x00000000000C0002L});
        public static final BitSet FOLLOW_19_in_ruleDataType8641 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleClassProperty_in_ruleDataType8663 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataType8673 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000100L});
        public static final BitSet FOLLOW_20_in_ruleDataType8685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType8723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType8733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulePrimitiveType8768 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveType8785 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_rulePrimitiveType8801 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_rulePrimitiveType8822 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_rulePrimitiveType8833 = new BitSet(new long[]{0x0010000000000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_rulePrimitiveType8854 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_entryRuleInlineGeneralization8896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineGeneralization8906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleInlineGeneralization8949 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlineGeneralization8981 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_ruleInlineGeneralization8992 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlineGeneralization9010 = new BitSet(new long[]{0x0040000000040000L});
        public static final BitSet FOLLOW_18_in_ruleInlineGeneralization9021 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlineGeneralization9039 = new BitSet(new long[]{0x0040000000040000L});
        public static final BitSet FOLLOW_54_in_ruleInlineGeneralization9051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralizationSet_in_entryRuleGeneralizationSet9091 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneralizationSet9101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleGeneralizationSet9186 = new BitSet(new long[]{0x0380000000000000L});
        public static final BitSet FOLLOW_56_in_ruleGeneralizationSet9267 = new BitSet(new long[]{0x0380000000000000L});
        public static final BitSet FOLLOW_57_in_ruleGeneralizationSet9329 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralizationSet9346 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleGeneralizationSet9361 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleGeneralizationSet9371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionSymbol_in_entryRuleExpressionSymbol9408 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionSymbol9419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefaultOperator_in_ruleExpressionSymbol9466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleExpressionSymbol9491 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleExpressionSymbol9504 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionSymbol9519 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleExpressionSymbol9537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefaultOperator_in_entryRuleDefaultOperator9579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefaultOperator9590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleDefaultOperator9628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleDefaultOperator9647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleDefaultOperator9666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleDefaultOperator9685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionValue_in_entryRuleExpressionValue9725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionValue9735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleExpressionValue9779 = new BitSet(new long[]{0x7C20000000000070L,0x0000000000007000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleExpressionValue9802 = new BitSet(new long[]{0x7C00000000000000L});
        public static final BitSet FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue9823 = new BitSet(new long[]{0x0020000000000070L,0x0000000000007000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleExpressionValue9844 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue9873 = new BitSet(new long[]{0x0020000000000070L,0x0000000000007000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleExpressionValue9894 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue9923 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleExpressionValue9933 = new BitSet(new long[]{0x0020000000000070L,0x0000000000007000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleExpressionValue9954 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleExpressionValue9965 = new BitSet(new long[]{0x0020000000000070L,0x0000000000007000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleExpressionValue9986 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_20_in_ruleExpressionValue9998 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleExpressionValue10010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonymousPropertyDefinition_in_entryRuleAnonymousPropertyDefinition10046 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnonymousPropertyDefinition10056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnonymousPropertyDefinition10108 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleAnonymousPropertyDefinition10119 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_ruleAnonymousPropertyDefinition10140 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleAnonymousPropertyDefinition10150 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_ruleAnonymousPropertyDefinition10171 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleAnonymousPropertyDefinition10181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_entryRuleInlinePropertyDefinition10219 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlinePropertyDefinition10229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition10280 = new BitSet(new long[]{0x0020000000000010L});
        public static final BitSet FOLLOW_53_in_ruleInlinePropertyDefinition10297 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_63_in_ruleInlinePropertyDefinition10357 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_64_in_ruleInlinePropertyDefinition10438 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_65_in_ruleInlinePropertyDefinition10519 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_66_in_ruleInlinePropertyDefinition10600 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_67_in_ruleInlinePropertyDefinition10681 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_54_in_ruleInlinePropertyDefinition10743 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition10763 = new BitSet(new long[]{0x0000000200080002L});
        public static final BitSet FOLLOW_33_in_ruleInlinePropertyDefinition10774 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_ruleInlinePropertyDefinition10795 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleInlinePropertyDefinition10805 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_ruleInlinePropertyDefinition10826 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleInlinePropertyDefinition10836 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleInlinePropertyDefinition10849 = new BitSet(new long[]{0x0000000000100000L,0x00000000000000F0L});
        public static final BitSet FOLLOW_68_in_ruleInlinePropertyDefinition10860 = new BitSet(new long[]{0x0020000000000070L,0x0000000000007000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleInlinePropertyDefinition10881 = new BitSet(new long[]{0x0000000000100000L,0x00000000000000E0L});
        public static final BitSet FOLLOW_69_in_ruleInlinePropertyDefinition10894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
        public static final BitSet FOLLOW_ruleAggregationKind_in_ruleInlinePropertyDefinition10915 = new BitSet(new long[]{0x0000000000100000L,0x00000000000000C0L});
        public static final BitSet FOLLOW_70_in_ruleInlinePropertyDefinition10928 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleInlinePropertyDefinition10938 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition10956 = new BitSet(new long[]{0x0040000000040000L});
        public static final BitSet FOLLOW_18_in_ruleInlinePropertyDefinition10967 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition10985 = new BitSet(new long[]{0x0040000000040000L});
        public static final BitSet FOLLOW_54_in_ruleInlinePropertyDefinition10997 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleInlinePropertyDefinition11010 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleInlinePropertyDefinition11020 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition11038 = new BitSet(new long[]{0x0040000000040000L});
        public static final BitSet FOLLOW_18_in_ruleInlinePropertyDefinition11049 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition11067 = new BitSet(new long[]{0x0040000000040000L});
        public static final BitSet FOLLOW_54_in_ruleInlinePropertyDefinition11079 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleInlinePropertyDefinition11091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassProperty_in_entryRuleClassProperty11129 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassProperty11139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleClassProperty11184 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_63_in_ruleClassProperty11244 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_64_in_ruleClassProperty11325 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_65_in_ruleClassProperty11406 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_66_in_ruleClassProperty11487 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_67_in_ruleClassProperty11568 = new BitSet(new long[]{0x8040000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_54_in_ruleClassProperty11630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleClassProperty11642 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassProperty11659 = new BitSet(new long[]{0x0000000200020000L});
        public static final BitSet FOLLOW_33_in_ruleClassProperty11675 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_ruleClassProperty11696 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleClassProperty11706 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_ruleClassProperty11727 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleClassProperty11737 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleClassProperty11749 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassProperty11767 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleClassProperty11778 = new BitSet(new long[]{0x0000000000100000L,0x00000000000000F0L});
        public static final BitSet FOLLOW_68_in_ruleClassProperty11789 = new BitSet(new long[]{0x0020000000000070L,0x0000000000007000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleClassProperty11810 = new BitSet(new long[]{0x0000000000100000L,0x00000000000000E0L});
        public static final BitSet FOLLOW_69_in_ruleClassProperty11823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
        public static final BitSet FOLLOW_ruleAggregationKind_in_ruleClassProperty11844 = new BitSet(new long[]{0x0000000000100000L,0x00000000000000C0L});
        public static final BitSet FOLLOW_70_in_ruleClassProperty11857 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleClassProperty11867 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassProperty11885 = new BitSet(new long[]{0x0040000000040000L});
        public static final BitSet FOLLOW_18_in_ruleClassProperty11896 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassProperty11914 = new BitSet(new long[]{0x0040000000040000L});
        public static final BitSet FOLLOW_54_in_ruleClassProperty11926 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleClassProperty11939 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleClassProperty11949 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassProperty11967 = new BitSet(new long[]{0x0040000000040000L});
        public static final BitSet FOLLOW_18_in_ruleClassProperty11978 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassProperty11996 = new BitSet(new long[]{0x0040000000040000L});
        public static final BitSet FOLLOW_54_in_ruleClassProperty12008 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleClassProperty12020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration12058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration12068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleEnumeration12103 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration12120 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleEnumeration12135 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration12156 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleEnumeration12167 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration12188 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_20_in_ruleEnumeration12200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral12236 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral12246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral12297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_ruleEnumerationLiteral12312 = new BitSet(new long[]{0x0020000000000070L,0x0000000000007000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleEnumerationLiteral12333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlot_in_entryRuleSlot12371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlot12381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSlot12424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_ruleSlot12434 = new BitSet(new long[]{0x0020000200000070L,0x0000000000007000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleSlot12456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleSlot12473 = new BitSet(new long[]{0x0020000000000070L,0x0000000000007000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleSlot12494 = new BitSet(new long[]{0x0000000800040000L});
        public static final BitSet FOLLOW_18_in_ruleSlot12505 = new BitSet(new long[]{0x0020000000000070L,0x0000000000007000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleSlot12526 = new BitSet(new long[]{0x0000000800040000L});
        public static final BitSet FOLLOW_35_in_ruleSlot12538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstanceValue_in_entryRuleInstanceValue12576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInstanceValue12586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceValue12629 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_ruleInstanceValue12640 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceValue12658 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleInstanceValue12668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger12706 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInteger12716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLiteralInteger12767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_entryRuleLiteralString12808 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralString12818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralString12869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean12910 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean12920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleLiteralBoolean12975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean13012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean13023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleBoolean13061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleBoolean13080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural13120 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural13130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalValue_in_ruleLiteralUnlimitedNatural13176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLiteralUnlimitedNatural13199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalValue_in_entryRuleUnlimitedNaturalValue13241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalValue13252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleUnlimitedNaturalValue13289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull13328 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNull13338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleLiteralNull13382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleAggregationKind13430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleAggregationKind13445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleAggregationKind13460 = new BitSet(new long[]{0x0000000000000002L});
    }


}