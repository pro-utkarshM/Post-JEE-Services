package PostJeeSrevices;

import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class printClgGyan {
	static Scanner sc=new Scanner(System.in);
	
	public void clgGyan()throws IOException {
          System.out.println();
          boolean again=true;
          int n;
        
          do {
        	  
          System.out.println("1 :For Suggestions.");
          System.out.println("0 :To Exit.");
          System.out.println();
          System.out.print("Enter :");
          n=(int) ((Math.random() * (74)));
          int input=sc.nextInt();
          
          if(input==1) {
          
        	  try{
            String line = Files.readAllLines(Paths.get("clgGyan.txt")).get(n);
            System.out.println();
            System.out.println(line);
            System.out.println(); 
          } 
          catch(IOException e){
            System.out.println(e);
          }
	}
          else if(input==0) {
        	  input in=new input();
          	  in.menu();
          	  }
          
          else if(input!=0 && input!=1) {
        	  again=false;
              System.out.println("Enter one of the choices: ");
          }
    	  
          }while(again);
          
	}
}