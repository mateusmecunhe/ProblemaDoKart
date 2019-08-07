package br.com.corrida;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VoltaFactory {
	

	private List<Volta> listaDeVoltas = new ArrayList<Volta>();
	private Set<String> listaDePilotos = new HashSet<>();

	public List<Volta> getListaDeVoltas() {
		return listaDeVoltas;
	}

	public Set<String> getListaDePilotos() {
		return listaDePilotos;
	}

	public Volta criar(String hora, String codigoDoPiloto, String nomeDoPiloto, int numeroDaVolta,
			double tempoDaVoltaEmSegundos, String velocidadeMediaDaVolta) {
		Volta volta = new Volta(hora, codigoDoPiloto, nomeDoPiloto, numeroDaVolta, tempoDaVoltaEmSegundos,
				velocidadeMediaDaVolta);
		listaDeVoltas.add(volta);
		listaDePilotos.add(nomeDoPiloto);
		return volta;

	}

	public void adicionaVolta(Volta volta) {
		this.listaDeVoltas.add(volta);
		System.out.println("volta adicionada na lista de Voltas");
	}

	public Integer calculaTotalDeVoltas(String nomeDoPilotoAChecar) {
		Integer contador = 0;
		for (Volta volta : listaDeVoltas) {
			if (volta.getNomeDoPiloto().equals(nomeDoPilotoAChecar)) {
				contador++;
			}
		}

		System.out.println("O piloto " + nomeDoPilotoAChecar + " completou " + contador + " voltas");
		return contador;

	}

	public double calculaTempoTotalDeProva(String nomeDoPilotoAChecar) {
		double tempoTotalEmSegundos = 0;
		for (Volta volta : listaDeVoltas) {
			if (volta.getNomeDoPiloto().equals(nomeDoPilotoAChecar)) {
				if(calculaTotalDeVoltas(nomeDoPilotoAChecar) < 4) {
					System.out.println("o piloto " + volta.getNomeDoPiloto() + " não completou a prova");
					break;
				}else {
					tempoTotalEmSegundos += volta.getTempoDaVoltaEmSegundos();
				}
			}
		}
		return tempoTotalEmSegundos;
	}
	
	public List<String> ordenaVencedor(Set listaDePilotos) {
		List<String> listaOrdenada = new ArrayList<>();
		
		listaDePilotos.forEach(p->{
			double tempoDaProva;
			tempoDaProva = calculaTempoTotalDeProva((String) p);
			System.out.println((String) p + " fez a prova em " + tempoDaProva);
		});
		
		return listaOrdenada;
	}

}
