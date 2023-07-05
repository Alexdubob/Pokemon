import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PokemonFileReader {
    private final String pokemonFile = "src\\2023-03-13-Pokemon.csv";
    private Map<Integer, PokedexEntry> pokedexEntriesById;
    private Map<String, PokedexEntry> pokedexEntriesByName;

    public PokemonFileReader() {
        pokedexEntriesById = new HashMap<>();
        pokedexEntriesByName = new HashMap<>();
        ArrayList<PokedexEntry> tmpList = readPokemonFile(pokemonFile);
        for (PokedexEntry element : tmpList
             ) {
            pokedexEntriesByName.put(element.getPokemonName(), element);
            pokedexEntriesById.put(element.getPokemonIndex(), element);
        }
    }
    public int pokeDexSize() {
        return pokedexEntriesById.size();
    }

    public ArrayList<PokedexEntry> readPokemonFile(String filename) {
        ArrayList<PokedexEntry> pokemonList = new ArrayList<>();
        String line = "";
        String splitBy = ";";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pokemonFile));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] pokemonReader = line.split(splitBy);
                PokedexEntry pokemon = new PokedexEntry(Integer.parseInt(pokemonReader[0]), pokemonReader[1], pokemonReader[2], Integer.parseInt(pokemonReader[5]), Integer.parseInt(pokemonReader[6]), Integer.parseInt(pokemonReader[7]), Integer.parseInt(pokemonReader[9]));
                pokemonList.add(pokemon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pokemonList;
    }

    public PokedexEntry getPokedexEntriesById(Integer id) {
        return pokedexEntriesById.get(id);
    }

    public PokedexEntry getPokedexEntriesByName(String name) {
        return pokedexEntriesByName.get(name);
    }


}
