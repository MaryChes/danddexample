package com.parents;

import com.app.Weapons.Weapon;

public class Elf extends CharacterClass {

	public Elf() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Added Weapon weapon 
	public Elf(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		super.setHealth(+100);
	}

	@Override
	public void setMagic(int magic) {
		// TODO Auto-generated method stub
		super.setMagic(+50);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("Legolas");
	}
	


}