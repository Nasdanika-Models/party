module org.nasdanika.models.party.processors {
		
	requires transitive org.nasdanika.models.party;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.party.processors;
	opens org.nasdanika.models.party.processors; // For loading resources
	
}
