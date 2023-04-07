package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] A = new int[9];
		
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		int max = A[0];
		int count = 0;
		for (int i=0; i<A.length; i++) {
			if(A[i] > max) {
				max = A[i];
			}
		}
		for (int i=0; i<A.length; i++) {
			if(A[i] == max) {
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}
