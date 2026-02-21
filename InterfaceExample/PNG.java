package InterfaceExample;

import java.io.File;

import InterfaceExample.Interfaces.FileType;

// PNGs are a File that can be saved and loaded, so we implement the interface FileType
public class PNG implements FileType {
	// Methods from FileType
	public void load(File f){
		System.out.println("Loading a PNG");
	}

	public void save(){
		System.out.println("Saving a PNG");
	}
}
