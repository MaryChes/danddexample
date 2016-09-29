package com.ourcharacters;

import com.app.Weapons.Weapon;
import com.interfaces.ClassInterface;
import com.interfaces.Jedi;
import com.parents.CharacterClass;
import com.parents.Twilek;

public class TwilekJedi extends Twilek implements Jedi {

	public TwilekJedi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TwilekJedi(int health, int magic, String name, Weapon weapon) {
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
