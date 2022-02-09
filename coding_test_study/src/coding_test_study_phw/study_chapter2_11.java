package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter2_11 {
	public int solution(int n,int num[][]){
		int answer=0;
		int max=Integer.MIN_VALUE;
		int tmp=0;
		int check=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<5;k++) {
				if(num[i][k]==num[j][k]&&i!=j&&check==0) {
					tmp++;
					check=1;
				}
				}
				check=0;
			}
			if(tmp>max) {
				max=tmp;
				answer=i+1;
			}
			tmp=0;
		}
	
		System.out.print(max+" ");
		return answer;
	}

	public static void main(String[] args){
		 study_chapter2_11 T = new study_chapter2_11();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int num[][]=new int[n][5];
		for(int i=0;i<n;i++) {
			for(int j=0;j<5;j++) {
				num[i][j]=kb.nextInt();
			}
		}
		System.out.print(T.solution(n,num));
		
	}

}
