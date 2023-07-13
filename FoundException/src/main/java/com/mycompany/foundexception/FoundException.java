
package com.mycompany.foundexception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FoundException {

    public static void main(String[] args) {
        
        try
        {
            File file=new File("nonexistent.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String Line=scanner.nextLine();
                System.out.println("Line");
            }
            scanner.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error File Not");
        }
    }
}
