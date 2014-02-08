package fr.gembasher.brumes.network;

import com.esotericsoftware.kryo.Kryo;

public class KryoRegisterer {

	public static void registerAll(Kryo kryo) {
		kryo.register(String.class);
		kryo.register(String[].class);
		kryo.register(PlayerIntent.class);
		kryo.register(LoginRequest.class);
		kryo.register(RegistrationRequired.class);
		kryo.register(LoggedAs.class);
	}

}
