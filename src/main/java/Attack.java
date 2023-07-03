public class Attack {

   private String attackName;

   private String attackType;

   private Integer attackPower;


    public Attack(String attackName, String attackType, Integer attackPower){
       this.attackName = attackName;
       this.attackType = attackType;
       this.attackPower = attackPower;

   }

    public String getAttackName() {
        return attackName;
    }

    public String getAttackType() {
        return attackType;
    }

    public Integer getAttackPower() {
        return attackPower;
    }

    @Override
    public String toString() {
        return "Attack{" +
                "Name='" + attackName + '\'' +
                ", Type='" + attackType + '\'' +
                ", Power=" + attackPower +
                '}';
    }


}
