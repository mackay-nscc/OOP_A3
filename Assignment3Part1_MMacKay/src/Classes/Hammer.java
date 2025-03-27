package Classes;

import javax.swing.*;

public class Hammer extends Weapon {

    //Declare circle-specific properties

    private ImageIcon hammerPic;

    //Constructors

    public Hammer(int attack, int weight) {
        super(attack,weight);


        //Set image for this shape
        hammerPic = new ImageIcon(this.getClass().getResource("/Images/hammer.png"));
    }

    public ImageIcon getHammerPic() {
        return hammerPic;
    }

    public void setHammerPic(ImageIcon hammerPic) {
        this.hammerPic = hammerPic;
    }

    //toString method to return a description of the object.
    @Override
    public String toString() {
        return "I'm a circle named "  + ". " + super.toString()  ;
    }

    @Override
    public String getWeaponInformString() {
        return "The hammer is a weapon with powerful attack power. " +
                "A single attack can create a high hit point. " +
                "However, it is a heavy weapon and has a slow attack speed. ";
    }
    @Override
    public String getCharactorInformString() {

        return null;
    }
}
