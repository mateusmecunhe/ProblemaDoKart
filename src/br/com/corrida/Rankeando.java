package br.com.corrida;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Rankeando {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("logPilotos.csv"));
		VoltaFactory voltaFactory = new VoltaFactory();
		ScannerDoCsv scannerCsv = new ScannerDoCsv();
		scannerCsv.lendoOCsv(scanner, voltaFactory);
		DesempenhoFactory desempenhoFactory = new DesempenhoFactory();
		desempenhoFactory.preencheListaDeDesempenhos(voltaFactory);
		System.out.println(desempenhoFactory.getListaDeDesempenhos());
		
		System.out.println(voltaFactory.findCodigoDoPiloto("S.VETTEL"));
		
		
//		
//		voltaFactory.getListaDePilotos().forEach(p ->{
//			System.out.println(p);
//			System.out.println(voltaFactory.calculaTotalDeVoltas(p));
//		});
//		
//		System.out.println(voltaFactory.calculaTotalDeVoltas("F.ALONSO"));
//		
//		voltaFactory.getListaDePilotos().forEach(p->{
//			System.out.println(p);
//			System.out.println(voltaFactory.calculaTempoTotalDeProva(p));
//			
//		});
//		
//		System.out.println(voltaFactory.checaSeCompletouAProva("F.ALONSO"));

		scanner.close();
	}
	

}
