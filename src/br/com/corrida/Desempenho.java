package br.com.corrida;

public class Desempenho {
	private String codigoDoPiloto;
	private String nomeDoPiloto;
	private Integer voltasCompletadas;
	private double tempoTotalDaProva;

	@Override
	public String toString() {
		return "[código do Piloto = " + codigoDoPiloto + ", nome do piloto = " + nomeDoPiloto
				+ ", voltas completadas = " + voltasCompletadas + ", tempo total da prova = "
				+ formataTempoDeProva(tempoTotalDaProva) + "]";
	}

	private String formataTempoDeProva(double tempoTotalDaProva) {
		Integer minutos = (int) ((tempoTotalDaProva / 60));
		Integer segundos = (int) ((tempoTotalDaProva%60));
		return minutos.toString() + "minutos " + segundos.toString() + " segundos";
	}

	public Desempenho() {
	}

	public Desempenho(String codigoDoPiloto, String nomeDoPiloto, int voltasCompletadas, double tempoTotalDaVolta) {
		this.codigoDoPiloto = codigoDoPiloto;
		this.nomeDoPiloto = nomeDoPiloto;
		this.voltasCompletadas = voltasCompletadas;
		this.tempoTotalDaProva = tempoTotalDaVolta;
	}

	public String getCodigoDoPiloto() {
		return codigoDoPiloto;
	}

	public String getNomeDoPiloto() {
		return nomeDoPiloto;
	}

	public void setNomeDoPiloto(String nomeDoPiloto) {
		this.nomeDoPiloto = nomeDoPiloto;
	}

	public Integer getVoltasCompletadas() {
		return voltasCompletadas;
	}

	public void setVoltasCompletadas(Integer voltasCompletadas) {
		this.voltasCompletadas = voltasCompletadas;
	}

	public double getTempoTotalDaProva() {
		return tempoTotalDaProva;
	}

	public void setTempoTotalDaProva(double tempoTotalDaVolta) {
		this.tempoTotalDaProva = tempoTotalDaVolta;
	}

}
