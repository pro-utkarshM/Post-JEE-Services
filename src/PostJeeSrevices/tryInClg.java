package PostJeeSrevices;

import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class tryInClg {
	int input,ln,tl;
	String file;
	static Scanner sc=new Scanner(System.in);
	
	public void menu() throws IOException {
		System.out.println("1 :Suggest Languages for Coding.");
        System.out.println("2 :Suggest Resources.");
        System.out.println("3 :Suggest Participation.");
        System.out.println("4 :College Suggestion.");
        
        System.out.println("0 :To Exit.");
        System.out.println();
        System.out.print("Enter :");
        input=sc.nextInt();
        cases();
	}
	
	public void cases() throws IOException {
		switch (input) {
        
		case 1 : {
        	file="tryInClgAr_lang.txt";
        	tl=18;
        	print();
        }
        
        case 2 : {
        	file="tryInClgAr_pf.txt";
        	tl=6;
        	print();
        }
        
        case 3 : {
        	file="tryInClgAr_Cp.txt";
        	tl=7;
            print();
        }
        
        case 4 : {
        	file="tryInClgBL.txt";
        	tl=75;
            print();
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

	public void print()throws IOException {
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
          ln=(int) ((Math.random() * (tl)));; // The line number
          String line = Files.readAllLines(Paths.get(file)).get(ln);
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