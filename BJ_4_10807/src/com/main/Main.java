package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		int[] v = new int[N];
		
		for (int i=0; i<v.length; i++) {
			v[i] = sc.nextInt();
		}
		
		int find;
		find = sc.nextInt();
		int count = 0;
		
		for (int i=0; i<v.length; i++) {
			if (find == v[i]) {
				count++;
			}
		}
		System.out.print(count);
	}
}
