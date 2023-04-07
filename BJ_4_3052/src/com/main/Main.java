package com.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int x;
		int count=0;
		
		for (int i=0; i<arr.length;i++) {
			x = sc.nextInt();
			arr[i] = x%42;	
		}
		
		int[] Arr =  Arrays.stream(arr).distinct().toArray();
		System.out.println(Arr.length);
	}
}
