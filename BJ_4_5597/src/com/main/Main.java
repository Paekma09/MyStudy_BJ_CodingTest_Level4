package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[30];
		int x;
		
		for (int i=0; i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		for (int i =0; i<28; i++) {
			x = sc.nextInt();
			arr[x-1] = 0;
		}
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
