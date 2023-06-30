import java.util.Random;

public class NPC {
    public int getRandomPokemon(){
        Random random = new Random();
        int randomNumber = random.nextInt(151);
        return randomNumber;

    }




}
