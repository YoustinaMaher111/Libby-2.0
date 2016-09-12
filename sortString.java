import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.Serializable;
//import java.nio.file.Files;
//import java.io.File;
//import java.nio.file.*;
import java.io.FileWriter;
//import java.io.IOException;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
public class sortString implements Serializable{
    
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static File libbyFiles=new File("E:\\","libbyFiles");
	static String pathStr=libbyFiles.getAbsolutePath();
	static String pathStrPh=pathStr+"\\physics";
	static String pathStrCalc=pathStr+"\\calculus";
	static String pathStrProg=pathStr+"\\programming";

    static File physics=new File(pathStrPh);
    static File calculus=new File(pathStrCalc);
    static File programming=new File(pathStrProg);
    
    static File phCounter=new File(pathStrPh+"\\phCounter");
    static File calCounter=new File(pathStrCalc+"\\calCounter");
    static File progCounter=new File(pathStrProg+"\\progCounter");
        
    static File phystuff=new File(pathStrPh+"\\phystuff");
    
       
    public static ArrayList<File> physicsFiles=new ArrayList<File>();
	public static ArrayList<File>calculusFiles=new ArrayList<File>();
	public static ArrayList<File>programmingFiles=new ArrayList<File>();
	//physicsFiles.
    
    public static void makeDirs() throws IOException
    {if (!libbyFiles.exists())
    	libbyFiles.mkdir();
    if (!physics.exists())
    	physics.mkdir();
    if (!calculus.exists())
    	calculus.mkdir();
    if (!programming.exists())
    	programming.mkdir();
    if (!calCounter.exists())
    	calCounter.createNewFile();
    if (!phCounter.exists())
    	phCounter.createNewFile();
    if (!progCounter.exists())
    	progCounter.createNewFile();
    if(!phystuff.exists())
    	phystuff.createNewFile();
    
    	
    }
	
    public static void searchForKeywords(String stringToSort) throws IOException, ClassNotFoundException{
        
       
    	//physicsFiles.
    	if ((stringToSort.toLowerCase().contains("Physics".toLowerCase()))
        ||((stringToSort.toLowerCase().contains("velocity".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("momentum".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("free fall".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("magnitude".toLowerCase())))
        ||((stringToSort.toLowerCase().contains("electron".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("negative charge".toLowerCase())))){
    		BufferedWriter phWriter=null;        	
        	phWriter=new BufferedWriter(new FileWriter(phCounter));
        	phWriter.append('1');
        	if (phWriter!=null)
        		phWriter.close();
     
        	File content=new File(pathStrPh+"\\content"); 		
        	BufferedWriter text=null;
        	text=new BufferedWriter(new FileWriter(content));
        	text.append(stringToSort);
        	physicsFiles.add(content);
        	//System.out.println(content+"i'm out");
        	ObjectOutputStream oos = 
        			new ObjectOutputStream(new FileOutputStream(phystuff));
        	oos.writeObject(physicsFiles);
        	//oos.flush();
        	oos.close();
        	ObjectInputStream ois = 
        			new ObjectInputStream(new FileInputStream(phystuff));
        	 File  phList=new File(pathStrPh+"\\phList");

        	if (!phList.exists())
		    	phList.createNewFile();		
        	
        			
        	phList= (File) ois.readObject();
        	ois.close();
        	System.out.println(physicsFiles);
        	//BufferedWriter text2=null;
        	//text2=new BufferedWriter(new FileWriter((String)phList));
        	//text.append(stringToSort);
        	if (text!=null)
        		text.close();
        	
        			
        }
        if ((stringToSort.toLowerCase().contains("math".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("maths".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("calculus".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("integrate".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("differentiate".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("derivative".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("integral".toLowerCase()))){
        	BufferedWriter calWriter=null;
           	calWriter=new BufferedWriter(new FileWriter(calCounter));
            calWriter.append('1');
            //calCounter.
            if (calWriter!=null)
            	calWriter.close();
        		
        	File content=new File(pathStrCalc+"\\content"); 		
           	BufferedWriter text=null;
            text=new BufferedWriter(new FileWriter(content));
            text.append(stringToSort);
            calculusFiles.add(content);
            if (text!=null)
            	text.close();
            System.out.println(calculusFiles);
        }
        if ((stringToSort.toLowerCase().contains("programming".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("while loop".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("if condition".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("write code".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("code".toLowerCase()))){
        	BufferedWriter progWriter=null;
           	progWriter=new BufferedWriter(new FileWriter(progCounter));
            progWriter.append('1');
        
  			if (progWriter!=null)
  				progWriter.close();
        		
        	File content=new File(pathStrProg+"\\content"); 		
            BufferedWriter text=null;
           	text=new BufferedWriter(new FileWriter(content));
           	text.append(stringToSort);
           	programmingFiles.add(content);
           	if (text!=null)
           		text.close();
        }
        
    }
}