package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter2_7 {
	public int solution(int n,int num[]){
		int answer=0;
		int cnt=0;
		for(int i=0;i<n;i++) {
			if(num[i]==1) {
				cnt++;
			}
			else {
				cnt=0;
			}
			if(cnt!=0) {
				answer+=cnt;
			}
		}
		
		return answer;
	}

	public static void main(String[] args){
		 study_chapter2_7 T = new study_chapter2_7();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=kb.nextInt();
		}
		System.out.print(T.solution(n,num));
		
	}
}
