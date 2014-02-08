package fr.gembasher.brumes.network;

public class PlayerIntent {
	public double destination_x;
	public double destination_y;
	public double looked_x;
	public double looked_y;
	public String[] action_requests;

	public PlayerIntent() {
		destination_x = 0;
		destination_y = 0;
		looked_x = 0;
		looked_y = 0;
		action_requests = null;
	}

	public PlayerIntent(double destination_x, double destination_y, double looked_x, double looked_y) {
		this.destination_x = destination_x;
		this.destination_y = destination_y;
		this.looked_x = looked_x;
		this.looked_y = looked_y;
		this.action_requests = null;
	}
}