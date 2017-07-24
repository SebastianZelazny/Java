package Java_01_07;

public class Rosliny extends Organizm{

	private String typ_roslin;
	
	private String okres_kwit;
	
	private boolean CzyKwitnie;

	public String getTyp_roslin() {
		return typ_roslin;
	}

	public void setTyp_roslin(String typ_roslin) {
		this.typ_roslin = typ_roslin;
	}

	public String getOkres_kwit() {
		return okres_kwit;
	}

	public void setOkres_kwit(String okres_kwit) {
		this.okres_kwit = okres_kwit;
	}

	public boolean isCzyKwitnie() {
		return CzyKwitnie;
	}

	public void setCzyKwitnie(boolean czyKwitnie) {
		CzyKwitnie = czyKwitnie;
	}
	
	public void info_ros()
	{
		if(CzyKwitnie==true)
			System.out.println("Jestem "+typ_roslin+" Moj okres kwitniecia przypada w "+getOkres_kwit()+" i nadal kwitne");
		else
		{
			System.out.println("Jestem "+typ_roslin+" Moj okres kwitniecia przypada w "+getOkres_kwit()+" i juz przekwitlem");
		}
	}
	
}
