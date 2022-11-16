package PostJeeSrevices;
import java.io.IOException;
import java.util.*;

public class input {
	
	static Scanner keyS=new Scanner(System.in);
	static Scanner keyI=new Scanner(System.in);
	static movieSuggestion movie=new movieSuggestion();
    static printClgGyan pr=new printClgGyan();
    static tryInClg tic=new tryInClg();
    
    int rank;
	String res = null;
	String gender;
    
	public void menu() throws IOException {
		int choice=-1;
        System.out.println("Welcome to POST JEE Services by UTKARSH :)");
        System.out.println();

        while (choice!=0) {
            System.out.println("1. For Councelling");
            System.out.println("2. Suggestions For College");
            System.out.println("3. Things To Try In College");
            System.out.println("4. Suggestions For Movies");
            System.out.println("0. for exit");
            System.out.println();

            System.out.print("Enter :");
            choice = keyI.nextInt();

            switch (choice) {
                case 1 -> {
                	requestRank();
                }
                case 2 -> {
                	pr.clgGyan();
                    }
                case 3 -> {
                	tic.menu();
                    }
                case 4 -> {
                    movie.menu();
                }
                case 0 -> {
                    System.out.println("Bye Bye... Tata :p");
                	System.exit(0);
                }
                
                default -> {
                    System.out.println();
                    System.out.println("Kindly select one of the available commands");
                 }
            }
        }

	}

	public void requestRank() throws IOException {
		
        	System.out.println();
        	System.out.print("Enter rank :");
        	rank=keyI.nextInt();
        	System.out.println();
        	System.out.println("Enter number for category >>");
        	int choice;
            System.out.println("1. OPEN");
            System.out.println("2. OPEN(PWD)");
            System.out.println("3. OBC-NCL");
            System.out.println("4. OBC-NCL(PWD)");
            System.out.println("5. GEN-EWS");
            System.out.println("6. SC");
            System.out.println("7. ST");
            System.out.println("0. TO EXIT");
            System.out.println();
            System.out.print("Enter :");
            
            choice = keyS.nextInt();

            switch (choice) {
            	case 0 : {
                menu();
                }
                
            	case 1 : {
                	res="OPEN";
                	break;
                }
                case 2 : {
                	res="OPEN(PWD)";
                	break;
                    }
                case 3 : {
                	res="OBC-NCL";
                	break;
                    }
                case 4 : {
                	res="OBC-NCL(PWD)";
                	break;
                }
                case 5 : {
                	res="GEN-EWS";
                	break;
                }
                case 6 : {
                	res="SC";
                	break;
                }
                case 7 : {
                	res="ST";
                	break;
                }
                
                default : {
                    System.out.println();
                    System.out.println("Kindly select one of the available commands");
                    requestRank();
                }
            }
    		requestGender();
	}
	
	public void requestGender() throws IOException {
        
			System.out.println();
            System.out.println("Enter number for Gender >>");
            System.out.println();
            System.out.println("1. Gender-Neutral");
            System.out.println("2. Female-only (including Supernumerary)");
            System.out.println("0. TO EXIT");
            System.out.println();
            System.out.print("Enter :");
            
            int choice;
            choice = keyS.nextInt();

            switch (choice) {
            	case 0 : {
            		menu();	
            	}
                
            	case 1 : {
                	gender="Gender-Neutral";
                	break;
                }
                case 2 : {
                	gender="Female-only (including Supernumerary)";
                	break;
                    }
                default : {
                    System.out.println();
                    System.out.println("Kindly select one of the available commands");
                    requestGender();
                }
            }
        System.out.println();
    
        Searching sort = new Searching(rank,res,gender);
        sort.SearchRank();
 

	}

}
