import java.io.File;
import java.nio.file.Files;
import java.io.File;
import java.nio.file.*;
//import java.
public class sortString{
    //private static physics;
    //private static calculus;
    //programming;
	File libbyFiles=new File("F:\\","libbyFiles");
	String pathStr=libbyFiles.getAbsolutePath();
	Path pathOfFiles=Paths.get(pathStr);
	File physics=Files.createDirectories(pathOfFiles).toFile();
    public static void searchForKeywords(String stringToSort){
        if ((stringToSort.toLowerCase().contains("Physics".toLowerCase()))
        ||((stringToSort.toLowerCase().contains("velocity".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("momentum".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("free fall".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("magnitude".toLowerCase())))
        ||((stringToSort.toLowerCase().contains("electron".toLowerCase()))
        &&(stringToSort.toLowerCase().contains("negative charge".toLowerCase())))){
            physics+=stringToSort;
            stringToSort="";
        
        }
        if ((stringToSort.toLowerCase().contains("math".toLowerCase())
        ||(stringToSort.toLowerCase().contains("maths".toLowerCase())
        ||(stringToSort.toLowerCase().contains("calculus".toLowerCase())
        ||(stringToSort.toLowerCase().contains("integrate".toLowerCase())
        ||(stringToSort.toLowerCase().contains("differentiate".toLowerCase())
        ||(stringToSort.toLowerCase().contains("derivative".toLowerCase())
        ||(stringToSort.toLowerCase().contains("integral".toLowerCase())){
            calculus+=stringToSort;
            stringToSort="";
            //physics="";
            //programming="";
        }
        if ((stringToSort.toLowerCase().contains("programming".toLowerCase())
        ||(stringToSort.toLowerCase().contains("while loop".toLowerCase())
        ||(stringToSort.toLowerCase().contains("if condition".toLowerCase())
        ||(stringToSort.toLowerCase().contains("write code".toLowerCase())
        ||(stringToSort.toLowerCase().contains("code".toLowerCase()){
            programming=stringToSort;
            stringToSort="";
            
        }
        
    }
}