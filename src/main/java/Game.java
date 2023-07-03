import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Game {
    private static final String pokemonFile = "src\\2023-03-13-Pokemon.csv";
    private static final String attackFile = "src\\2023-04-03-Attacks.csv";

    BufferedReader reader = null;
    String line = "";
    String splitBy = ";";
    ArrayList<Pokemon> pokemonList = new ArrayList<>();
    ArrayList<Attack> attackList = new ArrayList<>();

    //Pokemon filereader
    public void pokemonFileReader

    {
        try {
            reader = new BufferedReader(new FileReader(pokemonFile));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] pokemonReader = line.split(splitBy);
                Pokemon pokemon = new Pokemon(Integer.parseInt(pokemonReader[0]), pokemonReader[1], pokemonReader[2], Integer.parseInt(pokemonReader[5]), Integer.parseInt(pokemonReader[6]), Integer.parseInt(pokemonReader[7]), Integer.parseInt(pokemonReader[9]));
                pokemonList.add(pokemon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Attack filereader
    public void attackFileReader

    {
        try {
            reader = new BufferedReader(new FileReader(attackFile));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] attackReader = line.split(splitBy);
                Attack attack = new Attack(attackReader[1], attackReader[3], Integer.parseInt(attackReader[5]));
                attackList.add(attack);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Fight{
        while (playerPokemon.getHP() > 0 && opponentPokemon.getHP() > 0) {
            Pokemon attacker, defender;
            if (playerPokemon.getSpeed() > opponentPokemon.getSpeed()) {
                attacker = playerPokemon;
                defender = opponentPokemon;
            } else {
                attacker = opponentPokemon;
                defender = playerPokemon;
            }
        }

        //damage calculation
        double damage = (getAttackPower) * attacker.getAttack() / defender.getDefense;
        defender.takeDamage((int) damage);
    }


    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }
}









