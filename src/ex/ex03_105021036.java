﻿package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4) 
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021036 鄭東欣
 */
import java.util.Scanner;
public class ex03_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int h=1;
		for(int a=1;a<=n;a++){
			for(int b=1;b<=h;b++){
				System.out.print("*");
				
			}
			h++;
			System.out.println("");
		}

	}

}
