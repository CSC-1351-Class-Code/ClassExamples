package InterfaceExample;

import java.io.File;

import InterfaceExample.Interfaces.FileType;
import InterfaceExample.Interfaces.Playable;

// MP3s are a File that can be saved and loaded, so we implement the interface FileType
// They also have a playable aspect, so we implement Playable
public class MP3 implements FileType, Playable{
	File[] frames;

	// Methods from FileType
	public void load(File f){
		System.out.println("Loading a MP3");
	}

	public void save(){
		System.out.println("Saving a MP3");
	}

	// Methods from Playable
	public void play(){
		System.out.println("Playing a MP3");
	}

}
