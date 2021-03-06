package rpg_lab;

import interfaces.Target;
import interfaces.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Hero {

    private String name;

    private int experience;

    private Weapon weapon;

    private List<Weapon> heroInventory;

    public Hero (String name, Weapon weapon) {

        this.name = name;
        this.experience = 0;
        this.weapon = weapon;
        this.heroInventory = new ArrayList<Weapon>();
    }

    public String getName ( ) {

        return this.name;
    }

    public int getExperience ( ) {

        return this.experience;
    }

    public Weapon getWeapon ( ) {

        return this.weapon;
    }

    public Iterable<Weapon> getInventory() {
        return this.heroInventory;
    }

    public void attack (Target target) {

        this.weapon.attack(target);

        if (target.isDead( )) {
            this.experience += target.giveExperience( );
        }
    }
}
