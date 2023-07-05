public class Attack {
    private Integer attackId;

    private String attackName;

    private String attackType;

    private Integer attackPower;

    public Attack(Integer attackId, String attackName, String attackType, Integer attackPower) {
        this.attackId = attackId;
        this.attackName = attackName;
        this.attackType = attackType;
        this.attackPower = attackPower;
    }

    public Integer getAttackId() {
        return attackId;
    }

    public String getAttackName() {
        return attackName;
    }


    public Integer getAttackPower() {
        return attackPower;
    }

    @Override
    public String toString() {
        return "Attack{" +
                "AttackID='" + attackId + '\'' +
                "Name='" + attackName + '\'' +
                ", Type='" + attackType + '\'' +
                ", Power=" + attackPower +
                '}';
    }


}
