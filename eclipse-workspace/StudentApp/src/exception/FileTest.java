package exception;

import java.io.File;
import java.io.IOException;

public class FileTest {
void open() throws IOException, ClassNotFoundException{
	File f = new File("F://a.txt");
	f.createNewFile();
	Class.forName("com.a");
}
}




