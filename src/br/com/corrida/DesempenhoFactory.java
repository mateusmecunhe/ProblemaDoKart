package br.com.corrida;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class DesempenhoFactory {

	private List<Desempenho> listaDeDesempenhos = new ArrayList<>();

	public List<Desempenho> getListaDeDesempenhos() {
		return listaDeDesempenhos;
	}

	
	public Desempenho criar(String codigoDoPiloto, String nomeDoPiloto, int voltasCompletadas,
			double tempoTotalDaProva) {
		Desempenho desempenho = new Desempenho(codigoDoPiloto, nomeDoPiloto, voltasCompletadas, tempoTotalDaProva);

		return desempenho;
	}

	//método para preencher lista de desempenhos com os resultados de cada um dos pilotos
	public List<Desempenho> preencheListaDeDesempenhos(VoltaFactory voltaFactory) {
		voltaFactory.getListaDePilotos().forEach(p->{
			String nomeDoPiloto = (String)p;
			String codigoDoPiloto = voltaFactory.findCodigoDoPiloto(p);
			int voltasCompletadas = voltaFactory.calculaTotalDeVoltas(p);
			double tempoTotalDaProva = voltaFactory.calculaTempoTotalDeProva(p);
			Desempenho desempenho = this.criar(codigoDoPiloto, nomeDoPiloto, voltasCompletadas, tempoTotalDaProva);
			listaDeDesempenhos.add(desempenho);
			});
		return listaDeDesempenhos;
		}

	//método que coloca em ordem de chegada
	public List<Desempenho> ordenaListaDeDesempenhos(List<Desempenho> listaDeDesempenhos) {
		//primeiro coloca no topo quem completou a prova, e depois os menores tempos
		listaDeDesempenhos.sort(Comparator.comparingInt(Desempenho::getVoltasCompletadas).reversed().thenComparingDouble(Desempenho::getTempoTotalDaProva));
		return listaDeDesempenhos;
	}
	
	//método que imprime as lista, incluindo a posição de cada piloto
	public void imprimeListaDeChegada(List<Desempenho> listaDeDesempenhos, VoltaFactory voltaFactory) {
		preencheListaDeDesempenhos(voltaFactory);
		ordenaListaDeDesempenhos(listaDeDesempenhos);
		for(Integer i = 0; i<listaDeDesempenhos.size(); i++) {
			System.out.println("Posição " + i.sum(i, 1) +" "+ listaDeDesempenhos.get(i) + "\n");
		}
	}

}
