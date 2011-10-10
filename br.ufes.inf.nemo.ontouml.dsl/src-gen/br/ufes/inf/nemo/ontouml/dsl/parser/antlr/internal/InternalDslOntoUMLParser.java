package br.ufes.inf.nemo.ontouml.dsl.parser.antlr.internal; 

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
import br.ufes.inf.nemo.ontouml.dsl.services.DslOntoUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslOntoUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_INT", "RULE_RWS", "RULE_NL", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'model'", "'viewpoint'", "'{'", "'}'", "'datatype'", "'attributes:'", "'Dependency'", "','", "'depends on'", "'('", "')'", "'constraint'", "'package'", "'merge'", "':'", "'substitutable'", "'complete'", "'disjoint'", "'generalizationSet'", "'OpaqueExpression'", "'begin'", "'#'", "'end'", "'property'", "'<'", "'static'", "'ordered'", "'unique'", "'read-only'", "'derived-union'", "'>'", "'['", "']'", "'defaults to'", "'aggregation'", "'subset of'", "'redefines'", "'mediation'", "';'", "'memberEnd'", "'navigableOwnedEnd'", "'derived'", "'abstract'", "'leaf'", "'derivation'", "'material:'", "'relator:'", "'materialAssociation'", "'formalAssociation'", "'='", "'instance'", "'specification'", "'=>'", "'true'", "'false'", "'*'", "'NULL'", "'active'", "'subkind'", "'kind'", "'quantity'", "'extensional'", "'collective'", "'phase'", "'role'", "'category'", "'ownedAttribute'", "'roleMixin'", "'mixin'", "'mode'", "'relator'", "'Characterization'", "'ownedEnd'", "'none'", "'shared'", "'composite'", "'public'", "'private'", "'protected'"
    };
    public static final int RULE_RWS=8;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=6;
    public static final int RULE_NL=9;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=11;

        public InternalDslOntoUMLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g"; }



     	private DslOntoUMLGrammarAccess grammarAccess;
     	
        public InternalDslOntoUMLParser(TokenStream input, IAstFactory factory, DslOntoUMLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DslOntoUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:79:2: (iv_ruleModel= ruleModel EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:80:2: iv_ruleModel= ruleModel EOF
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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:87:1: ruleModel returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'model' ( (lv_name_3_0= RULE_ID ) ) ( 'viewpoint' ( (lv_viewpoint_5_0= RULE_STRING ) ) )? '{' ( (lv_packagedElement_7_0= rulePackageableElement ) )* '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token lv_viewpoint_5_0=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_packagedElement_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:92:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'model' ( (lv_name_3_0= RULE_ID ) ) ( 'viewpoint' ( (lv_viewpoint_5_0= RULE_STRING ) ) )? '{' ( (lv_packagedElement_7_0= rulePackageableElement ) )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:93:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'model' ( (lv_name_3_0= RULE_ID ) ) ( 'viewpoint' ( (lv_viewpoint_5_0= RULE_STRING ) ) )? '{' ( (lv_packagedElement_7_0= rulePackageableElement ) )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:93:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'model' ( (lv_name_3_0= RULE_ID ) ) ( 'viewpoint' ( (lv_viewpoint_5_0= RULE_STRING ) ) )? '{' ( (lv_packagedElement_7_0= rulePackageableElement ) )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:93:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'model' ( (lv_name_3_0= RULE_ID ) ) ( 'viewpoint' ( (lv_viewpoint_5_0= RULE_STRING ) ) )? '{' ( (lv_packagedElement_7_0= rulePackageableElement ) )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:93:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:94:5: 
            {
             
                    temp=factory.create(grammarAccess.getModelAccess().getModelAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getModelAccess().getModelAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:104:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25||(LA1_0>=89 && LA1_0<=91)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:105:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:105:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:106:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleModel140);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,13,FollowSets000.FOLLOW_13_in_ruleModel151); 

                    createLeafNode(grammarAccess.getModelAccess().getModelKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:132:1: ( (lv_name_3_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:133:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:133:1: (lv_name_3_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:134:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModel168); 

            			createLeafNode(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:156:2: ( 'viewpoint' ( (lv_viewpoint_5_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:156:4: 'viewpoint' ( (lv_viewpoint_5_0= RULE_STRING ) )
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleModel184); 

                            createLeafNode(grammarAccess.getModelAccess().getViewpointKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:160:1: ( (lv_viewpoint_5_0= RULE_STRING ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:161:1: (lv_viewpoint_5_0= RULE_STRING )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:161:1: (lv_viewpoint_5_0= RULE_STRING )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:162:3: lv_viewpoint_5_0= RULE_STRING
                    {
                    lv_viewpoint_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleModel201); 

                    			createLeafNode(grammarAccess.getModelAccess().getViewpointSTRINGTerminalRuleCall_4_1_0(), "viewpoint"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"viewpoint",
                    	        		lv_viewpoint_5_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleModel218); 

                    createLeafNode(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:188:1: ( (lv_packagedElement_7_0= rulePackageableElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19||(LA3_0>=24 && LA3_0<=25)||(LA3_0>=89 && LA3_0<=91)) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                    alt3=1;
                }
                else if ( (LA3_0==17||LA3_0==31||LA3_0==50||LA3_0==55||LA3_0==63||(LA3_0>=70 && LA3_0<=72)||(LA3_0>=76 && LA3_0<=77)||LA3_0==80||(LA3_0>=82 && LA3_0<=84)) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {
                    alt3=1;
                }
                else if ( (LA3_0==57||LA3_0==61||(LA3_0>=73 && LA3_0<=75)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:189:1: (lv_packagedElement_7_0= rulePackageableElement )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:189:1: (lv_packagedElement_7_0= rulePackageableElement )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:190:3: lv_packagedElement_7_0= rulePackageableElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_ruleModel239);
            	    lv_packagedElement_7_0=rulePackageableElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"packagedElement",
            	    	        		lv_packagedElement_7_0, 
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
            	    break loop3;
                }
            } while (true);

            match(input,16,FollowSets000.FOLLOW_16_in_ruleModel250); 

                    createLeafNode(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7(), null); 
                

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:224:1: entryRulePackageableElement returns [EObject current=null] : iv_rulePackageableElement= rulePackageableElement EOF ;
    public final EObject entryRulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageableElement = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:225:2: (iv_rulePackageableElement= rulePackageableElement EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:226:2: iv_rulePackageableElement= rulePackageableElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackageableElementRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_entryRulePackageableElement286);
            iv_rulePackageableElement=rulePackageableElement();
            _fsp--;

             current =iv_rulePackageableElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackageableElement296); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:233:1: rulePackageableElement returns [EObject current=null] : (this_Dependency_0= ruleDependency | this_Constraintx_1= ruleConstraintx | this_Package_Impl_2= rulePackage_Impl | this_GeneralizationSet_3= ruleGeneralizationSet | this_DataType_Impl_4= ruleDataType_Impl | this_InstanceSpecification_Impl_5= ruleInstanceSpecification_Impl | this_SubKind_6= ruleSubKind | this_Kind_7= ruleKind | this_Phase_8= rulePhase | this_Role_9= ruleRole | this_RoleMixin_10= ruleRoleMixin | this_Mixin_11= ruleMixin | this_Mode_12= ruleMode | this_Relator_13= ruleRelator | this_Characterization_14= ruleCharacterization | this_Mediation_15= ruleMediation | this_Derivation_16= ruleDerivation | this_FormalAssociation_17= ruleFormalAssociation | this_MaterialAssociation_18= ruleMaterialAssociation | this_Category_19= ruleCategory | this_Collective_20= ruleCollective | this_Quantity_21= ruleQuantity ) ;
    public final EObject rulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Dependency_0 = null;

        EObject this_Constraintx_1 = null;

        EObject this_Package_Impl_2 = null;

        EObject this_GeneralizationSet_3 = null;

        EObject this_DataType_Impl_4 = null;

        EObject this_InstanceSpecification_Impl_5 = null;

        EObject this_SubKind_6 = null;

        EObject this_Kind_7 = null;

        EObject this_Phase_8 = null;

        EObject this_Role_9 = null;

        EObject this_RoleMixin_10 = null;

        EObject this_Mixin_11 = null;

        EObject this_Mode_12 = null;

        EObject this_Relator_13 = null;

        EObject this_Characterization_14 = null;

        EObject this_Mediation_15 = null;

        EObject this_Derivation_16 = null;

        EObject this_FormalAssociation_17 = null;

        EObject this_MaterialAssociation_18 = null;

        EObject this_Category_19 = null;

        EObject this_Collective_20 = null;

        EObject this_Quantity_21 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:238:6: ( (this_Dependency_0= ruleDependency | this_Constraintx_1= ruleConstraintx | this_Package_Impl_2= rulePackage_Impl | this_GeneralizationSet_3= ruleGeneralizationSet | this_DataType_Impl_4= ruleDataType_Impl | this_InstanceSpecification_Impl_5= ruleInstanceSpecification_Impl | this_SubKind_6= ruleSubKind | this_Kind_7= ruleKind | this_Phase_8= rulePhase | this_Role_9= ruleRole | this_RoleMixin_10= ruleRoleMixin | this_Mixin_11= ruleMixin | this_Mode_12= ruleMode | this_Relator_13= ruleRelator | this_Characterization_14= ruleCharacterization | this_Mediation_15= ruleMediation | this_Derivation_16= ruleDerivation | this_FormalAssociation_17= ruleFormalAssociation | this_MaterialAssociation_18= ruleMaterialAssociation | this_Category_19= ruleCategory | this_Collective_20= ruleCollective | this_Quantity_21= ruleQuantity ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:239:1: (this_Dependency_0= ruleDependency | this_Constraintx_1= ruleConstraintx | this_Package_Impl_2= rulePackage_Impl | this_GeneralizationSet_3= ruleGeneralizationSet | this_DataType_Impl_4= ruleDataType_Impl | this_InstanceSpecification_Impl_5= ruleInstanceSpecification_Impl | this_SubKind_6= ruleSubKind | this_Kind_7= ruleKind | this_Phase_8= rulePhase | this_Role_9= ruleRole | this_RoleMixin_10= ruleRoleMixin | this_Mixin_11= ruleMixin | this_Mode_12= ruleMode | this_Relator_13= ruleRelator | this_Characterization_14= ruleCharacterization | this_Mediation_15= ruleMediation | this_Derivation_16= ruleDerivation | this_FormalAssociation_17= ruleFormalAssociation | this_MaterialAssociation_18= ruleMaterialAssociation | this_Category_19= ruleCategory | this_Collective_20= ruleCollective | this_Quantity_21= ruleQuantity )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:239:1: (this_Dependency_0= ruleDependency | this_Constraintx_1= ruleConstraintx | this_Package_Impl_2= rulePackage_Impl | this_GeneralizationSet_3= ruleGeneralizationSet | this_DataType_Impl_4= ruleDataType_Impl | this_InstanceSpecification_Impl_5= ruleInstanceSpecification_Impl | this_SubKind_6= ruleSubKind | this_Kind_7= ruleKind | this_Phase_8= rulePhase | this_Role_9= ruleRole | this_RoleMixin_10= ruleRoleMixin | this_Mixin_11= ruleMixin | this_Mode_12= ruleMode | this_Relator_13= ruleRelator | this_Characterization_14= ruleCharacterization | this_Mediation_15= ruleMediation | this_Derivation_16= ruleDerivation | this_FormalAssociation_17= ruleFormalAssociation | this_MaterialAssociation_18= ruleMaterialAssociation | this_Category_19= ruleCategory | this_Collective_20= ruleCollective | this_Quantity_21= ruleQuantity )
            int alt4=22;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:240:5: this_Dependency_0= ruleDependency
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getDependencyParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rulePackageableElement343);
                    this_Dependency_0=ruleDependency();
                    _fsp--;

                     
                            current = this_Dependency_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:250:5: this_Constraintx_1= ruleConstraintx
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getConstraintxParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstraintx_in_rulePackageableElement370);
                    this_Constraintx_1=ruleConstraintx();
                    _fsp--;

                     
                            current = this_Constraintx_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:260:5: this_Package_Impl_2= rulePackage_Impl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getPackage_ImplParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_rulePackageableElement397);
                    this_Package_Impl_2=rulePackage_Impl();
                    _fsp--;

                     
                            current = this_Package_Impl_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:270:5: this_GeneralizationSet_3= ruleGeneralizationSet
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getGeneralizationSetParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGeneralizationSet_in_rulePackageableElement424);
                    this_GeneralizationSet_3=ruleGeneralizationSet();
                    _fsp--;

                     
                            current = this_GeneralizationSet_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:280:5: this_DataType_Impl_4= ruleDataType_Impl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getDataType_ImplParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDataType_Impl_in_rulePackageableElement451);
                    this_DataType_Impl_4=ruleDataType_Impl();
                    _fsp--;

                     
                            current = this_DataType_Impl_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:290:5: this_InstanceSpecification_Impl_5= ruleInstanceSpecification_Impl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getInstanceSpecification_ImplParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInstanceSpecification_Impl_in_rulePackageableElement478);
                    this_InstanceSpecification_Impl_5=ruleInstanceSpecification_Impl();
                    _fsp--;

                     
                            current = this_InstanceSpecification_Impl_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:300:5: this_SubKind_6= ruleSubKind
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getSubKindParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubKind_in_rulePackageableElement505);
                    this_SubKind_6=ruleSubKind();
                    _fsp--;

                     
                            current = this_SubKind_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:310:5: this_Kind_7= ruleKind
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getKindParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKind_in_rulePackageableElement532);
                    this_Kind_7=ruleKind();
                    _fsp--;

                     
                            current = this_Kind_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:320:5: this_Phase_8= rulePhase
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getPhaseParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePhase_in_rulePackageableElement559);
                    this_Phase_8=rulePhase();
                    _fsp--;

                     
                            current = this_Phase_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:330:5: this_Role_9= ruleRole
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getRoleParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_rulePackageableElement586);
                    this_Role_9=ruleRole();
                    _fsp--;

                     
                            current = this_Role_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:340:5: this_RoleMixin_10= ruleRoleMixin
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getRoleMixinParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRoleMixin_in_rulePackageableElement613);
                    this_RoleMixin_10=ruleRoleMixin();
                    _fsp--;

                     
                            current = this_RoleMixin_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:350:5: this_Mixin_11= ruleMixin
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getMixinParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMixin_in_rulePackageableElement640);
                    this_Mixin_11=ruleMixin();
                    _fsp--;

                     
                            current = this_Mixin_11; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 13 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:360:5: this_Mode_12= ruleMode
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getModeParserRuleCall_12(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMode_in_rulePackageableElement667);
                    this_Mode_12=ruleMode();
                    _fsp--;

                     
                            current = this_Mode_12; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 14 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:370:5: this_Relator_13= ruleRelator
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getRelatorParserRuleCall_13(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRelator_in_rulePackageableElement694);
                    this_Relator_13=ruleRelator();
                    _fsp--;

                     
                            current = this_Relator_13; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 15 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:380:5: this_Characterization_14= ruleCharacterization
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getCharacterizationParserRuleCall_14(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_rulePackageableElement721);
                    this_Characterization_14=ruleCharacterization();
                    _fsp--;

                     
                            current = this_Characterization_14; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 16 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:390:5: this_Mediation_15= ruleMediation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getMediationParserRuleCall_15(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMediation_in_rulePackageableElement748);
                    this_Mediation_15=ruleMediation();
                    _fsp--;

                     
                            current = this_Mediation_15; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 17 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:400:5: this_Derivation_16= ruleDerivation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getDerivationParserRuleCall_16(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDerivation_in_rulePackageableElement775);
                    this_Derivation_16=ruleDerivation();
                    _fsp--;

                     
                            current = this_Derivation_16; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 18 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:410:5: this_FormalAssociation_17= ruleFormalAssociation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getFormalAssociationParserRuleCall_17(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFormalAssociation_in_rulePackageableElement802);
                    this_FormalAssociation_17=ruleFormalAssociation();
                    _fsp--;

                     
                            current = this_FormalAssociation_17; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 19 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:420:5: this_MaterialAssociation_18= ruleMaterialAssociation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getMaterialAssociationParserRuleCall_18(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMaterialAssociation_in_rulePackageableElement829);
                    this_MaterialAssociation_18=ruleMaterialAssociation();
                    _fsp--;

                     
                            current = this_MaterialAssociation_18; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 20 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:430:5: this_Category_19= ruleCategory
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getCategoryParserRuleCall_19(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCategory_in_rulePackageableElement856);
                    this_Category_19=ruleCategory();
                    _fsp--;

                     
                            current = this_Category_19; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 21 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:440:5: this_Collective_20= ruleCollective
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getCollectiveParserRuleCall_20(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCollective_in_rulePackageableElement883);
                    this_Collective_20=ruleCollective();
                    _fsp--;

                     
                            current = this_Collective_20; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 22 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:450:5: this_Quantity_21= ruleQuantity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getQuantityParserRuleCall_21(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuantity_in_rulePackageableElement910);
                    this_Quantity_21=ruleQuantity();
                    _fsp--;

                     
                            current = this_Quantity_21; 
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


    // $ANTLR start entryRuleNonExpressionValue
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:466:1: entryRuleNonExpressionValue returns [EObject current=null] : iv_ruleNonExpressionValue= ruleNonExpressionValue EOF ;
    public final EObject entryRuleNonExpressionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonExpressionValue = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:467:2: (iv_ruleNonExpressionValue= ruleNonExpressionValue EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:468:2: iv_ruleNonExpressionValue= ruleNonExpressionValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNonExpressionValueRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleNonExpressionValue_in_entryRuleNonExpressionValue945);
            iv_ruleNonExpressionValue=ruleNonExpressionValue();
            _fsp--;

             current =iv_ruleNonExpressionValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNonExpressionValue955); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:475:1: ruleNonExpressionValue returns [EObject current=null] : (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue | this_OpaqueExpression_5= ruleOpaqueExpression ) ;
    public final EObject ruleNonExpressionValue() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralInteger_0 = null;

        EObject this_LiteralString_1 = null;

        EObject this_LiteralNull_2 = null;

        EObject this_LiteralBoolean_3 = null;

        EObject this_InstanceValue_4 = null;

        EObject this_OpaqueExpression_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:480:6: ( (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue | this_OpaqueExpression_5= ruleOpaqueExpression ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:481:1: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue | this_OpaqueExpression_5= ruleOpaqueExpression )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:481:1: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue | this_OpaqueExpression_5= ruleOpaqueExpression )
            int alt5=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case 69:
                {
                alt5=3;
                }
                break;
            case 66:
            case 67:
                {
                alt5=4;
                }
                break;
            case 89:
                {
                int LA5_5 = input.LA(2);

                if ( (LA5_5==32) ) {
                    alt5=6;
                }
                else if ( (LA5_5==63) ) {
                    alt5=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("481:1: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue | this_OpaqueExpression_5= ruleOpaqueExpression )", 5, 5, input);

                    throw nvae;
                }
                }
                break;
            case 90:
                {
                int LA5_6 = input.LA(2);

                if ( (LA5_6==32) ) {
                    alt5=6;
                }
                else if ( (LA5_6==63) ) {
                    alt5=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("481:1: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue | this_OpaqueExpression_5= ruleOpaqueExpression )", 5, 6, input);

                    throw nvae;
                }
                }
                break;
            case 91:
                {
                int LA5_7 = input.LA(2);

                if ( (LA5_7==63) ) {
                    alt5=5;
                }
                else if ( (LA5_7==32) ) {
                    alt5=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("481:1: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue | this_OpaqueExpression_5= ruleOpaqueExpression )", 5, 7, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                int LA5_8 = input.LA(2);

                if ( (LA5_8==32) ) {
                    alt5=6;
                }
                else if ( (LA5_8==63) ) {
                    alt5=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("481:1: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue | this_OpaqueExpression_5= ruleOpaqueExpression )", 5, 8, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                alt5=5;
                }
                break;
            case 32:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("481:1: (this_LiteralInteger_0= ruleLiteralInteger | this_LiteralString_1= ruleLiteralString | this_LiteralNull_2= ruleLiteralNull | this_LiteralBoolean_3= ruleLiteralBoolean | this_InstanceValue_4= ruleInstanceValue | this_OpaqueExpression_5= ruleOpaqueExpression )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:482:5: this_LiteralInteger_0= ruleLiteralInteger
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonExpressionValueAccess().getLiteralIntegerParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_ruleNonExpressionValue1002);
                    this_LiteralInteger_0=ruleLiteralInteger();
                    _fsp--;

                     
                            current = this_LiteralInteger_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:492:5: this_LiteralString_1= ruleLiteralString
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonExpressionValueAccess().getLiteralStringParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_ruleNonExpressionValue1029);
                    this_LiteralString_1=ruleLiteralString();
                    _fsp--;

                     
                            current = this_LiteralString_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:502:5: this_LiteralNull_2= ruleLiteralNull
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonExpressionValueAccess().getLiteralNullParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralNull_in_ruleNonExpressionValue1056);
                    this_LiteralNull_2=ruleLiteralNull();
                    _fsp--;

                     
                            current = this_LiteralNull_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:512:5: this_LiteralBoolean_3= ruleLiteralBoolean
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonExpressionValueAccess().getLiteralBooleanParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_ruleNonExpressionValue1083);
                    this_LiteralBoolean_3=ruleLiteralBoolean();
                    _fsp--;

                     
                            current = this_LiteralBoolean_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:522:5: this_InstanceValue_4= ruleInstanceValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonExpressionValueAccess().getInstanceValueParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInstanceValue_in_ruleNonExpressionValue1110);
                    this_InstanceValue_4=ruleInstanceValue();
                    _fsp--;

                     
                            current = this_InstanceValue_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:532:5: this_OpaqueExpression_5= ruleOpaqueExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonExpressionValueAccess().getOpaqueExpressionParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOpaqueExpression_in_ruleNonExpressionValue1137);
                    this_OpaqueExpression_5=ruleOpaqueExpression();
                    _fsp--;

                     
                            current = this_OpaqueExpression_5; 
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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:548:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:549:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:550:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueSpecificationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification1172);
            iv_ruleValueSpecification=ruleValueSpecification();
            _fsp--;

             current =iv_ruleValueSpecification; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueSpecification1182); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:557:1: ruleValueSpecification returns [EObject current=null] : (this_NonExpressionValue_0= ruleNonExpressionValue | this_ExpressionValue_1= ruleExpressionValue ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_NonExpressionValue_0 = null;

        EObject this_ExpressionValue_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:562:6: ( (this_NonExpressionValue_0= ruleNonExpressionValue | this_ExpressionValue_1= ruleExpressionValue ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:563:1: (this_NonExpressionValue_0= ruleNonExpressionValue | this_ExpressionValue_1= ruleExpressionValue )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:563:1: (this_NonExpressionValue_0= ruleNonExpressionValue | this_ExpressionValue_1= ruleExpressionValue )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING||LA6_0==RULE_INT||LA6_0==25||LA6_0==32||LA6_0==63||(LA6_0>=66 && LA6_0<=67)||LA6_0==69||(LA6_0>=89 && LA6_0<=91)) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("563:1: (this_NonExpressionValue_0= ruleNonExpressionValue | this_ExpressionValue_1= ruleExpressionValue )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:564:5: this_NonExpressionValue_0= ruleNonExpressionValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueSpecificationAccess().getNonExpressionValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNonExpressionValue_in_ruleValueSpecification1229);
                    this_NonExpressionValue_0=ruleNonExpressionValue();
                    _fsp--;

                     
                            current = this_NonExpressionValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:574:5: this_ExpressionValue_1= ruleExpressionValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueSpecificationAccess().getExpressionValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionValue_in_ruleValueSpecification1256);
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


    // $ANTLR start entryRuleDataType_Impl
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:590:1: entryRuleDataType_Impl returns [EObject current=null] : iv_ruleDataType_Impl= ruleDataType_Impl EOF ;
    public final EObject entryRuleDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType_Impl = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:591:2: (iv_ruleDataType_Impl= ruleDataType_Impl EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:592:2: iv_ruleDataType_Impl= ruleDataType_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataType_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleDataType_Impl_in_entryRuleDataType_Impl1291);
            iv_ruleDataType_Impl=ruleDataType_Impl();
            _fsp--;

             current =iv_ruleDataType_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataType_Impl1301); 

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
    // $ANTLR end entryRuleDataType_Impl


    // $ANTLR start ruleDataType_Impl
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:599:1: ruleDataType_Impl returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'datatype' ( (lv_name_2_0= RULE_ID ) ) ( '{' ( 'attributes:' '{' ( (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition ) )* )? '}' )? ) ;
    public final EObject ruleDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedAttribute_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:604:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'datatype' ( (lv_name_2_0= RULE_ID ) ) ( '{' ( 'attributes:' '{' ( (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition ) )* )? '}' )? ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:605:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'datatype' ( (lv_name_2_0= RULE_ID ) ) ( '{' ( 'attributes:' '{' ( (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition ) )* )? '}' )? )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:605:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'datatype' ( (lv_name_2_0= RULE_ID ) ) ( '{' ( 'attributes:' '{' ( (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition ) )* )? '}' )? )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:605:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'datatype' ( (lv_name_2_0= RULE_ID ) ) ( '{' ( 'attributes:' '{' ( (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition ) )* )? '}' )?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:605:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25||(LA7_0>=89 && LA7_0<=91)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:606:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:606:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:607:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDataType_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleDataType_Impl1347);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataType_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,17,FollowSets000.FOLLOW_17_in_ruleDataType_Impl1358); 

                    createLeafNode(grammarAccess.getDataType_ImplAccess().getDatatypeKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:633:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:634:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:634:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:635:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataType_Impl1375); 

            			createLeafNode(grammarAccess.getDataType_ImplAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataType_ImplRule().getType().getClassifier());
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:657:2: ( '{' ( 'attributes:' '{' ( (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition ) )* )? '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:657:4: '{' ( 'attributes:' '{' ( (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition ) )* )? '}'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleDataType_Impl1391); 

                            createLeafNode(grammarAccess.getDataType_ImplAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:661:1: ( 'attributes:' '{' ( (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition ) )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:661:3: 'attributes:' '{' ( (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition ) )*
                            {
                            match(input,18,FollowSets000.FOLLOW_18_in_ruleDataType_Impl1402); 

                                    createLeafNode(grammarAccess.getDataType_ImplAccess().getAttributesKeyword_3_1_0(), null); 
                                
                            match(input,15,FollowSets000.FOLLOW_15_in_ruleDataType_Impl1412); 

                                    createLeafNode(grammarAccess.getDataType_ImplAccess().getLeftCurlyBracketKeyword_3_1_1(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:669:1: ( (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==25||LA8_0==36||(LA8_0>=89 && LA8_0<=91)) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:670:1: (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition )
                            	    {
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:670:1: (lv_ownedAttribute_6_0= ruleInlinePropertyDefinition )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:671:3: lv_ownedAttribute_6_0= ruleInlinePropertyDefinition
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getDataType_ImplAccess().getOwnedAttributeInlinePropertyDefinitionParserRuleCall_3_1_2_0(), currentNode); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleDataType_Impl1433);
                            	    lv_ownedAttribute_6_0=ruleInlinePropertyDefinition();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getDataType_ImplRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"ownedAttribute",
                            	    	        		lv_ownedAttribute_6_0, 
                            	    	        		"InlinePropertyDefinition", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleDataType_Impl1446); 

                            createLeafNode(grammarAccess.getDataType_ImplAccess().getRightCurlyBracketKeyword_3_2(), null); 
                        

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
    // $ANTLR end ruleDataType_Impl


    // $ANTLR start entryRuleDependency
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:707:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:708:2: (iv_ruleDependency= ruleDependency EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:709:2: iv_ruleDependency= ruleDependency EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDependencyRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_entryRuleDependency1486);
            iv_ruleDependency=ruleDependency();
            _fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDependency1496); 

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
    // $ANTLR end entryRuleDependency


    // $ANTLR start ruleDependency
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:716:1: ruleDependency returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'Dependency' ( (lv_name_3_0= RULE_ID ) )? '{' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'depends on' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' '}' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Enumerator lv_visibility_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:721:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'Dependency' ( (lv_name_3_0= RULE_ID ) )? '{' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'depends on' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:722:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'Dependency' ( (lv_name_3_0= RULE_ID ) )? '{' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'depends on' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:722:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'Dependency' ( (lv_name_3_0= RULE_ID ) )? '{' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'depends on' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:722:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'Dependency' ( (lv_name_3_0= RULE_ID ) )? '{' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'depends on' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:722:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:723:5: 
            {
             
                    temp=factory.create(grammarAccess.getDependencyAccess().getDependencyAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDependencyAccess().getDependencyAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:733:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25||(LA11_0>=89 && LA11_0<=91)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:734:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:734:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:735:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDependencyAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleDependency1551);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleDependency1562); 

                    createLeafNode(grammarAccess.getDependencyAccess().getDependencyKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:761:1: ( (lv_name_3_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:762:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:762:1: (lv_name_3_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:763:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependency1579); 

                    			createLeafNode(grammarAccess.getDependencyAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleDependency1595); 

                    createLeafNode(grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:789:1: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:790:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:790:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:791:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependency1613); 

            		createLeafNode(grammarAccess.getDependencyAccess().getClientNamedElementCrossReference_5_0(), "client"); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:803:2: ( ',' ( ( RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:803:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,20,FollowSets000.FOLLOW_20_in_ruleDependency1624); 

            	            createLeafNode(grammarAccess.getDependencyAccess().getCommaKeyword_6_0(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:807:1: ( ( RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:808:1: ( RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:808:1: ( RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:809:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependency1642); 

            	    		createLeafNode(grammarAccess.getDependencyAccess().getClientNamedElementCrossReference_6_1_0(), "client"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,21,FollowSets000.FOLLOW_21_in_ruleDependency1654); 

                    createLeafNode(grammarAccess.getDependencyAccess().getDependsOnKeyword_7(), null); 
                
            match(input,22,FollowSets000.FOLLOW_22_in_ruleDependency1664); 

                    createLeafNode(grammarAccess.getDependencyAccess().getLeftParenthesisKeyword_8(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:829:1: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:830:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:830:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:831:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependency1682); 

            		createLeafNode(grammarAccess.getDependencyAccess().getSupplierNamedElementCrossReference_9_0(), "supplier"); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:843:2: ( ',' ( ( RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:843:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,20,FollowSets000.FOLLOW_20_in_ruleDependency1693); 

            	            createLeafNode(grammarAccess.getDependencyAccess().getCommaKeyword_10_0(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:847:1: ( ( RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:848:1: ( RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:848:1: ( RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:849:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependency1711); 

            	    		createLeafNode(grammarAccess.getDependencyAccess().getSupplierNamedElementCrossReference_10_1_0(), "supplier"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,23,FollowSets000.FOLLOW_23_in_ruleDependency1723); 

                    createLeafNode(grammarAccess.getDependencyAccess().getRightParenthesisKeyword_11(), null); 
                
            match(input,16,FollowSets000.FOLLOW_16_in_ruleDependency1733); 

                    createLeafNode(grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_12(), null); 
                

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
    // $ANTLR end ruleDependency


    // $ANTLR start entryRuleConstraintx
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:881:1: entryRuleConstraintx returns [EObject current=null] : iv_ruleConstraintx= ruleConstraintx EOF ;
    public final EObject entryRuleConstraintx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintx = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:882:2: (iv_ruleConstraintx= ruleConstraintx EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:883:2: iv_ruleConstraintx= ruleConstraintx EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstraintxRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraintx_in_entryRuleConstraintx1773);
            iv_ruleConstraintx=ruleConstraintx();
            _fsp--;

             current =iv_ruleConstraintx; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraintx1783); 

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
    // $ANTLR end entryRuleConstraintx


    // $ANTLR start ruleConstraintx
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:890:1: ruleConstraintx returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'constraint' ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '{' ( (lv_specification_8_0= ruleValueSpecification ) ) '}' ) ;
    public final EObject ruleConstraintx() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;

        EObject lv_specification_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:895:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'constraint' ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '{' ( (lv_specification_8_0= ruleValueSpecification ) ) '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:896:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'constraint' ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '{' ( (lv_specification_8_0= ruleValueSpecification ) ) '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:896:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'constraint' ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '{' ( (lv_specification_8_0= ruleValueSpecification ) ) '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:896:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'constraint' ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '{' ( (lv_specification_8_0= ruleValueSpecification ) ) '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:896:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25||(LA15_0>=89 && LA15_0<=91)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:897:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:897:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:898:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConstraintxAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleConstraintx1829);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConstraintxRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,24,FollowSets000.FOLLOW_24_in_ruleConstraintx1840); 

                    createLeafNode(grammarAccess.getConstraintxAccess().getConstraintKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:924:1: ( '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:924:3: '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleConstraintx1851); 

                            createLeafNode(grammarAccess.getConstraintxAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:928:1: ( ( RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:929:1: ( RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:929:1: ( RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:930:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getConstraintxRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstraintx1869); 

                    		createLeafNode(grammarAccess.getConstraintxAccess().getConstrainedElementElementCrossReference_2_1_0(), "constrainedElement"); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:942:2: ( ',' ( ( RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==20) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:942:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleConstraintx1880); 

                    	            createLeafNode(grammarAccess.getConstraintxAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:946:1: ( ( RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:947:1: ( RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:947:1: ( RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:948:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getConstraintxRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstraintx1898); 

                    	    		createLeafNode(grammarAccess.getConstraintxAccess().getConstrainedElementElementCrossReference_2_2_1_0(), "constrainedElement"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match(input,23,FollowSets000.FOLLOW_23_in_ruleConstraintx1910); 

                            createLeafNode(grammarAccess.getConstraintxAccess().getRightParenthesisKeyword_2_3(), null); 
                        

                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleConstraintx1922); 

                    createLeafNode(grammarAccess.getConstraintxAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:968:1: ( (lv_specification_8_0= ruleValueSpecification ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:969:1: (lv_specification_8_0= ruleValueSpecification )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:969:1: (lv_specification_8_0= ruleValueSpecification )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:970:3: lv_specification_8_0= ruleValueSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstraintxAccess().getSpecificationValueSpecificationParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleConstraintx1943);
            lv_specification_8_0=ruleValueSpecification();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintxRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"specification",
            	        		lv_specification_8_0, 
            	        		"ValueSpecification", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleConstraintx1953); 

                    createLeafNode(grammarAccess.getConstraintxAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleConstraintx


    // $ANTLR start entryRulePackageMerge
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1004:1: entryRulePackageMerge returns [EObject current=null] : iv_rulePackageMerge= rulePackageMerge EOF ;
    public final EObject entryRulePackageMerge() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMerge = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1005:2: (iv_rulePackageMerge= rulePackageMerge EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1006:2: iv_rulePackageMerge= rulePackageMerge EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackageMergeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePackageMerge_in_entryRulePackageMerge1989);
            iv_rulePackageMerge=rulePackageMerge();
            _fsp--;

             current =iv_rulePackageMerge; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackageMerge1999); 

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
    // $ANTLR end entryRulePackageMerge


    // $ANTLR start rulePackageMerge
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1013:1: rulePackageMerge returns [EObject current=null] : ( () ( ( RULE_STRING ) ) ) ;
    public final EObject rulePackageMerge() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1018:6: ( ( () ( ( RULE_STRING ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1019:1: ( () ( ( RULE_STRING ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1019:1: ( () ( ( RULE_STRING ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1019:2: () ( ( RULE_STRING ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1019:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1020:5: 
            {
             
                    temp=factory.create(grammarAccess.getPackageMergeAccess().getPackageMergeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPackageMergeAccess().getPackageMergeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1030:2: ( ( RULE_STRING ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1031:1: ( RULE_STRING )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1031:1: ( RULE_STRING )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1032:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPackageMergeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePackageMerge2051); 

            		createLeafNode(grammarAccess.getPackageMergeAccess().getMergedPackagePackageCrossReference_1_0(), "mergedPackage"); 
            	

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
    // $ANTLR end rulePackageMerge


    // $ANTLR start entryRulePackage_Impl
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1052:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1053:2: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1054:2: iv_rulePackage_Impl= rulePackage_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackage_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl2087);
            iv_rulePackage_Impl=rulePackage_Impl();
            _fsp--;

             current =iv_rulePackage_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage_Impl2097); 

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
    // $ANTLR end entryRulePackage_Impl


    // $ANTLR start rulePackage_Impl
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1061:1: rulePackage_Impl returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'package' ( (lv_name_3_0= RULE_ID ) ) '{' ( 'merge' ':' ( (lv_packageMerge_7_0= rulePackageMerge ) ) ( ',' ( (lv_packageMerge_9_0= rulePackageMerge ) ) )* )? ( (lv_packagedElement_10_0= rulePackageableElement ) )* '}' ) ;
    public final EObject rulePackage_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_packageMerge_7_0 = null;

        EObject lv_packageMerge_9_0 = null;

        EObject lv_packagedElement_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1066:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'package' ( (lv_name_3_0= RULE_ID ) ) '{' ( 'merge' ':' ( (lv_packageMerge_7_0= rulePackageMerge ) ) ( ',' ( (lv_packageMerge_9_0= rulePackageMerge ) ) )* )? ( (lv_packagedElement_10_0= rulePackageableElement ) )* '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1067:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'package' ( (lv_name_3_0= RULE_ID ) ) '{' ( 'merge' ':' ( (lv_packageMerge_7_0= rulePackageMerge ) ) ( ',' ( (lv_packageMerge_9_0= rulePackageMerge ) ) )* )? ( (lv_packagedElement_10_0= rulePackageableElement ) )* '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1067:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'package' ( (lv_name_3_0= RULE_ID ) ) '{' ( 'merge' ':' ( (lv_packageMerge_7_0= rulePackageMerge ) ) ( ',' ( (lv_packageMerge_9_0= rulePackageMerge ) ) )* )? ( (lv_packagedElement_10_0= rulePackageableElement ) )* '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1067:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'package' ( (lv_name_3_0= RULE_ID ) ) '{' ( 'merge' ':' ( (lv_packageMerge_7_0= rulePackageMerge ) ) ( ',' ( (lv_packageMerge_9_0= rulePackageMerge ) ) )* )? ( (lv_packagedElement_10_0= rulePackageableElement ) )* '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1067:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1068:5: 
            {
             
                    temp=factory.create(grammarAccess.getPackage_ImplAccess().getPackageAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPackage_ImplAccess().getPackageAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1078:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=89 && LA18_0<=91)) ) {
                alt18=1;
            }
            else if ( (LA18_0==25) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==25) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1079:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1079:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1080:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_rulePackage_Impl2152);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,25,FollowSets000.FOLLOW_25_in_rulePackage_Impl2163); 

                    createLeafNode(grammarAccess.getPackage_ImplAccess().getPackageKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1106:1: ( (lv_name_3_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1107:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1107:1: (lv_name_3_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1108:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePackage_Impl2180); 

            			createLeafNode(grammarAccess.getPackage_ImplAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FollowSets000.FOLLOW_15_in_rulePackage_Impl2195); 

                    createLeafNode(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1134:1: ( 'merge' ':' ( (lv_packageMerge_7_0= rulePackageMerge ) ) ( ',' ( (lv_packageMerge_9_0= rulePackageMerge ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1134:3: 'merge' ':' ( (lv_packageMerge_7_0= rulePackageMerge ) ) ( ',' ( (lv_packageMerge_9_0= rulePackageMerge ) ) )*
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rulePackage_Impl2206); 

                            createLeafNode(grammarAccess.getPackage_ImplAccess().getMergeKeyword_5_0(), null); 
                        
                    match(input,27,FollowSets000.FOLLOW_27_in_rulePackage_Impl2216); 

                            createLeafNode(grammarAccess.getPackage_ImplAccess().getColonKeyword_5_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1142:1: ( (lv_packageMerge_7_0= rulePackageMerge ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1143:1: (lv_packageMerge_7_0= rulePackageMerge )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1143:1: (lv_packageMerge_7_0= rulePackageMerge )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1144:3: lv_packageMerge_7_0= rulePackageMerge
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getPackageMergePackageMergeParserRuleCall_5_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePackageMerge_in_rulePackage_Impl2237);
                    lv_packageMerge_7_0=rulePackageMerge();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"packageMerge",
                    	        		lv_packageMerge_7_0, 
                    	        		"PackageMerge", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1166:2: ( ',' ( (lv_packageMerge_9_0= rulePackageMerge ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==20) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1166:4: ',' ( (lv_packageMerge_9_0= rulePackageMerge ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_rulePackage_Impl2248); 

                    	            createLeafNode(grammarAccess.getPackage_ImplAccess().getCommaKeyword_5_3_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1170:1: ( (lv_packageMerge_9_0= rulePackageMerge ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1171:1: (lv_packageMerge_9_0= rulePackageMerge )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1171:1: (lv_packageMerge_9_0= rulePackageMerge )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1172:3: lv_packageMerge_9_0= rulePackageMerge
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getPackageMergePackageMergeParserRuleCall_5_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePackageMerge_in_rulePackage_Impl2269);
                    	    lv_packageMerge_9_0=rulePackageMerge();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"packageMerge",
                    	    	        		lv_packageMerge_9_0, 
                    	    	        		"PackageMerge", 
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1194:6: ( (lv_packagedElement_10_0= rulePackageableElement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19||(LA21_0>=24 && LA21_0<=25)||(LA21_0>=89 && LA21_0<=91)) ) {
                    alt21=1;
                }
                else if ( LA21_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                    alt21=1;
                }
                else if ( (LA21_0==17||LA21_0==31||LA21_0==50||LA21_0==55||LA21_0==63||(LA21_0>=70 && LA21_0<=72)||(LA21_0>=76 && LA21_0<=77)||LA21_0==80||(LA21_0>=82 && LA21_0<=84)) ) {
                    alt21=1;
                }
                else if ( LA21_0 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {
                    alt21=1;
                }
                else if ( LA21_0 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {
                    alt21=1;
                }
                else if ( (LA21_0==57||LA21_0==61||(LA21_0>=73 && LA21_0<=75)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1195:1: (lv_packagedElement_10_0= rulePackageableElement )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1195:1: (lv_packagedElement_10_0= rulePackageableElement )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1196:3: lv_packagedElement_10_0= rulePackageableElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rulePackage_Impl2294);
            	    lv_packagedElement_10_0=rulePackageableElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"packagedElement",
            	    	        		lv_packagedElement_10_0, 
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
            	    break loop21;
                }
            } while (true);

            match(input,16,FollowSets000.FOLLOW_16_in_rulePackage_Impl2305); 

                    createLeafNode(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_7(), null); 
                

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
    // $ANTLR end rulePackage_Impl


    // $ANTLR start entryRuleInlineGeneralization
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1230:1: entryRuleInlineGeneralization returns [EObject current=null] : iv_ruleInlineGeneralization= ruleInlineGeneralization EOF ;
    public final EObject entryRuleInlineGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineGeneralization = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1231:2: (iv_ruleInlineGeneralization= ruleInlineGeneralization EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1232:2: iv_ruleInlineGeneralization= ruleInlineGeneralization EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInlineGeneralizationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_entryRuleInlineGeneralization2341);
            iv_ruleInlineGeneralization=ruleInlineGeneralization();
            _fsp--;

             current =iv_ruleInlineGeneralization; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineGeneralization2351); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1239:1: ruleInlineGeneralization returns [EObject current=null] : ( ( (lv_isSubstitutable_0_0= 'substitutable' ) )? ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ) ;
    public final EObject ruleInlineGeneralization() throws RecognitionException {
        EObject current = null;

        Token lv_isSubstitutable_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1244:6: ( ( ( (lv_isSubstitutable_0_0= 'substitutable' ) )? ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1245:1: ( ( (lv_isSubstitutable_0_0= 'substitutable' ) )? ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1245:1: ( ( (lv_isSubstitutable_0_0= 'substitutable' ) )? ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1245:2: ( (lv_isSubstitutable_0_0= 'substitutable' ) )? ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1245:2: ( (lv_isSubstitutable_0_0= 'substitutable' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1246:1: (lv_isSubstitutable_0_0= 'substitutable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1246:1: (lv_isSubstitutable_0_0= 'substitutable' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1247:3: lv_isSubstitutable_0_0= 'substitutable'
                    {
                    lv_isSubstitutable_0_0=(Token)input.LT(1);
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleInlineGeneralization2394); 

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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1266:3: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1267:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1267:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1268:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInlineGeneralizationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlineGeneralization2426); 

            		createLeafNode(grammarAccess.getInlineGeneralizationAccess().getGeneralClassifierCrossReference_1_0(), "general"); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1280:2: ( '(' ( ( RULE_ID ) ) ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1280:4: '(' ( ( RULE_ID ) ) ')'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleInlineGeneralization2437); 

                            createLeafNode(grammarAccess.getInlineGeneralizationAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1284:1: ( ( RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1285:1: ( RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1285:1: ( RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1286:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getInlineGeneralizationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlineGeneralization2455); 

                    		createLeafNode(grammarAccess.getInlineGeneralizationAccess().getGeneralizationSetGeneralizationSetCrossReference_2_1_0(), "generalizationSet"); 
                    	

                    }


                    }

                    match(input,23,FollowSets000.FOLLOW_23_in_ruleInlineGeneralization2465); 

                            createLeafNode(grammarAccess.getInlineGeneralizationAccess().getRightParenthesisKeyword_2_2(), null); 
                        

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1312:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1313:2: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1314:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGeneralizationSetRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneralizationSet_in_entryRuleGeneralizationSet2505);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();
            _fsp--;

             current =iv_ruleGeneralizationSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneralizationSet2515); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1321:1: ruleGeneralizationSet returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )* ) ) ) 'generalizationSet' ( (lv_name_5_0= RULE_ID ) ) '{' '}' ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token lv_isCovering_2_0=null;
        Token lv_isDisjoint_3_0=null;
        Token lv_name_5_0=null;
        Enumerator lv_visibility_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1326:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )* ) ) ) 'generalizationSet' ( (lv_name_5_0= RULE_ID ) ) '{' '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1327:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )* ) ) ) 'generalizationSet' ( (lv_name_5_0= RULE_ID ) ) '{' '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1327:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )* ) ) ) 'generalizationSet' ( (lv_name_5_0= RULE_ID ) ) '{' '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1327:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )* ) ) ) 'generalizationSet' ( (lv_name_5_0= RULE_ID ) ) '{' '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1327:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25||(LA24_0>=89 && LA24_0<=91)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1328:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1328:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1329:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGeneralizationSetAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleGeneralizationSet2561);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGeneralizationSetRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1351:3: ( ( ( ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1353:1: ( ( ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1353:1: ( ( ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1354:2: ( ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1357:2: ( ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1358:3: ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1358:3: ( ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) ) | ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( LA25_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1360:4: ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1360:4: ({...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1361:5: {...}? => ( ( (lv_isCovering_2_0= 'complete' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1361:114: ( ( (lv_isCovering_2_0= 'complete' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1362:6: ( (lv_isCovering_2_0= 'complete' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1365:6: ( (lv_isCovering_2_0= 'complete' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1366:1: (lv_isCovering_2_0= 'complete' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1366:1: (lv_isCovering_2_0= 'complete' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1367:3: lv_isCovering_2_0= 'complete'
            	    {
            	    lv_isCovering_2_0=(Token)input.LT(1);
            	    match(input,29,FollowSets000.FOLLOW_29_in_ruleGeneralizationSet2622); 

            	            createLeafNode(grammarAccess.getGeneralizationSetAccess().getIsCoveringCompleteKeyword_1_0_0(), "isCovering"); 
            	        

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1393:4: ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1393:4: ({...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1394:5: {...}? => ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1394:114: ( ( (lv_isDisjoint_3_0= 'disjoint' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1395:6: ( (lv_isDisjoint_3_0= 'disjoint' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1398:6: ( (lv_isDisjoint_3_0= 'disjoint' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1399:1: (lv_isDisjoint_3_0= 'disjoint' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1399:1: (lv_isDisjoint_3_0= 'disjoint' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1400:3: lv_isDisjoint_3_0= 'disjoint'
            	    {
            	    lv_isDisjoint_3_0=(Token)input.LT(1);
            	    match(input,30,FollowSets000.FOLLOW_30_in_ruleGeneralizationSet2703); 

            	            createLeafNode(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_1_0(), "isDisjoint"); 
            	        

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            	

            }

            match(input,31,FollowSets000.FOLLOW_31_in_ruleGeneralizationSet2765); 

                    createLeafNode(grammarAccess.getGeneralizationSetAccess().getGeneralizationSetKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1437:1: ( (lv_name_5_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1438:1: (lv_name_5_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1438:1: (lv_name_5_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1439:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneralizationSet2782); 

            			createLeafNode(grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGeneralizationSetRule().getType().getClassifier());
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

            match(input,15,FollowSets000.FOLLOW_15_in_ruleGeneralizationSet2797); 

                    createLeafNode(grammarAccess.getGeneralizationSetAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            match(input,16,FollowSets000.FOLLOW_16_in_ruleGeneralizationSet2807); 

                    createLeafNode(grammarAccess.getGeneralizationSetAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1477:1: entryRuleExpressionSymbol returns [String current=null] : iv_ruleExpressionSymbol= ruleExpressionSymbol EOF ;
    public final String entryRuleExpressionSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionSymbol = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1478:2: (iv_ruleExpressionSymbol= ruleExpressionSymbol EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1479:2: iv_ruleExpressionSymbol= ruleExpressionSymbol EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionSymbolRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionSymbol_in_entryRuleExpressionSymbol2844);
            iv_ruleExpressionSymbol=ruleExpressionSymbol();
            _fsp--;

             current =iv_ruleExpressionSymbol.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionSymbol2855); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1486:1: ruleExpressionSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (this_ANY_OTHER_1= RULE_ANY_OTHER )+ ) ;
    public final AntlrDatatypeRuleToken ruleExpressionSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1491:6: ( (this_ID_0= RULE_ID | (this_ANY_OTHER_1= RULE_ANY_OTHER )+ ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1492:1: (this_ID_0= RULE_ID | (this_ANY_OTHER_1= RULE_ANY_OTHER )+ )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1492:1: (this_ID_0= RULE_ID | (this_ANY_OTHER_1= RULE_ANY_OTHER )+ )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ANY_OTHER) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1492:1: (this_ID_0= RULE_ID | (this_ANY_OTHER_1= RULE_ANY_OTHER )+ )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1492:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExpressionSymbol2895); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getExpressionSymbolAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1500:6: (this_ANY_OTHER_1= RULE_ANY_OTHER )+
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1500:6: (this_ANY_OTHER_1= RULE_ANY_OTHER )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ANY_OTHER) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1500:11: this_ANY_OTHER_1= RULE_ANY_OTHER
                    	    {
                    	    this_ANY_OTHER_1=(Token)input.LT(1);
                    	    match(input,RULE_ANY_OTHER,FollowSets000.FOLLOW_RULE_ANY_OTHER_in_ruleExpressionSymbol2922); 

                    	    		current.merge(this_ANY_OTHER_1);
                    	        
                    	     
                    	        createLeafNode(grammarAccess.getExpressionSymbolAccess().getANY_OTHERTerminalRuleCall_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


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


    // $ANTLR start entryRuleExpressionValue
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1515:1: entryRuleExpressionValue returns [EObject current=null] : iv_ruleExpressionValue= ruleExpressionValue EOF ;
    public final EObject entryRuleExpressionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionValue = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1516:2: (iv_ruleExpressionValue= ruleExpressionValue EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1517:2: iv_ruleExpressionValue= ruleExpressionValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionValueRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionValue_in_entryRuleExpressionValue2969);
            iv_ruleExpressionValue=ruleExpressionValue();
            _fsp--;

             current =iv_ruleExpressionValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionValue2979); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1524:1: ruleExpressionValue returns [EObject current=null] : ( () '(' ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) ) ')' ) ;
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
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1529:6: ( ( () '(' ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) ) ')' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1530:1: ( () '(' ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) ) ')' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1530:1: ( () '(' ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) ) ')' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1530:2: () '(' ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) ) ')'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1530:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1531:5: 
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

            match(input,22,FollowSets000.FOLLOW_22_in_ruleExpressionValue3023); 

                    createLeafNode(grammarAccess.getExpressionValueAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1545:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1545:2: ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1545:2: ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1545:3: ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1545:3: ( (lv_operand_2_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1546:1: (lv_operand_2_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1546:1: (lv_operand_2_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1547:3: lv_operand_2_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getOperandValueSpecificationParserRuleCall_2_0_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleExpressionValue3046);
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1569:2: ( (lv_symbol_3_0= ruleExpressionSymbol ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1570:1: (lv_symbol_3_0= ruleExpressionSymbol )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1570:1: (lv_symbol_3_0= ruleExpressionSymbol )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1571:3: lv_symbol_3_0= ruleExpressionSymbol
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getSymbolExpressionSymbolParserRuleCall_2_0_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue3067);
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1593:2: ( (lv_operand_4_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1594:1: (lv_operand_4_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1594:1: (lv_operand_4_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1595:3: lv_operand_4_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getOperandValueSpecificationParserRuleCall_2_0_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleExpressionValue3088);
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
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1618:6: ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1618:6: ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1618:7: ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1618:7: ( (lv_symbol_5_0= ruleExpressionSymbol ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1619:1: (lv_symbol_5_0= ruleExpressionSymbol )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1619:1: (lv_symbol_5_0= ruleExpressionSymbol )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1620:3: lv_symbol_5_0= ruleExpressionSymbol
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getSymbolExpressionSymbolParserRuleCall_2_1_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue3117);
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1642:2: ( (lv_operand_6_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1643:1: (lv_operand_6_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1643:1: (lv_operand_6_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1644:3: lv_operand_6_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getOperandValueSpecificationParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleExpressionValue3138);
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
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1667:6: ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1667:6: ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1667:7: ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}'
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1667:7: ( (lv_symbol_7_0= ruleExpressionSymbol ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1668:1: (lv_symbol_7_0= ruleExpressionSymbol )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1668:1: (lv_symbol_7_0= ruleExpressionSymbol )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1669:3: lv_symbol_7_0= ruleExpressionSymbol
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getSymbolExpressionSymbolParserRuleCall_2_2_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue3167);
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

                    match(input,15,FollowSets000.FOLLOW_15_in_ruleExpressionValue3177); 

                            createLeafNode(grammarAccess.getExpressionValueAccess().getLeftCurlyBracketKeyword_2_2_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1695:1: ( (lv_operand_9_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1696:1: (lv_operand_9_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1696:1: (lv_operand_9_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1697:3: lv_operand_9_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getOperandValueSpecificationParserRuleCall_2_2_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleExpressionValue3198);
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1719:2: ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==20) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1719:4: ',' ( (lv_operand_11_0= ruleValueSpecification ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleExpressionValue3209); 

                    	            createLeafNode(grammarAccess.getExpressionValueAccess().getCommaKeyword_2_2_3_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1723:1: ( (lv_operand_11_0= ruleValueSpecification ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1724:1: (lv_operand_11_0= ruleValueSpecification )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1724:1: (lv_operand_11_0= ruleValueSpecification )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1725:3: lv_operand_11_0= ruleValueSpecification
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getExpressionValueAccess().getOperandValueSpecificationParserRuleCall_2_2_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleExpressionValue3230);
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
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleExpressionValue3242); 

                            createLeafNode(grammarAccess.getExpressionValueAccess().getRightCurlyBracketKeyword_2_2_4(), null); 
                        

                    }


                    }
                    break;

            }

            match(input,23,FollowSets000.FOLLOW_23_in_ruleExpressionValue3254); 

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


    // $ANTLR start entryRuleOpaqueExpression
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1763:1: entryRuleOpaqueExpression returns [EObject current=null] : iv_ruleOpaqueExpression= ruleOpaqueExpression EOF ;
    public final EObject entryRuleOpaqueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpaqueExpression = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1764:2: (iv_ruleOpaqueExpression= ruleOpaqueExpression EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1765:2: iv_ruleOpaqueExpression= ruleOpaqueExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOpaqueExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleOpaqueExpression_in_entryRuleOpaqueExpression3290);
            iv_ruleOpaqueExpression=ruleOpaqueExpression();
            _fsp--;

             current =iv_ruleOpaqueExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpaqueExpression3300); 

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
    // $ANTLR end entryRuleOpaqueExpression


    // $ANTLR start ruleOpaqueExpression
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1772:1: ruleOpaqueExpression returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'OpaqueExpression' ( (lv_name_3_0= RULE_ID ) )? ( '(' ( ( RULE_ID ) ) ')' )? ':' ( (lv_language_8_0= RULE_STRING ) ) ( ',' ( (lv_language_10_0= RULE_STRING ) ) )* 'begin' ( '#' ( (lv_body_13_0= ruleLINE ) ) )* 'end' ) ;
    public final EObject ruleOpaqueExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token lv_language_8_0=null;
        Token lv_language_10_0=null;
        Enumerator lv_visibility_1_0 = null;

        AntlrDatatypeRuleToken lv_body_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1777:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'OpaqueExpression' ( (lv_name_3_0= RULE_ID ) )? ( '(' ( ( RULE_ID ) ) ')' )? ':' ( (lv_language_8_0= RULE_STRING ) ) ( ',' ( (lv_language_10_0= RULE_STRING ) ) )* 'begin' ( '#' ( (lv_body_13_0= ruleLINE ) ) )* 'end' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1778:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'OpaqueExpression' ( (lv_name_3_0= RULE_ID ) )? ( '(' ( ( RULE_ID ) ) ')' )? ':' ( (lv_language_8_0= RULE_STRING ) ) ( ',' ( (lv_language_10_0= RULE_STRING ) ) )* 'begin' ( '#' ( (lv_body_13_0= ruleLINE ) ) )* 'end' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1778:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'OpaqueExpression' ( (lv_name_3_0= RULE_ID ) )? ( '(' ( ( RULE_ID ) ) ')' )? ':' ( (lv_language_8_0= RULE_STRING ) ) ( ',' ( (lv_language_10_0= RULE_STRING ) ) )* 'begin' ( '#' ( (lv_body_13_0= ruleLINE ) ) )* 'end' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1778:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'OpaqueExpression' ( (lv_name_3_0= RULE_ID ) )? ( '(' ( ( RULE_ID ) ) ')' )? ':' ( (lv_language_8_0= RULE_STRING ) ) ( ',' ( (lv_language_10_0= RULE_STRING ) ) )* 'begin' ( '#' ( (lv_body_13_0= ruleLINE ) ) )* 'end'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1778:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1779:5: 
            {
             
                    temp=factory.create(grammarAccess.getOpaqueExpressionAccess().getOpaqueExpressionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getOpaqueExpressionAccess().getOpaqueExpressionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1789:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25||(LA30_0>=89 && LA30_0<=91)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1790:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1790:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1791:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOpaqueExpressionAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleOpaqueExpression3355);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOpaqueExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleOpaqueExpression3366); 

                    createLeafNode(grammarAccess.getOpaqueExpressionAccess().getOpaqueExpressionKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1817:1: ( (lv_name_3_0= RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1818:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1818:1: (lv_name_3_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1819:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOpaqueExpression3383); 

                    			createLeafNode(grammarAccess.getOpaqueExpressionAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOpaqueExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1841:3: ( '(' ( ( RULE_ID ) ) ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1841:5: '(' ( ( RULE_ID ) ) ')'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleOpaqueExpression3400); 

                            createLeafNode(grammarAccess.getOpaqueExpressionAccess().getLeftParenthesisKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1845:1: ( ( RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1846:1: ( RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1846:1: ( RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1847:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getOpaqueExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOpaqueExpression3418); 

                    		createLeafNode(grammarAccess.getOpaqueExpressionAccess().getTypeTypeCrossReference_4_1_0(), "type"); 
                    	

                    }


                    }

                    match(input,23,FollowSets000.FOLLOW_23_in_ruleOpaqueExpression3428); 

                            createLeafNode(grammarAccess.getOpaqueExpressionAccess().getRightParenthesisKeyword_4_2(), null); 
                        

                    }
                    break;

            }

            match(input,27,FollowSets000.FOLLOW_27_in_ruleOpaqueExpression3440); 

                    createLeafNode(grammarAccess.getOpaqueExpressionAccess().getColonKeyword_5(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1867:1: ( (lv_language_8_0= RULE_STRING ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1868:1: (lv_language_8_0= RULE_STRING )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1868:1: (lv_language_8_0= RULE_STRING )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1869:3: lv_language_8_0= RULE_STRING
            {
            lv_language_8_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOpaqueExpression3457); 

            			createLeafNode(grammarAccess.getOpaqueExpressionAccess().getLanguageSTRINGTerminalRuleCall_6_0(), "language"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOpaqueExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"language",
            	        		lv_language_8_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1891:2: ( ',' ( (lv_language_10_0= RULE_STRING ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==20) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1891:4: ',' ( (lv_language_10_0= RULE_STRING ) )
            	    {
            	    match(input,20,FollowSets000.FOLLOW_20_in_ruleOpaqueExpression3473); 

            	            createLeafNode(grammarAccess.getOpaqueExpressionAccess().getCommaKeyword_7_0(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1895:1: ( (lv_language_10_0= RULE_STRING ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1896:1: (lv_language_10_0= RULE_STRING )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1896:1: (lv_language_10_0= RULE_STRING )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1897:3: lv_language_10_0= RULE_STRING
            	    {
            	    lv_language_10_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOpaqueExpression3490); 

            	    			createLeafNode(grammarAccess.getOpaqueExpressionAccess().getLanguageSTRINGTerminalRuleCall_7_1_0(), "language"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOpaqueExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"language",
            	    	        		lv_language_10_0, 
            	    	        		"STRING", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            match(input,33,FollowSets000.FOLLOW_33_in_ruleOpaqueExpression3507); 

                    createLeafNode(grammarAccess.getOpaqueExpressionAccess().getBeginKeyword_8(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1923:1: ( '#' ( (lv_body_13_0= ruleLINE ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1923:3: '#' ( (lv_body_13_0= ruleLINE ) )
            	    {
            	    match(input,34,FollowSets000.FOLLOW_34_in_ruleOpaqueExpression3518); 

            	            createLeafNode(grammarAccess.getOpaqueExpressionAccess().getNumberSignKeyword_9_0(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1927:1: ( (lv_body_13_0= ruleLINE ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1928:1: (lv_body_13_0= ruleLINE )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1928:1: (lv_body_13_0= ruleLINE )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1929:3: lv_body_13_0= ruleLINE
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOpaqueExpressionAccess().getBodyLINEParserRuleCall_9_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLINE_in_ruleOpaqueExpression3539);
            	    lv_body_13_0=ruleLINE();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOpaqueExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"body",
            	    	        		lv_body_13_0, 
            	    	        		"LINE", 
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
            	    break loop34;
                }
            } while (true);

            match(input,35,FollowSets000.FOLLOW_35_in_ruleOpaqueExpression3551); 

                    createLeafNode(grammarAccess.getOpaqueExpressionAccess().getEndKeyword_10(), null); 
                

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
    // $ANTLR end ruleOpaqueExpression


    // $ANTLR start entryRuleLINE
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1963:1: entryRuleLINE returns [String current=null] : iv_ruleLINE= ruleLINE EOF ;
    public final String entryRuleLINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLINE = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1964:2: (iv_ruleLINE= ruleLINE EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1965:2: iv_ruleLINE= ruleLINE EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLINERule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLINE_in_entryRuleLINE3588);
            iv_ruleLINE=ruleLINE();
            _fsp--;

             current =iv_ruleLINE.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLINE3599); 

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
    // $ANTLR end entryRuleLINE


    // $ANTLR start ruleLINE
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1972:1: ruleLINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_RWS_2= RULE_RWS | this_ANY_OTHER_3= RULE_ANY_OTHER )+ ;
    public final AntlrDatatypeRuleToken ruleLINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_RWS_2=null;
        Token this_ANY_OTHER_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1977:6: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_RWS_2= RULE_RWS | this_ANY_OTHER_3= RULE_ANY_OTHER )+ )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1978:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_RWS_2= RULE_RWS | this_ANY_OTHER_3= RULE_ANY_OTHER )+
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1978:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_RWS_2= RULE_RWS | this_ANY_OTHER_3= RULE_ANY_OTHER )+
            int cnt35=0;
            loop35:
            do {
                int alt35=5;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt35=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt35=2;
                    }
                    break;
                case RULE_RWS:
                    {
                    alt35=3;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt35=4;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1978:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLINE3639); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getLINEAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1986:10: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)input.LT(1);
            	    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLINE3665); 

            	    		current.merge(this_INT_1);
            	        
            	     
            	        createLeafNode(grammarAccess.getLINEAccess().getINTTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:1994:10: this_RWS_2= RULE_RWS
            	    {
            	    this_RWS_2=(Token)input.LT(1);
            	    match(input,RULE_RWS,FollowSets000.FOLLOW_RULE_RWS_in_ruleLINE3691); 

            	    		current.merge(this_RWS_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getLINEAccess().getRWSTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2002:10: this_ANY_OTHER_3= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_3=(Token)input.LT(1);
            	    match(input,RULE_ANY_OTHER,FollowSets000.FOLLOW_RULE_ANY_OTHER_in_ruleLINE3717); 

            	    		current.merge(this_ANY_OTHER_3);
            	        
            	     
            	        createLeafNode(grammarAccess.getLINEAccess().getANY_OTHERTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


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
    // $ANTLR end ruleLINE


    // $ANTLR start entryRuleInlinePropertyDefinition
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2017:1: entryRuleInlinePropertyDefinition returns [EObject current=null] : iv_ruleInlinePropertyDefinition= ruleInlinePropertyDefinition EOF ;
    public final EObject entryRuleInlinePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlinePropertyDefinition = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2018:2: (iv_ruleInlinePropertyDefinition= ruleInlinePropertyDefinition EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2019:2: iv_ruleInlinePropertyDefinition= ruleInlinePropertyDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInlinePropertyDefinitionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_entryRuleInlinePropertyDefinition3763);
            iv_ruleInlinePropertyDefinition=ruleInlinePropertyDefinition();
            _fsp--;

             current =iv_ruleInlinePropertyDefinition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlinePropertyDefinition3773); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2026:1: ruleInlinePropertyDefinition returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'property' ( '<' ( ( ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* ) ) ) '>' )? ( (lv_name_11_0= RULE_ID ) )? ( '[' ( (lv_lowerValue_13_0= ruleLiteralInteger ) ) ',' ( (lv_upperValue_15_0= ruleLiteralUnlimitedNatural ) ) ']' )? '(' ( ( RULE_ID ) ) ')' ( '{' ( 'defaults to' ( (lv_defaultValue_22_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_24_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? ) ;
    public final EObject ruleInlinePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_5_0=null;
        Token lv_isOrdered_6_0=null;
        Token lv_isUnique_7_0=null;
        Token lv_isReadOnly_8_0=null;
        Token lv_isDerivedUnion_9_0=null;
        Token lv_name_11_0=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_lowerValue_13_0 = null;

        EObject lv_upperValue_15_0 = null;

        EObject lv_defaultValue_22_0 = null;

        Enumerator lv_aggregation_24_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2031:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'property' ( '<' ( ( ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* ) ) ) '>' )? ( (lv_name_11_0= RULE_ID ) )? ( '[' ( (lv_lowerValue_13_0= ruleLiteralInteger ) ) ',' ( (lv_upperValue_15_0= ruleLiteralUnlimitedNatural ) ) ']' )? '(' ( ( RULE_ID ) ) ')' ( '{' ( 'defaults to' ( (lv_defaultValue_22_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_24_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2032:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'property' ( '<' ( ( ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* ) ) ) '>' )? ( (lv_name_11_0= RULE_ID ) )? ( '[' ( (lv_lowerValue_13_0= ruleLiteralInteger ) ) ',' ( (lv_upperValue_15_0= ruleLiteralUnlimitedNatural ) ) ']' )? '(' ( ( RULE_ID ) ) ')' ( '{' ( 'defaults to' ( (lv_defaultValue_22_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_24_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2032:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'property' ( '<' ( ( ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* ) ) ) '>' )? ( (lv_name_11_0= RULE_ID ) )? ( '[' ( (lv_lowerValue_13_0= ruleLiteralInteger ) ) ',' ( (lv_upperValue_15_0= ruleLiteralUnlimitedNatural ) ) ']' )? '(' ( ( RULE_ID ) ) ')' ( '{' ( 'defaults to' ( (lv_defaultValue_22_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_24_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )? )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2032:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'property' ( '<' ( ( ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* ) ) ) '>' )? ( (lv_name_11_0= RULE_ID ) )? ( '[' ( (lv_lowerValue_13_0= ruleLiteralInteger ) ) ',' ( (lv_upperValue_15_0= ruleLiteralUnlimitedNatural ) ) ']' )? '(' ( ( RULE_ID ) ) ')' ( '{' ( 'defaults to' ( (lv_defaultValue_22_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_24_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2032:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2033:5: 
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2043:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25||(LA36_0>=89 && LA36_0<=91)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2044:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2044:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2045:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInlinePropertyDefinitionAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleInlinePropertyDefinition3828);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,36,FollowSets000.FOLLOW_36_in_ruleInlinePropertyDefinition3839); 

                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getPropertyKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2071:1: ( '<' ( ( ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* ) ) ) '>' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2071:3: '<' ( ( ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* ) ) ) '>'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleInlinePropertyDefinition3850); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getLessThanSignKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2075:1: ( ( ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* ) ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2077:1: ( ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2077:1: ( ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2078:2: ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1());
                    	
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2081:2: ( ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )* )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2082:3: ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )*
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2082:3: ( ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) ) | ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) | ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) ) | ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) ) | ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) ) )*
                    loop37:
                    do {
                        int alt37=6;
                        int LA37_0 = input.LA(1);

                        if ( LA37_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 0) ) {
                            alt37=1;
                        }
                        else if ( LA37_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 1) ) {
                            alt37=2;
                        }
                        else if ( LA37_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 2) ) {
                            alt37=3;
                        }
                        else if ( LA37_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 3) ) {
                            alt37=4;
                        }
                        else if ( LA37_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 4) ) {
                            alt37=5;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2084:4: ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2084:4: ({...}? => ( ( (lv_isStatic_5_0= 'static' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2085:5: {...}? => ( ( (lv_isStatic_5_0= 'static' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleInlinePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 0)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2085:123: ( ( (lv_isStatic_5_0= 'static' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2086:6: ( (lv_isStatic_5_0= 'static' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 0);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2089:6: ( (lv_isStatic_5_0= 'static' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2090:1: (lv_isStatic_5_0= 'static' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2090:1: (lv_isStatic_5_0= 'static' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2091:3: lv_isStatic_5_0= 'static'
                    	    {
                    	    lv_isStatic_5_0=(Token)input.LT(1);
                    	    match(input,38,FollowSets000.FOLLOW_38_in_ruleInlinePropertyDefinition3910); 

                    	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getIsStaticStaticKeyword_3_1_0_0(), "isStatic"); 
                    	        

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

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2117:4: ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2117:4: ({...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2118:5: {...}? => ( ( (lv_isOrdered_6_0= 'ordered' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleInlinePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 1)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2118:123: ( ( (lv_isOrdered_6_0= 'ordered' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2119:6: ( (lv_isOrdered_6_0= 'ordered' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 1);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2122:6: ( (lv_isOrdered_6_0= 'ordered' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2123:1: (lv_isOrdered_6_0= 'ordered' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2123:1: (lv_isOrdered_6_0= 'ordered' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2124:3: lv_isOrdered_6_0= 'ordered'
                    	    {
                    	    lv_isOrdered_6_0=(Token)input.LT(1);
                    	    match(input,39,FollowSets000.FOLLOW_39_in_ruleInlinePropertyDefinition3991); 

                    	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getIsOrderedOrderedKeyword_3_1_1_0(), "isOrdered"); 
                    	        

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

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2150:4: ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2150:4: ({...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2151:5: {...}? => ( ( (lv_isUnique_7_0= 'unique' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleInlinePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 2)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2151:123: ( ( (lv_isUnique_7_0= 'unique' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2152:6: ( (lv_isUnique_7_0= 'unique' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 2);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2155:6: ( (lv_isUnique_7_0= 'unique' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2156:1: (lv_isUnique_7_0= 'unique' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2156:1: (lv_isUnique_7_0= 'unique' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2157:3: lv_isUnique_7_0= 'unique'
                    	    {
                    	    lv_isUnique_7_0=(Token)input.LT(1);
                    	    match(input,40,FollowSets000.FOLLOW_40_in_ruleInlinePropertyDefinition4072); 

                    	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getIsUniqueUniqueKeyword_3_1_2_0(), "isUnique"); 
                    	        

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

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2183:4: ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2183:4: ({...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2184:5: {...}? => ( ( (lv_isReadOnly_8_0= 'read-only' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleInlinePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 3)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2184:123: ( ( (lv_isReadOnly_8_0= 'read-only' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2185:6: ( (lv_isReadOnly_8_0= 'read-only' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 3);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2188:6: ( (lv_isReadOnly_8_0= 'read-only' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2189:1: (lv_isReadOnly_8_0= 'read-only' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2189:1: (lv_isReadOnly_8_0= 'read-only' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2190:3: lv_isReadOnly_8_0= 'read-only'
                    	    {
                    	    lv_isReadOnly_8_0=(Token)input.LT(1);
                    	    match(input,41,FollowSets000.FOLLOW_41_in_ruleInlinePropertyDefinition4153); 

                    	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getIsReadOnlyReadOnlyKeyword_3_1_3_0(), "isReadOnly"); 
                    	        

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

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2216:4: ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2216:4: ({...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2217:5: {...}? => ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleInlinePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 4)");
                    	    }
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2217:123: ( ( (lv_isDerivedUnion_9_0= 'derived-union' ) ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2218:6: ( (lv_isDerivedUnion_9_0= 'derived-union' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1(), 4);
                    	    	 				
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2221:6: ( (lv_isDerivedUnion_9_0= 'derived-union' ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2222:1: (lv_isDerivedUnion_9_0= 'derived-union' )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2222:1: (lv_isDerivedUnion_9_0= 'derived-union' )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2223:3: lv_isDerivedUnion_9_0= 'derived-union'
                    	    {
                    	    lv_isDerivedUnion_9_0=(Token)input.LT(1);
                    	    match(input,42,FollowSets000.FOLLOW_42_in_ruleInlinePropertyDefinition4234); 

                    	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getIsDerivedUnionDerivedUnionKeyword_3_1_4_0(), "isDerivedUnion"); 
                    	        

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

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getInlinePropertyDefinitionAccess().getUnorderedGroup_3_1());
                    	

                    }

                    match(input,43,FollowSets000.FOLLOW_43_in_ruleInlinePropertyDefinition4296); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getGreaterThanSignKeyword_3_2(), null); 
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2260:3: ( (lv_name_11_0= RULE_ID ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2261:1: (lv_name_11_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2261:1: (lv_name_11_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2262:3: lv_name_11_0= RULE_ID
                    {
                    lv_name_11_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4315); 

                    			createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_11_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2284:3: ( '[' ( (lv_lowerValue_13_0= ruleLiteralInteger ) ) ',' ( (lv_upperValue_15_0= ruleLiteralUnlimitedNatural ) ) ']' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2284:5: '[' ( (lv_lowerValue_13_0= ruleLiteralInteger ) ) ',' ( (lv_upperValue_15_0= ruleLiteralUnlimitedNatural ) ) ']'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleInlinePropertyDefinition4332); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getLeftSquareBracketKeyword_5_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2288:1: ( (lv_lowerValue_13_0= ruleLiteralInteger ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2289:1: (lv_lowerValue_13_0= ruleLiteralInteger )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2289:1: (lv_lowerValue_13_0= ruleLiteralInteger )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2290:3: lv_lowerValue_13_0= ruleLiteralInteger
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInlinePropertyDefinitionAccess().getLowerValueLiteralIntegerParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_ruleInlinePropertyDefinition4353);
                    lv_lowerValue_13_0=ruleLiteralInteger();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lowerValue",
                    	        		lv_lowerValue_13_0, 
                    	        		"LiteralInteger", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleInlinePropertyDefinition4363); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getCommaKeyword_5_2(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2316:1: ( (lv_upperValue_15_0= ruleLiteralUnlimitedNatural ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2317:1: (lv_upperValue_15_0= ruleLiteralUnlimitedNatural )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2317:1: (lv_upperValue_15_0= ruleLiteralUnlimitedNatural )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2318:3: lv_upperValue_15_0= ruleLiteralUnlimitedNatural
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInlinePropertyDefinitionAccess().getUpperValueLiteralUnlimitedNaturalParserRuleCall_5_3_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_ruleInlinePropertyDefinition4384);
                    lv_upperValue_15_0=ruleLiteralUnlimitedNatural();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"upperValue",
                    	        		lv_upperValue_15_0, 
                    	        		"LiteralUnlimitedNatural", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,45,FollowSets000.FOLLOW_45_in_ruleInlinePropertyDefinition4394); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRightSquareBracketKeyword_5_4(), null); 
                        

                    }
                    break;

            }

            match(input,22,FollowSets000.FOLLOW_22_in_ruleInlinePropertyDefinition4406); 

                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getLeftParenthesisKeyword_6(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2348:1: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2349:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2349:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2350:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4424); 

            		createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getTypeTypeCrossReference_7_0(), "type"); 
            	

            }


            }

            match(input,23,FollowSets000.FOLLOW_23_in_ruleInlinePropertyDefinition4434); 

                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRightParenthesisKeyword_8(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2366:1: ( '{' ( 'defaults to' ( (lv_defaultValue_22_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_24_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==15) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2366:3: '{' ( 'defaults to' ( (lv_defaultValue_22_0= ruleValueSpecification ) ) )? ( 'aggregation' ( (lv_aggregation_24_0= ruleAggregationKind ) ) )? ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? '}'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleInlinePropertyDefinition4445); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getLeftCurlyBracketKeyword_9_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2370:1: ( 'defaults to' ( (lv_defaultValue_22_0= ruleValueSpecification ) ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==46) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2370:3: 'defaults to' ( (lv_defaultValue_22_0= ruleValueSpecification ) )
                            {
                            match(input,46,FollowSets000.FOLLOW_46_in_ruleInlinePropertyDefinition4456); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getDefaultsToKeyword_9_1_0(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2374:1: ( (lv_defaultValue_22_0= ruleValueSpecification ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2375:1: (lv_defaultValue_22_0= ruleValueSpecification )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2375:1: (lv_defaultValue_22_0= ruleValueSpecification )
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2376:3: lv_defaultValue_22_0= ruleValueSpecification
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getInlinePropertyDefinitionAccess().getDefaultValueValueSpecificationParserRuleCall_9_1_1_0(), currentNode); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleInlinePropertyDefinition4477);
                            lv_defaultValue_22_0=ruleValueSpecification();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"defaultValue",
                            	        		lv_defaultValue_22_0, 
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2398:4: ( 'aggregation' ( (lv_aggregation_24_0= ruleAggregationKind ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==47) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2398:6: 'aggregation' ( (lv_aggregation_24_0= ruleAggregationKind ) )
                            {
                            match(input,47,FollowSets000.FOLLOW_47_in_ruleInlinePropertyDefinition4490); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getAggregationKeyword_9_2_0(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2402:1: ( (lv_aggregation_24_0= ruleAggregationKind ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2403:1: (lv_aggregation_24_0= ruleAggregationKind )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2403:1: (lv_aggregation_24_0= ruleAggregationKind )
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2404:3: lv_aggregation_24_0= ruleAggregationKind
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getInlinePropertyDefinitionAccess().getAggregationAggregationKindEnumRuleCall_9_2_1_0(), currentNode); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleAggregationKind_in_ruleInlinePropertyDefinition4511);
                            lv_aggregation_24_0=ruleAggregationKind();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"aggregation",
                            	        		lv_aggregation_24_0, 
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2426:4: ( 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==48) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2426:6: 'subset of' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                            {
                            match(input,48,FollowSets000.FOLLOW_48_in_ruleInlinePropertyDefinition4524); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getSubsetOfKeyword_9_3_0(), null); 
                                
                            match(input,22,FollowSets000.FOLLOW_22_in_ruleInlinePropertyDefinition4534); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getLeftParenthesisKeyword_9_3_1(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2434:1: ( ( RULE_ID ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2435:1: ( RULE_ID )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2435:1: ( RULE_ID )
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2436:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4552); 

                            		createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getSubsettedPropertyPropertyCrossReference_9_3_2_0(), "subsettedProperty"); 
                            	

                            }


                            }

                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2448:2: ( ',' ( ( RULE_ID ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==20) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2448:4: ',' ( ( RULE_ID ) )
                            	    {
                            	    match(input,20,FollowSets000.FOLLOW_20_in_ruleInlinePropertyDefinition4563); 

                            	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getCommaKeyword_9_3_3_0(), null); 
                            	        
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2452:1: ( ( RULE_ID ) )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2453:1: ( RULE_ID )
                            	    {
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2453:1: ( RULE_ID )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2454:3: RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode, current);
                            	    	        }
                            	            
                            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4581); 

                            	    		createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getSubsettedPropertyPropertyCrossReference_9_3_3_1_0(), "subsettedProperty"); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);

                            match(input,23,FollowSets000.FOLLOW_23_in_ruleInlinePropertyDefinition4593); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRightParenthesisKeyword_9_3_4(), null); 
                                

                            }
                            break;

                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2470:3: ( 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==49) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2470:5: 'redefines' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                            {
                            match(input,49,FollowSets000.FOLLOW_49_in_ruleInlinePropertyDefinition4606); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRedefinesKeyword_9_4_0(), null); 
                                
                            match(input,22,FollowSets000.FOLLOW_22_in_ruleInlinePropertyDefinition4616); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getLeftParenthesisKeyword_9_4_1(), null); 
                                
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2478:1: ( ( RULE_ID ) )
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2479:1: ( RULE_ID )
                            {
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2479:1: ( RULE_ID )
                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2480:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4634); 

                            		createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRedefinedPropertyPropertyCrossReference_9_4_2_0(), "redefinedProperty"); 
                            	

                            }


                            }

                            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2492:2: ( ',' ( ( RULE_ID ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==20) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2492:4: ',' ( ( RULE_ID ) )
                            	    {
                            	    match(input,20,FollowSets000.FOLLOW_20_in_ruleInlinePropertyDefinition4645); 

                            	            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getCommaKeyword_9_4_3_0(), null); 
                            	        
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2496:1: ( ( RULE_ID ) )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2497:1: ( RULE_ID )
                            	    {
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2497:1: ( RULE_ID )
                            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2498:3: RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = factory.create(grammarAccess.getInlinePropertyDefinitionRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode, current);
                            	    	        }
                            	            
                            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4663); 

                            	    		createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRedefinedPropertyPropertyCrossReference_9_4_3_1_0(), "redefinedProperty"); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);

                            match(input,23,FollowSets000.FOLLOW_23_in_ruleInlinePropertyDefinition4675); 

                                    createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRightParenthesisKeyword_9_4_4(), null); 
                                

                            }
                            break;

                    }

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleInlinePropertyDefinition4687); 

                            createLeafNode(grammarAccess.getInlinePropertyDefinitionAccess().getRightCurlyBracketKeyword_9_5(), null); 
                        

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


    // $ANTLR start entryRuleMediation
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2526:1: entryRuleMediation returns [EObject current=null] : iv_ruleMediation= ruleMediation EOF ;
    public final EObject entryRuleMediation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2527:2: (iv_ruleMediation= ruleMediation EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2528:2: iv_ruleMediation= ruleMediation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMediationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleMediation_in_entryRuleMediation4725);
            iv_ruleMediation=ruleMediation();
            _fsp--;

             current =iv_ruleMediation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMediation4735); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2535:1: ruleMediation returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'mediation' ( (lv_name_3_0= RULE_ID ) )? ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' ) ;
    public final EObject ruleMediation() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_generalization_5_0 = null;

        EObject lv_generalization_7_0 = null;

        EObject lv_ownedEnd_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2540:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'mediation' ( (lv_name_3_0= RULE_ID ) )? ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2541:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'mediation' ( (lv_name_3_0= RULE_ID ) )? ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2541:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'mediation' ( (lv_name_3_0= RULE_ID ) )? ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2541:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'mediation' ( (lv_name_3_0= RULE_ID ) )? ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2541:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2542:5: 
            {
             
                    temp=factory.create(grammarAccess.getMediationAccess().getMediationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getMediationAccess().getMediationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2552:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25||(LA48_0>=89 && LA48_0<=91)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2553:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2553:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2554:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMediationAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleMediation4790);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,50,FollowSets000.FOLLOW_50_in_ruleMediation4801); 

                    createLeafNode(grammarAccess.getMediationAccess().getMediationKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2580:1: ( (lv_name_3_0= RULE_ID ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2581:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2581:1: (lv_name_3_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2582:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMediation4818); 

                    			createLeafNode(grammarAccess.getMediationAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2604:3: ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==27) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2604:5: ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleMediation4835); 

                            createLeafNode(grammarAccess.getMediationAccess().getColonKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2608:1: ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2609:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2609:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2610:3: lv_generalization_5_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMediationAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMediation4856);
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2632:2: ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==20) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2632:4: ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleMediation4867); 

                    	            createLeafNode(grammarAccess.getMediationAccess().getCommaKeyword_4_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2636:1: ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2637:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2637:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2638:3: lv_generalization_7_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMediationAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMediation4888);
                    	    lv_generalization_7_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleMediation4902); 

                    createLeafNode(grammarAccess.getMediationAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2664:1: ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2666:1: ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2666:1: ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2667:2: ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMediationAccess().getUnorderedGroup_6());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2670:2: ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2671:3: ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2671:3: ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=4;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==25||LA55_0==36|| LA55_0 >=89 && LA55_0<=91) && getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 0) ) {
                    alt55=1;
                }
                else if ( LA55_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 1) ) {
                    alt55=2;
                }
                else if ( LA55_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 2) ) {
                    alt55=3;
                }


                switch (alt55) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2673:4: ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2673:4: ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2674:5: {...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMediation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2674:106: ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2675:6: ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2678:6: ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+
            	    int cnt52=0;
            	    loop52:
            	    do {
            	        int alt52=2;
            	        switch ( input.LA(1) ) {
            	        case 89:
            	            {
            	            int LA52_2 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 0) ) {
            	                alt52=1;
            	            }


            	            }
            	            break;
            	        case 90:
            	            {
            	            int LA52_3 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 0) ) {
            	                alt52=1;
            	            }


            	            }
            	            break;
            	        case 91:
            	            {
            	            int LA52_4 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 0) ) {
            	                alt52=1;
            	            }


            	            }
            	            break;
            	        case 25:
            	            {
            	            int LA52_5 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 0) ) {
            	                alt52=1;
            	            }


            	            }
            	            break;
            	        case 36:
            	            {
            	            int LA52_6 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 0) ) {
            	                alt52=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt52) {
            	    	case 1 :
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2678:7: ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';'
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2678:7: ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2679:1: (lv_ownedEnd_10_0= ruleInlinePropertyDefinition )
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2679:1: (lv_ownedEnd_10_0= ruleInlinePropertyDefinition )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2680:3: lv_ownedEnd_10_0= ruleInlinePropertyDefinition
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getMediationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_6_0_0_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleMediation4966);
            	    	    lv_ownedEnd_10_0=ruleInlinePropertyDefinition();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"ownedEnd",
            	    	    	        		lv_ownedEnd_10_0, 
            	    	    	        		"InlinePropertyDefinition", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }

            	    	    match(input,51,FollowSets000.FOLLOW_51_in_ruleMediation4976); 

            	    	            createLeafNode(grammarAccess.getMediationAccess().getSemicolonKeyword_6_0_1(), null); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt52 >= 1 ) break loop52;
            	                EarlyExitException eee =
            	                    new EarlyExitException(52, input);
            	                throw eee;
            	        }
            	        cnt52++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMediationAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2713:4: ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2713:4: ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2714:5: {...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMediation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2714:106: ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2715:6: ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2718:6: ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2718:8: 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';'
            	    {
            	    match(input,52,FollowSets000.FOLLOW_52_in_ruleMediation5039); 

            	            createLeafNode(grammarAccess.getMediationAccess().getMemberEndKeyword_6_1_0(), null); 
            	        
            	    match(input,27,FollowSets000.FOLLOW_27_in_ruleMediation5049); 

            	            createLeafNode(grammarAccess.getMediationAccess().getColonKeyword_6_1_1(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2726:1: ( ( RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2727:1: ( RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2727:1: ( RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2728:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMediation5067); 

            	    		createLeafNode(grammarAccess.getMediationAccess().getMemberEndPropertyCrossReference_6_1_2_0(), "memberEnd"); 
            	    	

            	    }


            	    }

            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2740:2: ( ',' ( ( RULE_ID ) ) )*
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( (LA53_0==20) ) {
            	            alt53=1;
            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2740:4: ',' ( ( RULE_ID ) )
            	    	    {
            	    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleMediation5078); 

            	    	            createLeafNode(grammarAccess.getMediationAccess().getCommaKeyword_6_1_3_0(), null); 
            	    	        
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2744:1: ( ( RULE_ID ) )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2745:1: ( RULE_ID )
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2745:1: ( RULE_ID )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2746:3: RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode, current);
            	    	    	        }
            	    	            
            	    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMediation5096); 

            	    	    		createLeafNode(grammarAccess.getMediationAccess().getMemberEndPropertyCrossReference_6_1_3_1_0(), "memberEnd"); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop53;
            	        }
            	    } while (true);

            	    match(input,51,FollowSets000.FOLLOW_51_in_ruleMediation5108); 

            	            createLeafNode(grammarAccess.getMediationAccess().getSemicolonKeyword_6_1_4(), null); 
            	        

            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMediationAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2769:4: ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2769:4: ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2770:5: {...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMediation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2770:106: ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2771:6: ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMediationAccess().getUnorderedGroup_6(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2774:6: ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2774:8: 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';'
            	    {
            	    match(input,53,FollowSets000.FOLLOW_53_in_ruleMediation5170); 

            	            createLeafNode(grammarAccess.getMediationAccess().getNavigableOwnedEndKeyword_6_2_0(), null); 
            	        
            	    match(input,27,FollowSets000.FOLLOW_27_in_ruleMediation5180); 

            	            createLeafNode(grammarAccess.getMediationAccess().getColonKeyword_6_2_1(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2782:1: ( ( RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2783:1: ( RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2783:1: ( RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2784:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMediation5198); 

            	    		createLeafNode(grammarAccess.getMediationAccess().getNavigableOwnedEndPropertyCrossReference_6_2_2_0(), "navigableOwnedEnd"); 
            	    	

            	    }


            	    }

            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2796:2: ( ',' ( ( RULE_ID ) ) )*
            	    loop54:
            	    do {
            	        int alt54=2;
            	        int LA54_0 = input.LA(1);

            	        if ( (LA54_0==20) ) {
            	            alt54=1;
            	        }


            	        switch (alt54) {
            	    	case 1 :
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2796:4: ',' ( ( RULE_ID ) )
            	    	    {
            	    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleMediation5209); 

            	    	            createLeafNode(grammarAccess.getMediationAccess().getCommaKeyword_6_2_3_0(), null); 
            	    	        
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2800:1: ( ( RULE_ID ) )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2801:1: ( RULE_ID )
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2801:1: ( RULE_ID )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2802:3: RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getMediationRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode, current);
            	    	    	        }
            	    	            
            	    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMediation5227); 

            	    	    		createLeafNode(grammarAccess.getMediationAccess().getNavigableOwnedEndPropertyCrossReference_6_2_3_1_0(), "navigableOwnedEnd"); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop54;
            	        }
            	    } while (true);

            	    match(input,51,FollowSets000.FOLLOW_51_in_ruleMediation5239); 

            	            createLeafNode(grammarAccess.getMediationAccess().getSemicolonKeyword_6_2_4(), null); 
            	        

            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMediationAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMediationAccess().getUnorderedGroup_6()) ) {
                throw new FailedPredicateException(input, "ruleMediation", "getUnorderedGroupHelper().canLeave(grammarAccess.getMediationAccess().getUnorderedGroup_6())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMediationAccess().getUnorderedGroup_6());
            	

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleMediation5295); 

                    createLeafNode(grammarAccess.getMediationAccess().getRightCurlyBracketKeyword_7(), null); 
                

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2845:1: entryRuleDerivation returns [EObject current=null] : iv_ruleDerivation= ruleDerivation EOF ;
    public final EObject entryRuleDerivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2846:2: (iv_ruleDerivation= ruleDerivation EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2847:2: iv_ruleDerivation= ruleDerivation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDerivationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleDerivation_in_entryRuleDerivation5331);
            iv_ruleDerivation=ruleDerivation();
            _fsp--;

             current =iv_ruleDerivation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDerivation5341); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2854:1: ruleDerivation returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) ) 'derivation' ( (lv_name_6_0= RULE_ID ) )? ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )? '{' 'material:' ( ( (lv_ownedEnd_13_0= ruleInlinePropertyDefinition ) ) ';' ) 'relator:' ( ( (lv_ownedEnd_16_0= ruleInlinePropertyDefinition ) ) ';' ) ( ( ( ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )* ) ) ) '}' ) ;
    public final EObject ruleDerivation() throws RecognitionException {
        EObject current = null;

        Token lv_isDerived_2_0=null;
        Token lv_isAbstract_3_0=null;
        Token lv_isLeaf_4_0=null;
        Token lv_name_6_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_8_0 = null;

        EObject lv_generalization_10_0 = null;

        EObject lv_ownedEnd_13_0 = null;

        EObject lv_ownedEnd_16_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2859:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) ) 'derivation' ( (lv_name_6_0= RULE_ID ) )? ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )? '{' 'material:' ( ( (lv_ownedEnd_13_0= ruleInlinePropertyDefinition ) ) ';' ) 'relator:' ( ( (lv_ownedEnd_16_0= ruleInlinePropertyDefinition ) ) ';' ) ( ( ( ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )* ) ) ) '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2860:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) ) 'derivation' ( (lv_name_6_0= RULE_ID ) )? ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )? '{' 'material:' ( ( (lv_ownedEnd_13_0= ruleInlinePropertyDefinition ) ) ';' ) 'relator:' ( ( (lv_ownedEnd_16_0= ruleInlinePropertyDefinition ) ) ';' ) ( ( ( ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )* ) ) ) '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2860:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) ) 'derivation' ( (lv_name_6_0= RULE_ID ) )? ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )? '{' 'material:' ( ( (lv_ownedEnd_13_0= ruleInlinePropertyDefinition ) ) ';' ) 'relator:' ( ( (lv_ownedEnd_16_0= ruleInlinePropertyDefinition ) ) ';' ) ( ( ( ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )* ) ) ) '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2860:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) ) 'derivation' ( (lv_name_6_0= RULE_ID ) )? ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )? '{' 'material:' ( ( (lv_ownedEnd_13_0= ruleInlinePropertyDefinition ) ) ';' ) 'relator:' ( ( (lv_ownedEnd_16_0= ruleInlinePropertyDefinition ) ) ';' ) ( ( ( ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )* ) ) ) '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2860:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==25||(LA56_0>=89 && LA56_0<=91)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2861:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2861:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2862:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDerivationAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleDerivation5387);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2884:3: ( ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2886:1: ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2886:1: ( ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2887:2: ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDerivationAccess().getUnorderedGroup_1());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2890:2: ( ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2891:3: ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2891:3: ( ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) ) )*
            loop57:
            do {
                int alt57=4;
                int LA57_0 = input.LA(1);

                if ( LA57_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0) ) {
                    alt57=1;
                }
                else if ( LA57_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1) ) {
                    alt57=2;
                }
                else if ( LA57_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2) ) {
                    alt57=3;
                }


                switch (alt57) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2893:4: ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2893:4: ({...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2894:5: {...}? => ( ( (lv_isDerived_2_0= 'derived' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDerivation", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2894:107: ( ( (lv_isDerived_2_0= 'derived' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2895:6: ( (lv_isDerived_2_0= 'derived' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2898:6: ( (lv_isDerived_2_0= 'derived' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2899:1: (lv_isDerived_2_0= 'derived' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2899:1: (lv_isDerived_2_0= 'derived' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2900:3: lv_isDerived_2_0= 'derived'
            	    {
            	    lv_isDerived_2_0=(Token)input.LT(1);
            	    match(input,54,FollowSets000.FOLLOW_54_in_ruleDerivation5448); 

            	            createLeafNode(grammarAccess.getDerivationAccess().getIsDerivedDerivedKeyword_1_0_0(), "isDerived"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isDerived", true, "derived", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivationAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2926:4: ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2926:4: ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2927:5: {...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDerivation", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2927:107: ( ( (lv_isAbstract_3_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2928:6: ( (lv_isAbstract_3_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2931:6: ( (lv_isAbstract_3_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2932:1: (lv_isAbstract_3_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2932:1: (lv_isAbstract_3_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2933:3: lv_isAbstract_3_0= 'abstract'
            	    {
            	    lv_isAbstract_3_0=(Token)input.LT(1);
            	    match(input,55,FollowSets000.FOLLOW_55_in_ruleDerivation5529); 

            	            createLeafNode(grammarAccess.getDerivationAccess().getIsAbstractAbstractKeyword_1_1_0(), "isAbstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivationAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2959:4: ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2959:4: ({...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2960:5: {...}? => ( ( (lv_isLeaf_4_0= 'leaf' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDerivation", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2960:107: ( ( (lv_isLeaf_4_0= 'leaf' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2961:6: ( (lv_isLeaf_4_0= 'leaf' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2964:6: ( (lv_isLeaf_4_0= 'leaf' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2965:1: (lv_isLeaf_4_0= 'leaf' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2965:1: (lv_isLeaf_4_0= 'leaf' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:2966:3: lv_isLeaf_4_0= 'leaf'
            	    {
            	    lv_isLeaf_4_0=(Token)input.LT(1);
            	    match(input,56,FollowSets000.FOLLOW_56_in_ruleDerivation5610); 

            	            createLeafNode(grammarAccess.getDerivationAccess().getIsLeafLeafKeyword_1_2_0(), "isLeaf"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "isLeaf", true, "leaf", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivationAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDerivationAccess().getUnorderedGroup_1());
            	

            }

            match(input,57,FollowSets000.FOLLOW_57_in_ruleDerivation5672); 

                    createLeafNode(grammarAccess.getDerivationAccess().getDerivationKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3003:1: ( (lv_name_6_0= RULE_ID ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3004:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3004:1: (lv_name_6_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3005:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDerivation5689); 

                    			createLeafNode(grammarAccess.getDerivationAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3027:3: ( ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==27) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3027:5: ':' ( (lv_generalization_8_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleDerivation5706); 

                            createLeafNode(grammarAccess.getDerivationAccess().getColonKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3031:1: ( (lv_generalization_8_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3032:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3032:1: (lv_generalization_8_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3033:3: lv_generalization_8_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDerivationAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleDerivation5727);
                    lv_generalization_8_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3055:2: ( ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==20) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3055:4: ',' ( (lv_generalization_10_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleDerivation5738); 

                    	            createLeafNode(grammarAccess.getDerivationAccess().getCommaKeyword_4_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3059:1: ( (lv_generalization_10_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3060:1: (lv_generalization_10_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3060:1: (lv_generalization_10_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3061:3: lv_generalization_10_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDerivationAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleDerivation5759);
                    	    lv_generalization_10_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
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
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleDerivation5773); 

                    createLeafNode(grammarAccess.getDerivationAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            match(input,58,FollowSets000.FOLLOW_58_in_ruleDerivation5783); 

                    createLeafNode(grammarAccess.getDerivationAccess().getMaterialKeyword_6(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3091:1: ( ( (lv_ownedEnd_13_0= ruleInlinePropertyDefinition ) ) ';' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3091:2: ( (lv_ownedEnd_13_0= ruleInlinePropertyDefinition ) ) ';'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3091:2: ( (lv_ownedEnd_13_0= ruleInlinePropertyDefinition ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3092:1: (lv_ownedEnd_13_0= ruleInlinePropertyDefinition )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3092:1: (lv_ownedEnd_13_0= ruleInlinePropertyDefinition )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3093:3: lv_ownedEnd_13_0= ruleInlinePropertyDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDerivationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_7_0_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleDerivation5805);
            lv_ownedEnd_13_0=ruleInlinePropertyDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedEnd",
            	        		lv_ownedEnd_13_0, 
            	        		"InlinePropertyDefinition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,51,FollowSets000.FOLLOW_51_in_ruleDerivation5815); 

                    createLeafNode(grammarAccess.getDerivationAccess().getSemicolonKeyword_7_1(), null); 
                

            }

            match(input,59,FollowSets000.FOLLOW_59_in_ruleDerivation5826); 

                    createLeafNode(grammarAccess.getDerivationAccess().getRelatorKeyword_8(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3123:1: ( ( (lv_ownedEnd_16_0= ruleInlinePropertyDefinition ) ) ';' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3123:2: ( (lv_ownedEnd_16_0= ruleInlinePropertyDefinition ) ) ';'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3123:2: ( (lv_ownedEnd_16_0= ruleInlinePropertyDefinition ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3124:1: (lv_ownedEnd_16_0= ruleInlinePropertyDefinition )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3124:1: (lv_ownedEnd_16_0= ruleInlinePropertyDefinition )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3125:3: lv_ownedEnd_16_0= ruleInlinePropertyDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDerivationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_9_0_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleDerivation5848);
            lv_ownedEnd_16_0=ruleInlinePropertyDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedEnd",
            	        		lv_ownedEnd_16_0, 
            	        		"InlinePropertyDefinition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,51,FollowSets000.FOLLOW_51_in_ruleDerivation5858); 

                    createLeafNode(grammarAccess.getDerivationAccess().getSemicolonKeyword_9_1(), null); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3151:2: ( ( ( ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3153:1: ( ( ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3153:1: ( ( ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3154:2: ( ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDerivationAccess().getUnorderedGroup_10());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3157:2: ( ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3158:3: ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3158:3: ( ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )*
            loop63:
            do {
                int alt63=3;
                int LA63_0 = input.LA(1);

                if ( LA63_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_10(), 0) ) {
                    alt63=1;
                }
                else if ( LA63_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_10(), 1) ) {
                    alt63=2;
                }


                switch (alt63) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3160:4: ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3160:4: ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3161:5: {...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_10(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDerivation", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_10(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3161:108: ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3162:6: ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDerivationAccess().getUnorderedGroup_10(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3165:6: ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3165:8: 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';'
            	    {
            	    match(input,52,FollowSets000.FOLLOW_52_in_ruleDerivation5912); 

            	            createLeafNode(grammarAccess.getDerivationAccess().getMemberEndKeyword_10_0_0(), null); 
            	        
            	    match(input,27,FollowSets000.FOLLOW_27_in_ruleDerivation5922); 

            	            createLeafNode(grammarAccess.getDerivationAccess().getColonKeyword_10_0_1(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3173:1: ( ( RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3174:1: ( RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3174:1: ( RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3175:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDerivation5940); 

            	    		createLeafNode(grammarAccess.getDerivationAccess().getMemberEndPropertyCrossReference_10_0_2_0(), "memberEnd"); 
            	    	

            	    }


            	    }

            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3187:2: ( ',' ( ( RULE_ID ) ) )*
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( (LA61_0==20) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3187:4: ',' ( ( RULE_ID ) )
            	    	    {
            	    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleDerivation5951); 

            	    	            createLeafNode(grammarAccess.getDerivationAccess().getCommaKeyword_10_0_3_0(), null); 
            	    	        
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3191:1: ( ( RULE_ID ) )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3192:1: ( RULE_ID )
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3192:1: ( RULE_ID )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3193:3: RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode, current);
            	    	    	        }
            	    	            
            	    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDerivation5969); 

            	    	    		createLeafNode(grammarAccess.getDerivationAccess().getMemberEndPropertyCrossReference_10_0_3_1_0(), "memberEnd"); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop61;
            	        }
            	    } while (true);

            	    match(input,51,FollowSets000.FOLLOW_51_in_ruleDerivation5981); 

            	            createLeafNode(grammarAccess.getDerivationAccess().getSemicolonKeyword_10_0_4(), null); 
            	        

            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivationAccess().getUnorderedGroup_10());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3216:4: ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3216:4: ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3217:5: {...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_10(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDerivation", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_10(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3217:108: ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3218:6: ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDerivationAccess().getUnorderedGroup_10(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3221:6: ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3221:8: 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';'
            	    {
            	    match(input,53,FollowSets000.FOLLOW_53_in_ruleDerivation6043); 

            	            createLeafNode(grammarAccess.getDerivationAccess().getNavigableOwnedEndKeyword_10_1_0(), null); 
            	        
            	    match(input,27,FollowSets000.FOLLOW_27_in_ruleDerivation6053); 

            	            createLeafNode(grammarAccess.getDerivationAccess().getColonKeyword_10_1_1(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3229:1: ( ( RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3230:1: ( RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3230:1: ( RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3231:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDerivation6071); 

            	    		createLeafNode(grammarAccess.getDerivationAccess().getNavigableOwnedEndPropertyCrossReference_10_1_2_0(), "navigableOwnedEnd"); 
            	    	

            	    }


            	    }

            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3243:2: ( ',' ( ( RULE_ID ) ) )*
            	    loop62:
            	    do {
            	        int alt62=2;
            	        int LA62_0 = input.LA(1);

            	        if ( (LA62_0==20) ) {
            	            alt62=1;
            	        }


            	        switch (alt62) {
            	    	case 1 :
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3243:4: ',' ( ( RULE_ID ) )
            	    	    {
            	    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleDerivation6082); 

            	    	            createLeafNode(grammarAccess.getDerivationAccess().getCommaKeyword_10_1_3_0(), null); 
            	    	        
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3247:1: ( ( RULE_ID ) )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3248:1: ( RULE_ID )
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3248:1: ( RULE_ID )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3249:3: RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getDerivationRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode, current);
            	    	    	        }
            	    	            
            	    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDerivation6100); 

            	    	    		createLeafNode(grammarAccess.getDerivationAccess().getNavigableOwnedEndPropertyCrossReference_10_1_3_1_0(), "navigableOwnedEnd"); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop62;
            	        }
            	    } while (true);

            	    match(input,51,FollowSets000.FOLLOW_51_in_ruleDerivation6112); 

            	            createLeafNode(grammarAccess.getDerivationAccess().getSemicolonKeyword_10_1_4(), null); 
            	        

            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivationAccess().getUnorderedGroup_10());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDerivationAccess().getUnorderedGroup_10());
            	

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleDerivation6162); 

                    createLeafNode(grammarAccess.getDerivationAccess().getRightCurlyBracketKeyword_11(), null); 
                

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3291:1: entryRuleMaterialAssociation returns [EObject current=null] : iv_ruleMaterialAssociation= ruleMaterialAssociation EOF ;
    public final EObject entryRuleMaterialAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterialAssociation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3292:2: (iv_ruleMaterialAssociation= ruleMaterialAssociation EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3293:2: iv_ruleMaterialAssociation= ruleMaterialAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMaterialAssociationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleMaterialAssociation_in_entryRuleMaterialAssociation6198);
            iv_ruleMaterialAssociation=ruleMaterialAssociation();
            _fsp--;

             current =iv_ruleMaterialAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMaterialAssociation6208); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3300:1: ruleMaterialAssociation returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+ {...}?) ) ) 'materialAssociation' ( (lv_name_7_0= RULE_ID ) )? ( ':' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_11_0= ruleInlineGeneralization ) ) )* )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' ) ;
    public final EObject ruleMaterialAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_isDerived_3_0=null;
        Token lv_isAbstract_4_0=null;
        Token lv_isLeaf_5_0=null;
        Token lv_name_7_0=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_generalization_9_0 = null;

        EObject lv_generalization_11_0 = null;

        EObject lv_ownedEnd_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3305:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+ {...}?) ) ) 'materialAssociation' ( (lv_name_7_0= RULE_ID ) )? ( ':' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_11_0= ruleInlineGeneralization ) ) )* )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3306:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+ {...}?) ) ) 'materialAssociation' ( (lv_name_7_0= RULE_ID ) )? ( ':' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_11_0= ruleInlineGeneralization ) ) )* )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3306:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+ {...}?) ) ) 'materialAssociation' ( (lv_name_7_0= RULE_ID ) )? ( ':' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_11_0= ruleInlineGeneralization ) ) )* )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3306:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+ {...}?) ) ) 'materialAssociation' ( (lv_name_7_0= RULE_ID ) )? ( ':' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_11_0= ruleInlineGeneralization ) ) )* )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3306:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3307:5: 
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3317:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==25||(LA64_0>=89 && LA64_0<=91)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3318:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3318:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3319:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMaterialAssociationAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleMaterialAssociation6263);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3341:3: ( ( ( ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3343:1: ( ( ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3343:1: ( ( ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3344:2: ( ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3347:2: ( ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3348:3: ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3348:3: ( ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )+
            int cnt65=0;
            loop65:
            do {
                int alt65=4;
                int LA65_0 = input.LA(1);

                if ( LA65_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0) ) {
                    alt65=1;
                }
                else if ( LA65_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1) ) {
                    alt65=2;
                }
                else if ( LA65_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2) ) {
                    alt65=3;
                }


                switch (alt65) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3350:4: ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3350:4: ({...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3351:5: {...}? => ( ( (lv_isDerived_3_0= 'derived' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3351:116: ( ( (lv_isDerived_3_0= 'derived' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3352:6: ( (lv_isDerived_3_0= 'derived' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3355:6: ( (lv_isDerived_3_0= 'derived' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3356:1: (lv_isDerived_3_0= 'derived' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3356:1: (lv_isDerived_3_0= 'derived' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3357:3: lv_isDerived_3_0= 'derived'
            	    {
            	    lv_isDerived_3_0=(Token)input.LT(1);
            	    match(input,54,FollowSets000.FOLLOW_54_in_ruleMaterialAssociation6324); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getIsDerivedDerivedKeyword_2_0_0(), "isDerived"); 
            	        

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3383:4: ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3383:4: ({...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3384:5: {...}? => ( ( (lv_isAbstract_4_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3384:116: ( ( (lv_isAbstract_4_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3385:6: ( (lv_isAbstract_4_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3388:6: ( (lv_isAbstract_4_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3389:1: (lv_isAbstract_4_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3389:1: (lv_isAbstract_4_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3390:3: lv_isAbstract_4_0= 'abstract'
            	    {
            	    lv_isAbstract_4_0=(Token)input.LT(1);
            	    match(input,55,FollowSets000.FOLLOW_55_in_ruleMaterialAssociation6405); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getIsAbstractAbstractKeyword_2_1_0(), "isAbstract"); 
            	        

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3416:4: ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3416:4: ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3417:5: {...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3417:116: ( ( (lv_isLeaf_5_0= 'leaf' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3418:6: ( (lv_isLeaf_5_0= 'leaf' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3421:6: ( (lv_isLeaf_5_0= 'leaf' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3422:1: (lv_isLeaf_5_0= 'leaf' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3422:1: (lv_isLeaf_5_0= 'leaf' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3423:3: lv_isLeaf_5_0= 'leaf'
            	    {
            	    lv_isLeaf_5_0=(Token)input.LT(1);
            	    match(input,56,FollowSets000.FOLLOW_56_in_ruleMaterialAssociation6486); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getIsLeafLeafKeyword_2_2_0(), "isLeaf"); 
            	        

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canLeave(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2());
            	

            }

            match(input,60,FollowSets000.FOLLOW_60_in_ruleMaterialAssociation6554); 

                    createLeafNode(grammarAccess.getMaterialAssociationAccess().getMaterialAssociationKeyword_3(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3461:1: ( (lv_name_7_0= RULE_ID ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3462:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3462:1: (lv_name_7_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3463:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMaterialAssociation6571); 

                    			createLeafNode(grammarAccess.getMaterialAssociationAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_7_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3485:3: ( ':' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_11_0= ruleInlineGeneralization ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==27) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3485:5: ':' ( (lv_generalization_9_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_11_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleMaterialAssociation6588); 

                            createLeafNode(grammarAccess.getMaterialAssociationAccess().getColonKeyword_5_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3489:1: ( (lv_generalization_9_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3490:1: (lv_generalization_9_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3490:1: (lv_generalization_9_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3491:3: lv_generalization_9_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMaterialAssociationAccess().getGeneralizationInlineGeneralizationParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMaterialAssociation6609);
                    lv_generalization_9_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3513:2: ( ',' ( (lv_generalization_11_0= ruleInlineGeneralization ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==20) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3513:4: ',' ( (lv_generalization_11_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleMaterialAssociation6620); 

                    	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getCommaKeyword_5_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3517:1: ( (lv_generalization_11_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3518:1: (lv_generalization_11_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3518:1: (lv_generalization_11_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3519:3: lv_generalization_11_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMaterialAssociationAccess().getGeneralizationInlineGeneralizationParserRuleCall_5_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMaterialAssociation6641);
                    	    lv_generalization_11_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"generalization",
                    	    	        		lv_generalization_11_0, 
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
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleMaterialAssociation6655); 

                    createLeafNode(grammarAccess.getMaterialAssociationAccess().getLeftCurlyBracketKeyword_6(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3545:1: ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3547:1: ( ( ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3547:1: ( ( ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3548:2: ( ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3551:2: ( ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3552:3: ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3552:3: ( ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+
            int cnt72=0;
            loop72:
            do {
                int alt72=4;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==25||LA72_0==36|| LA72_0 >=89 && LA72_0<=91) && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 0) ) {
                    alt72=1;
                }
                else if ( LA72_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 1) ) {
                    alt72=2;
                }
                else if ( LA72_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 2) ) {
                    alt72=3;
                }


                switch (alt72) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3554:4: ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3554:4: ({...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3555:5: {...}? => ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3555:116: ( ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+ )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3556:6: ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3559:6: ( ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';' )+
            	    int cnt69=0;
            	    loop69:
            	    do {
            	        int alt69=2;
            	        switch ( input.LA(1) ) {
            	        case 89:
            	            {
            	            int LA69_2 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 0) ) {
            	                alt69=1;
            	            }


            	            }
            	            break;
            	        case 90:
            	            {
            	            int LA69_3 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 0) ) {
            	                alt69=1;
            	            }


            	            }
            	            break;
            	        case 91:
            	            {
            	            int LA69_4 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 0) ) {
            	                alt69=1;
            	            }


            	            }
            	            break;
            	        case 25:
            	            {
            	            int LA69_5 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 0) ) {
            	                alt69=1;
            	            }


            	            }
            	            break;
            	        case 36:
            	            {
            	            int LA69_6 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 0) ) {
            	                alt69=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt69) {
            	    	case 1 :
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3559:7: ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) ) ';'
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3559:7: ( (lv_ownedEnd_14_0= ruleInlinePropertyDefinition ) )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3560:1: (lv_ownedEnd_14_0= ruleInlinePropertyDefinition )
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3560:1: (lv_ownedEnd_14_0= ruleInlinePropertyDefinition )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3561:3: lv_ownedEnd_14_0= ruleInlinePropertyDefinition
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getMaterialAssociationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_7_0_0_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleMaterialAssociation6719);
            	    	    lv_ownedEnd_14_0=ruleInlinePropertyDefinition();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"ownedEnd",
            	    	    	        		lv_ownedEnd_14_0, 
            	    	    	        		"InlinePropertyDefinition", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }

            	    	    match(input,51,FollowSets000.FOLLOW_51_in_ruleMaterialAssociation6729); 

            	    	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getSemicolonKeyword_7_0_1(), null); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt69 >= 1 ) break loop69;
            	                EarlyExitException eee =
            	                    new EarlyExitException(69, input);
            	                throw eee;
            	        }
            	        cnt69++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3594:4: ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3594:4: ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3595:5: {...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3595:116: ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3596:6: ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3599:6: ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3599:8: 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';'
            	    {
            	    match(input,52,FollowSets000.FOLLOW_52_in_ruleMaterialAssociation6792); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getMemberEndKeyword_7_1_0(), null); 
            	        
            	    match(input,27,FollowSets000.FOLLOW_27_in_ruleMaterialAssociation6802); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getColonKeyword_7_1_1(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3607:1: ( ( RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3608:1: ( RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3608:1: ( RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3609:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMaterialAssociation6820); 

            	    		createLeafNode(grammarAccess.getMaterialAssociationAccess().getMemberEndPropertyCrossReference_7_1_2_0(), "memberEnd"); 
            	    	

            	    }


            	    }

            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3621:2: ( ',' ( ( RULE_ID ) ) )*
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==20) ) {
            	            alt70=1;
            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3621:4: ',' ( ( RULE_ID ) )
            	    	    {
            	    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleMaterialAssociation6831); 

            	    	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getCommaKeyword_7_1_3_0(), null); 
            	    	        
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3625:1: ( ( RULE_ID ) )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3626:1: ( RULE_ID )
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3626:1: ( RULE_ID )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3627:3: RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode, current);
            	    	    	        }
            	    	            
            	    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMaterialAssociation6849); 

            	    	    		createLeafNode(grammarAccess.getMaterialAssociationAccess().getMemberEndPropertyCrossReference_7_1_3_1_0(), "memberEnd"); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop70;
            	        }
            	    } while (true);

            	    match(input,51,FollowSets000.FOLLOW_51_in_ruleMaterialAssociation6861); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getSemicolonKeyword_7_1_4(), null); 
            	        

            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3650:4: ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3650:4: ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3651:5: {...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3651:116: ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3652:6: ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3655:6: ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3655:8: 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';'
            	    {
            	    match(input,53,FollowSets000.FOLLOW_53_in_ruleMaterialAssociation6923); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getNavigableOwnedEndKeyword_7_2_0(), null); 
            	        
            	    match(input,27,FollowSets000.FOLLOW_27_in_ruleMaterialAssociation6933); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getColonKeyword_7_2_1(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3663:1: ( ( RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3664:1: ( RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3664:1: ( RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3665:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMaterialAssociation6951); 

            	    		createLeafNode(grammarAccess.getMaterialAssociationAccess().getNavigableOwnedEndPropertyCrossReference_7_2_2_0(), "navigableOwnedEnd"); 
            	    	

            	    }


            	    }

            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3677:2: ( ',' ( ( RULE_ID ) ) )*
            	    loop71:
            	    do {
            	        int alt71=2;
            	        int LA71_0 = input.LA(1);

            	        if ( (LA71_0==20) ) {
            	            alt71=1;
            	        }


            	        switch (alt71) {
            	    	case 1 :
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3677:4: ',' ( ( RULE_ID ) )
            	    	    {
            	    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleMaterialAssociation6962); 

            	    	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getCommaKeyword_7_2_3_0(), null); 
            	    	        
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3681:1: ( ( RULE_ID ) )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3682:1: ( RULE_ID )
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3682:1: ( RULE_ID )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3683:3: RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getMaterialAssociationRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode, current);
            	    	    	        }
            	    	            
            	    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMaterialAssociation6980); 

            	    	    		createLeafNode(grammarAccess.getMaterialAssociationAccess().getNavigableOwnedEndPropertyCrossReference_7_2_3_1_0(), "navigableOwnedEnd"); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop71;
            	        }
            	    } while (true);

            	    match(input,51,FollowSets000.FOLLOW_51_in_ruleMaterialAssociation6992); 

            	            createLeafNode(grammarAccess.getMaterialAssociationAccess().getSemicolonKeyword_7_2_4(), null); 
            	        

            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7()) ) {
                throw new FailedPredicateException(input, "ruleMaterialAssociation", "getUnorderedGroupHelper().canLeave(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_7());
            	

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleMaterialAssociation7048); 

                    createLeafNode(grammarAccess.getMaterialAssociationAccess().getRightCurlyBracketKeyword_8(), null); 
                

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3726:1: entryRuleFormalAssociation returns [EObject current=null] : iv_ruleFormalAssociation= ruleFormalAssociation EOF ;
    public final EObject entryRuleFormalAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalAssociation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3727:2: (iv_ruleFormalAssociation= ruleFormalAssociation EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3728:2: iv_ruleFormalAssociation= ruleFormalAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormalAssociationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleFormalAssociation_in_entryRuleFormalAssociation7084);
            iv_ruleFormalAssociation=ruleFormalAssociation();
            _fsp--;

             current =iv_ruleFormalAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormalAssociation7094); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3735:1: ruleFormalAssociation returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )* ) ) ) 'formalAssociation' ( (lv_name_7_0= RULE_ID ) )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' ) ;
    public final EObject ruleFormalAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_3_0=null;
        Token lv_isDerived_4_0=null;
        Token lv_isLeaf_5_0=null;
        Token lv_name_7_0=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_ownedEnd_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3740:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )* ) ) ) 'formalAssociation' ( (lv_name_7_0= RULE_ID ) )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3741:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )* ) ) ) 'formalAssociation' ( (lv_name_7_0= RULE_ID ) )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3741:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )* ) ) ) 'formalAssociation' ( (lv_name_7_0= RULE_ID ) )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3741:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( ( ( ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )* ) ) ) 'formalAssociation' ( (lv_name_7_0= RULE_ID ) )? '{' ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) ) '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3741:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3742:5: 
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3752:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==25||(LA73_0>=89 && LA73_0<=91)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3753:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3753:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3754:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFormalAssociationAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleFormalAssociation7149);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFormalAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3776:3: ( ( ( ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )* ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3778:1: ( ( ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )* ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3778:1: ( ( ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3779:2: ( ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3782:2: ( ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )* )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3783:3: ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3783:3: ( ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) | ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) ) | ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) ) )*
            loop74:
            do {
                int alt74=4;
                int LA74_0 = input.LA(1);

                if ( LA74_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0) ) {
                    alt74=1;
                }
                else if ( LA74_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1) ) {
                    alt74=2;
                }
                else if ( LA74_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2) ) {
                    alt74=3;
                }


                switch (alt74) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3785:4: ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3785:4: ({...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3786:5: {...}? => ( ( (lv_isAbstract_3_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFormalAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3786:114: ( ( (lv_isAbstract_3_0= 'abstract' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3787:6: ( (lv_isAbstract_3_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3790:6: ( (lv_isAbstract_3_0= 'abstract' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3791:1: (lv_isAbstract_3_0= 'abstract' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3791:1: (lv_isAbstract_3_0= 'abstract' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3792:3: lv_isAbstract_3_0= 'abstract'
            	    {
            	    lv_isAbstract_3_0=(Token)input.LT(1);
            	    match(input,55,FollowSets000.FOLLOW_55_in_ruleFormalAssociation7210); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getIsAbstractAbstractKeyword_2_0_0(), "isAbstract"); 
            	        

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3818:4: ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3818:4: ({...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3819:5: {...}? => ( ( (lv_isDerived_4_0= 'derived' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFormalAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3819:114: ( ( (lv_isDerived_4_0= 'derived' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3820:6: ( (lv_isDerived_4_0= 'derived' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3823:6: ( (lv_isDerived_4_0= 'derived' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3824:1: (lv_isDerived_4_0= 'derived' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3824:1: (lv_isDerived_4_0= 'derived' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3825:3: lv_isDerived_4_0= 'derived'
            	    {
            	    lv_isDerived_4_0=(Token)input.LT(1);
            	    match(input,54,FollowSets000.FOLLOW_54_in_ruleFormalAssociation7291); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getIsDerivedDerivedKeyword_2_1_0(), "isDerived"); 
            	        

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3851:4: ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3851:4: ({...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3852:5: {...}? => ( ( (lv_isLeaf_5_0= 'leaf' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFormalAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3852:114: ( ( (lv_isLeaf_5_0= 'leaf' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3853:6: ( (lv_isLeaf_5_0= 'leaf' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3856:6: ( (lv_isLeaf_5_0= 'leaf' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3857:1: (lv_isLeaf_5_0= 'leaf' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3857:1: (lv_isLeaf_5_0= 'leaf' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3858:3: lv_isLeaf_5_0= 'leaf'
            	    {
            	    lv_isLeaf_5_0=(Token)input.LT(1);
            	    match(input,56,FollowSets000.FOLLOW_56_in_ruleFormalAssociation7372); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getIsLeafLeafKeyword_2_2_0(), "isLeaf"); 
            	        

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2());
            	

            }

            match(input,61,FollowSets000.FOLLOW_61_in_ruleFormalAssociation7434); 

                    createLeafNode(grammarAccess.getFormalAssociationAccess().getFormalAssociationKeyword_3(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3895:1: ( (lv_name_7_0= RULE_ID ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3896:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3896:1: (lv_name_7_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3897:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFormalAssociation7451); 

                    			createLeafNode(grammarAccess.getFormalAssociationAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFormalAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_7_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleFormalAssociation7467); 

                    createLeafNode(grammarAccess.getFormalAssociationAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3923:1: ( ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3925:1: ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3925:1: ( ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3926:2: ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6());
            	
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3929:2: ( ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3930:3: ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3930:3: ( ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) ) | ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) | ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) ) )+
            int cnt79=0;
            loop79:
            do {
                int alt79=4;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==25||LA79_0==36|| LA79_0 >=89 && LA79_0<=91) && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 0) ) {
                    alt79=1;
                }
                else if ( LA79_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 1) ) {
                    alt79=2;
                }
                else if ( LA79_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 2) ) {
                    alt79=3;
                }


                switch (alt79) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3932:4: ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3932:4: ({...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3933:5: {...}? => ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFormalAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3933:114: ( ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+ )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3934:6: ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3937:6: ( ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';' )+
            	    int cnt76=0;
            	    loop76:
            	    do {
            	        int alt76=2;
            	        switch ( input.LA(1) ) {
            	        case 89:
            	            {
            	            int LA76_2 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 0) ) {
            	                alt76=1;
            	            }


            	            }
            	            break;
            	        case 90:
            	            {
            	            int LA76_3 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 0) ) {
            	                alt76=1;
            	            }


            	            }
            	            break;
            	        case 91:
            	            {
            	            int LA76_4 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 0) ) {
            	                alt76=1;
            	            }


            	            }
            	            break;
            	        case 25:
            	            {
            	            int LA76_5 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 0) ) {
            	                alt76=1;
            	            }


            	            }
            	            break;
            	        case 36:
            	            {
            	            int LA76_6 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 0) ) {
            	                alt76=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt76) {
            	    	case 1 :
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3937:7: ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) ) ';'
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3937:7: ( (lv_ownedEnd_10_0= ruleInlinePropertyDefinition ) )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3938:1: (lv_ownedEnd_10_0= ruleInlinePropertyDefinition )
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3938:1: (lv_ownedEnd_10_0= ruleInlinePropertyDefinition )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3939:3: lv_ownedEnd_10_0= ruleInlinePropertyDefinition
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getFormalAssociationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_6_0_0_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleFormalAssociation7531);
            	    	    lv_ownedEnd_10_0=ruleInlinePropertyDefinition();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getFormalAssociationRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"ownedEnd",
            	    	    	        		lv_ownedEnd_10_0, 
            	    	    	        		"InlinePropertyDefinition", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }

            	    	    match(input,51,FollowSets000.FOLLOW_51_in_ruleFormalAssociation7541); 

            	    	            createLeafNode(grammarAccess.getFormalAssociationAccess().getSemicolonKeyword_6_0_1(), null); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt76 >= 1 ) break loop76;
            	                EarlyExitException eee =
            	                    new EarlyExitException(76, input);
            	                throw eee;
            	        }
            	        cnt76++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3972:4: ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3972:4: ({...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3973:5: {...}? => ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFormalAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3973:114: ( ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3974:6: ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3977:6: ( 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3977:8: 'memberEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';'
            	    {
            	    match(input,52,FollowSets000.FOLLOW_52_in_ruleFormalAssociation7604); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getMemberEndKeyword_6_1_0(), null); 
            	        
            	    match(input,27,FollowSets000.FOLLOW_27_in_ruleFormalAssociation7614); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getColonKeyword_6_1_1(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3985:1: ( ( RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3986:1: ( RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3986:1: ( RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3987:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getFormalAssociationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFormalAssociation7632); 

            	    		createLeafNode(grammarAccess.getFormalAssociationAccess().getMemberEndPropertyCrossReference_6_1_2_0(), "memberEnd"); 
            	    	

            	    }


            	    }

            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3999:2: ( ',' ( ( RULE_ID ) ) )*
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==20) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:3999:4: ',' ( ( RULE_ID ) )
            	    	    {
            	    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleFormalAssociation7643); 

            	    	            createLeafNode(grammarAccess.getFormalAssociationAccess().getCommaKeyword_6_1_3_0(), null); 
            	    	        
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4003:1: ( ( RULE_ID ) )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4004:1: ( RULE_ID )
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4004:1: ( RULE_ID )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4005:3: RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getFormalAssociationRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode, current);
            	    	    	        }
            	    	            
            	    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFormalAssociation7661); 

            	    	    		createLeafNode(grammarAccess.getFormalAssociationAccess().getMemberEndPropertyCrossReference_6_1_3_1_0(), "memberEnd"); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop77;
            	        }
            	    } while (true);

            	    match(input,51,FollowSets000.FOLLOW_51_in_ruleFormalAssociation7673); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getSemicolonKeyword_6_1_4(), null); 
            	        

            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4028:4: ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4028:4: ({...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4029:5: {...}? => ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFormalAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4029:114: ( ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4030:6: ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4033:6: ( 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';' )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4033:8: 'navigableOwnedEnd' ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ';'
            	    {
            	    match(input,53,FollowSets000.FOLLOW_53_in_ruleFormalAssociation7735); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getNavigableOwnedEndKeyword_6_2_0(), null); 
            	        
            	    match(input,27,FollowSets000.FOLLOW_27_in_ruleFormalAssociation7745); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getColonKeyword_6_2_1(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4041:1: ( ( RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4042:1: ( RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4042:1: ( RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4043:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getFormalAssociationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFormalAssociation7763); 

            	    		createLeafNode(grammarAccess.getFormalAssociationAccess().getNavigableOwnedEndPropertyCrossReference_6_2_2_0(), "navigableOwnedEnd"); 
            	    	

            	    }


            	    }

            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4055:2: ( ',' ( ( RULE_ID ) ) )*
            	    loop78:
            	    do {
            	        int alt78=2;
            	        int LA78_0 = input.LA(1);

            	        if ( (LA78_0==20) ) {
            	            alt78=1;
            	        }


            	        switch (alt78) {
            	    	case 1 :
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4055:4: ',' ( ( RULE_ID ) )
            	    	    {
            	    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleFormalAssociation7774); 

            	    	            createLeafNode(grammarAccess.getFormalAssociationAccess().getCommaKeyword_6_2_3_0(), null); 
            	    	        
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4059:1: ( ( RULE_ID ) )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4060:1: ( RULE_ID )
            	    	    {
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4060:1: ( RULE_ID )
            	    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4061:3: RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getFormalAssociationRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode, current);
            	    	    	        }
            	    	            
            	    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFormalAssociation7792); 

            	    	    		createLeafNode(grammarAccess.getFormalAssociationAccess().getNavigableOwnedEndPropertyCrossReference_6_2_3_1_0(), "navigableOwnedEnd"); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop78;
            	        }
            	    } while (true);

            	    match(input,51,FollowSets000.FOLLOW_51_in_ruleFormalAssociation7804); 

            	            createLeafNode(grammarAccess.getFormalAssociationAccess().getSemicolonKeyword_6_2_4(), null); 
            	        

            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt79 >= 1 ) break loop79;
                        EarlyExitException eee =
                            new EarlyExitException(79, input);
                        throw eee;
                }
                cnt79++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6()) ) {
                throw new FailedPredicateException(input, "ruleFormalAssociation", "getUnorderedGroupHelper().canLeave(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_6());
            	

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleFormalAssociation7860); 

                    createLeafNode(grammarAccess.getFormalAssociationAccess().getRightCurlyBracketKeyword_7(), null); 
                

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


    // $ANTLR start entryRuleEnumerationLiteral
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4106:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4107:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4108:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationLiteralRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral7898);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();
            _fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationLiteral7908); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4115:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_specification_3_0= ruleValueSpecification ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_specification_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4120:6: ( ( () ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_specification_3_0= ruleValueSpecification ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4121:1: ( () ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_specification_3_0= ruleValueSpecification ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4121:1: ( () ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_specification_3_0= ruleValueSpecification ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4121:2: () ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_specification_3_0= ruleValueSpecification ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4121:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4122:5: 
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4132:2: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4133:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4133:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4134:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumerationLiteral7959); 

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

            match(input,62,FollowSets000.FOLLOW_62_in_ruleEnumerationLiteral7974); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4160:1: ( (lv_specification_3_0= ruleValueSpecification ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4161:1: (lv_specification_3_0= ruleValueSpecification )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4161:1: (lv_specification_3_0= ruleValueSpecification )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4162:3: lv_specification_3_0= ruleValueSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumerationLiteralAccess().getSpecificationValueSpecificationParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleEnumerationLiteral7995);
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


    // $ANTLR start entryRuleInstanceSpecification_Impl
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4192:1: entryRuleInstanceSpecification_Impl returns [EObject current=null] : iv_ruleInstanceSpecification_Impl= ruleInstanceSpecification_Impl EOF ;
    public final EObject entryRuleInstanceSpecification_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecification_Impl = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4193:2: (iv_ruleInstanceSpecification_Impl= ruleInstanceSpecification_Impl EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4194:2: iv_ruleInstanceSpecification_Impl= ruleInstanceSpecification_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstanceSpecification_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleInstanceSpecification_Impl_in_entryRuleInstanceSpecification_Impl8031);
            iv_ruleInstanceSpecification_Impl=ruleInstanceSpecification_Impl();
            _fsp--;

             current =iv_ruleInstanceSpecification_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInstanceSpecification_Impl8041); 

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
    // $ANTLR end entryRuleInstanceSpecification_Impl


    // $ANTLR start ruleInstanceSpecification_Impl
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4201:1: ruleInstanceSpecification_Impl returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'instance' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ( 'specification' ( (lv_specification_9_0= ruleValueSpecification ) ) )? '{' ( ( (lv_slot_11_0= ruleSlot ) ) ( ',' ( (lv_slot_13_0= ruleSlot ) ) )* )? '}' ) ;
    public final EObject ruleInstanceSpecification_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_specification_9_0 = null;

        EObject lv_slot_11_0 = null;

        EObject lv_slot_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4206:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'instance' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ( 'specification' ( (lv_specification_9_0= ruleValueSpecification ) ) )? '{' ( ( (lv_slot_11_0= ruleSlot ) ) ( ',' ( (lv_slot_13_0= ruleSlot ) ) )* )? '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4207:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'instance' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ( 'specification' ( (lv_specification_9_0= ruleValueSpecification ) ) )? '{' ( ( (lv_slot_11_0= ruleSlot ) ) ( ',' ( (lv_slot_13_0= ruleSlot ) ) )* )? '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4207:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'instance' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ( 'specification' ( (lv_specification_9_0= ruleValueSpecification ) ) )? '{' ( ( (lv_slot_11_0= ruleSlot ) ) ( ',' ( (lv_slot_13_0= ruleSlot ) ) )* )? '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4207:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'instance' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? ( 'specification' ( (lv_specification_9_0= ruleValueSpecification ) ) )? '{' ( ( (lv_slot_11_0= ruleSlot ) ) ( ',' ( (lv_slot_13_0= ruleSlot ) ) )* )? '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4207:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4208:5: 
            {
             
                    temp=factory.create(grammarAccess.getInstanceSpecification_ImplAccess().getInstanceSpecificationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getInstanceSpecification_ImplAccess().getInstanceSpecificationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4218:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==25||(LA80_0>=89 && LA80_0<=91)) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4219:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4219:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4220:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInstanceSpecification_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleInstanceSpecification_Impl8096);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInstanceSpecification_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,63,FollowSets000.FOLLOW_63_in_ruleInstanceSpecification_Impl8107); 

                    createLeafNode(grammarAccess.getInstanceSpecification_ImplAccess().getInstanceKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4246:1: ( (lv_name_3_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4247:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4247:1: (lv_name_3_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4248:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInstanceSpecification_Impl8124); 

            			createLeafNode(grammarAccess.getInstanceSpecification_ImplAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInstanceSpecification_ImplRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4270:2: ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==27) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4270:4: ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleInstanceSpecification_Impl8140); 

                            createLeafNode(grammarAccess.getInstanceSpecification_ImplAccess().getColonKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4274:1: ( ( RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4275:1: ( RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4275:1: ( RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4276:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getInstanceSpecification_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInstanceSpecification_Impl8158); 

                    		createLeafNode(grammarAccess.getInstanceSpecification_ImplAccess().getClassifierClassifierCrossReference_4_1_0(), "classifier"); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4288:2: ( ',' ( ( RULE_ID ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==20) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4288:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleInstanceSpecification_Impl8169); 

                    	            createLeafNode(grammarAccess.getInstanceSpecification_ImplAccess().getCommaKeyword_4_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4292:1: ( ( RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4293:1: ( RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4293:1: ( RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4294:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInstanceSpecification_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInstanceSpecification_Impl8187); 

                    	    		createLeafNode(grammarAccess.getInstanceSpecification_ImplAccess().getClassifierClassifierCrossReference_4_2_1_0(), "classifier"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4306:6: ( 'specification' ( (lv_specification_9_0= ruleValueSpecification ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==64) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4306:8: 'specification' ( (lv_specification_9_0= ruleValueSpecification ) )
                    {
                    match(input,64,FollowSets000.FOLLOW_64_in_ruleInstanceSpecification_Impl8202); 

                            createLeafNode(grammarAccess.getInstanceSpecification_ImplAccess().getSpecificationKeyword_5_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4310:1: ( (lv_specification_9_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4311:1: (lv_specification_9_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4311:1: (lv_specification_9_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4312:3: lv_specification_9_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInstanceSpecification_ImplAccess().getSpecificationValueSpecificationParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleInstanceSpecification_Impl8223);
                    lv_specification_9_0=ruleValueSpecification();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInstanceSpecification_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"specification",
                    	        		lv_specification_9_0, 
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

            match(input,15,FollowSets000.FOLLOW_15_in_ruleInstanceSpecification_Impl8235); 

                    createLeafNode(grammarAccess.getInstanceSpecification_ImplAccess().getLeftCurlyBracketKeyword_6(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4338:1: ( ( (lv_slot_11_0= ruleSlot ) ) ( ',' ( (lv_slot_13_0= ruleSlot ) ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_STRING) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4338:2: ( (lv_slot_11_0= ruleSlot ) ) ( ',' ( (lv_slot_13_0= ruleSlot ) ) )*
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4338:2: ( (lv_slot_11_0= ruleSlot ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4339:1: (lv_slot_11_0= ruleSlot )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4339:1: (lv_slot_11_0= ruleSlot )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4340:3: lv_slot_11_0= ruleSlot
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInstanceSpecification_ImplAccess().getSlotSlotParserRuleCall_7_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSlot_in_ruleInstanceSpecification_Impl8257);
                    lv_slot_11_0=ruleSlot();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInstanceSpecification_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"slot",
                    	        		lv_slot_11_0, 
                    	        		"Slot", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4362:2: ( ',' ( (lv_slot_13_0= ruleSlot ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==20) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4362:4: ',' ( (lv_slot_13_0= ruleSlot ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleInstanceSpecification_Impl8268); 

                    	            createLeafNode(grammarAccess.getInstanceSpecification_ImplAccess().getCommaKeyword_7_1_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4366:1: ( (lv_slot_13_0= ruleSlot ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4367:1: (lv_slot_13_0= ruleSlot )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4367:1: (lv_slot_13_0= ruleSlot )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4368:3: lv_slot_13_0= ruleSlot
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getInstanceSpecification_ImplAccess().getSlotSlotParserRuleCall_7_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSlot_in_ruleInstanceSpecification_Impl8289);
                    	    lv_slot_13_0=ruleSlot();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInstanceSpecification_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"slot",
                    	    	        		lv_slot_13_0, 
                    	    	        		"Slot", 
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
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleInstanceSpecification_Impl8303); 

                    createLeafNode(grammarAccess.getInstanceSpecification_ImplAccess().getRightCurlyBracketKeyword_8(), null); 
                

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
    // $ANTLR end ruleInstanceSpecification_Impl


    // $ANTLR start entryRuleSlot
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4402:1: entryRuleSlot returns [EObject current=null] : iv_ruleSlot= ruleSlot EOF ;
    public final EObject entryRuleSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlot = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4403:2: (iv_ruleSlot= ruleSlot EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4404:2: iv_ruleSlot= ruleSlot EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSlotRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSlot_in_entryRuleSlot8339);
            iv_ruleSlot=ruleSlot();
            _fsp--;

             current =iv_ruleSlot; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlot8349); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4411:1: ruleSlot returns [EObject current=null] : ( ( ( RULE_STRING ) ) '=>' ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) ) ) ;
    public final EObject ruleSlot() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4416:6: ( ( ( ( RULE_STRING ) ) '=>' ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4417:1: ( ( ( RULE_STRING ) ) '=>' ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4417:1: ( ( ( RULE_STRING ) ) '=>' ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4417:2: ( ( RULE_STRING ) ) '=>' ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4417:2: ( ( RULE_STRING ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4418:1: ( RULE_STRING )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4418:1: ( RULE_STRING )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4419:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSlotRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSlot8392); 

            		createLeafNode(grammarAccess.getSlotAccess().getDefiningFeatureStructuralFeatureCrossReference_0_0(), "definingFeature"); 
            	

            }


            }

            match(input,65,FollowSets000.FOLLOW_65_in_ruleSlot8402); 

                    createLeafNode(grammarAccess.getSlotAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4435:1: ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_STRING||LA87_0==RULE_INT||LA87_0==22||LA87_0==25||LA87_0==32||LA87_0==63||(LA87_0>=66 && LA87_0<=67)||LA87_0==69||(LA87_0>=89 && LA87_0<=91)) ) {
                alt87=1;
            }
            else if ( (LA87_0==44) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4435:1: ( ( (lv_value_2_0= ruleValueSpecification ) ) | ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' ) )", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4435:2: ( (lv_value_2_0= ruleValueSpecification ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4435:2: ( (lv_value_2_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4436:1: (lv_value_2_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4436:1: (lv_value_2_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4437:3: lv_value_2_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSlotAccess().getValueValueSpecificationParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleSlot8424);
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
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4460:6: ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4460:6: ( '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4460:8: '[' ( (lv_value_4_0= ruleValueSpecification ) ) ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )* ']'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleSlot8441); 

                            createLeafNode(grammarAccess.getSlotAccess().getLeftSquareBracketKeyword_2_1_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4464:1: ( (lv_value_4_0= ruleValueSpecification ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4465:1: (lv_value_4_0= ruleValueSpecification )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4465:1: (lv_value_4_0= ruleValueSpecification )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4466:3: lv_value_4_0= ruleValueSpecification
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSlotAccess().getValueValueSpecificationParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleSlot8462);
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4488:2: ( ',' ( (lv_value_6_0= ruleValueSpecification ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==20) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4488:4: ',' ( (lv_value_6_0= ruleValueSpecification ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleSlot8473); 

                    	            createLeafNode(grammarAccess.getSlotAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4492:1: ( (lv_value_6_0= ruleValueSpecification ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4493:1: (lv_value_6_0= ruleValueSpecification )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4493:1: (lv_value_6_0= ruleValueSpecification )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4494:3: lv_value_6_0= ruleValueSpecification
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSlotAccess().getValueValueSpecificationParserRuleCall_2_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleSlot8494);
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
                    	    break loop86;
                        }
                    } while (true);

                    match(input,45,FollowSets000.FOLLOW_45_in_ruleSlot8506); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4528:1: entryRuleInstanceValue returns [EObject current=null] : iv_ruleInstanceValue= ruleInstanceValue EOF ;
    public final EObject entryRuleInstanceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceValue = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4529:2: (iv_ruleInstanceValue= ruleInstanceValue EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4530:2: iv_ruleInstanceValue= ruleInstanceValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstanceValueRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleInstanceValue_in_entryRuleInstanceValue8544);
            iv_ruleInstanceValue=ruleInstanceValue();
            _fsp--;

             current =iv_ruleInstanceValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInstanceValue8554); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4537:1: ruleInstanceValue returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'instance' ( (lv_name_2_0= RULE_ID ) )? ( '(' ( ( RULE_ID ) ) ')' )? ( ( RULE_ID ) ) ) ;
    public final EObject ruleInstanceValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_visibility_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4542:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'instance' ( (lv_name_2_0= RULE_ID ) )? ( '(' ( ( RULE_ID ) ) ')' )? ( ( RULE_ID ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4543:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'instance' ( (lv_name_2_0= RULE_ID ) )? ( '(' ( ( RULE_ID ) ) ')' )? ( ( RULE_ID ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4543:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'instance' ( (lv_name_2_0= RULE_ID ) )? ( '(' ( ( RULE_ID ) ) ')' )? ( ( RULE_ID ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4543:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'instance' ( (lv_name_2_0= RULE_ID ) )? ( '(' ( ( RULE_ID ) ) ')' )? ( ( RULE_ID ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4543:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==25||(LA88_0>=89 && LA88_0<=91)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4544:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4544:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4545:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInstanceValueAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleInstanceValue8600);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInstanceValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,63,FollowSets000.FOLLOW_63_in_ruleInstanceValue8611); 

                    createLeafNode(grammarAccess.getInstanceValueAccess().getInstanceKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4571:1: ( (lv_name_2_0= RULE_ID ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==22) ) {
                    alt89=1;
                }
                else if ( (LA89_1==RULE_ID) ) {
                    int LA89_4 = input.LA(3);

                    if ( (LA89_4==EOF||LA89_4==RULE_ID||LA89_4==RULE_ANY_OTHER||(LA89_4>=15 && LA89_4<=16)||LA89_4==20||LA89_4==23||LA89_4==45||(LA89_4>=47 && LA89_4<=49)) ) {
                        alt89=1;
                    }
                }
            }
            switch (alt89) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4572:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4572:1: (lv_name_2_0= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4573:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInstanceValue8628); 

                    			createLeafNode(grammarAccess.getInstanceValueAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInstanceValueRule().getType().getClassifier());
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
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4595:3: ( '(' ( ( RULE_ID ) ) ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==22) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4595:5: '(' ( ( RULE_ID ) ) ')'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleInstanceValue8645); 

                            createLeafNode(grammarAccess.getInstanceValueAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4599:1: ( ( RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4600:1: ( RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4600:1: ( RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4601:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getInstanceValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInstanceValue8663); 

                    		createLeafNode(grammarAccess.getInstanceValueAccess().getTypeTypeCrossReference_3_1_0(), "type"); 
                    	

                    }


                    }

                    match(input,23,FollowSets000.FOLLOW_23_in_ruleInstanceValue8673); 

                            createLeafNode(grammarAccess.getInstanceValueAccess().getRightParenthesisKeyword_3_2(), null); 
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4617:3: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4618:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4618:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4619:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInstanceValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInstanceValue8693); 

            		createLeafNode(grammarAccess.getInstanceValueAccess().getInstanceInstanceSpecificationCrossReference_4_0(), "instance"); 
            	

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
    // $ANTLR end ruleInstanceValue


    // $ANTLR start entryRuleLiteralInteger
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4639:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4640:2: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4641:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralIntegerRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger8729);
            iv_ruleLiteralInteger=ruleLiteralInteger();
            _fsp--;

             current =iv_ruleLiteralInteger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralInteger8739); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4648:1: ruleLiteralInteger returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4653:6: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4654:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4654:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4654:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4654:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4655:5: 
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4665:2: ( (lv_value_1_0= RULE_INT ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4666:1: (lv_value_1_0= RULE_INT )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4666:1: (lv_value_1_0= RULE_INT )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4667:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLiteralInteger8790); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4697:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4698:2: (iv_ruleLiteralString= ruleLiteralString EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4699:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralStringRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_entryRuleLiteralString8831);
            iv_ruleLiteralString=ruleLiteralString();
            _fsp--;

             current =iv_ruleLiteralString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralString8841); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4706:1: ruleLiteralString returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4711:6: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4712:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4712:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4712:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4712:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4713:5: 
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4723:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4724:1: (lv_value_1_0= RULE_STRING )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4724:1: (lv_value_1_0= RULE_STRING )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4725:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLiteralString8892); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4755:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4756:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4757:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean8933);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();
            _fsp--;

             current =iv_ruleLiteralBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralBoolean8943); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4764:1: ruleLiteralBoolean returns [EObject current=null] : ( () ( (lv_value_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4769:6: ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4770:1: ( () ( (lv_value_1_0= ruleBoolean ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4770:1: ( () ( (lv_value_1_0= ruleBoolean ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4770:2: () ( (lv_value_1_0= ruleBoolean ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4770:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4771:5: 
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4781:2: ( (lv_value_1_0= ruleBoolean ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4782:1: (lv_value_1_0= ruleBoolean )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4782:1: (lv_value_1_0= ruleBoolean )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4783:3: lv_value_1_0= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleLiteralBoolean8998);
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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4813:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4814:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4815:2: iv_ruleBoolean= ruleBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean9035);
            iv_ruleBoolean=ruleBoolean();
            _fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean9046); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4822:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4827:6: ( (kw= 'true' | kw= 'false' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4828:1: (kw= 'true' | kw= 'false' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4828:1: (kw= 'true' | kw= 'false' )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==66) ) {
                alt91=1;
            }
            else if ( (LA91_0==67) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4828:1: (kw= 'true' | kw= 'false' )", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4829:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,66,FollowSets000.FOLLOW_66_in_ruleBoolean9084); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBooleanAccess().getTrueKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4836:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,67,FollowSets000.FOLLOW_67_in_ruleBoolean9103); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4849:1: entryRuleLiteralUnlimitedNatural returns [EObject current=null] : iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF ;
    public final EObject entryRuleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUnlimitedNatural = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4850:2: (iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4851:2: iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural9143);
            iv_ruleLiteralUnlimitedNatural=ruleLiteralUnlimitedNatural();
            _fsp--;

             current =iv_ruleLiteralUnlimitedNatural; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural9153); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4858:1: ruleLiteralUnlimitedNatural returns [EObject current=null] : ( ( (lv_value_0_0= ruleUnlimitedNaturalValue ) ) | ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4863:6: ( ( ( (lv_value_0_0= ruleUnlimitedNaturalValue ) ) | ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4864:1: ( ( (lv_value_0_0= ruleUnlimitedNaturalValue ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4864:1: ( ( (lv_value_0_0= ruleUnlimitedNaturalValue ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==68) ) {
                alt92=1;
            }
            else if ( (LA92_0==RULE_INT) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4864:1: ( ( (lv_value_0_0= ruleUnlimitedNaturalValue ) ) | ( (lv_value_1_0= RULE_INT ) ) )", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4864:2: ( (lv_value_0_0= ruleUnlimitedNaturalValue ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4864:2: ( (lv_value_0_0= ruleUnlimitedNaturalValue ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4865:1: (lv_value_0_0= ruleUnlimitedNaturalValue )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4865:1: (lv_value_0_0= ruleUnlimitedNaturalValue )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4866:3: lv_value_0_0= ruleUnlimitedNaturalValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueUnlimitedNaturalValueParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalValue_in_ruleLiteralUnlimitedNatural9199);
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
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4889:6: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4889:6: ( (lv_value_1_0= RULE_INT ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4890:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4890:1: (lv_value_1_0= RULE_INT )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4891:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLiteralUnlimitedNatural9222); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4921:1: entryRuleUnlimitedNaturalValue returns [String current=null] : iv_ruleUnlimitedNaturalValue= ruleUnlimitedNaturalValue EOF ;
    public final String entryRuleUnlimitedNaturalValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnlimitedNaturalValue = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4922:2: (iv_ruleUnlimitedNaturalValue= ruleUnlimitedNaturalValue EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4923:2: iv_ruleUnlimitedNaturalValue= ruleUnlimitedNaturalValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnlimitedNaturalValueRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalValue_in_entryRuleUnlimitedNaturalValue9264);
            iv_ruleUnlimitedNaturalValue=ruleUnlimitedNaturalValue();
            _fsp--;

             current =iv_ruleUnlimitedNaturalValue.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalValue9275); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4930:1: ruleUnlimitedNaturalValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleUnlimitedNaturalValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4935:6: (kw= '*' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4937:2: kw= '*'
            {
            kw=(Token)input.LT(1);
            match(input,68,FollowSets000.FOLLOW_68_in_ruleUnlimitedNaturalValue9312); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4950:1: entryRuleLiteralNull returns [EObject current=null] : iv_ruleLiteralNull= ruleLiteralNull EOF ;
    public final EObject entryRuleLiteralNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNull = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4951:2: (iv_ruleLiteralNull= ruleLiteralNull EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4952:2: iv_ruleLiteralNull= ruleLiteralNull EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralNullRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull9351);
            iv_ruleLiteralNull=ruleLiteralNull();
            _fsp--;

             current =iv_ruleLiteralNull; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralNull9361); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4959:1: ruleLiteralNull returns [EObject current=null] : ( () 'NULL' ) ;
    public final EObject ruleLiteralNull() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4964:6: ( ( () 'NULL' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4965:1: ( () 'NULL' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4965:1: ( () 'NULL' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4965:2: () 'NULL'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4965:2: ()
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4966:5: 
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

            match(input,69,FollowSets000.FOLLOW_69_in_ruleLiteralNull9405); 

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


    // $ANTLR start entryRuleSubKind
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4988:1: entryRuleSubKind returns [EObject current=null] : iv_ruleSubKind= ruleSubKind EOF ;
    public final EObject entryRuleSubKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubKind = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4989:2: (iv_ruleSubKind= ruleSubKind EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4990:2: iv_ruleSubKind= ruleSubKind EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubKindRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSubKind_in_entryRuleSubKind9441);
            iv_ruleSubKind=ruleSubKind();
            _fsp--;

             current =iv_ruleSubKind; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubKind9451); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:4997:1: ruleSubKind returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isActive_1_0= 'active' ) )? 'subkind' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* )? '}' ) ;
    public final EObject ruleSubKind() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_name_3_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_5_0 = null;

        EObject lv_generalization_7_0 = null;

        EObject lv_ownedAttribute_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5002:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isActive_1_0= 'active' ) )? 'subkind' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* )? '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5003:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isActive_1_0= 'active' ) )? 'subkind' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* )? '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5003:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isActive_1_0= 'active' ) )? 'subkind' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* )? '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5003:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isActive_1_0= 'active' ) )? 'subkind' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* )? '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5003:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==25||(LA93_0>=89 && LA93_0<=91)) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5004:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5004:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5005:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSubKindAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleSubKind9497);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSubKindRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5027:3: ( (lv_isActive_1_0= 'active' ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==70) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5028:1: (lv_isActive_1_0= 'active' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5028:1: (lv_isActive_1_0= 'active' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5029:3: lv_isActive_1_0= 'active'
                    {
                    lv_isActive_1_0=(Token)input.LT(1);
                    match(input,70,FollowSets000.FOLLOW_70_in_ruleSubKind9516); 

                            createLeafNode(grammarAccess.getSubKindAccess().getIsActiveActiveKeyword_1_0(), "isActive"); 
                        

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
                    break;

            }

            match(input,71,FollowSets000.FOLLOW_71_in_ruleSubKind9540); 

                    createLeafNode(grammarAccess.getSubKindAccess().getSubkindKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5052:1: ( (lv_name_3_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5053:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5053:1: (lv_name_3_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5054:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubKind9557); 

            			createLeafNode(grammarAccess.getSubKindAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSubKindRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5076:2: ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==27) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5076:4: ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleSubKind9573); 

                            createLeafNode(grammarAccess.getSubKindAccess().getColonKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5080:1: ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5081:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5081:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5082:3: lv_generalization_5_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSubKindAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleSubKind9594);
                    lv_generalization_5_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSubKindRule().getType().getClassifier());
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5104:2: ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==20) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5104:4: ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleSubKind9605); 

                    	            createLeafNode(grammarAccess.getSubKindAccess().getCommaKeyword_4_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5108:1: ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5109:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5109:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5110:3: lv_generalization_7_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSubKindAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleSubKind9626);
                    	    lv_generalization_7_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSubKindRule().getType().getClassifier());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleSubKind9640); 

                    createLeafNode(grammarAccess.getSubKindAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5136:1: ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==18) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5136:3: 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )*
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleSubKind9651); 

                            createLeafNode(grammarAccess.getSubKindAccess().getAttributesKeyword_6_0(), null); 
                        
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleSubKind9661); 

                            createLeafNode(grammarAccess.getSubKindAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5144:1: ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==25||LA97_0==36||(LA97_0>=89 && LA97_0<=91)) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5145:1: (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5145:1: (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5146:3: lv_ownedAttribute_11_0= ruleInlinePropertyDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSubKindAccess().getOwnedAttributeInlinePropertyDefinitionParserRuleCall_6_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleSubKind9682);
                    	    lv_ownedAttribute_11_0=ruleInlinePropertyDefinition();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSubKindRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedAttribute",
                    	    	        		lv_ownedAttribute_11_0, 
                    	    	        		"InlinePropertyDefinition", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleSubKind9695); 

                    createLeafNode(grammarAccess.getSubKindAccess().getRightCurlyBracketKeyword_7(), null); 
                

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


    // $ANTLR start entryRuleKind
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5180:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5181:2: (iv_ruleKind= ruleKind EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5182:2: iv_ruleKind= ruleKind EOF
            {
             currentNode = createCompositeNode(grammarAccess.getKindRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleKind_in_entryRuleKind9731);
            iv_ruleKind=ruleKind();
            _fsp--;

             current =iv_ruleKind; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKind9741); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5189:1: ruleKind returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'kind' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_4_0 = null;

        EObject lv_generalization_6_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5194:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'kind' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5195:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'kind' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5195:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'kind' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5195:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'kind' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5195:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==25||(LA99_0>=89 && LA99_0<=91)) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5196:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5196:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5197:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getKindAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleKind9787);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getKindRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,72,FollowSets000.FOLLOW_72_in_ruleKind9798); 

                    createLeafNode(grammarAccess.getKindAccess().getKindKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5223:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5224:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5224:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5225:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKind9815); 

            			createLeafNode(grammarAccess.getKindAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getKindRule().getType().getClassifier());
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5247:2: ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==27) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5247:4: ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleKind9831); 

                            createLeafNode(grammarAccess.getKindAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5251:1: ( (lv_generalization_4_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5252:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5252:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5253:3: lv_generalization_4_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getKindAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleKind9852);
                    lv_generalization_4_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getKindRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_4_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5275:2: ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==20) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5275:4: ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleKind9863); 

                    	            createLeafNode(grammarAccess.getKindAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5279:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5280:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5280:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5281:3: lv_generalization_6_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getKindAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleKind9884);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleKind9898); 

                    createLeafNode(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5307:1: ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==18) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5307:3: 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleKind9909); 

                            createLeafNode(grammarAccess.getKindAccess().getAttributesKeyword_5_0(), null); 
                        
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleKind9919); 

                            createLeafNode(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_5_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5315:1: ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==25||LA102_0==36||(LA102_0>=89 && LA102_0<=91)) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5316:1: (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5316:1: (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5317:3: lv_ownedAttribute_10_0= ruleInlinePropertyDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getKindAccess().getOwnedAttributeInlinePropertyDefinitionParserRuleCall_5_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleKind9940);
                    	    lv_ownedAttribute_10_0=ruleInlinePropertyDefinition();
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
                    	    	        		"InlinePropertyDefinition", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleKind9951); 

                            createLeafNode(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_5_3(), null); 
                        

                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleKind9963); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5355:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5356:2: (iv_ruleQuantity= ruleQuantity EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5357:2: iv_ruleQuantity= ruleQuantity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQuantityRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleQuantity_in_entryRuleQuantity9999);
            iv_ruleQuantity=ruleQuantity();
            _fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuantity10009); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5364:1: ruleQuantity returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isActive_1_0= 'active' ) )? 'quantity' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' '}' ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_1_0=null;
        Token lv_name_3_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_5_0 = null;

        EObject lv_generalization_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5369:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isActive_1_0= 'active' ) )? 'quantity' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5370:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isActive_1_0= 'active' ) )? 'quantity' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5370:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isActive_1_0= 'active' ) )? 'quantity' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5370:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isActive_1_0= 'active' ) )? 'quantity' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5370:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==25||(LA104_0>=89 && LA104_0<=91)) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5371:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5371:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5372:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getQuantityAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleQuantity10055);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQuantityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5394:3: ( (lv_isActive_1_0= 'active' ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==70) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5395:1: (lv_isActive_1_0= 'active' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5395:1: (lv_isActive_1_0= 'active' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5396:3: lv_isActive_1_0= 'active'
                    {
                    lv_isActive_1_0=(Token)input.LT(1);
                    match(input,70,FollowSets000.FOLLOW_70_in_ruleQuantity10074); 

                            createLeafNode(grammarAccess.getQuantityAccess().getIsActiveActiveKeyword_1_0(), "isActive"); 
                        

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
                    break;

            }

            match(input,73,FollowSets000.FOLLOW_73_in_ruleQuantity10098); 

                    createLeafNode(grammarAccess.getQuantityAccess().getQuantityKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5419:1: ( (lv_name_3_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5420:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5420:1: (lv_name_3_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5421:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQuantity10115); 

            			createLeafNode(grammarAccess.getQuantityAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQuantityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5443:2: ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==27) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5443:4: ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleQuantity10131); 

                            createLeafNode(grammarAccess.getQuantityAccess().getColonKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5447:1: ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5448:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5448:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5449:3: lv_generalization_5_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getQuantityAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleQuantity10152);
                    lv_generalization_5_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQuantityRule().getType().getClassifier());
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5471:2: ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==20) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5471:4: ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleQuantity10163); 

                    	            createLeafNode(grammarAccess.getQuantityAccess().getCommaKeyword_4_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5475:1: ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5476:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5476:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5477:3: lv_generalization_7_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getQuantityAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleQuantity10184);
                    	    lv_generalization_7_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getQuantityRule().getType().getClassifier());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleQuantity10198); 

                    createLeafNode(grammarAccess.getQuantityAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            match(input,16,FollowSets000.FOLLOW_16_in_ruleQuantity10208); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5515:1: entryRuleCollective returns [EObject current=null] : iv_ruleCollective= ruleCollective EOF ;
    public final EObject entryRuleCollective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollective = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5516:2: (iv_ruleCollective= ruleCollective EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5517:2: iv_ruleCollective= ruleCollective EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectiveRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCollective_in_entryRuleCollective10244);
            iv_ruleCollective=ruleCollective();
            _fsp--;

             current =iv_ruleCollective; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollective10254); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5524:1: ruleCollective returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isExtensional_1_0= 'extensional' ) )? 'collective' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' '}' ) ;
    public final EObject ruleCollective() throws RecognitionException {
        EObject current = null;

        Token lv_isExtensional_1_0=null;
        Token lv_name_3_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_5_0 = null;

        EObject lv_generalization_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5529:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isExtensional_1_0= 'extensional' ) )? 'collective' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5530:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isExtensional_1_0= 'extensional' ) )? 'collective' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5530:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isExtensional_1_0= 'extensional' ) )? 'collective' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5530:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isExtensional_1_0= 'extensional' ) )? 'collective' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5530:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==25||(LA108_0>=89 && LA108_0<=91)) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5531:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5531:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5532:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCollectiveAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleCollective10300);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCollectiveRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5554:3: ( (lv_isExtensional_1_0= 'extensional' ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==74) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5555:1: (lv_isExtensional_1_0= 'extensional' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5555:1: (lv_isExtensional_1_0= 'extensional' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5556:3: lv_isExtensional_1_0= 'extensional'
                    {
                    lv_isExtensional_1_0=(Token)input.LT(1);
                    match(input,74,FollowSets000.FOLLOW_74_in_ruleCollective10319); 

                            createLeafNode(grammarAccess.getCollectiveAccess().getIsExtensionalExtensionalKeyword_1_0(), "isExtensional"); 
                        

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
                    break;

            }

            match(input,75,FollowSets000.FOLLOW_75_in_ruleCollective10343); 

                    createLeafNode(grammarAccess.getCollectiveAccess().getCollectiveKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5579:1: ( (lv_name_3_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5580:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5580:1: (lv_name_3_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5581:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCollective10360); 

            			createLeafNode(grammarAccess.getCollectiveAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectiveRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5603:2: ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==27) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5603:4: ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleCollective10376); 

                            createLeafNode(grammarAccess.getCollectiveAccess().getColonKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5607:1: ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5608:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5608:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5609:3: lv_generalization_5_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCollectiveAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCollective10397);
                    lv_generalization_5_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCollectiveRule().getType().getClassifier());
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5631:2: ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==20) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5631:4: ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleCollective10408); 

                    	            createLeafNode(grammarAccess.getCollectiveAccess().getCommaKeyword_4_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5635:1: ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5636:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5636:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5637:3: lv_generalization_7_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectiveAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCollective10429);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleCollective10443); 

                    createLeafNode(grammarAccess.getCollectiveAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            match(input,16,FollowSets000.FOLLOW_16_in_ruleCollective10453); 

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


    // $ANTLR start entryRulePhase
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5675:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5676:2: (iv_rulePhase= rulePhase EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5677:2: iv_rulePhase= rulePhase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPhaseRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePhase_in_entryRulePhase10489);
            iv_rulePhase=rulePhase();
            _fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhase10499); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5684:1: rulePhase returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'phase' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' '}' ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_4_0 = null;

        EObject lv_generalization_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5689:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'phase' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5690:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'phase' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5690:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'phase' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5690:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'phase' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5690:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==25||(LA112_0>=89 && LA112_0<=91)) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5691:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5691:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5692:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPhaseAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_rulePhase10545);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPhaseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,76,FollowSets000.FOLLOW_76_in_rulePhase10556); 

                    createLeafNode(grammarAccess.getPhaseAccess().getPhaseKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5718:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5719:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5719:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5720:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePhase10573); 

            			createLeafNode(grammarAccess.getPhaseAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPhaseRule().getType().getClassifier());
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5742:2: ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==27) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5742:4: ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rulePhase10589); 

                            createLeafNode(grammarAccess.getPhaseAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5746:1: ( (lv_generalization_4_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5747:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5747:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5748:3: lv_generalization_4_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPhaseAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_rulePhase10610);
                    lv_generalization_4_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPhaseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_4_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5770:2: ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==20) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5770:4: ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_rulePhase10621); 

                    	            createLeafNode(grammarAccess.getPhaseAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5774:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5775:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5775:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5776:3: lv_generalization_6_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPhaseAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_rulePhase10642);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_rulePhase10656); 

                    createLeafNode(grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            match(input,16,FollowSets000.FOLLOW_16_in_rulePhase10666); 

                    createLeafNode(grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5814:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5815:2: (iv_ruleRole= ruleRole EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5816:2: iv_ruleRole= ruleRole EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRoleRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole10702);
            iv_ruleRole=ruleRole();
            _fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole10712); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5823:1: ruleRole returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'role' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_4_0 = null;

        EObject lv_generalization_6_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5828:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'role' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5829:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'role' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5829:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'role' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5829:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'role' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5829:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==25||(LA115_0>=89 && LA115_0<=91)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5830:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5830:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5831:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleRole10758);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,77,FollowSets000.FOLLOW_77_in_ruleRole10769); 

                    createLeafNode(grammarAccess.getRoleAccess().getRoleKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5857:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5858:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5858:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5859:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRole10786); 

            			createLeafNode(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5881:2: ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==27) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5881:4: ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleRole10802); 

                            createLeafNode(grammarAccess.getRoleAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5885:1: ( (lv_generalization_4_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5886:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5886:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5887:3: lv_generalization_4_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRole10823);
                    lv_generalization_4_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_4_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5909:2: ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==20) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5909:4: ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleRole10834); 

                    	            createLeafNode(grammarAccess.getRoleAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5913:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5914:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5914:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5915:3: lv_generalization_6_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRole10855);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleRole10869); 

                    createLeafNode(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5941:1: ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==18) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5941:3: 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleRole10880); 

                            createLeafNode(grammarAccess.getRoleAccess().getAttributesKeyword_5_0(), null); 
                        
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleRole10890); 

                            createLeafNode(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_5_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5949:1: ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==25||LA118_0==36||(LA118_0>=89 && LA118_0<=91)) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5950:1: (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5950:1: (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5951:3: lv_ownedAttribute_10_0= ruleInlinePropertyDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getOwnedAttributeInlinePropertyDefinitionParserRuleCall_5_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleRole10911);
                    	    lv_ownedAttribute_10_0=ruleInlinePropertyDefinition();
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
                    	    	        		"InlinePropertyDefinition", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleRole10922); 

                            createLeafNode(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5_3(), null); 
                        

                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleRole10934); 

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


    // $ANTLR start entryRuleCategory
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5989:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5990:2: (iv_ruleCategory= ruleCategory EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5991:2: iv_ruleCategory= ruleCategory EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCategoryRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_entryRuleCategory10970);
            iv_ruleCategory=ruleCategory();
            _fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCategory10980); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:5998:1: ruleCategory returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isAbstract_1_0= 'abstract' ) ) 'category' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition ) ) )* '}' )? '}' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_1_0=null;
        Token lv_name_3_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_5_0 = null;

        EObject lv_generalization_7_0 = null;

        EObject lv_ownedAttribute_11_0 = null;

        EObject lv_ownedAttribute_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6003:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isAbstract_1_0= 'abstract' ) ) 'category' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition ) ) )* '}' )? '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6004:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isAbstract_1_0= 'abstract' ) ) 'category' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition ) ) )* '}' )? '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6004:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isAbstract_1_0= 'abstract' ) ) 'category' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition ) ) )* '}' )? '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6004:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isAbstract_1_0= 'abstract' ) ) 'category' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition ) ) )* '}' )? '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6004:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==25||(LA120_0>=89 && LA120_0<=91)) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6005:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6005:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6006:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCategoryAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleCategory11026);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6028:3: ( (lv_isAbstract_1_0= 'abstract' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6029:1: (lv_isAbstract_1_0= 'abstract' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6029:1: (lv_isAbstract_1_0= 'abstract' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6030:3: lv_isAbstract_1_0= 'abstract'
            {
            lv_isAbstract_1_0=(Token)input.LT(1);
            match(input,55,FollowSets000.FOLLOW_55_in_ruleCategory11045); 

                    createLeafNode(grammarAccess.getCategoryAccess().getIsAbstractAbstractKeyword_1_0(), "isAbstract"); 
                

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

            match(input,78,FollowSets000.FOLLOW_78_in_ruleCategory11068); 

                    createLeafNode(grammarAccess.getCategoryAccess().getCategoryKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6053:1: ( (lv_name_3_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6054:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6054:1: (lv_name_3_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6055:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCategory11085); 

            			createLeafNode(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6077:2: ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==27) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6077:4: ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleCategory11101); 

                            createLeafNode(grammarAccess.getCategoryAccess().getColonKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6081:1: ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6082:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6082:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6083:3: lv_generalization_5_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCategoryAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCategory11122);
                    lv_generalization_5_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6105:2: ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==20) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6105:4: ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleCategory11133); 

                    	            createLeafNode(grammarAccess.getCategoryAccess().getCommaKeyword_4_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6109:1: ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6110:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6110:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6111:3: lv_generalization_7_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCategoryAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCategory11154);
                    	    lv_generalization_7_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleCategory11168); 

                    createLeafNode(grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6137:1: ( 'ownedAttribute' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition ) ) )* '}' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==79) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6137:3: 'ownedAttribute' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition ) ) )* '}'
                    {
                    match(input,79,FollowSets000.FOLLOW_79_in_ruleCategory11179); 

                            createLeafNode(grammarAccess.getCategoryAccess().getOwnedAttributeKeyword_6_0(), null); 
                        
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleCategory11189); 

                            createLeafNode(grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6145:1: ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6146:1: (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6146:1: (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6147:3: lv_ownedAttribute_11_0= ruleInlinePropertyDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCategoryAccess().getOwnedAttributeInlinePropertyDefinitionParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleCategory11210);
                    lv_ownedAttribute_11_0=ruleInlinePropertyDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"ownedAttribute",
                    	        		lv_ownedAttribute_11_0, 
                    	        		"InlinePropertyDefinition", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6169:2: ( ',' ( (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==20) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6169:4: ',' ( (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleCategory11221); 

                    	            createLeafNode(grammarAccess.getCategoryAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6173:1: ( (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6174:1: (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6174:1: (lv_ownedAttribute_13_0= ruleInlinePropertyDefinition )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6175:3: lv_ownedAttribute_13_0= ruleInlinePropertyDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCategoryAccess().getOwnedAttributeInlinePropertyDefinitionParserRuleCall_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleCategory11242);
                    	    lv_ownedAttribute_13_0=ruleInlinePropertyDefinition();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCategoryRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedAttribute",
                    	    	        		lv_ownedAttribute_13_0, 
                    	    	        		"InlinePropertyDefinition", 
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
                    	    break loop123;
                        }
                    } while (true);

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleCategory11254); 

                            createLeafNode(grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleCategory11266); 

                    createLeafNode(grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_7(), null); 
                

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


    // $ANTLR start entryRuleRoleMixin
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6213:1: entryRuleRoleMixin returns [EObject current=null] : iv_ruleRoleMixin= ruleRoleMixin EOF ;
    public final EObject entryRuleRoleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleMixin = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6214:2: (iv_ruleRoleMixin= ruleRoleMixin EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6215:2: iv_ruleRoleMixin= ruleRoleMixin EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRoleMixinRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleRoleMixin_in_entryRuleRoleMixin11302);
            iv_ruleRoleMixin=ruleRoleMixin();
            _fsp--;

             current =iv_ruleRoleMixin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoleMixin11312); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6222:1: ruleRoleMixin returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'roleMixin' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) ;
    public final EObject ruleRoleMixin() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_4_0 = null;

        EObject lv_generalization_6_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6227:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'roleMixin' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6228:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'roleMixin' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6228:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'roleMixin' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6228:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'roleMixin' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6228:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==25||(LA125_0>=89 && LA125_0<=91)) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6229:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6229:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6230:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRoleMixinAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleRoleMixin11358);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRoleMixinRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,80,FollowSets000.FOLLOW_80_in_ruleRoleMixin11369); 

                    createLeafNode(grammarAccess.getRoleMixinAccess().getRoleMixinKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6256:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6257:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6257:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6258:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRoleMixin11386); 

            			createLeafNode(grammarAccess.getRoleMixinAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRoleMixinRule().getType().getClassifier());
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6280:2: ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==27) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6280:4: ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleRoleMixin11402); 

                            createLeafNode(grammarAccess.getRoleMixinAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6284:1: ( (lv_generalization_4_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6285:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6285:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6286:3: lv_generalization_4_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRoleMixinAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRoleMixin11423);
                    lv_generalization_4_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRoleMixinRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_4_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6308:2: ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==20) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6308:4: ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleRoleMixin11434); 

                    	            createLeafNode(grammarAccess.getRoleMixinAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6312:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6313:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6313:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6314:3: lv_generalization_6_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRoleMixinAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRoleMixin11455);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleRoleMixin11469); 

                    createLeafNode(grammarAccess.getRoleMixinAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6340:1: ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==18) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6340:3: 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleRoleMixin11480); 

                            createLeafNode(grammarAccess.getRoleMixinAccess().getAttributesKeyword_5_0(), null); 
                        
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleRoleMixin11490); 

                            createLeafNode(grammarAccess.getRoleMixinAccess().getLeftCurlyBracketKeyword_5_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6348:1: ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==25||LA128_0==36||(LA128_0>=89 && LA128_0<=91)) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6349:1: (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6349:1: (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6350:3: lv_ownedAttribute_10_0= ruleInlinePropertyDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRoleMixinAccess().getOwnedAttributeInlinePropertyDefinitionParserRuleCall_5_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleRoleMixin11511);
                    	    lv_ownedAttribute_10_0=ruleInlinePropertyDefinition();
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
                    	    	        		"InlinePropertyDefinition", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleRoleMixin11522); 

                            createLeafNode(grammarAccess.getRoleMixinAccess().getRightCurlyBracketKeyword_5_3(), null); 
                        

                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleRoleMixin11534); 

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


    // $ANTLR start entryRuleMixin
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6388:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6389:2: (iv_ruleMixin= ruleMixin EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6390:2: iv_ruleMixin= ruleMixin EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMixinRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleMixin_in_entryRuleMixin11570);
            iv_ruleMixin=ruleMixin();
            _fsp--;

             current =iv_ruleMixin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMixin11580); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6397:1: ruleMixin returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isAbstract_1_0= 'abstract' ) ) 'mixin' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) ;
    public final EObject ruleMixin() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_1_0=null;
        Token lv_name_3_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_5_0 = null;

        EObject lv_generalization_7_0 = null;

        EObject lv_ownedAttribute_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6402:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isAbstract_1_0= 'abstract' ) ) 'mixin' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6403:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isAbstract_1_0= 'abstract' ) ) 'mixin' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6403:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isAbstract_1_0= 'abstract' ) ) 'mixin' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6403:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? ( (lv_isAbstract_1_0= 'abstract' ) ) 'mixin' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* '}' )? '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6403:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==25||(LA130_0>=89 && LA130_0<=91)) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6404:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6404:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6405:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMixinAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleMixin11626);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMixinRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6427:3: ( (lv_isAbstract_1_0= 'abstract' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6428:1: (lv_isAbstract_1_0= 'abstract' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6428:1: (lv_isAbstract_1_0= 'abstract' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6429:3: lv_isAbstract_1_0= 'abstract'
            {
            lv_isAbstract_1_0=(Token)input.LT(1);
            match(input,55,FollowSets000.FOLLOW_55_in_ruleMixin11645); 

                    createLeafNode(grammarAccess.getMixinAccess().getIsAbstractAbstractKeyword_1_0(), "isAbstract"); 
                

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

            match(input,81,FollowSets000.FOLLOW_81_in_ruleMixin11668); 

                    createLeafNode(grammarAccess.getMixinAccess().getMixinKeyword_2(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6452:1: ( (lv_name_3_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6453:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6453:1: (lv_name_3_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6454:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMixin11685); 

            			createLeafNode(grammarAccess.getMixinAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMixinRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6476:2: ( ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )* )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==27) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6476:4: ':' ( (lv_generalization_5_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleMixin11701); 

                            createLeafNode(grammarAccess.getMixinAccess().getColonKeyword_4_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6480:1: ( (lv_generalization_5_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6481:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6481:1: (lv_generalization_5_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6482:3: lv_generalization_5_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMixinAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMixin11722);
                    lv_generalization_5_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMixinRule().getType().getClassifier());
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

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6504:2: ( ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==20) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6504:4: ',' ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleMixin11733); 

                    	            createLeafNode(grammarAccess.getMixinAccess().getCommaKeyword_4_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6508:1: ( (lv_generalization_7_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6509:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6509:1: (lv_generalization_7_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6510:3: lv_generalization_7_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMixinAccess().getGeneralizationInlineGeneralizationParserRuleCall_4_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMixin11754);
                    	    lv_generalization_7_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMixinRule().getType().getClassifier());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop131;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleMixin11768); 

                    createLeafNode(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6536:1: ( 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* '}' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==18) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6536:3: 'attributes:' '{' ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleMixin11779); 

                            createLeafNode(grammarAccess.getMixinAccess().getAttributesKeyword_6_0(), null); 
                        
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleMixin11789); 

                            createLeafNode(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6544:1: ( (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==25||LA133_0==36||(LA133_0>=89 && LA133_0<=91)) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6545:1: (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6545:1: (lv_ownedAttribute_11_0= ruleInlinePropertyDefinition )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6546:3: lv_ownedAttribute_11_0= ruleInlinePropertyDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMixinAccess().getOwnedAttributeInlinePropertyDefinitionParserRuleCall_6_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleMixin11810);
                    	    lv_ownedAttribute_11_0=ruleInlinePropertyDefinition();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMixinRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedAttribute",
                    	    	        		lv_ownedAttribute_11_0, 
                    	    	        		"InlinePropertyDefinition", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleMixin11821); 

                            createLeafNode(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_6_3(), null); 
                        

                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleMixin11833); 

                    createLeafNode(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_7(), null); 
                

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


    // $ANTLR start entryRuleMode
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6584:1: entryRuleMode returns [EObject current=null] : iv_ruleMode= ruleMode EOF ;
    public final EObject entryRuleMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMode = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6585:2: (iv_ruleMode= ruleMode EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6586:2: iv_ruleMode= ruleMode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleMode_in_entryRuleMode11869);
            iv_ruleMode=ruleMode();
            _fsp--;

             current =iv_ruleMode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMode11879); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6593:1: ruleMode returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'mode' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) ;
    public final EObject ruleMode() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_4_0 = null;

        EObject lv_generalization_6_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6598:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'mode' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6599:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'mode' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6599:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'mode' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6599:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'mode' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6599:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==25||(LA135_0>=89 && LA135_0<=91)) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6600:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6600:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6601:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModeAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleMode11925);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,82,FollowSets000.FOLLOW_82_in_ruleMode11936); 

                    createLeafNode(grammarAccess.getModeAccess().getModeKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6627:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6628:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6628:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6629:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMode11953); 

            			createLeafNode(grammarAccess.getModeAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModeRule().getType().getClassifier());
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6651:2: ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==27) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6651:4: ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleMode11969); 

                            createLeafNode(grammarAccess.getModeAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6655:1: ( (lv_generalization_4_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6656:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6656:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6657:3: lv_generalization_4_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModeAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMode11990);
                    lv_generalization_4_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_4_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6679:2: ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==20) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6679:4: ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleMode12001); 

                    	            createLeafNode(grammarAccess.getModeAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6683:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6684:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6684:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6685:3: lv_generalization_6_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModeAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleMode12022);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleMode12036); 

                    createLeafNode(grammarAccess.getModeAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6711:1: ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==18) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6711:3: 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleMode12047); 

                            createLeafNode(grammarAccess.getModeAccess().getAttributesKeyword_5_0(), null); 
                        
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleMode12057); 

                            createLeafNode(grammarAccess.getModeAccess().getLeftCurlyBracketKeyword_5_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6719:1: ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==25||LA138_0==36||(LA138_0>=89 && LA138_0<=91)) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6720:1: (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6720:1: (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6721:3: lv_ownedAttribute_10_0= ruleInlinePropertyDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModeAccess().getOwnedAttributeInlinePropertyDefinitionParserRuleCall_5_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleMode12078);
                    	    lv_ownedAttribute_10_0=ruleInlinePropertyDefinition();
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
                    	    	        		"InlinePropertyDefinition", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleMode12089); 

                            createLeafNode(grammarAccess.getModeAccess().getRightCurlyBracketKeyword_5_3(), null); 
                        

                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleMode12101); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6759:1: entryRuleRelator returns [EObject current=null] : iv_ruleRelator= ruleRelator EOF ;
    public final EObject entryRuleRelator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelator = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6760:2: (iv_ruleRelator= ruleRelator EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6761:2: iv_ruleRelator= ruleRelator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelatorRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleRelator_in_entryRuleRelator12137);
            iv_ruleRelator=ruleRelator();
            _fsp--;

             current =iv_ruleRelator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelator12147); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6768:1: ruleRelator returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'relator' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) ;
    public final EObject ruleRelator() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_4_0 = null;

        EObject lv_generalization_6_0 = null;

        EObject lv_ownedAttribute_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6773:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'relator' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6774:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'relator' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6774:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'relator' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6774:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'relator' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )? '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6774:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==25||(LA140_0>=89 && LA140_0<=91)) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6775:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6775:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6776:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRelatorAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleRelator12193);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,83,FollowSets000.FOLLOW_83_in_ruleRelator12204); 

                    createLeafNode(grammarAccess.getRelatorAccess().getRelatorKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6802:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6803:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6803:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6804:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRelator12221); 

            			createLeafNode(grammarAccess.getRelatorAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6826:2: ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==27) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6826:4: ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleRelator12237); 

                            createLeafNode(grammarAccess.getRelatorAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6830:1: ( (lv_generalization_4_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6831:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6831:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6832:3: lv_generalization_4_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRelatorAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRelator12258);
                    lv_generalization_4_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_4_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6854:2: ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==20) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6854:4: ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleRelator12269); 

                    	            createLeafNode(grammarAccess.getRelatorAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6858:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6859:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6859:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6860:3: lv_generalization_6_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRelatorAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleRelator12290);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleRelator12304); 

                    createLeafNode(grammarAccess.getRelatorAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6886:1: ( 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}' )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==18) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6886:3: 'attributes:' '{' ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )* '}'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleRelator12315); 

                            createLeafNode(grammarAccess.getRelatorAccess().getAttributesKeyword_5_0(), null); 
                        
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleRelator12325); 

                            createLeafNode(grammarAccess.getRelatorAccess().getLeftCurlyBracketKeyword_5_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6894:1: ( (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition ) )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==25||LA143_0==36||(LA143_0>=89 && LA143_0<=91)) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6895:1: (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6895:1: (lv_ownedAttribute_10_0= ruleInlinePropertyDefinition )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6896:3: lv_ownedAttribute_10_0= ruleInlinePropertyDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRelatorAccess().getOwnedAttributeInlinePropertyDefinitionParserRuleCall_5_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleRelator12346);
                    	    lv_ownedAttribute_10_0=ruleInlinePropertyDefinition();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRelatorRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedAttribute",
                    	    	        		lv_ownedAttribute_10_0, 
                    	    	        		"InlinePropertyDefinition", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop143;
                        }
                    } while (true);

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleRelator12357); 

                            createLeafNode(grammarAccess.getRelatorAccess().getRightCurlyBracketKeyword_5_3(), null); 
                        

                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleRelator12369); 

                    createLeafNode(grammarAccess.getRelatorAccess().getRightCurlyBracketKeyword_6(), null); 
                

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


    // $ANTLR start entryRuleCharacterization
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6934:1: entryRuleCharacterization returns [EObject current=null] : iv_ruleCharacterization= ruleCharacterization EOF ;
    public final EObject entryRuleCharacterization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterization = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6935:2: (iv_ruleCharacterization= ruleCharacterization EOF )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6936:2: iv_ruleCharacterization= ruleCharacterization EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCharacterizationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_entryRuleCharacterization12405);
            iv_ruleCharacterization=ruleCharacterization();
            _fsp--;

             current =iv_ruleCharacterization; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacterization12415); 

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
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6943:1: ruleCharacterization returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'Characterization' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' 'memberEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'navigableOwnedEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'ownedEnd' '{' ( (lv_ownedEnd_22_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedEnd_24_0= ruleInlinePropertyDefinition ) ) )* '}' )? '}' ) ;
    public final EObject ruleCharacterization() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_generalization_4_0 = null;

        EObject lv_generalization_6_0 = null;

        EObject lv_ownedEnd_22_0 = null;

        EObject lv_ownedEnd_24_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6948:6: ( ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'Characterization' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' 'memberEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'navigableOwnedEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'ownedEnd' '{' ( (lv_ownedEnd_22_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedEnd_24_0= ruleInlinePropertyDefinition ) ) )* '}' )? '}' ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6949:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'Characterization' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' 'memberEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'navigableOwnedEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'ownedEnd' '{' ( (lv_ownedEnd_22_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedEnd_24_0= ruleInlinePropertyDefinition ) ) )* '}' )? '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6949:1: ( ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'Characterization' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' 'memberEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'navigableOwnedEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'ownedEnd' '{' ( (lv_ownedEnd_22_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedEnd_24_0= ruleInlinePropertyDefinition ) ) )* '}' )? '}' )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6949:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )? 'Characterization' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )? '{' 'memberEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'navigableOwnedEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'ownedEnd' '{' ( (lv_ownedEnd_22_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedEnd_24_0= ruleInlinePropertyDefinition ) ) )* '}' )? '}'
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6949:2: ( (lv_visibility_0_0= ruleVisibilityKind ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==25||(LA145_0>=89 && LA145_0<=91)) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6950:1: (lv_visibility_0_0= ruleVisibilityKind )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6950:1: (lv_visibility_0_0= ruleVisibilityKind )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6951:3: lv_visibility_0_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCharacterizationAccess().getVisibilityVisibilityKindEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleCharacterization12461);
                    lv_visibility_0_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_0_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,84,FollowSets000.FOLLOW_84_in_ruleCharacterization12472); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getCharacterizationKeyword_1(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6977:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6978:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6978:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:6979:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCharacterization12489); 

            			createLeafNode(grammarAccess.getCharacterizationAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
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

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7001:2: ( ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )* )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==27) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7001:4: ':' ( (lv_generalization_4_0= ruleInlineGeneralization ) ) ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleCharacterization12505); 

                            createLeafNode(grammarAccess.getCharacterizationAccess().getColonKeyword_3_0(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7005:1: ( (lv_generalization_4_0= ruleInlineGeneralization ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7006:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7006:1: (lv_generalization_4_0= ruleInlineGeneralization )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7007:3: lv_generalization_4_0= ruleInlineGeneralization
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCharacterizationAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCharacterization12526);
                    lv_generalization_4_0=ruleInlineGeneralization();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"generalization",
                    	        		lv_generalization_4_0, 
                    	        		"InlineGeneralization", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7029:2: ( ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) ) )*
                    loop146:
                    do {
                        int alt146=2;
                        int LA146_0 = input.LA(1);

                        if ( (LA146_0==20) ) {
                            alt146=1;
                        }


                        switch (alt146) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7029:4: ',' ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleCharacterization12537); 

                    	            createLeafNode(grammarAccess.getCharacterizationAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7033:1: ( (lv_generalization_6_0= ruleInlineGeneralization ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7034:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7034:1: (lv_generalization_6_0= ruleInlineGeneralization )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7035:3: lv_generalization_6_0= ruleInlineGeneralization
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCharacterizationAccess().getGeneralizationInlineGeneralizationParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineGeneralization_in_ruleCharacterization12558);
                    	    lv_generalization_6_0=ruleInlineGeneralization();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop146;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleCharacterization12572); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            match(input,52,FollowSets000.FOLLOW_52_in_ruleCharacterization12582); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getMemberEndKeyword_5(), null); 
                
            match(input,22,FollowSets000.FOLLOW_22_in_ruleCharacterization12592); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getLeftParenthesisKeyword_6(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7069:1: ( ( RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7070:1: ( RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7070:1: ( RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7071:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCharacterization12610); 

            		createLeafNode(grammarAccess.getCharacterizationAccess().getMemberEndPropertyCrossReference_7_0(), "memberEnd"); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7083:2: ( ',' ( ( RULE_ID ) ) )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==20) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7083:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,20,FollowSets000.FOLLOW_20_in_ruleCharacterization12621); 

            	            createLeafNode(grammarAccess.getCharacterizationAccess().getCommaKeyword_8_0(), null); 
            	        
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7087:1: ( ( RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7088:1: ( RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7088:1: ( RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7089:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCharacterization12639); 

            	    		createLeafNode(grammarAccess.getCharacterizationAccess().getMemberEndPropertyCrossReference_8_1_0(), "memberEnd"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop148;
                }
            } while (true);

            match(input,23,FollowSets000.FOLLOW_23_in_ruleCharacterization12651); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getRightParenthesisKeyword_9(), null); 
                
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7105:1: ( 'navigableOwnedEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==53) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7105:3: 'navigableOwnedEnd' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleCharacterization12662); 

                            createLeafNode(grammarAccess.getCharacterizationAccess().getNavigableOwnedEndKeyword_10_0(), null); 
                        
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleCharacterization12672); 

                            createLeafNode(grammarAccess.getCharacterizationAccess().getLeftParenthesisKeyword_10_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7113:1: ( ( RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7114:1: ( RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7114:1: ( RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7115:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCharacterization12690); 

                    		createLeafNode(grammarAccess.getCharacterizationAccess().getNavigableOwnedEndPropertyCrossReference_10_2_0(), "navigableOwnedEnd"); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7127:2: ( ',' ( ( RULE_ID ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==20) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7127:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleCharacterization12701); 

                    	            createLeafNode(grammarAccess.getCharacterizationAccess().getCommaKeyword_10_3_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7131:1: ( ( RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7132:1: ( RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7132:1: ( RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7133:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCharacterization12719); 

                    	    		createLeafNode(grammarAccess.getCharacterizationAccess().getNavigableOwnedEndPropertyCrossReference_10_3_1_0(), "navigableOwnedEnd"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    match(input,23,FollowSets000.FOLLOW_23_in_ruleCharacterization12731); 

                            createLeafNode(grammarAccess.getCharacterizationAccess().getRightParenthesisKeyword_10_4(), null); 
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7149:3: ( 'ownedEnd' '{' ( (lv_ownedEnd_22_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedEnd_24_0= ruleInlinePropertyDefinition ) ) )* '}' )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==85) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7149:5: 'ownedEnd' '{' ( (lv_ownedEnd_22_0= ruleInlinePropertyDefinition ) ) ( ',' ( (lv_ownedEnd_24_0= ruleInlinePropertyDefinition ) ) )* '}'
                    {
                    match(input,85,FollowSets000.FOLLOW_85_in_ruleCharacterization12744); 

                            createLeafNode(grammarAccess.getCharacterizationAccess().getOwnedEndKeyword_11_0(), null); 
                        
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleCharacterization12754); 

                            createLeafNode(grammarAccess.getCharacterizationAccess().getLeftCurlyBracketKeyword_11_1(), null); 
                        
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7157:1: ( (lv_ownedEnd_22_0= ruleInlinePropertyDefinition ) )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7158:1: (lv_ownedEnd_22_0= ruleInlinePropertyDefinition )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7158:1: (lv_ownedEnd_22_0= ruleInlinePropertyDefinition )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7159:3: lv_ownedEnd_22_0= ruleInlinePropertyDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCharacterizationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_11_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleCharacterization12775);
                    lv_ownedEnd_22_0=ruleInlinePropertyDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"ownedEnd",
                    	        		lv_ownedEnd_22_0, 
                    	        		"InlinePropertyDefinition", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7181:2: ( ',' ( (lv_ownedEnd_24_0= ruleInlinePropertyDefinition ) ) )*
                    loop151:
                    do {
                        int alt151=2;
                        int LA151_0 = input.LA(1);

                        if ( (LA151_0==20) ) {
                            alt151=1;
                        }


                        switch (alt151) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7181:4: ',' ( (lv_ownedEnd_24_0= ruleInlinePropertyDefinition ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleCharacterization12786); 

                    	            createLeafNode(grammarAccess.getCharacterizationAccess().getCommaKeyword_11_3_0(), null); 
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7185:1: ( (lv_ownedEnd_24_0= ruleInlinePropertyDefinition ) )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7186:1: (lv_ownedEnd_24_0= ruleInlinePropertyDefinition )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7186:1: (lv_ownedEnd_24_0= ruleInlinePropertyDefinition )
                    	    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7187:3: lv_ownedEnd_24_0= ruleInlinePropertyDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCharacterizationAccess().getOwnedEndInlinePropertyDefinitionParserRuleCall_11_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlinePropertyDefinition_in_ruleCharacterization12807);
                    	    lv_ownedEnd_24_0=ruleInlinePropertyDefinition();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCharacterizationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedEnd",
                    	    	        		lv_ownedEnd_24_0, 
                    	    	        		"InlinePropertyDefinition", 
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
                    	    break loop151;
                        }
                    } while (true);

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleCharacterization12819); 

                            createLeafNode(grammarAccess.getCharacterizationAccess().getRightCurlyBracketKeyword_11_4(), null); 
                        

                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleCharacterization12831); 

                    createLeafNode(grammarAccess.getCharacterizationAccess().getRightCurlyBracketKeyword_12(), null); 
                

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


    // $ANTLR start ruleAggregationKind
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7225:1: ruleAggregationKind returns [Enumerator current=null] : ( ( 'none' ) | ( 'shared' ) | ( 'composite' ) ) ;
    public final Enumerator ruleAggregationKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7229:6: ( ( ( 'none' ) | ( 'shared' ) | ( 'composite' ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7230:1: ( ( 'none' ) | ( 'shared' ) | ( 'composite' ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7230:1: ( ( 'none' ) | ( 'shared' ) | ( 'composite' ) )
            int alt153=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt153=1;
                }
                break;
            case 87:
                {
                alt153=2;
                }
                break;
            case 88:
                {
                alt153=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("7230:1: ( ( 'none' ) | ( 'shared' ) | ( 'composite' ) )", 153, 0, input);

                throw nvae;
            }

            switch (alt153) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7230:2: ( 'none' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7230:2: ( 'none' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7230:4: 'none'
                    {
                    match(input,86,FollowSets000.FOLLOW_86_in_ruleAggregationKind12879); 

                            current = grammarAccess.getAggregationKindAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAggregationKindAccess().getNoneEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7236:6: ( 'shared' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7236:6: ( 'shared' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7236:8: 'shared'
                    {
                    match(input,87,FollowSets000.FOLLOW_87_in_ruleAggregationKind12894); 

                            current = grammarAccess.getAggregationKindAccess().getSharedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAggregationKindAccess().getSharedEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7242:6: ( 'composite' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7242:6: ( 'composite' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7242:8: 'composite'
                    {
                    match(input,88,FollowSets000.FOLLOW_88_in_ruleAggregationKind12909); 

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


    // $ANTLR start ruleVisibilityKind
    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7252:1: ruleVisibilityKind returns [Enumerator current=null] : ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) ) ;
    public final Enumerator ruleVisibilityKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7256:6: ( ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) ) )
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7257:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )
            {
            // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7257:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )
            int alt154=4;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt154=1;
                }
                break;
            case 90:
                {
                alt154=2;
                }
                break;
            case 91:
                {
                alt154=3;
                }
                break;
            case 25:
                {
                alt154=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("7257:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7257:2: ( 'public' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7257:2: ( 'public' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7257:4: 'public'
                    {
                    match(input,89,FollowSets000.FOLLOW_89_in_ruleVisibilityKind12952); 

                            current = grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7263:6: ( 'private' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7263:6: ( 'private' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7263:8: 'private'
                    {
                    match(input,90,FollowSets000.FOLLOW_90_in_ruleVisibilityKind12967); 

                            current = grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7269:6: ( 'protected' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7269:6: ( 'protected' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7269:8: 'protected'
                    {
                    match(input,91,FollowSets000.FOLLOW_91_in_ruleVisibilityKind12982); 

                            current = grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7275:6: ( 'package' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7275:6: ( 'package' )
                    // ../br.ufes.inf.nemo.ontouml.dsl/src-gen/br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.g:7275:8: 'package'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_ruleVisibilityKind12997); 

                            current = grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3(), null); 
                        

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
    // $ANTLR end ruleVisibilityKind


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA4_eotS =
        "\65\uffff";
    static final String DFA4_eofS =
        "\65\uffff";
    static final String DFA4_minS =
        "\4\21\1\4\7\uffff\1\107\5\uffff\1\66\4\uffff\2\66\4\uffff\3\66\4"+
        "\uffff\3\66\3\uffff\2\66\3\uffff\2\66\2\uffff\1\66\1\uffff";
    static final String DFA4_maxS =
        "\1\133\4\124\7\uffff\1\111\5\uffff\1\121\4\uffff\2\75\4\uffff\1"+
        "\75\1\121\1\75\4\uffff\3\75\3\uffff\2\75\3\uffff\2\75\2\uffff\1"+
        "\75\1\uffff";
    static final String DFA4_acceptS =
        "\5\uffff\1\1\1\2\3\4\1\5\1\6\1\uffff\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\15\1\16\1\17\1\20\2\uffff\1\21\1\22\1\25\1\26\3\uffff\1\3\1\24"+
        "\1\14\1\22\3\uffff\1\21\1\23\1\22\2\uffff\1\21\1\23\1\21\2\uffff"+
        "\1\23\1\22\1\uffff\1\23";
    static final String DFA4_specialS =
        "\1\6\21\uffff\1\7\4\uffff\1\10\1\3\13\uffff\1\0\1\11\1\4\3\uffff"+
        "\1\1\1\5\3\uffff\1\12\1\2\4\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\12\1\uffff\1\5\4\uffff\1\6\1\4\3\uffff\1\7\1\10\1\11\22\uffff"+
            "\1\26\3\uffff\1\27\1\22\1\30\1\31\3\uffff\1\32\1\uffff\1\13"+
            "\6\uffff\1\14\1\15\1\16\1\34\2\33\1\17\1\20\2\uffff\1\21\1\uffff"+
            "\1\23\1\24\1\25\4\uffff\1\1\1\2\1\3",
            "\1\12\1\uffff\1\5\4\uffff\1\6\1\40\3\uffff\3\11\22\uffff\1\26"+
            "\3\uffff\1\35\1\36\1\37\1\31\3\uffff\1\32\1\uffff\1\13\6\uffff"+
            "\1\14\1\15\1\16\1\34\2\33\1\17\1\20\2\uffff\1\21\1\uffff\1\23"+
            "\1\24\1\25",
            "\1\12\1\uffff\1\5\4\uffff\1\6\1\40\3\uffff\3\11\22\uffff\1\26"+
            "\3\uffff\1\35\1\36\1\37\1\31\3\uffff\1\32\1\uffff\1\13\6\uffff"+
            "\1\14\1\15\1\16\1\34\2\33\1\17\1\20\2\uffff\1\21\1\uffff\1\23"+
            "\1\24\1\25",
            "\1\12\1\uffff\1\5\4\uffff\1\6\1\40\3\uffff\3\11\22\uffff\1\26"+
            "\3\uffff\1\35\1\36\1\37\1\31\3\uffff\1\32\1\uffff\1\13\6\uffff"+
            "\1\14\1\15\1\16\1\34\2\33\1\17\1\20\2\uffff\1\21\1\uffff\1\23"+
            "\1\24\1\25",
            "\1\40\14\uffff\1\12\1\uffff\1\5\4\uffff\1\6\1\40\3\uffff\3\11"+
            "\22\uffff\1\26\3\uffff\1\35\1\36\1\37\1\31\3\uffff\1\32\1\uffff"+
            "\1\13\6\uffff\1\14\1\15\1\16\1\34\2\33\1\17\1\20\2\uffff\1\21"+
            "\1\uffff\1\23\1\24\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\1\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "\1\45\1\44\1\46\1\47\2\uffff\1\50\1\43\20\uffff\1\41\2\uffff"+
            "\1\42",
            "",
            "",
            "",
            "",
            "\1\27\1\52\1\53\1\54\2\uffff\1\55\1\51",
            "\1\57\1\60\1\30\1\56\2\uffff\1\61\1\62",
            "",
            "",
            "",
            "",
            "\1\35\1\63\1\37\1\31\2\uffff\1\64\1\32",
            "\1\35\1\63\1\37\1\31\2\uffff\1\64\1\32\20\uffff\1\41\2\uffff"+
            "\1\42",
            "\1\35\1\63\1\37\1\31\2\uffff\1\64\1\32",
            "",
            "",
            "",
            "",
            "\1\45\1\44\1\46\1\47\2\uffff\1\50\1\43",
            "\1\45\1\44\1\46\1\47\2\uffff\1\50\1\43",
            "\1\45\1\44\1\46\1\47\2\uffff\1\50\1\43",
            "",
            "",
            "",
            "\1\27\1\52\1\53\1\54\2\uffff\1\55\1\51",
            "\1\27\1\52\1\53\1\54\2\uffff\1\55\1\51",
            "",
            "",
            "",
            "\1\57\1\60\1\30\1\56\2\uffff\1\61\1\62",
            "\1\57\1\60\1\30\1\56\2\uffff\1\61\1\62",
            "",
            "",
            "\1\35\1\63\1\37\1\31\2\uffff\1\64\1\32",
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
            return "239:1: (this_Dependency_0= ruleDependency | this_Constraintx_1= ruleConstraintx | this_Package_Impl_2= rulePackage_Impl | this_GeneralizationSet_3= ruleGeneralizationSet | this_DataType_Impl_4= ruleDataType_Impl | this_InstanceSpecification_Impl_5= ruleInstanceSpecification_Impl | this_SubKind_6= ruleSubKind | this_Kind_7= ruleKind | this_Phase_8= rulePhase | this_Role_9= ruleRole | this_RoleMixin_10= ruleRoleMixin | this_Mixin_11= ruleMixin | this_Mode_12= ruleMode | this_Relator_13= ruleRelator | this_Characterization_14= ruleCharacterization | this_Mediation_15= ruleMediation | this_Derivation_16= ruleDerivation | this_FormalAssociation_17= ruleFormalAssociation | this_MaterialAssociation_18= ruleMaterialAssociation | this_Category_19= ruleCategory | this_Collective_20= ruleCollective | this_Quantity_21= ruleQuantity )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_36 = input.LA(1);

                         
                        int index4_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_36 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0) ) {s = 35;}

                        else if ( LA4_36 ==55 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 36;}

                        else if ( LA4_36 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 37;}

                        else if ( LA4_36 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 38;}

                        else if ( LA4_36 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1) ) {s = 39;}

                        else if ( LA4_36 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1) ) {s = 40;}

                         
                        input.seek(index4_36);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_42 = input.LA(1);

                         
                        int index4_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_42 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1) ) {s = 41;}

                        else if ( LA4_42 ==55 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {s = 42;}

                        else if ( LA4_42 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {s = 23;}

                        else if ( LA4_42 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {s = 43;}

                        else if ( LA4_42 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0) ) {s = 44;}

                        else if ( LA4_42 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0) ) {s = 45;}

                         
                        input.seek(index4_42);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_48 = input.LA(1);

                         
                        int index4_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_48 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2) ) {s = 50;}

                        else if ( LA4_48 ==55 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {s = 48;}

                        else if ( LA4_48 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {s = 47;}

                        else if ( LA4_48 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {s = 24;}

                        else if ( LA4_48 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2) ) {s = 46;}

                        else if ( LA4_48 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2) ) {s = 49;}

                         
                        input.seek(index4_48);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_24 = input.LA(1);

                         
                        int index4_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_24 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2) ) {s = 46;}

                        else if ( LA4_24 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {s = 47;}

                        else if ( LA4_24 ==55 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {s = 48;}

                        else if ( LA4_24 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {s = 24;}

                        else if ( LA4_24 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2) ) {s = 49;}

                        else if ( LA4_24 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2) ) {s = 50;}

                         
                        input.seek(index4_24);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_38 = input.LA(1);

                         
                        int index4_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_38 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1) ) {s = 39;}

                        else if ( LA4_38 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 37;}

                        else if ( LA4_38 ==55 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 36;}

                        else if ( LA4_38 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 38;}

                        else if ( LA4_38 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1) ) {s = 40;}

                        else if ( LA4_38 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0) ) {s = 35;}

                         
                        input.seek(index4_38);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_43 = input.LA(1);

                         
                        int index4_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_43 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0) ) {s = 44;}

                        else if ( LA4_43 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {s = 23;}

                        else if ( LA4_43 ==55 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {s = 42;}

                        else if ( LA4_43 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {s = 43;}

                        else if ( LA4_43 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0) ) {s = 45;}

                        else if ( LA4_43 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1) ) {s = 41;}

                         
                        input.seek(index4_43);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_0 = input.LA(1);

                         
                        int index4_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_0==89) ) {s = 1;}

                        else if ( (LA4_0==90) ) {s = 2;}

                        else if ( (LA4_0==91) ) {s = 3;}

                        else if ( (LA4_0==25) ) {s = 4;}

                        else if ( (LA4_0==19) ) {s = 5;}

                        else if ( (LA4_0==24) ) {s = 6;}

                        else if ( LA4_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {s = 7;}

                        else if ( LA4_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {s = 8;}

                        else if ( (LA4_0==31) ) {s = 9;}

                        else if ( (LA4_0==17) ) {s = 10;}

                        else if ( (LA4_0==63) ) {s = 11;}

                        else if ( (LA4_0==70) ) {s = 12;}

                        else if ( (LA4_0==71) ) {s = 13;}

                        else if ( (LA4_0==72) ) {s = 14;}

                        else if ( (LA4_0==76) ) {s = 15;}

                        else if ( (LA4_0==77) ) {s = 16;}

                        else if ( (LA4_0==80) ) {s = 17;}

                        else if ( (LA4_0==55) ) {s = 18;}

                        else if ( (LA4_0==82) ) {s = 19;}

                        else if ( (LA4_0==83) ) {s = 20;}

                        else if ( (LA4_0==84) ) {s = 21;}

                        else if ( (LA4_0==50) ) {s = 22;}

                        else if ( LA4_0 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {s = 23;}

                        else if ( LA4_0 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {s = 24;}

                        else if ( (LA4_0==57) ) {s = 25;}

                        else if ( (LA4_0==61) ) {s = 26;}

                        else if ( ((LA4_0>=74 && LA4_0<=75)) ) {s = 27;}

                        else if ( (LA4_0==73) ) {s = 28;}

                         
                        input.seek(index4_0);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_18 = input.LA(1);

                         
                        int index4_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_18==78) ) {s = 33;}

                        else if ( (LA4_18==81) ) {s = 34;}

                        else if ( LA4_18 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0) ) {s = 35;}

                        else if ( LA4_18 ==55 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 36;}

                        else if ( LA4_18 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 37;}

                        else if ( LA4_18 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 38;}

                        else if ( LA4_18 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1) ) {s = 39;}

                        else if ( LA4_18 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1) ) {s = 40;}

                         
                        input.seek(index4_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA4_23 = input.LA(1);

                         
                        int index4_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_23 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1) ) {s = 41;}

                        else if ( LA4_23 ==55 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {s = 42;}

                        else if ( LA4_23 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {s = 23;}

                        else if ( LA4_23 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0)) ) {s = 43;}

                        else if ( LA4_23 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 0) ) {s = 44;}

                        else if ( LA4_23 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 0) ) {s = 45;}

                         
                        input.seek(index4_23);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA4_37 = input.LA(1);

                         
                        int index4_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_37 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0) ) {s = 35;}

                        else if ( LA4_37 ==55 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 36;}

                        else if ( LA4_37 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 37;}

                        else if ( LA4_37 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 0)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1)||getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1)) ) {s = 38;}

                        else if ( LA4_37 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 1) ) {s = 39;}

                        else if ( LA4_37 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 1) ) {s = 40;}

                         
                        input.seek(index4_37);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA4_47 = input.LA(1);

                         
                        int index4_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_47 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2) ) {s = 50;}

                        else if ( LA4_47 ==55 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {s = 48;}

                        else if ( LA4_47 ==54 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {s = 47;}

                        else if ( LA4_47 ==56 && (getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getFormalAssociationAccess().getUnorderedGroup_2(), 2)||getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2)) ) {s = 24;}

                        else if ( LA4_47 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAccess().getUnorderedGroup_1(), 2) ) {s = 46;}

                        else if ( LA4_47 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAssociationAccess().getUnorderedGroup_2(), 2) ) {s = 49;}

                         
                        input.seek(index4_47);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\6\uffff";
    static final String DFA29_eofS =
        "\6\uffff";
    static final String DFA29_minS =
        "\1\4\1\uffff\2\5\2\uffff";
    static final String DFA29_maxS =
        "\1\133\1\uffff\2\133\2\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2";
    static final String DFA29_specialS =
        "\6\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\1\1\1\3\1\1\16\uffff\1\1\2\uffff\1\1\6\uffff\1\1\36\uffff"+
            "\1\1\2\uffff\2\1\1\uffff\1\1\23\uffff\3\1",
            "",
            "\1\5\1\uffff\1\5\7\uffff\1\4\6\uffff\1\5\2\uffff\1\5\6\uffff"+
            "\1\5\36\uffff\1\5\2\uffff\2\5\1\uffff\1\5\23\uffff\3\5",
            "\1\5\1\3\1\5\7\uffff\1\4\6\uffff\1\5\2\uffff\1\5\6\uffff\1\5"+
            "\36\uffff\1\5\2\uffff\2\5\1\uffff\1\5\23\uffff\3\5",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1545:1: ( ( ( (lv_operand_2_0= ruleValueSpecification ) ) ( (lv_symbol_3_0= ruleExpressionSymbol ) ) ( (lv_operand_4_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_5_0= ruleExpressionSymbol ) ) ( (lv_operand_6_0= ruleValueSpecification ) ) ) | ( ( (lv_symbol_7_0= ruleExpressionSymbol ) ) '{' ( (lv_operand_9_0= ruleValueSpecification ) ) ( ',' ( (lv_operand_11_0= ruleValueSpecification ) ) )+ '}' ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleModel140 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleModel151 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModel168 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleModel184 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleModel201 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleModel218 = new BitSet(new long[]{0xA3C40000E30B0000L,0x000000000E1D3FC0L});
        public static final BitSet FOLLOW_rulePackageableElement_in_ruleModel239 = new BitSet(new long[]{0xA3C40000E30B0000L,0x000000000E1D3FC0L});
        public static final BitSet FOLLOW_16_in_ruleModel250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_entryRulePackageableElement286 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackageableElement296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rulePackageableElement343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraintx_in_rulePackageableElement370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_rulePackageableElement397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralizationSet_in_rulePackageableElement424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_Impl_in_rulePackageableElement451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstanceSpecification_Impl_in_rulePackageableElement478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubKind_in_rulePackageableElement505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_rulePackageableElement532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhase_in_rulePackageableElement559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rulePackageableElement586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoleMixin_in_rulePackageableElement613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_rulePackageableElement640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMode_in_rulePackageableElement667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelator_in_rulePackageableElement694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterization_in_rulePackageableElement721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMediation_in_rulePackageableElement748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDerivation_in_rulePackageableElement775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormalAssociation_in_rulePackageableElement802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMaterialAssociation_in_rulePackageableElement829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_rulePackageableElement856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollective_in_rulePackageableElement883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantity_in_rulePackageableElement910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonExpressionValue_in_entryRuleNonExpressionValue945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNonExpressionValue955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_ruleNonExpressionValue1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_ruleNonExpressionValue1029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralNull_in_ruleNonExpressionValue1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_ruleNonExpressionValue1083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstanceValue_in_ruleNonExpressionValue1110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpaqueExpression_in_ruleNonExpressionValue1137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification1172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification1182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonExpressionValue_in_ruleValueSpecification1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionValue_in_ruleValueSpecification1256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_Impl_in_entryRuleDataType_Impl1291 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataType_Impl1301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleDataType_Impl1347 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDataType_Impl1358 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataType_Impl1375 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleDataType_Impl1391 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleDataType_Impl1402 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDataType_Impl1412 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleDataType_Impl1433 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_16_in_ruleDataType_Impl1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency1486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDependency1496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleDependency1551 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDependency1562 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependency1579 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDependency1595 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependency1613 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleDependency1624 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependency1642 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_21_in_ruleDependency1654 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleDependency1664 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependency1682 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_20_in_ruleDependency1693 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependency1711 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_23_in_ruleDependency1723 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDependency1733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraintx_in_entryRuleConstraintx1773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraintx1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleConstraintx1829 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleConstraintx1840 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_22_in_ruleConstraintx1851 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstraintx1869 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_20_in_ruleConstraintx1880 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstraintx1898 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_23_in_ruleConstraintx1910 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConstraintx1922 = new BitSet(new long[]{0x80000001024000A0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleConstraintx1943 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConstraintx1953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageMerge_in_entryRulePackageMerge1989 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackageMerge1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePackageMerge2051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl2087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage_Impl2097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_rulePackage_Impl2152 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulePackage_Impl2163 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePackage_Impl2180 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePackage_Impl2195 = new BitSet(new long[]{0xA3C40000E70B0000L,0x000000000E1D3FC0L});
        public static final BitSet FOLLOW_26_in_rulePackage_Impl2206 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulePackage_Impl2216 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rulePackageMerge_in_rulePackage_Impl2237 = new BitSet(new long[]{0xA3C40000E31B0000L,0x000000000E1D3FC0L});
        public static final BitSet FOLLOW_20_in_rulePackage_Impl2248 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rulePackageMerge_in_rulePackage_Impl2269 = new BitSet(new long[]{0xA3C40000E31B0000L,0x000000000E1D3FC0L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rulePackage_Impl2294 = new BitSet(new long[]{0xA3C40000E30B0000L,0x000000000E1D3FC0L});
        public static final BitSet FOLLOW_16_in_rulePackage_Impl2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_entryRuleInlineGeneralization2341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineGeneralization2351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleInlineGeneralization2394 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlineGeneralization2426 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleInlineGeneralization2437 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlineGeneralization2455 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleInlineGeneralization2465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralizationSet_in_entryRuleGeneralizationSet2505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneralizationSet2515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleGeneralizationSet2561 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_29_in_ruleGeneralizationSet2622 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_30_in_ruleGeneralizationSet2703 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_31_in_ruleGeneralizationSet2765 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralizationSet2782 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGeneralizationSet2797 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleGeneralizationSet2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionSymbol_in_entryRuleExpressionSymbol2844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionSymbol2855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionSymbol2895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleExpressionSymbol2922 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_ruleExpressionValue_in_entryRuleExpressionValue2969 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionValue2979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleExpressionValue3023 = new BitSet(new long[]{0x80000001024000F0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleExpressionValue3046 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue3067 = new BitSet(new long[]{0x80000001024000A0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleExpressionValue3088 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue3117 = new BitSet(new long[]{0x80000001024000A0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleExpressionValue3138 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleExpressionSymbol_in_ruleExpressionValue3167 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExpressionValue3177 = new BitSet(new long[]{0x80000001024000A0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleExpressionValue3198 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleExpressionValue3209 = new BitSet(new long[]{0x80000001024000A0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleExpressionValue3230 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_16_in_ruleExpressionValue3242 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleExpressionValue3254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpaqueExpression_in_entryRuleOpaqueExpression3290 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpaqueExpression3300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleOpaqueExpression3355 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleOpaqueExpression3366 = new BitSet(new long[]{0x0000000008400010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOpaqueExpression3383 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_22_in_ruleOpaqueExpression3400 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOpaqueExpression3418 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleOpaqueExpression3428 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleOpaqueExpression3440 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOpaqueExpression3457 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_20_in_ruleOpaqueExpression3473 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOpaqueExpression3490 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_33_in_ruleOpaqueExpression3507 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_34_in_ruleOpaqueExpression3518 = new BitSet(new long[]{0x00000000000001D0L});
        public static final BitSet FOLLOW_ruleLINE_in_ruleOpaqueExpression3539 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_35_in_ruleOpaqueExpression3551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLINE_in_entryRuleLINE3588 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLINE3599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLINE3639 = new BitSet(new long[]{0x00000000000001D2L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLINE3665 = new BitSet(new long[]{0x00000000000001D2L});
        public static final BitSet FOLLOW_RULE_RWS_in_ruleLINE3691 = new BitSet(new long[]{0x00000000000001D2L});
        public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleLINE3717 = new BitSet(new long[]{0x00000000000001D2L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_entryRuleInlinePropertyDefinition3763 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlinePropertyDefinition3773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleInlinePropertyDefinition3828 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleInlinePropertyDefinition3839 = new BitSet(new long[]{0x0000102000400010L});
        public static final BitSet FOLLOW_37_in_ruleInlinePropertyDefinition3850 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_38_in_ruleInlinePropertyDefinition3910 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_39_in_ruleInlinePropertyDefinition3991 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_40_in_ruleInlinePropertyDefinition4072 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_41_in_ruleInlinePropertyDefinition4153 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_42_in_ruleInlinePropertyDefinition4234 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_43_in_ruleInlinePropertyDefinition4296 = new BitSet(new long[]{0x0000100000400010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4315 = new BitSet(new long[]{0x0000100000400000L});
        public static final BitSet FOLLOW_44_in_ruleInlinePropertyDefinition4332 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_ruleInlinePropertyDefinition4353 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleInlinePropertyDefinition4363 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000010L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_ruleInlinePropertyDefinition4384 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleInlinePropertyDefinition4394 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInlinePropertyDefinition4406 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4424 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleInlinePropertyDefinition4434 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleInlinePropertyDefinition4445 = new BitSet(new long[]{0x0003C00000010000L});
        public static final BitSet FOLLOW_46_in_ruleInlinePropertyDefinition4456 = new BitSet(new long[]{0x80000001024000A0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleInlinePropertyDefinition4477 = new BitSet(new long[]{0x0003800000010000L});
        public static final BitSet FOLLOW_47_in_ruleInlinePropertyDefinition4490 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
        public static final BitSet FOLLOW_ruleAggregationKind_in_ruleInlinePropertyDefinition4511 = new BitSet(new long[]{0x0003000000010000L});
        public static final BitSet FOLLOW_48_in_ruleInlinePropertyDefinition4524 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInlinePropertyDefinition4534 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4552 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_20_in_ruleInlinePropertyDefinition4563 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4581 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_23_in_ruleInlinePropertyDefinition4593 = new BitSet(new long[]{0x0002000000010000L});
        public static final BitSet FOLLOW_49_in_ruleInlinePropertyDefinition4606 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInlinePropertyDefinition4616 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4634 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_20_in_ruleInlinePropertyDefinition4645 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInlinePropertyDefinition4663 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_23_in_ruleInlinePropertyDefinition4675 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleInlinePropertyDefinition4687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMediation_in_entryRuleMediation4725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMediation4735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleMediation4790 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleMediation4801 = new BitSet(new long[]{0x0000000008008010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMediation4818 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleMediation4835 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMediation4856 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleMediation4867 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMediation4888 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleMediation4902 = new BitSet(new long[]{0x0030001002000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleMediation4966 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleMediation4976 = new BitSet(new long[]{0x0030001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_52_in_ruleMediation5039 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMediation5049 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMediation5067 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMediation5078 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMediation5096 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_51_in_ruleMediation5108 = new BitSet(new long[]{0x0030001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_53_in_ruleMediation5170 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMediation5180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMediation5198 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMediation5209 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMediation5227 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_51_in_ruleMediation5239 = new BitSet(new long[]{0x0030001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_16_in_ruleMediation5295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDerivation_in_entryRuleDerivation5331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDerivation5341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleDerivation5387 = new BitSet(new long[]{0x03C0000000000000L});
        public static final BitSet FOLLOW_54_in_ruleDerivation5448 = new BitSet(new long[]{0x03C0000000000000L});
        public static final BitSet FOLLOW_55_in_ruleDerivation5529 = new BitSet(new long[]{0x03C0000000000000L});
        public static final BitSet FOLLOW_56_in_ruleDerivation5610 = new BitSet(new long[]{0x03C0000000000000L});
        public static final BitSet FOLLOW_57_in_ruleDerivation5672 = new BitSet(new long[]{0x0000000008008010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDerivation5689 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleDerivation5706 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleDerivation5727 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleDerivation5738 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleDerivation5759 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleDerivation5773 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleDerivation5783 = new BitSet(new long[]{0x0000001002000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleDerivation5805 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleDerivation5815 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_ruleDerivation5826 = new BitSet(new long[]{0x0000001002000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleDerivation5848 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleDerivation5858 = new BitSet(new long[]{0x0030000000010000L});
        public static final BitSet FOLLOW_52_in_ruleDerivation5912 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleDerivation5922 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDerivation5940 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_20_in_ruleDerivation5951 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDerivation5969 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_51_in_ruleDerivation5981 = new BitSet(new long[]{0x0030000000010000L});
        public static final BitSet FOLLOW_53_in_ruleDerivation6043 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleDerivation6053 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDerivation6071 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_20_in_ruleDerivation6082 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDerivation6100 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_51_in_ruleDerivation6112 = new BitSet(new long[]{0x0030000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDerivation6162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMaterialAssociation_in_entryRuleMaterialAssociation6198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMaterialAssociation6208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleMaterialAssociation6263 = new BitSet(new long[]{0x01C0000000000000L});
        public static final BitSet FOLLOW_54_in_ruleMaterialAssociation6324 = new BitSet(new long[]{0x11C0000000000000L});
        public static final BitSet FOLLOW_55_in_ruleMaterialAssociation6405 = new BitSet(new long[]{0x11C0000000000000L});
        public static final BitSet FOLLOW_56_in_ruleMaterialAssociation6486 = new BitSet(new long[]{0x11C0000000000000L});
        public static final BitSet FOLLOW_60_in_ruleMaterialAssociation6554 = new BitSet(new long[]{0x0000000008008010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMaterialAssociation6571 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleMaterialAssociation6588 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMaterialAssociation6609 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleMaterialAssociation6620 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMaterialAssociation6641 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleMaterialAssociation6655 = new BitSet(new long[]{0x0030001002000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleMaterialAssociation6719 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleMaterialAssociation6729 = new BitSet(new long[]{0x0030001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_52_in_ruleMaterialAssociation6792 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMaterialAssociation6802 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMaterialAssociation6820 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMaterialAssociation6831 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMaterialAssociation6849 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_51_in_ruleMaterialAssociation6861 = new BitSet(new long[]{0x0030001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_53_in_ruleMaterialAssociation6923 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMaterialAssociation6933 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMaterialAssociation6951 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMaterialAssociation6962 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMaterialAssociation6980 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_51_in_ruleMaterialAssociation6992 = new BitSet(new long[]{0x0030001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_16_in_ruleMaterialAssociation7048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormalAssociation_in_entryRuleFormalAssociation7084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormalAssociation7094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleFormalAssociation7149 = new BitSet(new long[]{0x21C0000000000000L});
        public static final BitSet FOLLOW_55_in_ruleFormalAssociation7210 = new BitSet(new long[]{0x21C0000000000000L});
        public static final BitSet FOLLOW_54_in_ruleFormalAssociation7291 = new BitSet(new long[]{0x21C0000000000000L});
        public static final BitSet FOLLOW_56_in_ruleFormalAssociation7372 = new BitSet(new long[]{0x21C0000000000000L});
        public static final BitSet FOLLOW_61_in_ruleFormalAssociation7434 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFormalAssociation7451 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFormalAssociation7467 = new BitSet(new long[]{0x0030001002000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleFormalAssociation7531 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleFormalAssociation7541 = new BitSet(new long[]{0x0030001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_52_in_ruleFormalAssociation7604 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleFormalAssociation7614 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFormalAssociation7632 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFormalAssociation7643 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFormalAssociation7661 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_51_in_ruleFormalAssociation7673 = new BitSet(new long[]{0x0030001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_53_in_ruleFormalAssociation7735 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleFormalAssociation7745 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFormalAssociation7763 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFormalAssociation7774 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFormalAssociation7792 = new BitSet(new long[]{0x0008000000100000L});
        public static final BitSet FOLLOW_51_in_ruleFormalAssociation7804 = new BitSet(new long[]{0x0030001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_16_in_ruleFormalAssociation7860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral7898 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral7908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral7959 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_62_in_ruleEnumerationLiteral7974 = new BitSet(new long[]{0x80000001024000A0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleEnumerationLiteral7995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstanceSpecification_Impl_in_entryRuleInstanceSpecification_Impl8031 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecification_Impl8041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleInstanceSpecification_Impl8096 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_ruleInstanceSpecification_Impl8107 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceSpecification_Impl8124 = new BitSet(new long[]{0x0000000008008000L,0x0000000000000001L});
        public static final BitSet FOLLOW_27_in_ruleInstanceSpecification_Impl8140 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceSpecification_Impl8158 = new BitSet(new long[]{0x0000000000108000L,0x0000000000000001L});
        public static final BitSet FOLLOW_20_in_ruleInstanceSpecification_Impl8169 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceSpecification_Impl8187 = new BitSet(new long[]{0x0000000000108000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleInstanceSpecification_Impl8202 = new BitSet(new long[]{0x80000001024000A0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleInstanceSpecification_Impl8223 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInstanceSpecification_Impl8235 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_ruleSlot_in_ruleInstanceSpecification_Impl8257 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_20_in_ruleInstanceSpecification_Impl8268 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleSlot_in_ruleInstanceSpecification_Impl8289 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_16_in_ruleInstanceSpecification_Impl8303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlot_in_entryRuleSlot8339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlot8349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSlot8392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleSlot8402 = new BitSet(new long[]{0x80001001024000A0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleSlot8424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleSlot8441 = new BitSet(new long[]{0x80000001024000A0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleSlot8462 = new BitSet(new long[]{0x0000200000100000L});
        public static final BitSet FOLLOW_20_in_ruleSlot8473 = new BitSet(new long[]{0x80000001024000A0L,0x000000000E00002CL});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleSlot8494 = new BitSet(new long[]{0x0000200000100000L});
        public static final BitSet FOLLOW_45_in_ruleSlot8506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstanceValue_in_entryRuleInstanceValue8544 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInstanceValue8554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleInstanceValue8600 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_ruleInstanceValue8611 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceValue8628 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_22_in_ruleInstanceValue8645 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceValue8663 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleInstanceValue8673 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceValue8693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger8729 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInteger8739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLiteralInteger8790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_entryRuleLiteralString8831 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralString8841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralString8892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean8933 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean8943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleLiteralBoolean8998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean9035 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean9046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleBoolean9084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleBoolean9103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural9143 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural9153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalValue_in_ruleLiteralUnlimitedNatural9199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLiteralUnlimitedNatural9222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalValue_in_entryRuleUnlimitedNaturalValue9264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalValue9275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleUnlimitedNaturalValue9312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull9351 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNull9361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleLiteralNull9405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubKind_in_entryRuleSubKind9441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubKind9451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleSubKind9497 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
        public static final BitSet FOLLOW_70_in_ruleSubKind9516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleSubKind9540 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubKind9557 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleSubKind9573 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleSubKind9594 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleSubKind9605 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleSubKind9626 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleSubKind9640 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleSubKind9651 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSubKind9661 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleSubKind9682 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_16_in_ruleSubKind9695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_entryRuleKind9731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKind9741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleKind9787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleKind9798 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKind9815 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleKind9831 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleKind9852 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleKind9863 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleKind9884 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleKind9898 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleKind9909 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleKind9919 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleKind9940 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_16_in_ruleKind9951 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleKind9963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantity_in_entryRuleQuantity9999 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuantity10009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleQuantity10055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000240L});
        public static final BitSet FOLLOW_70_in_ruleQuantity10074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_ruleQuantity10098 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQuantity10115 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleQuantity10131 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleQuantity10152 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleQuantity10163 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleQuantity10184 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleQuantity10198 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleQuantity10208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollective_in_entryRuleCollective10244 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollective10254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleCollective10300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
        public static final BitSet FOLLOW_74_in_ruleCollective10319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_ruleCollective10343 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCollective10360 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleCollective10376 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCollective10397 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleCollective10408 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCollective10429 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleCollective10443 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCollective10453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhase_in_entryRulePhase10489 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhase10499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_rulePhase10545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_76_in_rulePhase10556 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePhase10573 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_rulePhase10589 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_rulePhase10610 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_rulePhase10621 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_rulePhase10642 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_rulePhase10656 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePhase10666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole10702 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole10712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleRole10758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_ruleRole10769 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRole10786 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleRole10802 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRole10823 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleRole10834 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRole10855 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleRole10869 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleRole10880 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRole10890 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleRole10911 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_16_in_ruleRole10922 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRole10934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory10970 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCategory10980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleCategory11026 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleCategory11045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleCategory11068 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCategory11085 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleCategory11101 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCategory11122 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleCategory11133 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCategory11154 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleCategory11168 = new BitSet(new long[]{0x0000000000010000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleCategory11179 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCategory11189 = new BitSet(new long[]{0x0000001002000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleCategory11210 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_20_in_ruleCategory11221 = new BitSet(new long[]{0x0000001002000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleCategory11242 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_16_in_ruleCategory11254 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCategory11266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoleMixin_in_entryRuleRoleMixin11302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoleMixin11312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleRoleMixin11358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_80_in_ruleRoleMixin11369 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRoleMixin11386 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleRoleMixin11402 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRoleMixin11423 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleRoleMixin11434 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRoleMixin11455 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleRoleMixin11469 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleRoleMixin11480 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRoleMixin11490 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleRoleMixin11511 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_16_in_ruleRoleMixin11522 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRoleMixin11534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin11570 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMixin11580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleMixin11626 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleMixin11645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_81_in_ruleMixin11668 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMixin11685 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleMixin11701 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMixin11722 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleMixin11733 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMixin11754 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleMixin11768 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleMixin11779 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMixin11789 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleMixin11810 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_16_in_ruleMixin11821 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMixin11833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMode_in_entryRuleMode11869 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMode11879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleMode11925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleMode11936 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMode11953 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleMode11969 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMode11990 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleMode12001 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleMode12022 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleMode12036 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleMode12047 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMode12057 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleMode12078 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_16_in_ruleMode12089 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMode12101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelator_in_entryRuleRelator12137 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelator12147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleRelator12193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_83_in_ruleRelator12204 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRelator12221 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleRelator12237 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRelator12258 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleRelator12269 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleRelator12290 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleRelator12304 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleRelator12315 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRelator12325 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleRelator12346 = new BitSet(new long[]{0x0000001002010000L,0x000000000E000000L});
        public static final BitSet FOLLOW_16_in_ruleRelator12357 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRelator12369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterization_in_entryRuleCharacterization12405 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacterization12415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleCharacterization12461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_ruleCharacterization12472 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCharacterization12489 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleCharacterization12505 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCharacterization12526 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleCharacterization12537 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleInlineGeneralization_in_ruleCharacterization12558 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleCharacterization12572 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleCharacterization12582 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCharacterization12592 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCharacterization12610 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_20_in_ruleCharacterization12621 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCharacterization12639 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_23_in_ruleCharacterization12651 = new BitSet(new long[]{0x0020000000010000L,0x0000000000200000L});
        public static final BitSet FOLLOW_53_in_ruleCharacterization12662 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCharacterization12672 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCharacterization12690 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_20_in_ruleCharacterization12701 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCharacterization12719 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_23_in_ruleCharacterization12731 = new BitSet(new long[]{0x0000000000010000L,0x0000000000200000L});
        public static final BitSet FOLLOW_85_in_ruleCharacterization12744 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCharacterization12754 = new BitSet(new long[]{0x0000001002000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleCharacterization12775 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_20_in_ruleCharacterization12786 = new BitSet(new long[]{0x0000001002000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_ruleInlinePropertyDefinition_in_ruleCharacterization12807 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_16_in_ruleCharacterization12819 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCharacterization12831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleAggregationKind12879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleAggregationKind12894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleAggregationKind12909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleVisibilityKind12952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleVisibilityKind12967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleVisibilityKind12982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleVisibilityKind12997 = new BitSet(new long[]{0x0000000000000002L});
    }


}