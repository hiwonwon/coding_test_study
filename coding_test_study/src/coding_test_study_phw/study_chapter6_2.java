package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter6_2 {
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public void solution(int n,int arr[]){

		
		for(int i=0;i<n;i++) {
			
			// 최솟값을 갖고있는 인덱스 찾기 
			for(int j = 0; j < n-1; j++) {
					if(arr[j]>arr[j+1]) {
						swap(arr,j,j+1);
						}
				}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
	}

	public static void main(String[] args){
		study_chapter6_2 T = new study_chapter6_2();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		T.solution(n,arr);
	}
}
