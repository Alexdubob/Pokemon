public class CalculateDmg {
    private static double calculateDamage(Attack attackPower, Pokemon attackingPokemon, Pokemon defendingPokemon) {
        double attackPwr = attackPower.getAttackPower();
        double attackingPokemonPower = attackingPokemon.getAttack();
        double defendingPokemonDefense = defendingPokemon.getDefense();
        return (attackPwr * (attackingPokemonPower / defendingPokemonDefense));

    }
}
