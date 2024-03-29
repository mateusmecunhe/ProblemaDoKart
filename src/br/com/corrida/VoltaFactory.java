package br.com.corrida;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//classe que coloca as voltas em uma lista e os pilotos em um set (sem repetição)
public class VoltaFactory {

	private List<Volta> listaDeVoltas = new ArrayList<Volta>();
	private Set<String> listaDePilotos = new HashSet<>();

	public ArrayList<Volta> getListaDeVoltas() {
		return (ArrayList<Volta>) listaDeVoltas;
	}

	public Set<String> getListaDePilotos() {
		return listaDePilotos;
	}

	//ao chamar esse método, cada uma das voltas é incluída na lista de voltas 
	//e o piloto é incluído no set caso ainda não tenha sido
	public Volta criar(String hora, String codigoDoPiloto, String nomeDoPiloto, int numeroDaVolta,
			double tempoDaVoltaEmSegundos, String velocidadeMediaDaVolta) {
		Volta volta = new Volta(hora, codigoDoPiloto, nomeDoPiloto, numeroDaVolta, tempoDaVoltaEmSegundos,
				velocidadeMediaDaVolta);
		listaDeVoltas.add(volta);
		listaDePilotos.add(nomeDoPiloto);
		return volta;

	}


	//calcula a quantidade de voltas que cada piloto deu
	public void adicionaVolta(Volta volta) {
		this.listaDeVoltas.add(volta);
	}

	public Integer calculaTotalDeVoltas(String nomeDoPilotoAChecar) {
		Integer contador = 0;
		for (Volta volta : listaDeVoltas) {
			if (volta.getNomeDoPiloto().equals(nomeDoPilotoAChecar)) {
				contador++;
			}
		}
		return contador;
	}

	//checa se o piloto completou todas as voltas
	public boolean checaSeCompletouAProva(String nomeDoPilotoAChecar) {
		if (calculaTotalDeVoltas(nomeDoPilotoAChecar).equals((Integer) 4)) {
			return true;
		} else {
			return false;
		}
	}

	public double calculaTempoTotalDeProva(String nomeDoPilotoAChecar) {
		double tempoTotalEmSegundos = 0;
		for (Volta volta : listaDeVoltas) {
			if (volta.getNomeDoPiloto().equals(nomeDoPilotoAChecar)) {
				
					tempoTotalEmSegundos += volta.getTempoDaVoltaEmSegundos();
				}
			}
		
		return tempoTotalEmSegundos;
	}

	public void adicionaNaListaASerOrdenada(List<Volta> listaDevoltas) {

	}

	public String findCodigoDoPiloto(String nomeDoPiloto) {
		for(int i = 0; i<listaDeVoltas.size();i++) {
			if(listaDeVoltas.get(i).getNomeDoPiloto().equals(nomeDoPiloto)) {
				return listaDeVoltas.get(i).getCodigoDoPiloto();
			} 
		}
		return "não encontrado";
		
	}


}
