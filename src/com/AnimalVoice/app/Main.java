package com.AnimalVoice.app;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.AnimalVoice.app.models.Animal;
import com.AnimalVoice.app.models.Caniche;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		
		Caniche caniche1 = new Caniche("Caniche", 2, 20, 50, "Taoufiq");
		Animal caniche2 = new Caniche("Caniche", 2, 20, 50, "Elhanchaoui");

		caniche2.ReadSound("\\SoundAnimal\\chien-11.wav","caniche1");
	}

}
