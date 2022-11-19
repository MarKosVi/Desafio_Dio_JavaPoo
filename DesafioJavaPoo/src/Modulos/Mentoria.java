package Modulos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

	private LocalDate data;
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public String toString() {
		 DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "["+this.getTitulo()+" - "+this.getDescricao()+" - "+this.data.format(dateFormat)+" - "+this.calcularXp()+"]";
	}
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return xp_padrao+20;
	}
	
}





