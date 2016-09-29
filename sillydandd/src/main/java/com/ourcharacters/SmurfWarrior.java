package com.ourcharacters;

import com.app.Weapons.Weapon;
import com.interfaces.ClassInterface;
import com.interfaces.Warrior;
import com.parents.CharacterClass;
import com.parents.Smurf;

public class SmurfWarrior extends Smurf implements Warrior {

	public SmurfWarrior() {
		super();
		// TODO Auto-generated constructor stub
	}

	//added weapon
	public SmurfWarrior(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	//from warrior
	@Override
	public void changeHealth() {
		super.setHealth(+75);

	}

	//from warrior
	@Override
	public void changeMagic() {
		super.setMagic(+0);

	}
	
	//Overrode setWeapon
		@Override
		public void setWeapon(Weapon weapon) {
			super.setWeapon(Weapon.MACE);
		}

	

}
