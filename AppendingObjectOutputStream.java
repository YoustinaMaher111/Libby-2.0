package testforAppendingObjectOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
//The following code was taken from http://stackoverflow.com/a/1195078/6025511
//Many thanks to the person who provided it, brilliant solution!
public class AppendingObjectOutputStream extends ObjectOutputStream{
	

		  public AppendingObjectOutputStream(OutputStream out) throws IOException {
		    super(out);
		  }

		  @Override
		  protected void writeStreamHeader() throws IOException {
		    // do not write a header, but reset:
		    
		    reset();
		  }

		}