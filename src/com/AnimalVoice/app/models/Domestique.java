package com.AnimalVoice.app.models;

public class Domestique extends Animal{
	
	private String owner;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Domestique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Domestique(String name, int age, float weight, int size, String owner) {
		super(name, age, weight, size);
		this.owner = owner;
		// TODO Auto-generated constructor stub
	}
	
	public void play() {
		
	}

	@Override
	public String toString() {
		return "Domestique [owner=" + owner + ", toString()=" + super.toString() + "]";
	}

	
}
