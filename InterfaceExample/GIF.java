package InterfaceExample;

import java.io.File;

import InterfaceExample.Interfaces.FileType;
import InterfaceExample.Interfaces.Playable;

// GIFs are a File that can be saved and loaded, so we implement the interface FileType
// They also have a playable aspect, so we implement Playable
public class GIF implements FileType, Playable{

	// Methods from FileType
	public void load(File f){
		System.out.println("Loading a GIF");
	}

	public void save(){
		System.out.println("Saving a GIF");
	}

	// Methods from Playable
	public void play(){
		System.out.println("Playing a GIF");
	}

}
