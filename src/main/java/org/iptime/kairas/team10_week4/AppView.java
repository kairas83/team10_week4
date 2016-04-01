package org.iptime.kairas.team10_week4;

import java.util.Scanner;

public class AppView {
	private Scanner scan;
	
	public AppView(){
		scan = new Scanner(System.in);
	}
	
	public int inputInt(){
		return scan.nextInt();
	}
	
	public String inputString(){
		return scan.nextLine();
	}
	
	public void outputString(String output){
		System.out.print(output);
	}
}
