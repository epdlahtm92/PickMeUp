package PickMeUp;

import java.util.Scanner;

public class PickMeUp {

	public static char stars[] = {
			'a','b','c','d','e',
			'f','g','h','i','j',
			'k','l','m','n','o',
			'p','q','r','s','t',
			'u','v','w','x','y',
			'z','A','B','C','D',
			'E','F'};

	public static int roundsOf32[] = new int [32];
	public static int roundsOf16[] = new int [16];
	public static int quaterFinal[] = new int [8];
	public static int semiFinal[] = new int [4];
	public static int finalRound[] = new int [2];

	public static int choosenNumber1;
	public static int choosenNumber2; 

	public static int winOrLose[] = {
			2,2,2,2,2,
			2,2,2,2,2,
			2,2,2,2,2,
			2,2,2,2,2,
			2,2,2,2,2,
			2,2,2,2,2,
			2,2};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < stars.length; i++) {
			roundsOf32[i] = stars[i];
		//	System.out.print(roundsOf32[i]);
		}

		RoundsPlay(32);
		
		winOrLose = new int[16];
		for (int i = 0; i < winOrLose.length; i++) {
			winOrLose[i] = 2;
			System.out.println(winOrLose[i]);
		}
		

		//		int cnt = 0;
		//		while (cnt < 17) {
		//			int firstOne = Duelers();
		//			int secnondOne = Duelers();
		//
		//			while (firstOne == secnondOne) {
		//				secnondOne = Duelers();
		//			}
		//
		//			System.out.println();
		//			System.out.println("ROUND" + (cnt + 1));
		//			System.out.println(firstOne);
		//			System.out.println(secnondOne);
		//
		//			Scanner sc = new Scanner(System.in);
		//			int answer = sc.nextInt();
		//
		//			if (answer == firstOne) {
		//				winOrLose[firstOne] = 1;
		//				winOrLose[secnondOne] = 0;
		//			} else {
		//				winOrLose[secnondOne] = 1;
		//				winOrLose[firstOne]= 0;
		//			}
		//
		//			for (int i = 0; i < winOrLose.length; i++) {
		//				System.out.print(winOrLose[i] + " ");
		//			}
		//			cnt++;
		//		}
	}

	public static void NextRound () {

	}

	public static void RoundsPlay(int stage) {
		int cnt = 0;
		while (cnt < ((stage/2)+1)) {
			cnt++;
			int firstOne = Duelers();
			int secnondOne = Duelers();

			while (firstOne == secnondOne) {
				secnondOne = Duelers();
			}

			System.out.println();
			System.out.println("ROUND" + cnt);
			System.out.println(firstOne);
			System.out.println(secnondOne);

			Scanner sc = new Scanner(System.in);
			int answer = sc.nextInt();

			if (answer == firstOne) {
				winOrLose[firstOne] = 1;
				winOrLose[secnondOne] = 0;
			} else {
				winOrLose[secnondOne] = 1;
				winOrLose[firstOne]= 0;
			}

			for (int i = 0; i < winOrLose.length; i++) {
				System.out.print(winOrLose[i] + " ");
			}
			
		}
		
		for(int i = 0; i < stage; i++) {
			if (winOrLose[i] == 1) {
				roundsOf16[i] = stars[i]; 
			}
			System.out.println(roundsOf16[i]);
		}
	}

	public static int Duelers() {
		int res;
		while (true){
			int choosenNumber = (int)(Math.random() * 32);
			if (winOrLose[choosenNumber] == 2) {
				res = choosenNumber;
				break;
			} else {
				continue;
			}
		}
		return res;

	}

}
