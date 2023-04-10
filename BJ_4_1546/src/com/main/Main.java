package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] scores = new int[N];
		int max = scores[0];
		double sum = 0;
		double avg = 0;
		
		for (int i=0; i<scores.length;i++) {
			int score = sc.nextInt();
			scores[i] = score;
		}
		
		for (int i=0; i<scores.length;i++) {
			if (scores[i]>max) {
				max = scores[i];
			}
		}
		
		for (int i =0; i<scores.length;i++) {
			sum += (double)scores[i] / max * 100;
		}
		
		avg = sum / N;
		System.out.println(avg);
	}
}
