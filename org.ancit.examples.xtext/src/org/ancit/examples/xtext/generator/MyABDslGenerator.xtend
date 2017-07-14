/*
 * generated by Xtext 2.10.0
 */
package org.ancit.examples.xtext.generator

import addressbook.Contact
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyABDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val contacts = resource.allContents
						.filter(typeof(Contact))
					
		var string = "";
		while (contacts.hasNext) {
			val contact = contacts.next;
			string += ("\n"+ contact.name + "," + contact.address);
		}
		
		
		fsa.generateFile('addressbook.txt', string)
	}
}
