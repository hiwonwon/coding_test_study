package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter2_4 {
	public int[] solution(int n){
		int[] answer=new int[n];
		answer[0]=1;
		answer[1]=1;
		for(int i=2;i<n;i++) {
			answer[i]=answer[i-1]+answer[i-2];
		}
		
		return answer;
	}

	public static void main(String[] args){
		 study_chapter2_4 T = new study_chapter2_4();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		for(int x : T.solution(n)){
			System.out.print(x+" ");
		}
	}

}
