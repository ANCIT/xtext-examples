/*
 * generated by Xtext 2.10.0
 */
package org.ancit.examples.xtext.serializer;

import addressbook.AddressBook;
import addressbook.AddressbookPackage;
import addressbook.Contact;
import addressbook.Group;
import com.google.inject.Inject;
import java.util.Set;
import org.ancit.examples.xtext.services.MyABDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class MyABDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyABDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AddressbookPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AddressbookPackage.ADDRESS_BOOK:
				sequence_AddressBook(context, (AddressBook) semanticObject); 
				return; 
			case AddressbookPackage.CONTACT:
				sequence_Contact(context, (Contact) semanticObject); 
				return; 
			case AddressbookPackage.GROUP:
				sequence_Group(context, (Group) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AddressBook returns AddressBook
	 *
	 * Constraint:
	 *     ((groups+=Group groups+=Group*)? (contacts+=Contact contacts+=Contact*)?)
	 */
	protected void sequence_AddressBook(ISerializationContext context, AddressBook semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Contact returns Contact
	 *
	 * Constraint:
	 *     (name=EString address=EString? email=EString?)
	 */
	protected void sequence_Contact(ISerializationContext context, Contact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Group returns Group
	 *
	 * Constraint:
	 *     (name=EString (contacts+=[Contact|EString] contacts+=[Contact|EString]*)?)
	 */
	protected void sequence_Group(ISerializationContext context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
