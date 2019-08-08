package br.com.corrida;

public class Desempenho {
	private String codigoDoPiloto;
	private String nomeDoPiloto;
	private int voltasCompletadas;
	private double tempoTotalDaProva;
	
	@Override
	public String toString() {
		return "Desempenho [codigoDoPiloto=" + codigoDoPiloto + ", nomeDoPiloto=" + nomeDoPiloto
				+ ", voltasCompletadas=" + voltasCompletadas + ", tempoTotalDaProva=" + tempoTotalDaProva + "]";
	}

	public Desempenho() {}
	
	public Desempenho(String codigoDoPiloto, String nomeDoPiloto, int voltasCompletadas,
			double tempoTotalDaVolta) {
		this.codigoDoPiloto = codigoDoPiloto;
		this.nomeDoPiloto = nomeDoPiloto;
		this.voltasCompletadas = voltasCompletadas;
		this.tempoTotalDaProva = tempoTotalDaVolta;
	}

	public String getCodigoDoPiloto() {
		return codigoDoPiloto;
	}
	public void setCodigoDoPiloto(String codigoDoPiloto) {
		codigoDoPiloto = codigoDoPiloto;
	}
	public String getNomeDoPiloto() {
		return nomeDoPiloto;
	}
	public void setNomeDoPiloto(String nomeDoPiloto) {
		this.nomeDoPiloto = nomeDoPiloto;
	}
	public int getVoltasCompletadas() {
		return voltasCompletadas;
	}
	public void setVoltasCompletadas(int voltasCompletadas) {
		this.voltasCompletadas = voltasCompletadas;
	}
	public double getTempoTotalDaProva() {
		return tempoTotalDaProva;
	}
	public void setTempoTotalDaProva(double tempoTotalDaVolta) {
		this.tempoTotalDaProva = tempoTotalDaVolta;
	}
	
	

}
