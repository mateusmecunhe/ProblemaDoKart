package br.com.corrida;

import java.util.List;

public class Voltas {
	
	
	private String hora;
	private String piloto;
	private int numeroDaVolta;
	private String tempoDaVolta;
	private String velocidadeMediaDaVolta;
	
	
	
	@Override
	public String toString() {
		return "Voltas [hora=" + hora + ", piloto=" + piloto + ", numeroDaVolta=" + numeroDaVolta + ", tempoDaVolta="
				+ tempoDaVolta + ", velocidadeMediaDaVolta=" + velocidadeMediaDaVolta + "]";
	}
	public Voltas(String hora, String piloto, int numeroDaVolta, String tempoDaVolta, String velocidadeMediaDaVolta) {
		super();
		this.hora = hora;
		this.piloto = piloto;
		this.numeroDaVolta = numeroDaVolta;
		this.tempoDaVolta = tempoDaVolta;
		this.velocidadeMediaDaVolta = velocidadeMediaDaVolta;
	}
	
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public int getNumeroDaVolta() {
		return numeroDaVolta;
	}
	public void setNumeroDaVolta(int numeroDaVolta) {
		this.numeroDaVolta = numeroDaVolta;
	}
	public String getTempoDaVolta() {
		return tempoDaVolta;
	}
	public void setTempoDaVolta(String tempoDaVolta) {
		this.tempoDaVolta = tempoDaVolta;
	}
	public String getVelocidadeMediaDaVolta() {
		return velocidadeMediaDaVolta;
	}
	public void setVelocidadeMediaDaVolta(String velocidadeMediaDaVolta) {
		this.velocidadeMediaDaVolta = velocidadeMediaDaVolta;
	}
	
	
	

}
