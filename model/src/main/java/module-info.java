import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.party.util.PartyEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.party {
	exports org.nasdanika.models.party;
	exports org.nasdanika.models.party.impl;
	exports org.nasdanika.models.party.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.ncore;
	
	provides CapabilityFactory with PartyEPackageResourceSetCapabilityFactory;
	
}