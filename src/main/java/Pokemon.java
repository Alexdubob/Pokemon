class Pokemon {
    private Integer pokemonIndex;
    private String pokemonName;
    private String pokemonType;
    private Integer healthPoints;
    private Integer attack;
    private Integer defense;
    private Integer speed;

    public Integer getPokemonIndex(){
        return  pokemonIndex;
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

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Pokemon(Integer pokemonIndex,String pokemonName, String pokemonType, Integer healthPoints, Integer attack, Integer defense, Integer speed) {
        this.pokemonIndex = pokemonIndex;
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
        this.healthPoints = healthPoints;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "NR=" + pokemonIndex +
                ", Name='" + pokemonName + '\'' +
                ", Type='" + pokemonType + '\'' +
                ", HP=" + healthPoints +
                ", Attack=" + attack +
                ", Defense=" + defense +
                ", Speed=" + speed +
                '}';
    }
}
