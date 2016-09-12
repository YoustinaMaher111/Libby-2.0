
package testforAppendingObjectOutputStream;
import java.io.*;
//import java.lang.*;
//import java.util.*;
public class test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	       File testfile=new File("E:\\testAppendingObjectetc\\testfile");
	      // if (!testfile.exists())
	    	//   testfile.createNewFile();
	       BufferedWriter text=null;
	       text=new BufferedWriter(new FileWriter(testfile));
	       text.append("This is a string!!");
	       if (text!=null)
	    	   text.close();
	       File storeSerialized=
	    		   new File("E:\\testAppendingObjectetc\\storeSerialized");
	       
	      
	      File fileRead =new File("E:\\testAppendingObjectetc\\fileRead");
	    if (fileRead.exists())
	    {
      	 AppendingObjectOutputStream newObj=
	    		   new AppendingObjectOutputStream(new FileOutputStream(storeSerialized));
	     //newObj.writeStreamHeader();  
      	 newObj.writeObject(testfile);
	    newObj.close();}
	    else
	    {fileRead.createNewFile();
	    ObjectOutputStream newObjX=
		   new ObjectOutputStream(new FileOutputStream(storeSerialized));
newObjX.writeObject(testfile);
	    newObjX.close();}
	    ObjectInputStream ois = 
       			new ObjectInputStream(new FileInputStream(storeSerialized));
	    //testfile.
	    fileRead=(File) ois.readObject();
      	   //if (!phList.exists())
		    //	phList.createNewFile();		
      	
      		//if (fileRead.exists())
      			//newObj.writeStreamHeader();
      	   //fileRead= (File) ois.readObject();
	    
	    ois.close();
      	
	      //File  phList=new File("E:\\"");
	      
	      
	      // newObj.writeStreamHeader();
	    //   newObj.close();
	       
	      // System.out.println(newObj);
	}

}

