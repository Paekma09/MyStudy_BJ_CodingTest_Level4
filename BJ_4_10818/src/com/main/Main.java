package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, X;
		N = sc.nextInt();
		int[] A = new int[N];
		
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		int min = A[0];
		int max = A[0];
		for (int i=0; i<A.length; i++) {
			if (A[i] < min) {
				min = A[i];
			} 
		}
		for (int i=0; i<A.length; i++) {
			if(A[i] > max) {
				max = A[i];
			}
		}
		System.out.print(min+" "+max);
	}
}
