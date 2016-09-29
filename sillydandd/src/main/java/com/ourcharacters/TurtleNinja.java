package com.ourcharacters;

import com.app.Weapons.Weapon;
import com.interfaces.ClassInterface;
import com.interfaces.Ninja;
import com.parents.CharacterClass;
import com.parents.Turtle;

public class TurtleNinja extends Turtle implements Ninja {

	public TurtleNinja() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TurtleNinja(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	//from ninja
	@Override
	public void changeHealth() {
		super.setHealth(+20);

	}

	//from ninja
	@Override
	public void changeMagic() {
		super.setMagic(-5);

	}
	
	//Overrode setWeapon
		@Override
		public void setWeapon(Weapon weapon) {
			super.setWeapon(Weapon.NUNCHUCK);
		}



}
