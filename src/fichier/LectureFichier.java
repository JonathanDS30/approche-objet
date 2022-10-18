package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Popup;
import javax.swing.plaf.synth.Region;

public class LectureFichier {

	// Tp 15 lire le fichier
	public static void main(String[] args) throws IOException {
		Path pathFile = Paths.get("D:\\DIGINAMIC\\Cours\\Cours Java\\Programmation orientée objet\\recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

		List<Ville> listeVille = new ArrayList<>();

		for (int i = 1; i < lines.size(); i++) {
			String[] tab = lines.get(i).split(";");
			String nomVille = tab[6];
			int pop = Integer.parseInt(tab[9].replaceAll(" ", ""));
			String Region = tab[1];
			String departement = tab[0];
			Ville v = new Ville(nomVille, departement, Region, pop);
			listeVille.add(v);
			System.out.println(listeVille.get(i-1));
		}

		// lecture du fichier
//		for (String read : lines) {
//			System.out.println(read);
//		}

	}

}
