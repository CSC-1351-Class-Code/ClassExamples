package InterfaceExample.Interfaces;

import java.io.File;

// An interface that might describe files as
// they need a means to be saved and loaded
public interface FileType {
	public void load(File f);

	public void save();
}
