package com.ourcharacters;

import com.app.Weapons.Weapon;
import com.interfaces.ClassInterface;
import com.parents.CharacterClass;

public class HumanWizard extends CharacterClass implements ClassInterface {

	public HumanWizard() {
		super();
		// TODO Auto-generated constructor stub
	}

	//added weapon
	public HumanWizard(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(+0);

	}

	@Override
	public void changeMagic() {
		super.setMagic(+200);

	}

	//Overrode setWeapon
		@Override
		public void setWeapon(Weapon weapon) {
			super.setWeapon(Weapon.WAND);
		}


}
