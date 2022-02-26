package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter6_5 {
	public char solution(int n,int arr[]){
		char answer='U';
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					answer='D';
					return answer;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args){
		study_chapter6_5 T = new study_chapter6_5();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n,arr));
	}
}
