package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	
	// Tp 15 créer le fichier 
	public static void main(String[] args) throws IOException {
		List<String> lines = new ArrayList<>();
		lines.add("Coucou");
		lines.add("Hello");
		lines.add("modification du fichier");

		Path pathCible = Paths.get("D:\\DIGINAMIC\\monFichier.txt");
		Files.write(pathCible, lines);

	}

}
