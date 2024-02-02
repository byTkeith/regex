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
            char[] eachIpUnit=fileValues.toCharArray();//splits the words into char values
            int numOfCommas=0;
            for(int i=0;i<eachIpUnit.length;i++){
                if(eachIpUnit[i]=='.'){
                    numOfCommas+=numOfCommas;
                }

            }
           
           
           
        }System.out.println("Done.");

        
    }
}
