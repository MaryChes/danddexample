package com.ourcharacters;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.ClassInterface;
import com.interfaces.Royal;
import com.parents.CharacterClass;
import com.parents.Elf;

public class ElfRoyal extends Elf implements Royal {

	public ElfRoyal() {
		super();
		// TODO Auto-generated constructor stub
	}

	//added weapon
	public ElfRoyal(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(-5);

	}

	@Override
	public void changeMagic() {
		super.setMagic(+40);

	}
	
	//Overrode setWeapon
		@Override
		public void setWeapon(Weapon weapon) {
			super.setWeapon(Weapon.SCROLL);
		}

	

}
