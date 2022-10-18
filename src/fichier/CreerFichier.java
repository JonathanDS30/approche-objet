package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	
	// Tp 15 créer le fichier 
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("D:\\DIGINAMIC\\Cours\\Cours Java\\Programmation orientée objet\\recensement.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		List<String> monFichier = new ArrayList<>();				
		for(int i = 1; i <= 100; i++) {
			monFichier.add(lines.get(i));
		}

		Path pathCible = Paths.get("D:\\DIGINAMIC\\monFichier.txt");
		Files.write(pathCible, monFichier);

	}

}
