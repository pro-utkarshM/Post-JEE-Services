package PostJeeSrevices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Searching {

	int rank;
	String res;
	String gender;
	static int nextSearch;
	int lineNo=-1;
	
		public Searching(int rank, String res, String gender) {
			this.rank=rank;
			this.res=res;
			this.gender=gender;
	}

		public Searching() {
			// Left Intensionally
	}

		public void SearchRank() throws IOException {
			int lowerLimit, upperLimit;
				
			Scanner orf = null;
			Scanner crf=null; 
			Scanner category=null;
			Scanner genderOpt=null;
			
			Searching ob=new Searching();
		
				try {
					
					orf = new Scanner(new FileInputStream("oRank.txt"));
					crf= new Scanner(new FileInputStream("cRank.txt"));
					genderOpt=new Scanner(new FileInputStream("gender.txt"));
					category=new Scanner(new FileInputStream("category.txt"));
		}
				catch(FileNotFoundException e) {
					
					System.out.println("Sorry, this file could not not be found.");
		}
			        
			String cat,genderCheck;
				
			while(orf.hasNextInt() && crf.hasNextInt() && category.hasNextLine() && genderOpt.hasNextLine()) {	
					lineNo++;
					lowerLimit= orf.nextInt();
					upperLimit= crf.nextInt();
					cat = category.nextLine();
					genderCheck=genderOpt.nextLine();
					
					if(cat.equals(res) && genderCheck.equals(gender)) {
						if(lowerLimit<=rank&& upperLimit>=rank ) {
							System.out.println("OR : "+lowerLimit+"  "+"CR : "+upperLimit);
							ob.getUniversity(lineNo);
							ob.getBranch(lineNo);
							ob.getQuota(lineNo);
							ob.getGender(lineNo);
							System.out.println();
					}
				}
			}
		}
		private void getGender(int lineNo1) throws IOException {
			String line1 = Files.readAllLines(Paths.get("gender.txt")).get(lineNo1);
	        System.out.println(line1);
		}

		private void getQuota(int lineNo2) throws IOException {
			String line2 = Files.readAllLines(Paths.get("StateQuota.txt")).get(lineNo2);
	        System.out.println(line2);
		}

		private void getBranch(int lineNo3) throws IOException {
			String line3 = Files.readAllLines(Paths.get("Branch.txt")).get(lineNo3);
	        System.out.println(line3);
		}
		
		private void getUniversity(int lineNo4) throws IOException {
			String line4 = Files.readAllLines(Paths.get("University.txt")).get(lineNo4);
	        System.out.println(line4);	
		}
}
