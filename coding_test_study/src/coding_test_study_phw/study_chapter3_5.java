package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter3_5 {
	public int solution(int n){
		int answer=0;
		int tmp=0;
		int x=0;
		for(int i=1;i<=n;i++) { 
			while(tmp<n) {
				tmp+=i+x;
				//System.out.printf("%d\n",tmp);
				x++;
			}
			System.out.printf("%d\n",tmp);
			if(tmp==n)answer++;
			tmp=0;
			x=0;
		}
		
		answer--;
		return answer;
	

	}

	public static void main(String[] args){
		study_chapter3_5 T = new study_chapter3_5();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		System.out.print(T.solution(n));
	
	}
}
