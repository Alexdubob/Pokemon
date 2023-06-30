import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
                Integer pokemonIndex = Integer.parseInt(pokemonReader[0]);
                String pokemonName = pokemonReader[1];
                String pokemonType = pokemonReader[2];
                Integer pokemonHP = Integer.parseInt(pokemonReader[5]);
                Integer pokemonDefense = Integer.parseInt(pokemonReader[6]);
                Integer pokemonAttack = Integer.parseInt(pokemonReader[7]);
                Integer pokemonSpeed = Integer.parseInt(pokemonReader[9]);
                Pokemon pokemon = new Pokemon(pokemonIndex,pokemonName, pokemonType, pokemonHP, pokemonDefense, pokemonAttack, pokemonSpeed);
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


        Random random = new Random();
        int opponentChoice = random.nextInt(pokemonList.size());
        Pokemon opponentPokemon = pokemonList.get(opponentChoice);
        System.out.println("NPC got the Pokemon: " + opponentPokemon);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Pokemon");
        for (Pokemon p : pokemonList) {
            System.out.println(p);
        }
        String playerChoice = scanner.nextLine();
        Pokemon chosenPokemon = null;
        try {
            int index = Integer.parseInt(playerChoice)-1;
            chosenPokemon = pokemonList.get(index);
        }
        catch (NumberFormatException e){
            for(Pokemon p : pokemonList){
                if(p.getPokemonName().equalsIgnoreCase(playerChoice)){
                    chosenPokemon = p;
                    break;
                }
            }
        }
        if(chosenPokemon != null){
            System.out.println("Yor have chosen: " + chosenPokemon.getPokemonName());
        }
        else {
            System.out.println("Invalid choice. PLease try again.");
        }









      /* for (Attack a : attackList) {
            System.out.println(a);
        }*/

    }
}

