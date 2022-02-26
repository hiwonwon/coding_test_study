package coding_test_study_phw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class study_chapter6_8 {
	public  int solution(int n,int m, int[] arr){
		int answer=0;
		int[] tmp=arr.clone();
		Arrays.sort(tmp);
		for(int i=0; i<n; i++){
			if(tmp[i]==m)return i+1;
		}
		return answer;
	}
	public static void main(String[] args){
		study_chapter6_8 T = new study_chapter6_8();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.print(T.solution(n,m,arr));
	}
}
