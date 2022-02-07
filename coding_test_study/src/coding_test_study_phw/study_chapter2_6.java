package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter2_6 {
	public void solution(int n,int num[]){
		int answer[]=new int[n];
		int flip[]=new int[n];
		for(int i=0;i<n;i++) {
			int result=0;
			while(num[i]!=0) {
				result=result*10+num[i]%10;
				num[i]/=10;
			}
			flip[i]=result;
		}
		int cnt=0;
		int an_cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=2;j<flip[i];j++) {
				if(flip[i]%j==0)cnt++;
			}
			if(cnt==0&&flip[i]!=1) {
				answer[an_cnt]=flip[i];
				an_cnt++;
			}
			cnt=0;
		}
		for(int i=0;i<an_cnt;i++) {
			System.out.print(answer[i]+" ");
		}
	}

	public static void main(String[] args){
		 study_chapter2_6 T = new study_chapter2_6();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=kb.nextInt();
		}
		T.solution(n, num);
		
	}

}
