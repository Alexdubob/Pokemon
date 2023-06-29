import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String pokemonFile = "src\\2023-03-13-Pokemon.csv";
        String attackFile = "src\\2023-04-03-Attacks.csv";
        BufferedReader reader = null;
        String line = "";
        String splitBy = ";";
        ArrayList<String[]> pokemonList = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(pokemonFile));
            while ((line = reader.readLine()) != null) {
                String[] pokemonReader = line.split(splitBy);
                pokemonList.add(pokemonReader);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (String[] pokemon : pokemonList) {
            System.out.println("Pokemon = " + pokemon[1] + ", HP = " + pokemon[5]);
        }
    }
}

