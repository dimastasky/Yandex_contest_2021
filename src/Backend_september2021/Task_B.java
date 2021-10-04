import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_B {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("output.txt");
		PrintWriter writer = new PrintWriter("output.txt");
		Scanner input = new Scanner(new File("input.txt"));
		
		int n = input.nextInt();
		if (n<2 || n > 100) {
			input.close();
			fout.close();
			writer.close();
			System.exit(0);
		}
		//System.out.println(n);
		int m = input.nextInt();
		if (m<3 || m > 100) {
			input.close();
			fout.close();
			writer.close();
			System.exit(0);
		}
		//System.out.println(m);
		
		String[] lines = new String[n];
		input.nextLine();
		for(int i = 0; i < n; i++) {
				lines[i] = input.nextLine();
				//System.out.println(lines[i]); 
		}
		
		int k = input.nextInt();
		if (k<0 || k>n-1 || k>89) {
			input.close();
			fout.close();
			writer.close();
			System.exit(0);
		}
		//System.out.println(k);
		
		String[] name = new String[k];
		int[] count = new int[k];
		String[] symbol = new String[k];
		
		
		
		for (int i=0; i<k; i++) {
			name[i]=input.next();
			if (name[i].length()<1 || name[i].length()>10) {
				input.close();
				fout.close();
				writer.close();
				System.exit(0);
			}
			//System.out.println(name[i]);
			count[i]=input.nextInt();
			
			//System.out.println(count[i]);
			symbol[i]=input.next();
			//System.out.println(symbol[i]);
			char ch = symbol[i].charAt(0);
			int asciiValue = ch;
			 if (asciiValue <=32 || asciiValue >= 127) { 
				 input.close();
					fout.close();
					writer.close();
				 System.exit(0); 
			 }
			 if (symbol[i].equals("/") || symbol[i].equals("|") || symbol[i].equals("\\") || symbol[i].equals(".")) { 
				 input.close();
					fout.close();
					writer.close();	
				 System.exit(0); 
				 }
			
 		}
		
		for (int i = n-2; i>=0; i--) {
			for (int j=0; j<k; j++) {
				while(count[j] != 0) {
					lines[i] = lines[i].replaceAll("\\s", symbol[j]);
					count[j]--;
					i--;
				}
			}
		}
		for (int i=0; i<n; i++) {
			fout.write((lines[i]+"\n").getBytes());
			System.out.println(lines[i]);
		}
	
		input.close();
		fout.close();
		writer.close();
	}
}


