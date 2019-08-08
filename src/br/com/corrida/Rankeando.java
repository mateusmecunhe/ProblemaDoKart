package br.com.corrida;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rankeando {
	public static void main(String[] args) throws FileNotFoundException {

		//chamando factories
		VoltaFactory voltaFactory = new VoltaFactory();
		DesempenhoFactory desempenhoFactory = new DesempenhoFactory();

		//chamando scanners e lendo o CSV
		Scanner scanner = new Scanner(new File("logPilotos.csv"));
		ScannerDoCsv scannerCsv = new ScannerDoCsv();
		scannerCsv.lendoOCsv(scanner, voltaFactory);
		
		//imprimindo lista com ordem de chegada
		desempenhoFactory.imprimeListaDeChegada(desempenhoFactory.getListaDeDesempenhos(), voltaFactory);

		//fechando scanner
		scanner.close();
	}
	

}
