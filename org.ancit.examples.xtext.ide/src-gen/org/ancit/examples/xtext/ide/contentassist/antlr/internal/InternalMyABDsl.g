/*
 * generated by Xtext 2.10.0
 */
grammar InternalMyABDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.ancit.examples.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.ancit.examples.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.ancit.examples.xtext.services.MyABDslGrammarAccess;

}
@parser::members {
	private MyABDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyABDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleAddressBook
entryRuleAddressBook
:
{ before(grammarAccess.getAddressBookRule()); }
	 ruleAddressBook
{ after(grammarAccess.getAddressBookRule()); } 
	 EOF 
;

// Rule AddressBook
ruleAddressBook 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAddressBookAccess().getGroup()); }
		(rule__AddressBook__Group__0)
		{ after(grammarAccess.getAddressBookAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGroup
entryRuleGroup
:
{ before(grammarAccess.getGroupRule()); }
	 ruleGroup
{ after(grammarAccess.getGroupRule()); } 
	 EOF 
;

// Rule Group
ruleGroup 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGroupAccess().getGroup()); }
		(rule__Group__Group__0)
		{ after(grammarAccess.getGroupAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContact
entryRuleContact
:
{ before(grammarAccess.getContactRule()); }
	 ruleContact
{ after(grammarAccess.getContactRule()); } 
	 EOF 
;

// Rule Contact
ruleContact 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContactAccess().getGroup()); }
		(rule__Contact__Group__0)
		{ after(grammarAccess.getContactAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group__0__Impl
	rule__AddressBook__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getAddressBookAction_0()); }
	()
	{ after(grammarAccess.getAddressBookAccess().getAddressBookAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group__1__Impl
	rule__AddressBook__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getAddressBookKeyword_1()); }
	'AddressBook'
	{ after(grammarAccess.getAddressBookAccess().getAddressBookKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group__2__Impl
	rule__AddressBook__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getAddressBookAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group__3__Impl
	rule__AddressBook__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getGroup_3()); }
	(rule__AddressBook__Group_3__0)?
	{ after(grammarAccess.getAddressBookAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group__4__Impl
	rule__AddressBook__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getGroup_4()); }
	(rule__AddressBook__Group_4__0)?
	{ after(grammarAccess.getAddressBookAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getAddressBookAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AddressBook__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_3__0__Impl
	rule__AddressBook__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getGroupsKeyword_3_0()); }
	'groups'
	{ after(grammarAccess.getAddressBookAccess().getGroupsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_3__1__Impl
	rule__AddressBook__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getAddressBookAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_3__2__Impl
	rule__AddressBook__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getGroupsAssignment_3_2()); }
	(rule__AddressBook__GroupsAssignment_3_2)
	{ after(grammarAccess.getAddressBookAccess().getGroupsAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_3__3__Impl
	rule__AddressBook__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getGroup_3_3()); }
	(rule__AddressBook__Group_3_3__0)*
	{ after(grammarAccess.getAddressBookAccess().getGroup_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getRightCurlyBracketKeyword_3_4()); }
	'}'
	{ after(grammarAccess.getAddressBookAccess().getRightCurlyBracketKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AddressBook__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_3_3__0__Impl
	rule__AddressBook__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getCommaKeyword_3_3_0()); }
	','
	{ after(grammarAccess.getAddressBookAccess().getCommaKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getGroupsAssignment_3_3_1()); }
	(rule__AddressBook__GroupsAssignment_3_3_1)
	{ after(grammarAccess.getAddressBookAccess().getGroupsAssignment_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AddressBook__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_4__0__Impl
	rule__AddressBook__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getContactsKeyword_4_0()); }
	'contacts'
	{ after(grammarAccess.getAddressBookAccess().getContactsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_4__1__Impl
	rule__AddressBook__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getAddressBookAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_4__2__Impl
	rule__AddressBook__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getContactsAssignment_4_2()); }
	(rule__AddressBook__ContactsAssignment_4_2)
	{ after(grammarAccess.getAddressBookAccess().getContactsAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_4__3__Impl
	rule__AddressBook__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getGroup_4_3()); }
	(rule__AddressBook__Group_4_3__0)*
	{ after(grammarAccess.getAddressBookAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getRightCurlyBracketKeyword_4_4()); }
	'}'
	{ after(grammarAccess.getAddressBookAccess().getRightCurlyBracketKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AddressBook__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_4_3__0__Impl
	rule__AddressBook__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getCommaKeyword_4_3_0()); }
	','
	{ after(grammarAccess.getAddressBookAccess().getCommaKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddressBook__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressBookAccess().getContactsAssignment_4_3_1()); }
	(rule__AddressBook__ContactsAssignment_4_3_1)
	{ after(grammarAccess.getAddressBookAccess().getContactsAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Group__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group__0__Impl
	rule__Group__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getGroupAction_0()); }
	()
	{ after(grammarAccess.getGroupAccess().getGroupAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group__1__Impl
	rule__Group__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getGroupKeyword_1()); }
	'Group'
	{ after(grammarAccess.getGroupAccess().getGroupKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group__2__Impl
	rule__Group__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getNameAssignment_2()); }
	(rule__Group__NameAssignment_2)
	{ after(grammarAccess.getGroupAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group__3__Impl
	rule__Group__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group__4__Impl
	rule__Group__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getGroup_4()); }
	(rule__Group__Group_4__0)?
	{ after(grammarAccess.getGroupAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Group__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group_4__0__Impl
	rule__Group__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getContactsKeyword_4_0()); }
	'contacts'
	{ after(grammarAccess.getGroupAccess().getContactsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group_4__1__Impl
	rule__Group__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_4_1()); }
	'('
	{ after(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group_4__2__Impl
	rule__Group__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getContactsAssignment_4_2()); }
	(rule__Group__ContactsAssignment_4_2)
	{ after(grammarAccess.getGroupAccess().getContactsAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group_4__3__Impl
	rule__Group__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getGroup_4_3()); }
	(rule__Group__Group_4_3__0)*
	{ after(grammarAccess.getGroupAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_4_4()); }
	')'
	{ after(grammarAccess.getGroupAccess().getRightParenthesisKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Group__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group_4_3__0__Impl
	rule__Group__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getCommaKeyword_4_3_0()); }
	','
	{ after(grammarAccess.getGroupAccess().getCommaKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getContactsAssignment_4_3_1()); }
	(rule__Group__ContactsAssignment_4_3_1)
	{ after(grammarAccess.getGroupAccess().getContactsAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Contact__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group__0__Impl
	rule__Contact__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getContactAction_0()); }
	()
	{ after(grammarAccess.getContactAccess().getContactAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group__1__Impl
	rule__Contact__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getContactKeyword_1()); }
	'Contact'
	{ after(grammarAccess.getContactAccess().getContactKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group__2__Impl
	rule__Contact__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getNameAssignment_2()); }
	(rule__Contact__NameAssignment_2)
	{ after(grammarAccess.getContactAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group__3__Impl
	rule__Contact__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group__4__Impl
	rule__Contact__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getGroup_4()); }
	(rule__Contact__Group_4__0)?
	{ after(grammarAccess.getContactAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group__5__Impl
	rule__Contact__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getGroup_5()); }
	(rule__Contact__Group_5__0)?
	{ after(grammarAccess.getContactAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getContactAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Contact__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group_4__0__Impl
	rule__Contact__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getAddressKeyword_4_0()); }
	'address'
	{ after(grammarAccess.getContactAccess().getAddressKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getAddressAssignment_4_1()); }
	(rule__Contact__AddressAssignment_4_1)
	{ after(grammarAccess.getContactAccess().getAddressAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Contact__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group_5__0__Impl
	rule__Contact__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getEmailKeyword_5_0()); }
	'email'
	{ after(grammarAccess.getContactAccess().getEmailKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getEmailAssignment_5_1()); }
	(rule__Contact__EmailAssignment_5_1)
	{ after(grammarAccess.getContactAccess().getEmailAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AddressBook__GroupsAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddressBookAccess().getGroupsGroupParserRuleCall_3_2_0()); }
		ruleGroup
		{ after(grammarAccess.getAddressBookAccess().getGroupsGroupParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__GroupsAssignment_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddressBookAccess().getGroupsGroupParserRuleCall_3_3_1_0()); }
		ruleGroup
		{ after(grammarAccess.getAddressBookAccess().getGroupsGroupParserRuleCall_3_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__ContactsAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddressBookAccess().getContactsContactParserRuleCall_4_2_0()); }
		ruleContact
		{ after(grammarAccess.getAddressBookAccess().getContactsContactParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddressBook__ContactsAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddressBookAccess().getContactsContactParserRuleCall_4_3_1_0()); }
		ruleContact
		{ after(grammarAccess.getAddressBookAccess().getContactsContactParserRuleCall_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__ContactsAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGroupAccess().getContactsContactCrossReference_4_2_0()); }
		(
			{ before(grammarAccess.getGroupAccess().getContactsContactEStringParserRuleCall_4_2_0_1()); }
			ruleEString
			{ after(grammarAccess.getGroupAccess().getContactsContactEStringParserRuleCall_4_2_0_1()); }
		)
		{ after(grammarAccess.getGroupAccess().getContactsContactCrossReference_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__ContactsAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGroupAccess().getContactsContactCrossReference_4_3_1_0()); }
		(
			{ before(grammarAccess.getGroupAccess().getContactsContactEStringParserRuleCall_4_3_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getGroupAccess().getContactsContactEStringParserRuleCall_4_3_1_0_1()); }
		)
		{ after(grammarAccess.getGroupAccess().getContactsContactCrossReference_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContactAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getContactAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__AddressAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContactAccess().getAddressEStringParserRuleCall_4_1_0()); }
		ruleEString
		{ after(grammarAccess.getContactAccess().getAddressEStringParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__EmailAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContactAccess().getEmailEStringParserRuleCall_5_1_0()); }
		ruleEString
		{ after(grammarAccess.getContactAccess().getEmailEStringParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
