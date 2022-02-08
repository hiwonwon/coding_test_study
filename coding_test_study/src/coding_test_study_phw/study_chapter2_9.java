package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter2_9 {
	public int solution(int n,int num[][]){
		int answer=0;
		int max=0;
		int hap1=0,hap2=0;
		for(int i=0;i<n;i++) {//각 행의 합
			for(int j=0;j<n;j++) {
				hap1+=num[i][j];
				hap2+=num[j][i];
			}
			if(hap1>max)max=hap1;
			hap1=0;
			if(hap2>max)max=hap2;
			hap2=0;
		}
		
		
		for(int i=0,j=0;i<n;i++,j++) {//각 대각선의 합
			hap1+=num[i][j];
			hap2+=num[i][n-j-1];
		}
		if(hap1>max)max=hap1;
		hap1=0;
		if(hap2>max)max=hap2;
		hap2=0;
		
		answer=max;
		
		return answer;
	}

	public static void main(String[] args){
		 study_chapter2_9 T = new study_chapter2_9();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int num[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			num[i][j]=kb.nextInt();
			}
		}
		System.out.print(T.solution(n,num));
		
	}

}
