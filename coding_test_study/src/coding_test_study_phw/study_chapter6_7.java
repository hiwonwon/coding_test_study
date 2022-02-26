package coding_test_study_phw;

import java.util.ArrayList;
import java.util.Scanner;

public class study_chapter6_7 {
	public void solution(int n, int[][]arr){
		int[][] answer=new int[n][2];
		
		for(int i=0; i<n-1; i++) {
			
			for(int j=i+1; j<n; j++) {
				int tmp[]=new int[2];
				if(arr[j][0]<=arr[i][0]) {
					if(arr[j][0]==arr[i][0]) {
						if(arr[j][1]<arr[i][1]) {
							tmp=arr[j];
							arr[j]=arr[i];
							arr[i]=tmp;
						}
					}
					else {
						tmp=arr[j];
						arr[j]=arr[i];
						arr[i]=tmp;
					}
					
				}
			}
			}
		for(int i=0; i<n; i++) {
				System.out.printf("%d %d\n",arr[i][0],arr[i][1]);
		}
	}
	public static void main(String[] args){
		study_chapter6_7 T = new study_chapter6_7();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[][] arr=new int[n][2];
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j]=kb.nextInt();
			}
			
		}
		T.solution(n,arr);
		
		
		
	}
}
