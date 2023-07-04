import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final String pokemonFile = "src\\2023-03-13-Pokemon.csv";
    private static final String attackFile = "src\\2023-04-03-Attacks.csv";
    BufferedReader reader = null;
    String line = "";
    String splitBy = ";";
    PokemonFileReader pokemonList;
    AttackFileReader attackList;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public Game() {
        pokemonList = new PokemonFileReader();
        new Pokemon(pokemonList.getPokedexEntriesById(3));
        new Pokemon(pokemonList.getPokedexEntriesByName("Pikachu"));
        attackList = new AttackFileReader();
        attackList.getAttackEntriesById(4);


        System.out.println("Choose a Pokemon From the Pokedex");


        int userChoice = scanner.nextInt();
        PokedexEntry selecetedPokedexEntry = pokemonList.getPokedexEntriesById(userChoice);
        Pokemon playerPoke = new Pokemon(selecetedPokedexEntry);
        System.out.println("Your Pokemon is = " + playerPoke.getPokemonName() + playerPoke.getPokemonAttacks());
        PokedexEntry randomPokedexEntry = pokemonList.getPokedexEntriesById(random.nextInt(selecetedPokedexEntry.getPokemonIndex()));
        Pokemon opponentPokemon = new Pokemon(randomPokedexEntry);
        System.out.print("Opponents Pokemon = " + opponentPokemon.getPokemonName() + opponentPokemon.getPokemonAttacks());



    }



   /* private Pokemon Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Pokemon.");
        String playerChoice = scanner.nextLine();
        Pokemon playerPokemon = null;

        try {
            // ToDo: Check User Input
            int index = Integer.parseInt(playerChoice);
            playerPokemon = new Pokemon(pokemonList.getPokedexEntriesById(index));
        } catch (NumberFormatException e) {
        }


        return Player();
    }*/
}

   /* private Pokemon NPC() {
        int opponentChoice = random.nextInt(pokemonList.size());
        Pokemon npcPokemon = pokemonList.getPokedexEntriesById(Integer.parseInt(String.valueOf(opponentChoice)));

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

    public Pokemon Fight() {
        Pokemon attacker = null;
        Pokemon defender = null;
        while (NPC().getHealthPoints() > 0 && Player().getHealthPoints() > 0) {
            if (Player().getSpeed() > NPC().getSpeed()) {
                attacker = Player();
                defender = NPC();
                System.out.println("which attack do you want to use? ");
                int
            } else {
                attacker = NPC();
                defender = Player();
            }
        }

        //damage calculation
        double damage = (attacker) * attacker.getAttack() / defender.getDefense();
        defender.takeDamage((int) damage);
    }


    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }
}*/









