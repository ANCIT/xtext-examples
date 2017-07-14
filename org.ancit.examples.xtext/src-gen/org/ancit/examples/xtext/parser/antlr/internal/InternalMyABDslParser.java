package org.ancit.examples.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ancit.examples.xtext.services.MyABDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyABDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AddressBook'", "'{'", "'groups'", "','", "'}'", "'contacts'", "'Group'", "'('", "')'", "'Contact'", "'address'", "'email'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyABDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyABDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyABDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyABDsl.g"; }



     	private MyABDslGrammarAccess grammarAccess;

        public InternalMyABDslParser(TokenStream input, MyABDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AddressBook";
       	}

       	@Override
       	protected MyABDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAddressBook"
    // InternalMyABDsl.g:64:1: entryRuleAddressBook returns [EObject current=null] : iv_ruleAddressBook= ruleAddressBook EOF ;
    public final EObject entryRuleAddressBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressBook = null;


        try {
            // InternalMyABDsl.g:64:52: (iv_ruleAddressBook= ruleAddressBook EOF )
            // InternalMyABDsl.g:65:2: iv_ruleAddressBook= ruleAddressBook EOF
            {
             newCompositeNode(grammarAccess.getAddressBookRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddressBook=ruleAddressBook();

            state._fsp--;

             current =iv_ruleAddressBook; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddressBook"


    // $ANTLR start "ruleAddressBook"
    // InternalMyABDsl.g:71:1: ruleAddressBook returns [EObject current=null] : ( () otherlv_1= 'AddressBook' otherlv_2= '{' (otherlv_3= 'groups' otherlv_4= '{' ( (lv_groups_5_0= ruleGroup ) ) (otherlv_6= ',' ( (lv_groups_7_0= ruleGroup ) ) )* otherlv_8= '}' )? (otherlv_9= 'contacts' otherlv_10= '{' ( (lv_contacts_11_0= ruleContact ) ) (otherlv_12= ',' ( (lv_contacts_13_0= ruleContact ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleAddressBook() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_groups_5_0 = null;

        EObject lv_groups_7_0 = null;

        EObject lv_contacts_11_0 = null;

        EObject lv_contacts_13_0 = null;



        	enterRule();

        try {
            // InternalMyABDsl.g:77:2: ( ( () otherlv_1= 'AddressBook' otherlv_2= '{' (otherlv_3= 'groups' otherlv_4= '{' ( (lv_groups_5_0= ruleGroup ) ) (otherlv_6= ',' ( (lv_groups_7_0= ruleGroup ) ) )* otherlv_8= '}' )? (otherlv_9= 'contacts' otherlv_10= '{' ( (lv_contacts_11_0= ruleContact ) ) (otherlv_12= ',' ( (lv_contacts_13_0= ruleContact ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMyABDsl.g:78:2: ( () otherlv_1= 'AddressBook' otherlv_2= '{' (otherlv_3= 'groups' otherlv_4= '{' ( (lv_groups_5_0= ruleGroup ) ) (otherlv_6= ',' ( (lv_groups_7_0= ruleGroup ) ) )* otherlv_8= '}' )? (otherlv_9= 'contacts' otherlv_10= '{' ( (lv_contacts_11_0= ruleContact ) ) (otherlv_12= ',' ( (lv_contacts_13_0= ruleContact ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMyABDsl.g:78:2: ( () otherlv_1= 'AddressBook' otherlv_2= '{' (otherlv_3= 'groups' otherlv_4= '{' ( (lv_groups_5_0= ruleGroup ) ) (otherlv_6= ',' ( (lv_groups_7_0= ruleGroup ) ) )* otherlv_8= '}' )? (otherlv_9= 'contacts' otherlv_10= '{' ( (lv_contacts_11_0= ruleContact ) ) (otherlv_12= ',' ( (lv_contacts_13_0= ruleContact ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMyABDsl.g:79:3: () otherlv_1= 'AddressBook' otherlv_2= '{' (otherlv_3= 'groups' otherlv_4= '{' ( (lv_groups_5_0= ruleGroup ) ) (otherlv_6= ',' ( (lv_groups_7_0= ruleGroup ) ) )* otherlv_8= '}' )? (otherlv_9= 'contacts' otherlv_10= '{' ( (lv_contacts_11_0= ruleContact ) ) (otherlv_12= ',' ( (lv_contacts_13_0= ruleContact ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalMyABDsl.g:79:3: ()
            // InternalMyABDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddressBookAccess().getAddressBookAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAddressBookAccess().getAddressBookKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAddressBookAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyABDsl.g:94:3: (otherlv_3= 'groups' otherlv_4= '{' ( (lv_groups_5_0= ruleGroup ) ) (otherlv_6= ',' ( (lv_groups_7_0= ruleGroup ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyABDsl.g:95:4: otherlv_3= 'groups' otherlv_4= '{' ( (lv_groups_5_0= ruleGroup ) ) (otherlv_6= ',' ( (lv_groups_7_0= ruleGroup ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddressBookAccess().getGroupsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAddressBookAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyABDsl.g:103:4: ( (lv_groups_5_0= ruleGroup ) )
                    // InternalMyABDsl.g:104:5: (lv_groups_5_0= ruleGroup )
                    {
                    // InternalMyABDsl.g:104:5: (lv_groups_5_0= ruleGroup )
                    // InternalMyABDsl.g:105:6: lv_groups_5_0= ruleGroup
                    {

                    						newCompositeNode(grammarAccess.getAddressBookAccess().getGroupsGroupParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_groups_5_0=ruleGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressBookRule());
                    						}
                    						add(
                    							current,
                    							"groups",
                    							lv_groups_5_0,
                    							"org.ancit.examples.xtext.MyABDsl.Group");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyABDsl.g:122:4: (otherlv_6= ',' ( (lv_groups_7_0= ruleGroup ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyABDsl.g:123:5: otherlv_6= ',' ( (lv_groups_7_0= ruleGroup ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAddressBookAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyABDsl.g:127:5: ( (lv_groups_7_0= ruleGroup ) )
                    	    // InternalMyABDsl.g:128:6: (lv_groups_7_0= ruleGroup )
                    	    {
                    	    // InternalMyABDsl.g:128:6: (lv_groups_7_0= ruleGroup )
                    	    // InternalMyABDsl.g:129:7: lv_groups_7_0= ruleGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddressBookAccess().getGroupsGroupParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_groups_7_0=ruleGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddressBookRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_7_0,
                    	    								"org.ancit.examples.xtext.MyABDsl.Group");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddressBookAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyABDsl.g:152:3: (otherlv_9= 'contacts' otherlv_10= '{' ( (lv_contacts_11_0= ruleContact ) ) (otherlv_12= ',' ( (lv_contacts_13_0= ruleContact ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyABDsl.g:153:4: otherlv_9= 'contacts' otherlv_10= '{' ( (lv_contacts_11_0= ruleContact ) ) (otherlv_12= ',' ( (lv_contacts_13_0= ruleContact ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getAddressBookAccess().getContactsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddressBookAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyABDsl.g:161:4: ( (lv_contacts_11_0= ruleContact ) )
                    // InternalMyABDsl.g:162:5: (lv_contacts_11_0= ruleContact )
                    {
                    // InternalMyABDsl.g:162:5: (lv_contacts_11_0= ruleContact )
                    // InternalMyABDsl.g:163:6: lv_contacts_11_0= ruleContact
                    {

                    						newCompositeNode(grammarAccess.getAddressBookAccess().getContactsContactParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_contacts_11_0=ruleContact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressBookRule());
                    						}
                    						add(
                    							current,
                    							"contacts",
                    							lv_contacts_11_0,
                    							"org.ancit.examples.xtext.MyABDsl.Contact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyABDsl.g:180:4: (otherlv_12= ',' ( (lv_contacts_13_0= ruleContact ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyABDsl.g:181:5: otherlv_12= ',' ( (lv_contacts_13_0= ruleContact ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAddressBookAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyABDsl.g:185:5: ( (lv_contacts_13_0= ruleContact ) )
                    	    // InternalMyABDsl.g:186:6: (lv_contacts_13_0= ruleContact )
                    	    {
                    	    // InternalMyABDsl.g:186:6: (lv_contacts_13_0= ruleContact )
                    	    // InternalMyABDsl.g:187:7: lv_contacts_13_0= ruleContact
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddressBookAccess().getContactsContactParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_contacts_13_0=ruleContact();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddressBookRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"contacts",
                    	    								lv_contacts_13_0,
                    	    								"org.ancit.examples.xtext.MyABDsl.Contact");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getAddressBookAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getAddressBookAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddressBook"


    // $ANTLR start "entryRuleGroup"
    // InternalMyABDsl.g:218:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalMyABDsl.g:218:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalMyABDsl.g:219:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalMyABDsl.g:225:1: ruleGroup returns [EObject current=null] : ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contacts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyABDsl.g:231:2: ( ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contacts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalMyABDsl.g:232:2: ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contacts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalMyABDsl.g:232:2: ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contacts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalMyABDsl.g:233:3: () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contacts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // InternalMyABDsl.g:233:3: ()
            // InternalMyABDsl.g:234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupAccess().getGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
            		
            // InternalMyABDsl.g:244:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyABDsl.g:245:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyABDsl.g:245:4: (lv_name_2_0= ruleEString )
            // InternalMyABDsl.g:246:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.ancit.examples.xtext.MyABDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyABDsl.g:267:3: (otherlv_4= 'contacts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyABDsl.g:268:4: otherlv_4= 'contacts' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getContactsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMyABDsl.g:276:4: ( ( ruleEString ) )
                    // InternalMyABDsl.g:277:5: ( ruleEString )
                    {
                    // InternalMyABDsl.g:277:5: ( ruleEString )
                    // InternalMyABDsl.g:278:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGroupAccess().getContactsContactCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyABDsl.g:292:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyABDsl.g:293:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyABDsl.g:297:5: ( ( ruleEString ) )
                    	    // InternalMyABDsl.g:298:6: ( ruleEString )
                    	    {
                    	    // InternalMyABDsl.g:298:6: ( ruleEString )
                    	    // InternalMyABDsl.g:299:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGroupRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getGroupAccess().getContactsContactCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleContact"
    // InternalMyABDsl.g:327:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // InternalMyABDsl.g:327:48: (iv_ruleContact= ruleContact EOF )
            // InternalMyABDsl.g:328:2: iv_ruleContact= ruleContact EOF
            {
             newCompositeNode(grammarAccess.getContactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContact=ruleContact();

            state._fsp--;

             current =iv_ruleContact; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContact"


    // $ANTLR start "ruleContact"
    // InternalMyABDsl.g:334:1: ruleContact returns [EObject current=null] : ( () otherlv_1= 'Contact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'address' ( (lv_address_5_0= ruleEString ) ) )? (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleContact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_address_5_0 = null;

        AntlrDatatypeRuleToken lv_email_7_0 = null;



        	enterRule();

        try {
            // InternalMyABDsl.g:340:2: ( ( () otherlv_1= 'Contact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'address' ( (lv_address_5_0= ruleEString ) ) )? (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalMyABDsl.g:341:2: ( () otherlv_1= 'Contact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'address' ( (lv_address_5_0= ruleEString ) ) )? (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalMyABDsl.g:341:2: ( () otherlv_1= 'Contact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'address' ( (lv_address_5_0= ruleEString ) ) )? (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalMyABDsl.g:342:3: () otherlv_1= 'Contact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'address' ( (lv_address_5_0= ruleEString ) ) )? (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalMyABDsl.g:342:3: ()
            // InternalMyABDsl.g:343:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContactAccess().getContactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getContactAccess().getContactKeyword_1());
            		
            // InternalMyABDsl.g:353:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyABDsl.g:354:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyABDsl.g:354:4: (lv_name_2_0= ruleEString )
            // InternalMyABDsl.g:355:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContactAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContactRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.ancit.examples.xtext.MyABDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyABDsl.g:376:3: (otherlv_4= 'address' ( (lv_address_5_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyABDsl.g:377:4: otherlv_4= 'address' ( (lv_address_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getContactAccess().getAddressKeyword_4_0());
                    			
                    // InternalMyABDsl.g:381:4: ( (lv_address_5_0= ruleEString ) )
                    // InternalMyABDsl.g:382:5: (lv_address_5_0= ruleEString )
                    {
                    // InternalMyABDsl.g:382:5: (lv_address_5_0= ruleEString )
                    // InternalMyABDsl.g:383:6: lv_address_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getContactAccess().getAddressEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_address_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContactRule());
                    						}
                    						set(
                    							current,
                    							"address",
                    							lv_address_5_0,
                    							"org.ancit.examples.xtext.MyABDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyABDsl.g:401:3: (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyABDsl.g:402:4: otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getContactAccess().getEmailKeyword_5_0());
                    			
                    // InternalMyABDsl.g:406:4: ( (lv_email_7_0= ruleEString ) )
                    // InternalMyABDsl.g:407:5: (lv_email_7_0= ruleEString )
                    {
                    // InternalMyABDsl.g:407:5: (lv_email_7_0= ruleEString )
                    // InternalMyABDsl.g:408:6: lv_email_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getContactAccess().getEmailEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_email_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContactRule());
                    						}
                    						set(
                    							current,
                    							"email",
                    							lv_email_7_0,
                    							"org.ancit.examples.xtext.MyABDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getContactAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContact"


    // $ANTLR start "entryRuleEString"
    // InternalMyABDsl.g:434:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyABDsl.g:434:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyABDsl.g:435:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyABDsl.g:441:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyABDsl.g:447:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyABDsl.g:448:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyABDsl.g:448:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyABDsl.g:449:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyABDsl.g:457:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000408000L});

}