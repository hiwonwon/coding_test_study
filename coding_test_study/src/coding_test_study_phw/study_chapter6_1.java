package coding_test_study_phw;

import java.util.Scanner;
import java.util.Stack;

public class study_chapter6_1 {
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public void solution(int n,int arr[]){

		
		for(int i=0;i<n-1;i++) {
			int min_index = i;	
			
			// 최솟값을 갖고있는 인덱스 찾기 
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
		
				}
		}
			swap(arr, min_index, i);	
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
	}

	public static void main(String[] args){
		study_chapter6_1 T = new study_chapter6_1();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		T.solution(n,arr);
	}
}
