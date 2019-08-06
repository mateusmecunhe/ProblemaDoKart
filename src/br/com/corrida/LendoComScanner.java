package br.com.corrida;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LendoComScanner {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("logPilotos.csv"));
		
		while (scanner.hasNextLine()) {

			String linha = scanner.nextLine();
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(";");

			String hora = linhaScanner.next();
			String piloto = linhaScanner.next();
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
						

			Voltas volta = new Voltas(hora, piloto, numeroDaVolta, segundosTotaisDaVolta, velocidadeMediaDaVolta);
			volta.adicionaVolta(volta);
			volta.adicionaPiloto(piloto);

			linhaScanner.close();

		}
		
		System.out.println(Voltas.getPilotos());
		System.out.println(Voltas.getVoltas());


//		System.out.println();
		
//		System.out.println(listaDeVoltas);
		scanner.close();
	}

}