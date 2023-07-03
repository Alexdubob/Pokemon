import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /*private static final String attackFile = "src\\2023-04-03-Attacks.csv";
    private static final String pokemonFile = "src\\2023-03-13-Pokemon.csv";
    private static ArrayList<Pokemon> pokemonList = new ArrayList<>();
    private static ArrayList<Attack> attackList = new ArrayList<>();
    static Random random = new Random();
    public static void main(String[] args) {


        BufferedReader reader = null;
        String line = "";
        String splitBy = ";";

        PokemonFileReader pokeReader = new PokemonFileReader();

        pokemonList = pokeReader.readPokemonFile(pokemonFile);

        //Attack filereader
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

        //Print pokemonList
        for (Pokemon p : pokemonList) {
            System.out.println(p);
        }

        //Random Pokemon for the NPC
        System.out.println();
        System.out.println("NPC picked:" + NPC());
        //random Attack for the NPC
        Attack npcAttack1 = generateAttack();
        Attack npcAttack2 = generateAttack();
        System.out.println("NPC attacks are: " + npcAttack1 + npcAttack2);





        //Player picking a Pokemon
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Pokemon");
        String playerChoice = scanner.nextLine();
        Pokemon chosenPokemon = null;
        try {
            int index = Integer.parseInt(playerChoice) - 1;
            chosenPokemon = pokemonList.get(index);
            Pokemon playerPokemon = pokemonList.get(Integer.parseInt(playerChoice));
        } catch (NumberFormatException e) {
            for (Pokemon p : pokemonList) {
                if (p.getPokemonName().equalsIgnoreCase(playerChoice)) {
                    chosenPokemon = p;
                    break;
                }
            }
        }
        if (chosenPokemon != null) {
            System.out.println("Player picked: " + chosenPokemon.getPokemonName());
            //Players attacks
            int playerAttackChoice = random.nextInt(attackList.size());
            Attack playerAttack1 = attackList.get(playerAttackChoice);
            attackList.remove(playerAttack1);
            Attack playerAttack2 = attackList.get(playerAttackChoice);
            attackList.add(playerAttack1);
            System.out.println("Players attacks are: ");
            System.out.println(playerAttack1);
            System.out.println(playerAttack2);

        } else {
            System.out.println("Invalid choice. PLease try again.");
        }




        *//* boolean playerTurn;
        if (opponentPokemon.getSpeed() < playerPokemon.getSpeed()){
            playerTurn = true;


        }*//*


    }

    private static Pokemon NPC() {
        Random random = new Random();
        int opponentChoice = random.nextInt(pokemonList.size());
        Pokemon npcPokemon = pokemonList.get(Integer.parseInt(String.valueOf(opponentChoice)));


        int opponentAttackChoice = random.nextInt(attackList.size());
        Attack opponentAttack1 = attackList.get(opponentAttackChoice);
        attackList.remove(opponentAttack1);
        Attack opponentAttack2 = attackList.get(opponentAttackChoice);
        System.out.println("Opponents attacks are : ");
        System.out.println(opponentAttack1);
        System.out.println(opponentAttack2);
        attackList.add(opponentAttack1);

        return pokemonList.get(opponentChoice);

    }
    private static Attack generateAttack() {

        int randomAttackChoice = random.nextInt(attackList.size());
        Attack randomAttack = attackList.get(randomAttackChoice);

        while(attackList.contains(randomAttack)){
            randomAttackChoice = random.nextInt(attackList.size());
            randomAttack = attackList.get(randomAttackChoice);
        }
            return randomAttack;
        }*/

    }




