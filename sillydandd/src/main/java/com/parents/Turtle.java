package com.parents;

import com.app.Weapons.Weapon;

public class Turtle extends CharacterClass {

	public Turtle() {
		super();
		// TODO Auto-generated constructor stub
	}

	//added weapon
	public Turtle(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		super.setHealth(+25);
	}

	@Override
	public void setMagic(int magic) {
		// TODO Auto-generated method stub
		super.setMagic(+5);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("Raphael");
	}

}