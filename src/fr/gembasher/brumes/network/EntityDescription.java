package fr.gembasher.brumes.network;

public class EntityDescription {
	public int id;
	public String display_name;
	public String model_name;
	public String model_parameters;

	public EntityDescription() {
		id = 0;
		display_name = "Maybe your mum";
		model_name = "";
		model_parameters = "";

	}

	public EntityDescription(int id, String display_name, String model_name, String model_parameters ) {
		this.id = id;
		this.display_name = display_name;
		this.model_name = model_name;
		this.model_parameters = model_parameters;

	}
}
