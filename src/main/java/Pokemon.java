import java.util.ArrayList;
import java.util.Random;

public class Pokemon {

    private Integer pokemonIndex;
    private String pokemonName;
    private String pokemonType;
    private Integer healthPoints;



    private Integer maxHealth;
    private Integer attack;
    private Integer defense;
    private Integer speed;
    private ArrayList<Attack> pokemonAttacks;


    public Integer getPokemonIndex() {
        return pokemonIndex;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getMaxHealth() {
        return maxHealth;
    }

    public ArrayList<Attack> getPokemonAttacks() {
        return pokemonAttacks;
    }

    public Pokemon(PokedexEntry pokedexEntry) {
        this.pokemonIndex = pokedexEntry.getPokemonIndex();
        this.pokemonName = pokedexEntry.getPokemonName();
        this.pokemonType = pokedexEntry.getPokemonType();
        this.healthPoints = pokedexEntry.getHealthPoints();
        this.maxHealth = this.healthPoints;
        this.attack = pokedexEntry.getAttack();
        this.defense = pokedexEntry.getDefense();
        this.speed = pokedexEntry.getSpeed();

        Random random = new Random();
        AttackFileReader attackList;
        attackList = new AttackFileReader();

        this.pokemonAttacks = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            this.pokemonAttacks.add(attackList.getRandomAttack());
        }
    }

    public Attack getPokeAttack(int index) {
        if (index > pokemonAttacks.size() && index < 0) {
            throw new IllegalArgumentException ("invalid index");
        } else {
            return pokemonAttacks.get(index - 1);
        }
    }



    @Override
    public String toString() {
        return "Pokemon{" +
                "NR=" + pokemonIndex +
                ", Name='" + pokemonName + '\'' +
                ", Type='" + pokemonType + '\'' +
                ", HP=" + healthPoints +
                ", Attackpower=" + attack +
                ", Defense=" + defense +
                ", Speed=" + speed +
                ", Attacks= " + pokemonAttacks +
                '}';
    }
}
