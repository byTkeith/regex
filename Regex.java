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
            if(eachIpUnit.length>4||eachIpUnit.length<4){//if not within the range of an ip address
                System.out.println("length too long for an IP-Address.");
                    
            }
            for(int i=0;i<eachIpUnit.length;i++){//loops through the split values if above 4 then its not an ip address
                char[] unitLength=eachIpUnit[i].toCharArray();//splits each unit to char values
                int numValues=Integer.parseInt(eachIpUnit[i]);//converst each unit to a int value
                if(unitLength.length>3||)
                
            }
        }
        
    }
}
