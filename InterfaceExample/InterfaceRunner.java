package InterfaceExample;

import InterfaceExample.Interfaces.FileType;
import InterfaceExample.Interfaces.Playable;

public class InterfaceRunner {
	public static void main(String[] args){
		// This example is to illustrate the usefulness of interfaces
		// We want to use them over class inheritance when we don't want to
		// be held to the data members of the parent class(es)
		// Because they only say what functions to implement,
		// we can implement as many interfaces as we want
		// even if they say to define the same method!
		GIF gif = new GIF(); // FileType and Playable
		MP3 mp3 = new MP3(); // FileType and Playable
		PNG png = new PNG(); // FileType

		// We can use the interfaces in type declarations!
		// Here, we make a FileType array which means we know
		// each element of the array has a save and load method
		FileType[] files = {gif,mp3,png};
		for(FileType file : files){
			file.load(null);
			file.save();
		}

		// Here, we make a Playable array which means we know
		// each element of the array has a play method
		Playable[] media = {gif,mp3};
		for(Playable v : media){
			v.play();
		}
	}
}
