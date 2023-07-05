import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AttackFileReader {

    private final String attackFile = "src\\2023-04-03-Attacks.csv";

    private Map<Integer,Attack> attackEntriesById;
    private Map<String,Attack> attackEntriesByName;
    public AttackFileReader() {
        attackEntriesById = new HashMap<>();
        attackEntriesByName = new HashMap<>();
        ArrayList<Attack>tmpList = readAttackFile(attackFile);
        for (Attack element : tmpList){
            attackEntriesByName.put(element.getAttackName(),element);
            attackEntriesById.put(element.getAttackId(),element);
        }
    }

    public int attacklistSize() {
        return attackEntriesById.size();
    }

    private static ArrayList<Attack> readAttackFile(String filename) {
        ArrayList<Attack> attackList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] attackReader = line.split(";");
                Attack attack = new Attack(Integer.parseInt(attackReader[0]) ,attackReader[1], attackReader[3], Integer.parseInt(attackReader[5]));
                attackList.add(attack);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return attackList;
    }

    public Attack getRandomAttack() {
        ArrayList<Attack> tmpAttack = new ArrayList<>();
        for(Map.Entry<Integer, Attack> entry : attackEntriesById.entrySet()) {
            tmpAttack.add(entry.getValue());
        }
        Random rnd = new Random();
        int i = rnd.nextInt(tmpAttack.size());
        return tmpAttack.get(i);
    }
}


