package model;

public class LoginModel {
	private int LP;
	private String Login;
	private String Haslo;
	
	public LoginModel(int LP,String Login,String Haslo)
	{
		this.setLP(LP);
		this.setLogin(Login);
		this.setHaslo(Haslo);
		
	}

	public String getHaslo() {
		return Haslo;
	}

	public void setHaslo(String haslo) {
		Haslo = haslo;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public int getLP() {
		return LP;
	}

	public void setLP(int lP) {
		LP = lP;
	}
}
