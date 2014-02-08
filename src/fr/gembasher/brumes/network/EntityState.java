package fr.gembasher.brumes.network;

public class EntityState {
	public int id;
	public double destination_x;
	public double destination_y;
	public double looked_x;
	public double looked_y;

	public EntityState() {
		id = 0;
		destination_x = 0;
		destination_y = 0;
		looked_x = 0;
		looked_y = 0;
	}

	public EntityState(int id, double destination_x, double destination_y, double looked_x, double looked_y) {
		this.id = id;		
		this.destination_x = destination_x;
		this.destination_y = destination_y;
		this.looked_x = looked_x;
		this.looked_y = looked_y;
	}
}
