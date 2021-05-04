package me.telfrancesco.base64;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class Base64Tool {

	public static void main(String[] args) throws InterruptedException {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String messaggio = "";
			messaggio = reader.readLine();
			
			System.out.println("[----------------------+----------------------]");
			System.out.println("");
			System.out.println("-> Seleziona il metodo che vuoi eseguire <-");
			System.out.println("");
			System.out.println("1) Encode");
			System.out.println("2) Decode");
			System.out.println("");
			System.out.println("");
			System.out.println("[----------------------+----------------------]");
			
			if(messaggio.equals("1") || messaggio.equalsIgnoreCase("Encode")) {
				System.out.println("Ok, hai scelto Encode, mandami il testo da Codificare in Base64!");
				try {
					String input = reader.readLine();
					System.out.println("Stringa da Codificare: " + input);

					String encodedString = Base64.getEncoder().encodeToString(input.getBytes());
					System.out.println("Stringa codificata con successo!");

					System.out.println("Risultato finale: " + encodedString);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if(messaggio.equals("2") || messaggio.equalsIgnoreCase("Decode")) {
				System.out.println("Ok, hai scelto Decode, mandami il testo da Decodificare in Base64!");
				try {
					String input = reader.readLine();
					System.out.println("Stringa da Decodificare: " + input);

					byte[] decode = input.getBytes();
					byte[] output = Base64.getDecoder().decode(decode);
					String decodedString = new String(output);
					
					System.out.println("Stringa decodificata con successo!");
					System.out.println("Risultato finale: " + decodedString);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Non hai inserito un argomento valido! Uscita dal programma in corso..");
				System.exit(1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
