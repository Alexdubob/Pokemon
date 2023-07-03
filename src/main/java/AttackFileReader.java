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
                Attack attack = new Attack(attackReader[1], attackReader[3], Integer.parseInt(attackReader[5]));
                attackList.add(attack);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return attackList;
    }
}


