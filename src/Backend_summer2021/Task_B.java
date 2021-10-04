package Backend_summer2021;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Set;

enum Seats{A,B,C,Z,D,E,F};

public class Task_B {
	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fout = new FileOutputStream("output2.txt");
		Scanner input = new Scanner(new File("input2.txt"));
		
		int n = input.nextInt();
		System.out.println(n);
		
		String[] lines = new String[n];
		
		for(int i = 0; i < n; i++) {
			lines[i] = input.next();
			System.out.println(lines[i]);
		}
		
		
		int m = input.nextInt();		
		System.out.println(m);
		
		int[] num = new int[m];
		String[] side = new String[m];
		String[] position = new String[m];
		
		Pattern pattern = Pattern.compile("[A-Za-z]*");
		
		for(int i = 0; i < m; i++) {
			num[i] = input.nextInt();
			side[i] = input.next(pattern);
			position[i] = input.next(pattern);
			System.out.println(num[i]);
			System.out.println(side[i]);
			System.out.println(position[i]);
		}
		
		boolean isFindPlace = false;
		
		/*
		 * StringBuilder[] newlines = new StringBuilder[n];
		 * 
		 * for(int i = 0; i < n; i++) { newlines[i].append(" "+lines[i]); }
		 */
		
		String seatsToTake = new String();
		
		HashMap<Integer, String> intsAndLetters = new HashMap<>();
		intsAndLetters.put(0, "A");
		intsAndLetters.put(1, "B");
		intsAndLetters.put(2, "C");
		intsAndLetters.put(4, "D");
		intsAndLetters.put(5, "E");
		intsAndLetters.put(6, "F");
	    Set<Integer> keys = intsAndLetters.keySet();
	    ArrayList<String> values = new ArrayList<>(intsAndLetters.values());

		
		for (int i=0; i<m; i++) {
			if (side[i].equals("left")) {
				if (position[i].equals("window")) {
					for (int j=0; j<n; j++) {
						int passangers = num[i];
							for (int z=0; z<num[i]; z++) {
								if (Character.toString(lines[j].charAt(z)).equals(".")) {
									passangers--;
								}
								if (passangers == 0) {
									StringBuilder sb = new StringBuilder(lines[j]);
									StringBuilder sb2 = new StringBuilder("");
									for (int k=0; k<num[i]; k++) {
										sb.setCharAt(k, '#');
										sb2.append(" ");
										sb2.append(j+1);
										sb2.append(values.get(k));
	
									}
									lines[j] = sb.toString();
									seatsToTake = sb2.toString();
									System.out.println("Passangers can take seats:"+seatsToTake);
									break;
								}
							}
					}
				}
				else {
					for (int j=0; j<n; j++) {
						int passangers = num[i];
						for (int z=2; num[i]>z+1; z++) {
							if (Character.toString(lines[j].charAt(z)).equals(".")) {
								passangers--;
							}
							if (passangers == 0) {
								StringBuilder sb = new StringBuilder(lines[j]);
								StringBuilder sb2 = new StringBuilder("");
								for (int k=0; k<num[i]; k++) {
									sb.setCharAt(k, '#');
									sb2.append(" ");
									sb2.append(j+1);
									sb2.append(values.get(k));

								}
								lines[j] = sb.toString();
								seatsToTake = sb2.toString();
								System.out.println("Passangers can take seats:"+seatsToTake);
								break;
							}
						}
					}
					
				}
			}
			else
			{
				System.out.println("  righttt");
			}
		}
		
	}
	
	
}