package Backend_september2021;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task_A {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("output.txt");
		Scanner input = new Scanner(new File("input.txt"));
		
		int[][] a = new int[7][3];
		// Заполнение массива из файла
		for (int j=0; j<3; j++) {
			a[0][j] = input.nextInt();
			
		}
		// Заполнение столбцов массива 
		for (int i=1; i<7; i++) {
			for (int j=0; j<3; j++) {
				a[i][j] = a[0][j];
			}
		}
		// Изменение массива
		int z = 1;
		for (int f=0; f<3; f++) {
			for (int s=f+1; s<3; s++) {
				a[z][f] = a[z][f]-a[z][s];
				z++;
				a[z][f] = a[z][s]-a[z][f];
				z++;
			}
		}
		
		
		
		
		//for (int )
				
 	}

}
