import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class pokemonFileReader {

    private static ArrayList<Pokemon> readPokemonFile(String filename) {
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] pokemonReader = line.split(";");
                Integer pokemonIndex = Integer.parseInt(pokemonReader[0]);
                String pokemonName = pokemonReader[1];
                String pokemonType = pokemonReader[2];
                int pokemonHP = Integer.parseInt(pokemonReader[5]);
                int pokemonDefense = Integer.parseInt(pokemonReader[6]);
                int pokemonAttack = Integer.parseInt(pokemonReader[7]);
                int pokemonSpeed = Integer.parseInt(pokemonReader[9]);
                Pokemon pokemon = new Pokemon(pokemonIndex, pokemonName, pokemonType, pokemonHP, pokemonDefense, pokemonAttack, pokemonSpeed);
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
