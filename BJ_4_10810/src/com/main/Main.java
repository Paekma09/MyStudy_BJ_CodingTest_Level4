package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i=0; i<arr.length;i++) {
			arr[i] = 0;
		}
		for (int x=0; x<M; x++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for (int I=i-1;I<j;I++) {
				arr[I] = k;
			}
		}
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
