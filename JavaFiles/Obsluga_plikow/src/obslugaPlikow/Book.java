package obslugaPlikow;

public class Book {

	private String tytul;
	private String autor;
	private String rok;
	
	public String getTytul() {
		return tytul;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getRok() {
		return rok;
	}
	public void setRok(String rok) {
		this.rok = rok;
	}
	
	public Book(String tytul,String autor,String rok)
	{
		 this.tytul=tytul;
		 this.autor=autor;
		 this.rok=rok;
	}
}
