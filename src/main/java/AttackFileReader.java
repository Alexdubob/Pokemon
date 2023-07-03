import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class AttackFileReader {

    private static ArrayList<Attack> readAttackFile(String filename) {
        ArrayList<Attack> attackList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] attackReader = line.split(";");
                String attackName = attackReader[1];
                String attackType = attackReader[3];
                String attackPower = attackReader[5];
                Attack attack = new Attack(attackName, attackType, Integer.parseInt(attackPower));
                attackList.add(attack);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return attackList;
    }
}


