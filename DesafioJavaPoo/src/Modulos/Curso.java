package Modulos;

public class Curso extends Conteudo{
	
	
	private int cargaHoraria;
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String toString() {
		return "["+this.getTitulo()+" - "+this.getDescricao()+" - "+this.cargaHoraria+" - "+this.calcularXp()+"]";
	}
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return xp_padrao;
	}
	
}
