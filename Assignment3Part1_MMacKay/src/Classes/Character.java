package Classes;

public class Character {

    private String charName;
    private String classType;
    private String weaponName;

    public Character(String name, String classType, String weaponName){
        this.charName = name;
        this.classType = classType;
        this.weaponName = weaponName;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }


}
