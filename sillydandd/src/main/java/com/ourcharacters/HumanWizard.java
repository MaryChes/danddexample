package com.ourcharacters;

import com.app.Weapons.Weapon;
import com.interfaces.ClassInterface;
import com.interfaces.Wizard;
import com.parents.CharacterClass;
import com.parents.Human;

public class HumanWizard extends Human implements Wizard {

	public HumanWizard() {
		super();
		// TODO Auto-generated constructor stub
	}

	//added weapon
	public HumanWizard(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	
	//from wizard
	@Override
	public void changeHealth() {
		super.setHealth(health+0);

	}

	//from wizard
	@Override
	public void changeMagic() {
		super.setMagic(magic+200);

	}

	//Overrode setWeapon
		@Override
		public void setWeapon(Weapon weapon) {
			super.setWeapon(Weapon.WAND);
		}
		
	public static HumanWizard makeHumanWizard(){
		
		HumanWizard ourHuWizard = new HumanWizard();
		
		ourHuWizard.changeHealth();
		ourHuWizard.setHealth(0);
		
		ourHuWizard.setMagic(0);
		ourHuWizard.changeMagic();
		ourHuWizard.setName(null);
		ourHuWizard.setWeapon(null);
		
		
		
		return ourHuWizard;
		
		
		
	}


}
