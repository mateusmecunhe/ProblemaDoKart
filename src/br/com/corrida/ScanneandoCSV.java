package br.com.corrida;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanneandoCSV {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("logPilotos.csv"));
		VoltaFactory voltaFactory = new VoltaFactory();
		ScannerDoCsv scannerCsv = new ScannerDoCsv();
		scannerCsv.lendoOCsv(scanner, voltaFactory);
		
		
		voltaFactory.getListaDePilotos().forEach(p ->{
			System.out.println(p);
			System.out.println(voltaFactory.calculaTotalDeVoltas(p));
		});
		
		System.out.println(voltaFactory.calculaTotalDeVoltas("F.ALONSO"));
		
		voltaFactory.getListaDePilotos().forEach(p->{
			System.out.println(p);
			System.out.println(voltaFactory.calculaTempoTotalDeProva(p));
			
		});
		
		voltaFactory.ordenaVencedor(voltaFactory.getListaDePilotos());

		scanner.close();
	}

}
