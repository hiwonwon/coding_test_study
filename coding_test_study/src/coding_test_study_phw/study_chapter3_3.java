package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter3_3 {
	public int solution(int n, int m, int[]a){
		int answer=Integer.MIN_VALUE;
		int tmp=0;
		for(int i=0;i<n-m;i++) {
			for(int j=0;j<m;j++) {
				tmp+=a[i+j];
			}
			if(tmp>answer)answer=tmp;
			tmp=0;
		}
		
		return answer;
	

	}

	public static void main(String[] args){
		study_chapter3_3 T = new study_chapter3_3();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, m, a));
	
	}
}
