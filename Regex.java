import java.io.*;
import java.util.*;
public class Regex {
    public static void main(String[] args) {
        ArrayList<String> ipFile=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter file with IP-Address:");
        String filename=scanner.nextLine();
        try{File file=new File(filename);
            scanner=new Scanner(file);
            while (scanner.hasNextLine()) {
                ipFile.add(scanner.nextLine());
            }

        }catch(FileNotFoundException e){
            System.out.println("ASKIES file not found.");
        }
        for(String fileValues: ipFile){//this loop loops over the entire file line by line
            String[] eachIpUnit=fileValues.split(".");//splits each line by the "."
            
        }
        
    }
}
