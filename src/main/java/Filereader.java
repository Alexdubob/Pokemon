import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class  Filereader {
    String pokemonFile = "src\\2023-03-13-Pokemon.csv";
    String attackFile = "src\\2023-04-03-Attacks.csv";
    BufferedReader reader = null;
    String line = "";
    String splitBy = ";";
    ArrayList<String[]> pokemonList = new ArrayList<>();

        try{
        reader = new BufferedReader(new FileReader(pokemonFile));
        while ((line = reader.readLine()) != null) {
            String[] pokemonReader = line.split(splitBy);
            pokemonList.add(pokemonReader);

        }
    } catch(
    Exception e)

    {
        e.printStackTrace();
    }
}