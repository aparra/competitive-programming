package uva.problem;

import java.util.Scanner;

/** 
/* Problem: 272 - Tex Quotes 
/* Submission: 14770444
/* Run Time: 0.386 s 
 */
public class P00272_TexQuotes {

	private boolean isNotOpenQuotes = true;
	
	public String format(String input) {
		
		StringBuilder line = new StringBuilder(input);
		
		int index = -1;
		while ((index = line.indexOf("\"")) >= 0) {
			line.replace(index, index + 1, isNotOpenQuotes? "``" : "''");
			isNotOpenQuotes = !isNotOpenQuotes;
		}
		
		return line.toString();
	}

	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		P00272_TexQuotes main = new P00272_TexQuotes();
		
		while (in.hasNext()) {
			System.out.println(main.format(in.nextLine()));
		}
		in.close();
	}
}
