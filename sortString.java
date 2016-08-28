import java.io.File;
import java.io.IOException;
//import java.nio.file.Files;
//import java.io.File;
//import java.nio.file.*;
import java.io.FileWriter;
//import java.io.IOException;
import java.io.BufferedWriter;
public class sortString{
    //private static physics;
    //private static calculus;
    //programming;
	static File libbyFiles=new File("E:\\","libbyFiles");
	static String pathStr=libbyFiles.getAbsolutePath();
	static String pathStrPh=pathStr+"\\physics";
	static String pathStrCalc=pathStr+"\\calculus";
	static String pathStrProg=pathStr+"\\programming";
//	Path pathOfFiles=Paths.get(pathStr);
	
    static File physics=new File(pathStrPh);
    static File calculus=new File(pathStrCalc);
    static File programming=new File(pathStrProg);
    
    static File phCounter=new File("E:\\libbyFiles");//(pathStr+"\\phCounter");
    static File calCounter=new File(pathStr+"\\calCounter");
    static File progCounter=new File(pathStr+"\\progCounter");
    
    
	/*{try{File physics=new File(pathStrPh);
	}catch(FileAlreadyExistsException e1){
	}
		
	}*/
	
	
	/*{try
	{
		FileWriter fw1=new FileWriter ("physics",true);
		fw1.close();
	}
	catch(IOException ioe1)
	{
		System.err.println("IOException"+ioe1.getMessage());
	}}
	{try
	{
		FileWriter fw2=new FileWriter ("calculus",true);
		fw2.close();
	}
	catch(IOException ioe2)
	{
		System.err.println("IOException"+ioe2.getMessage());
	}}
	{
	try
	{
		FileWriter fw3=new FileWriter ("programming",true);
		fw3.close();
	}
	catch(IOException ioe3)
	{
		System.err.println("IOException"+ioe3.getMessage());
	}}*/
	
	
    public static void searchForKeywords(String stringToSort) throws IOException{
        if ((stringToSort.toLowerCase().contains("Physics".toLowerCase()))
        ||((stringToSort.toLowerCase().contains("velocity".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("momentum".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("free fall".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("magnitude".toLowerCase())))
        ||((stringToSort.toLowerCase().contains("electron".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("negative charge".toLowerCase())))){
            //physics.*=stringToSort;
        	//pathStrPh+="1";
        	//File 
        	BufferedWriter phWriter=null;
        	//try{
            	phWriter=new BufferedWriter(new FileWriter(phCounter));
            	phWriter.append('1');
            //}
        	//catch(IOException e1){
        		//System.err.println("IOException"+e1.getMessage()+"error 1");
        	//}
        	//finally{
        		//try{
        			if (phWriter!=null)
        				phWriter.close();
        		//}
        		//catch(IOException e1){
        			//System.err.println("IOException"+e1.getMessage()+"error 2");
        		//}
        	//}
        	//stringToSort+=""
        
        }
        if ((stringToSort.toLowerCase().contains("math".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("maths".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("calculus".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("integrate".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("differentiate".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("derivative".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("integral".toLowerCase()))){
        	BufferedWriter calWriter=null;
        	try{
            	calWriter=new BufferedWriter(new FileWriter(calCounter));
            	calWriter.append('1');
            }
        	catch(IOException e1){
        		System.err.println("IOException"+e1.getMessage());
        	}
        	finally{
        		try{
        			if (calWriter!=null)
        				calWriter.close();
        		}
        		catch(IOException e1){
        			System.err.println("IOException"+e1.getMessage());
        		}
        	}

            //calculus+=stringToSort;
           // stringToSort="";
            //physics="";
            //programming="";
        }
        if ((stringToSort.toLowerCase().contains("programming".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("while loop".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("if condition".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("write code".toLowerCase()))
        ||(stringToSort.toLowerCase().contains("code".toLowerCase()))){
        	BufferedWriter progWriter=null;
        	try{
            	progWriter=new BufferedWriter(new FileWriter(progCounter));
            	progWriter.append('1');
            }
        	catch(IOException e1){
        		System.err.println("IOException"+e1.getMessage());
        	}
        	finally{
        		try{
        			if (progWriter!=null)
        				progWriter.close();
        		}
        		catch(IOException e1){
        			System.err.println("IOException"+e1.getMessage());
        		}
        	}

            //programming=stringToSort;
            //stringToSort="";
            
        }
        
    }
}