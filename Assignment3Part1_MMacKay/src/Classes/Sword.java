package Classes;

import javax.swing.*;

public class Sword extends Weapon {
    private ImageIcon swordPic;

    //Constructors

    public Sword (int attack, int weight) {
        super(attack,weight);

        //Set image for this shape
        swordPic = new ImageIcon(this.getClass().getResource("/Images/sword.png"));
    }
    public ImageIcon getSwordPic() {
        return swordPic;
    }

    public void setWarriorPic(ImageIcon swordPic) {
        this.swordPic = swordPic;
    }

    //toString method to return a description of the object.

    public String toString() {
        return "I'm a circle named "  + ". " + super.toString()  ;
    }


    public String getWeaponInformString() {
        return "A sword is a good all-round weapon. " +
                "It is not too heavy and inflicts a lot of damage.";

    }

    public String getCharactorInformString() {
        return null;
    }
}
