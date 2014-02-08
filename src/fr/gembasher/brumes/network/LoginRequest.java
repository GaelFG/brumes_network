package fr.gembasher.brumes.network;

public class LoginRequest {
	public String login;
	public String encrypted_password;

	public LoginRequest() {
		login = null;
		encrypted_password = null;
	}

	public LoginRequest(String login, String encrypted_password) {
		this.login = login;
		this.encrypted_password = encrypted_password;
	}
}