package fr.gembasher.brumes.network;

public class LoggedAs {
	public String character_name;
	public int character_entity_id;

	public LoggedAs() {
		character_name = null;
		character_entity_id = 0;
	}

	public LoggedAs(String character_name, int character_entity_id) {
		this.character_name = character_name;
		this.character_entity_id = character_entity_id;
	}

}