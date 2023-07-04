public class Main {
    public static void main(String[] args) {
        Game g = new Game();
    }
}

    /*


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


        }*/








