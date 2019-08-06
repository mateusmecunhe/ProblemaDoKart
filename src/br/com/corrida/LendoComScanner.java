package br.com.corrida;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LendoComScanner {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("logPilotos.csv"));
		
		List<Voltas> listaDeVoltas = new ArrayList<Voltas>();
		
		HashSet<String> setDePilotos = new HashSet<>();
		
		while(scanner.hasNextLine()) {
			
			String linha = scanner.nextLine();
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(";");
			
			String hora = linhaScanner.next();
			String piloto = linhaScanner.next();
			int numeroDaVolta = linhaScanner.nextInt();
			String tempoDaVolta = linhaScanner.next();
			String velocidadeMediaDaVolta = linhaScanner.next();
			
			Voltas volta = new Voltas(hora, piloto, numeroDaVolta, tempoDaVolta, velocidadeMediaDaVolta);
			
			listaDeVoltas.add(volta);
			setDePilotos.add(piloto);
		}
		System.out.println(setDePilotos);
	}

}