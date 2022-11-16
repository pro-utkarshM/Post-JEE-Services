package PostJeeSrevices;

import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class movieSuggestion {
	int ln;
	int input;
	String movie;
	static Scanner sc=new Scanner(System.in);
	
	public void menu() throws IOException {
	System.out.println("1 :Documentries On StartUp.");
        System.out.println("2 :Documentries On Politics.");
        System.out.println("3 :Documentries On Biopics.");
        System.out.println("4 :Comedy.");
        
        System.out.println("0 :To Exit.");
        System.out.println();
        System.out.print("Enter :");
        input=sc.nextInt();
        cases();
	}
	
	public void cases() throws IOException {
		switch (input) {
        
		case 1 : {
        	movie="startupDocum.txt";
        	movie();
        }
        
        case 2 : {
        	movie="politicsDocum.txt";
        	movie();
        }
        
        case 3 : {
        	movie="biopicsDocu.txt";
        	movie();
            }
        
        case 4 : {
        	movie="comedy.txt";
        	movie();
        }
        
        case 0 : {
        	input in=new input();
        	in.menu();   	  
        }
        
        default : {
            System.out.println();
            System.out.println("Kindly select one of the available commands");
         }
    }
}

	public void movie()throws IOException {
        System.out.println();
        boolean again=true;
        do {

            System.out.println("1 :For Suggestions.");
            System.out.println("0 :To Exit.");
            System.out.println();
            System.out.print("Enter :");
            int yn=sc.nextInt();

        if(yn==1) {
      	  try{
          ln=(int) ((Math.random() * (40)));
          String line = Files.readAllLines(Paths.get(movie)).get(ln);
          System.out.println();
          System.out.println(line);
          System.out.println();
        } 
        
      	  catch(IOException e){
          System.out.println(e);
        }
        
        }
        else if(yn==0) {
      	  input in=new input();
        	  in.menu();
        }
        else if(yn!=0 && yn!=1) {
      	  again=false;
            System.out.println("Enter one of the choices: ");
            menu();
            System.out.println();
        }
        }while(again);
	}
}
