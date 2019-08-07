package br.com.corrida;


public class Volta {
	
	
	private String hora;
	private String codigoDoPiloto;
	private String nomeDoPiloto;
	private int numeroDaVolta;
	private double tempoDaVoltaEmSegundos;
	private String velocidadeMediaDaVolta;
	
		
	

	public Volta(String hora, String codigoDoPiloto, String nomeDoPiloto, int numeroDaVolta,
			double tempoDaVoltaEmSegundos, String velocidadeMediaDaVolta) {
		this.hora = hora;
		this.codigoDoPiloto = codigoDoPiloto;
		this.nomeDoPiloto = nomeDoPiloto;
		this.numeroDaVolta = numeroDaVolta;
		this.tempoDaVoltaEmSegundos = tempoDaVoltaEmSegundos;
		this.velocidadeMediaDaVolta = velocidadeMediaDaVolta;
	}
	
	
	@Override
	public String toString() {
		return "Volta [hora=" + hora + ", codigoDoPiloto=" + codigoDoPiloto + ", nomeDoPiloto=" + nomeDoPiloto
				+ ", numeroDaVolta=" + numeroDaVolta + ", tempoDaVoltaEmSegundos=" + tempoDaVoltaEmSegundos
				+ ", velocidadeMediaDaVolta=" + velocidadeMediaDaVolta + "]";
	}


	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public String getCodigoDoPiloto() {
		return codigoDoPiloto;
	}


	public void setCodigoDoPiloto(String codigoDoPiloto) {
		this.codigoDoPiloto = codigoDoPiloto;
	}


	public String getNomeDoPiloto() {
		return nomeDoPiloto;
	}


	public void setNomeDoPiloto(String nomeDoPiloto) {
		this.nomeDoPiloto = nomeDoPiloto;
	}


	public double getTempoDaVoltaEmSegundos() {
		return tempoDaVoltaEmSegundos;
	}


	public void setTempoDaVoltaEmSegundos(double tempoDaVoltaEmSegundos) {
		this.tempoDaVoltaEmSegundos = tempoDaVoltaEmSegundos;
	}


	public int getNumeroDaVolta() {
		return numeroDaVolta;
	}
	public void setNumeroDaVolta(int numeroDaVolta) {
		this.numeroDaVolta = numeroDaVolta;
	}
	public double getTempoDaVolta() {
		return tempoDaVoltaEmSegundos;
	}
	public void setTempoDaVolta(double tempoDaVoltaEmSegundos) {
		this.tempoDaVoltaEmSegundos = tempoDaVoltaEmSegundos;
	}
	public String getVelocidadeMediaDaVolta() {
		return velocidadeMediaDaVolta;
	}
	public void setVelocidadeMediaDaVolta(String velocidadeMediaDaVolta) {
		this.velocidadeMediaDaVolta = velocidadeMediaDaVolta;
	}
	
	
	
	
	

}
