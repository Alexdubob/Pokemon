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
        ArrayList<Attack> attackList = new ArrayList<>();


        try {
            reader = new BufferedReader(new FileReader(pokemonFile));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] pokemonReader = line.split(splitBy);

                String pokemonName = pokemonReader[1];
                String pokemonType = pokemonReader[2];
                Integer pokemonHP = Integer.parseInt(pokemonReader[5]);
                Integer pokemonDefense = Integer.parseInt(pokemonReader[6]);
                Integer pokemonAttack = Integer.parseInt(pokemonReader[7]);
                Integer pokemonSpeed = Integer.parseInt(pokemonReader[9]);
                Pokemon pokemon = new Pokemon(pokemonName, pokemonType, pokemonHP, pokemonDefense, pokemonAttack, pokemonSpeed);
                pokemonList.add(pokemon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

       /* for (Pokemon p : pokemonList) {
            System.out.println(p);
        }*/


        try {
            reader = new BufferedReader(new FileReader(attackFile));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] attackReader = line.split(splitBy);
                String attackName = attackReader[1];
                String attackType = attackReader[3];
                Integer attackPower = Integer.parseInt(attackReader[5]);
                Attack attack = new Attack(attackName, attackType, attackPower);
                attackList.add(attack);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

       for (Attack a : attackList) {
            System.out.println(a);
        }

    }
}

