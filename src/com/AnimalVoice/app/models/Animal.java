package com.AnimalVoice.app.models;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	
   
    private String name;
    private int age;
    private float weight;
    private int size;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public Animal() {
		
	}
	
	public Animal(String name, int age, float weight, int size) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "\nName : "+ name +"\nAge : "+ age +"\nWeight : "+ weight+"\nSize : "+ size;
	}
	
	public void eat() {
	};

	public void sleep() {
	};

	public void run() {
	};


	public void ReadSound(String paht,String effectSource) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		Path AbsolutePath = FileSystems.getDefault().getPath("").toAbsolutePath();
		String fullPath = AbsolutePath + paht;
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(fullPath));
           
           Clip clip = AudioSystem.getClip();
           clip.open(audioIn);
           clip.start();
           System.out.println(effectSource+" sound is start ! ");
           System.out.println("s : "+clip.isActive());
           while(clip.isActive()) {
//System.out.println("hola "+effectSource);
}
           clip.close();
           System.out.println(effectSource+" sound is end ! ");
}

	

}
