package br.com.corrida;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Voltas {
	
	
	private String hora;
	private String piloto;
	private int numeroDaVolta;
	private double tempoDaVoltaEmSegundos;
	private String velocidadeMediaDaVolta;
	
	static List<Voltas> listaDeVoltas = new ArrayList<Voltas>();

	static HashSet<String> setDePilotos = new HashSet<>();
	
	
	public Voltas(String hora, String piloto, int numeroDaVolta, double tempoDaVoltaEmSegundos, String velocidadeMediaDaVolta) {
		super();
		this.hora = hora;
		this.piloto = piloto;
		this.numeroDaVolta = numeroDaVolta;
		this.tempoDaVoltaEmSegundos = tempoDaVoltaEmSegundos;
		this.velocidadeMediaDaVolta = velocidadeMediaDaVolta;
	}
	
	public Voltas() {}
	
	public static List<Voltas> getVoltas(){
		return Voltas.listaDeVoltas;
	}
	
	public static HashSet<String> getPilotos(){
		return Voltas.setDePilotos;
	}
	
	public void adicionaVolta(Voltas volta) {
		this.listaDeVoltas.add(volta);
		System.out.println("volta adicionada na lista de Voltas");
	}
	
	public void adicionaPiloto(String piloto) {
		this.setDePilotos.add(piloto);
	}
	
	@Override
	public String toString() {
		return "Voltas [hora=" + hora + ", piloto=" + piloto + ", numeroDaVolta=" + numeroDaVolta + ", tempoDaVolta="
				+ tempoDaVoltaEmSegundos + ", velocidadeMediaDaVolta=" + velocidadeMediaDaVolta + "]";
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
