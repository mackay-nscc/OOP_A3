package Classes;

import javax.swing.*;

public class Dagger extends Weapon {
    private ImageIcon daggerPic;

    //Constructors

    public Dagger(int attack, int weight) {
        super(attack,weight);

        //Set image for this shape
        daggerPic = new ImageIcon(this.getClass().getResource("/Images/dagger.png"));
    }

    public ImageIcon getDaggerPic() {
        return daggerPic;
    }

    public void setDaggerPic(ImageIcon daggerPic) {
        this.daggerPic = daggerPic;
    }

    @Override
    public String getCharactorInformString() {
        return null;
    }

    //toString method to return a description of the object.
    @Override
    public String toString() {
        return "I'm a circle named "  + ". " + super.toString()  ;
    }

    @Override
    public String getWeaponInformString() {

        return "A dagger is a light and fast weapon. " +
                "Classes with high agility are very effective when using this weapon. " +
                "It can maintain fast attack speed, but the increase in additional attack power is not high..";
    }
}
