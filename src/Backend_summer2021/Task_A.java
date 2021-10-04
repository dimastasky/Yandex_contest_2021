package Backend_summer2021;

import java.util.Scanner;
import java.io.*;

import java.nio.ByteBuffer;
public class Task_A {
	public static void main(String[] args) throws IOException {
		
		
		
		Scanner input = null;
		FileOutputStream fout = new FileOutputStream("output.txt");
		input = new Scanner(new File("input.txt"));
		
		int n = input.nextInt();
		
		int[] tank;
		tank = new int[100000];
		
		for (int i = 0; i < n; i++) {
			tank[i] = input.nextInt();
			System.out.println("tank "+tank[i]);
		}
		
		long sum = 0;
		for (int i = n-1; i > 0; i--) {
			if (tank[i] < tank[i-1]) {
				fout.write(String.valueOf(-1).getBytes());
				fout.close();
				input.close();
				System.exit(0);
			}
			else if(tank[i] >= tank[i-1]){
				sum = sum + tank[i] - tank[i-1];
			}
		}
		
		fout.write(String.valueOf(sum).getBytes());
		
		fout.close();
		input.close();
		
	}


}
