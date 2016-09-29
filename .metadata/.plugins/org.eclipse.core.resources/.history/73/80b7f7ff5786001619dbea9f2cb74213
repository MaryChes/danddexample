package com.ourcharacters;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.Elf;

public class ElfJedi extends Elf implements Jedi {
	
	//removed local jediWeapon
	public ElfJedi() {
		super();
		// TODO Auto-generated constructor stub
	}

	//added Weapon
	public ElfJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(+50);
		
	}

	@Override
	public void changeMagic() {
		super.setMagic(+100);

	}

	//Overrode setWeapon
	@Override
	public void setWeapon(Weapon weapon) {
		super.setWeapon(Weapon.LIGHTSABER);
	}
}
