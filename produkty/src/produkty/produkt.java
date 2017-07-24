package produkty;

import java.time.LocalDate;

public class produkt {
	
	private String nazwa_produktu;
	private LocalDate data_produkcji;
	private LocalDate data_zuycia;
	
	public String getNazwa_produktu() {
		return nazwa_produktu;
	}
	public void setNazwa_produktu(String nazwa_produktu) {
		this.nazwa_produktu = nazwa_produktu;
	}
	public LocalDate getData_produkcji() {
		return data_produkcji;
	}
	private void setData_produkcji() {
		this.data_produkcji = LocalDate.now();
	}
	public LocalDate getData_uzycia() {
		return data_zuycia;
	}
	private void setData_zuycia() {
		//this.data_zuycia = data_zuycia;
		
		String nazwa_prod_tmp =  getNazwa_produktu();
		
		if(nazwa_prod_tmp.toLowerCase().contains("mleczny zapakowany"))
		{
			this.data_zuycia = getData_produkcji().plusWeeks(2);
		}
		else if(nazwa_prod_tmp.toLowerCase().contains("mleczny"))
		{
			this.data_zuycia = getData_produkcji().plusDays(4);
		}
		else if(nazwa_prod_tmp.toLowerCase().contains("puszka"))
		{
			this.data_zuycia = getData_produkcji().plusYears(2);
		}
		else
		{
			this.data_zuycia = getData_produkcji();
		}
	}
	
	public produkt(String nazwaProd)
	{
		this.nazwa_produktu= nazwaProd;
		setData_produkcji();
		setData_zuycia();
	}
	
	
}
