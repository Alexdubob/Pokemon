import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;

public class Game {

    PokemonFileReader pokemonList;
    AttackFileReader attackList;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public Game() {
        pokemonList = new PokemonFileReader();
        attackList = new AttackFileReader();

        System.out.println("Choose a Pokemon From the Pokedex");

        //Playerpokemon
        int userChoice = scanner.nextInt();
        if (userChoice > pokemonList.pokeDexSize() || userChoice < 0) {
            throw new IllegalArgumentException("Invalid Pokemon input");
        } else {
            PokedexEntry selecetedPokedexEntry = pokemonList.getPokedexEntriesById(userChoice);
            Pokemon playerPoke = new Pokemon(selecetedPokedexEntry);
            System.out.println("Your Pokemon is = " + playerPoke.getPokemonName() + playerPoke.getPokemonAttacks());


            //NPC Pokemon
            PokedexEntry randomPokedexEntry = pokemonList.getPokedexEntriesById(random.nextInt(selecetedPokedexEntry.getPokemonIndex()));
            Pokemon opponentPoke = new Pokemon(randomPokedexEntry);
            System.out.println("Opponents Pokemon = " + opponentPoke.getPokemonName() + opponentPoke.getPokemonAttacks());

            // Fight loop
            boolean playerTurn = true;
            while (playerPoke.getHealthPoints() > 0 && opponentPoke.getHealthPoints() > 0) {
                if ((playerPoke.getSpeed() >= opponentPoke.getSpeed() && playerTurn) || (playerPoke.getSpeed() < opponentPoke.getSpeed() && !playerTurn)) {                    System.out.println("It is the opponent's turn");
                    attackPokemon(opponentPoke, playerPoke, opponentPoke.getPokeAttack(random.nextInt(1, 2)));
                }
                else {
                    System.out.println("Select an attack: ");
                    System.out.println(playerPoke.getPokemonAttacks());
                    int playerAttackChoice = scanner.nextInt();
                    System.out.println("You chose " + playerPoke.getPokeAttack(playerAttackChoice));
                    attackPokemon(playerPoke, opponentPoke, playerPoke.getPokeAttack(playerAttackChoice));

                }
                playerTurn = !playerTurn;
            }
            if (playerPoke.getHealthPoints() < 0) {
                System.out.println("You lost the battle!");
            } else if (opponentPoke.getHealthPoints() < 0) {
                System.out.println("You won the battle!");
        }


        }
    }

    public static void attackPokemon(Pokemon attacker, Pokemon defender, Attack attack) {
        double damage = 1.0 / 25.0 * ((double) attack.getAttackPower() * ((double) attacker.getAttack() / (double) defender.getDefense()));
        double newHealthPoints = defender.getHealthPoints() - damage;
        defender.setHealthPoints((int) newHealthPoints);
        System.out.println(attacker.getPokemonName() + " attacks with " + attack.getAttackName() + "!");
        System.out.println(defender.getPokemonName() + " loses " + Math.round(damage) + " HP.");
        System.out.println(defender.getPokemonName() + " left with " + Math.round(newHealthPoints) + "HP");

    }
}












