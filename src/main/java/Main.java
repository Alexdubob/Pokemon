import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String pokemonFile = "src\\2023-03-13-Pokemon.csv";
        String attackFile = "src\\2023-04-03-Attacks.csv";
        BufferedReader reader = null;
        String line = "";
        String splitBy = ";";
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        ArrayList<Pokemon> attackList = new ArrayList<>();


        try {
            reader = new BufferedReader(new FileReader(pokemonFile));
            while ((line = reader.readLine()) != null) {
                String[] pokemonReader = line.split(splitBy);

                String pokemonName = pokemonReader[1];
                String pokemonType = pokemonReader[2];
                Integer pokemonHP = Integer.parseInt(pokemonReader[5]);
                Integer pokemonDefense = Integer.parseInt(pokemonReader[6]);
                Integer pokemonAttack = Integer.parseInt(pokemonReader[7]);
                Integer pokemonSpeed = Integer.parseInt(pokemonReader[9]);
                Pokemon pokemon = new Pokemon(pokemonName,pokemonType,pokemonHP,pokemonDefense,pokemonAttack,pokemonSpeed);
                pokemonList.add(pokemon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(pokemonList);

       /* for (String[] pokemon : pokemonList) {
            System.out.println("Pokemon: " + pokemon[1]+ ", Type: " + pokemon[2] + ", HP: " + pokemon[5] +", Defense" + pokemon[7] +  ", Attack: " + pokemon[6] + ", Speed: " + pokemon[9]) ;
        }*/


        /*try {
            reader = new BufferedReader(new FileReader(attackFile));
            while ((line = reader.readLine()) != null) {
                String[] attackReader = line.split(splitBy);
                attackList.add(attackReader);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (String[] attack : attackList) {
            System.out.println("Attack = " + attack[1] +", Type: " + attack[3] +  ", Power = " + attack[5]);
        }*/
    }
}

