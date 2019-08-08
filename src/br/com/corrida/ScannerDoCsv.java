package br.com.corrida;

import java.io.File;
import java.util.Scanner;

public class ScannerDoCsv {
	

	public void lendoOCsv(Scanner scanner, VoltaFactory voltaFactory) {
		
		while (scanner.hasNextLine()) {
			

			String linha = scanner.nextLine();
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(";");

			String hora = linhaScanner.next();
			
			String pilotoString = linhaScanner.next();
			
			//separando codigo do nome
			String[] pilotoDividindoString= pilotoString.split("–");
			String codigoDoPiloto = pilotoDividindoString[0].replaceAll("\\s+", "");
			String nomeDoPiloto = pilotoDividindoString[1].replaceAll("\\s+", "");
			
			
			
			int numeroDaVolta = linhaScanner.nextInt();
			
			//tempo da volta em String
			String tempoDaVolta = linhaScanner.next();
			
			//parseando...
			tempoDaVolta = tempoDaVolta.replaceAll("\\s+", "");
			String[] parseandoTempoDaVolta = tempoDaVolta.split(":");
			
			//transformando em double
			double minutos = Double.parseDouble(parseandoTempoDaVolta[0]);
			double segundos = Double.parseDouble(parseandoTempoDaVolta[1]);
			double segundosTotaisDaVolta = (minutos * 60) + segundos;
								
			String velocidadeMediaDaVolta = linhaScanner.next();
						


			
			voltaFactory.criar(hora, codigoDoPiloto, nomeDoPiloto, numeroDaVolta, segundosTotaisDaVolta, velocidadeMediaDaVolta);

			linhaScanner.close();

		}
		
	}
}