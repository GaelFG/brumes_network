package fr.gembasher.brumes.network;

public class WorldState {
	public long timestamp;
	public String[] messages;
	public EntityState[] entities_states;

	public WorldState() {
		timestamp = System.currentTimeMillis();
		messages = null;
		entities_states = null;
		
	}

	public WorldState(String[] messages, EntityState[] entities_states) {
		this.timestamp = System.currentTimeMillis();
		this.messages = messages;
		this.entities_states = entities_states;
	}
}
