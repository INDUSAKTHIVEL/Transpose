package Transpose;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_transpose {
	public static int [][]mattrans(int arr[][], int n, int m)
	{
		int temp=0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if(i<j) {
					temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		return arr;
	}
		public static void main(String[] args)
		{
	Scanner sc = new Scanner(System.in);
	int i,j;
	int n = sc.nextInt();
	int m=sc.nextInt();
	int arr[][] = new int[n][m];
	{
	for( i=0; i<n; i++) {
		for( j=0;j<m;j++);{
			arr[i][j] = sc.nextInt();
		}
	}
	int a[][]=mattrans(arr,n,m);
	for(int[]value:a)
	{
		System.out.println(Arrays.toString(value));
	}
	
	}
	}
	}