package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i=0; i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		for (int x=0; x<M; x++) {
			int i = sc.nextInt();
			int j = sc.nextInt();			
			int I = arr[i-1];
			int J = arr[j-1];
			arr[j-1] = I;
			arr[i-1] = J;
		}
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
