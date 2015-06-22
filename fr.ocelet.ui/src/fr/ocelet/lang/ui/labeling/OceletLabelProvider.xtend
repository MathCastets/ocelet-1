/*
* Customize outline text and images
* @author Pascal Degenne - Initial contribution
*/
package fr.ocelet.lang.ui.labeling

import com.google.inject.Inject
import fr.ocelet.lang.ocelet.Agregdef
import fr.ocelet.lang.ocelet.ConstructorDef
import fr.ocelet.lang.ocelet.Datafacer
import fr.ocelet.lang.ocelet.Entity
import fr.ocelet.lang.ocelet.Filterdef
import fr.ocelet.lang.ocelet.InteractionDef
import fr.ocelet.lang.ocelet.Metadata
import fr.ocelet.lang.ocelet.Model
import fr.ocelet.lang.ocelet.Parameter
import fr.ocelet.lang.ocelet.PropertyDef
import fr.ocelet.lang.ocelet.RelPropertyDef
import fr.ocelet.lang.ocelet.Relation
import fr.ocelet.lang.ocelet.Role
import fr.ocelet.lang.ocelet.Scenario
import fr.ocelet.lang.ocelet.ServiceDef
import fr.ocelet.lang.ocelet.StrucFuncDef
import fr.ocelet.lang.ocelet.StrucVarDef
import fr.ocelet.lang.ocelet.Strucdef
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class OceletLabelProvider extends XbaseLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

override protected doGetImage(Object eln) {
  
  switch eln {
  	Agregdef : 'outline/gif/agreg.gif'
  	ConstructorDef: 'outline/gif/entity_init.gif'
  	Datafacer : 'outline/gif/datafacer.gif'
  	Entity : 'outline/gif/entity.gif'
  	Filterdef : 'outline/gif/filter.gif'
    InteractionDef : 'outline/gif/service_rel.gif'
  	Metadata: 'outline/gif/model.gif'
    Model: 'outline/gif/model.gif'
    Parameter : 'outline/gif/propStruc.gif'
    PropertyDef: 'outline/gif/property.gif'
    Relation : 'outline/gif/relation.gif'
    RelPropertyDef : 'outline/gif/property.gif'
    Role : 'outline/gif/default.gif'
    Scenario: 'outline/gif/scenario.gif'
    ServiceDef: 'outline/gif/entity_svc.gif'
    Strucdef : 'outline/gif/structure.gif'
    StrucVarDef : 'outline/gif/propStruc.gif'
    StrucFuncDef : 'outline/gif/entity_svc.gif'
  default:
    super.doGetImage(eln)
  }
}

override protected doGetText(Object eln){
	switch eln {
	  Agregdef case ((eln.name != null)&&(eln.type != null)) : eln.name+'() returns '+eln.type.simpleName
	  ConstructorDef case (eln.name != null): eln.name+'()'
	  Datafacer case (eln.name != null): eln.name
	  Entity case (eln.name != null): eln.name
	  Filterdef case (eln.name != null): eln.name+'()'
	  InteractionDef case (eln.name != null) : eln.name+'()'
	  Metadata : 'Metadata'
	  Model: 'Model'
	  Parameter case ((eln.name != null)&&(eln.ptype != null)): eln.name+ " is " + eln.ptype.simpleName
	  PropertyDef case ((eln.name != null)&&(eln.type != null)) : eln.name+ " is " + eln.type.simpleName
	  Relation : relText(eln)
	  RelPropertyDef case ((eln.name != null)&&(eln.type != null)) : eln.name+ " is " + eln.type.simpleName
	  Role case (eln.name != null): eln.name
	  Scenario  case (eln.name != null) : eln.name
	  ServiceDef case ((eln.name != null)&&(eln.type != null)) : eln.name+'() returns '+eln.type.simpleName
	  ServiceDef case ((eln.name != null)&&(eln.type == null)) : eln.name+'()'
	  Strucdef  case (eln.name != null) : eln.name
	  StrucVarDef case ((eln.name != null)&&(eln.type != null)): eln.name+ " is " + eln.type.simpleName
	  StrucFuncDef case ((eln.name != null)&&(eln.type != null)) : eln.name+'() returns '+eln.type.simpleName
	  StrucFuncDef case ((eln.name != null)&&(eln.type == null)) : eln.name+'()'
	default: '...'
	}
}

private def String relText(Relation rel){
	val StringBuffer r = new StringBuffer();
		r.append(rel.name + "<");
		try{
		var int i = 0;
		for (Role rol : rel.getRoles()) {
			if (i > 0)
				r.append(",");
			i = i + 1;
			r.append(rol.getType()?.getName()?:".?.");
		}
		} catch (NullPointerException npe){
			// Do not crash if there is no Role defined yet
		}
		r.append(">");
		return r.toString();
}

}
