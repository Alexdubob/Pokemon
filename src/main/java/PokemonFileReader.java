import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class PokemonFileReader {
    private final String pokemonFile = "src\\2023-03-13-Pokemon.csv";


    private ArrayList<Pokemon> readPokemonFile(String filename) {
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        String line = "";
        String splitBy = ";";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pokemonFile));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] pokemonReader = line.split(splitBy);
                Pokemon pokemon = new Pokemon(Integer.parseInt(pokemonReader[0]), pokemonReader[1], pokemonReader[2], Integer.parseInt(pokemonReader[5]), Integer.parseInt(pokemonReader[6]), Integer.parseInt(pokemonReader[7]), Integer.parseInt(pokemonReader[9]));
                pokemonList.add(pokemon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pokemonList;
    }











    /*private static ArrayList<Pokemon> readPokemonFile(String filename) {
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new pokemonFileReader(pokemonFile))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] pokemonReader = line.split(";");
                String pokemonIndex = pokemonReader[0];
                String pokemonName = pokemonReader[1];
                String pokemonType = pokemonReader[2];
                String pokemonHP = (pokemonReader[5]);
                String pokemonDefense = pokemonReader[6];
                String pokemonAttack = pokemonReader[7];
                String pokemonSpeed = pokemonReader[9];
                Pokemon pokemon = new Pokemon(Integer.parseInt(pokemonIndex),pokemonName, pokemonType, Integer.parseInt(pokemonHP), Integer.parseInt(pokemonDefense), Integer.parseInt(pokemonAttack), Integer.parseInt(pokemonSpeed));
                pokemonList.add(pokemon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pokemonList;
    }*/
}
