package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter2_8 {
	public int[] solution(int n,int num[]){
		int answer[]=new int[n];
		int cnt=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				if(num[i]<num[j])cnt++;
			}
			answer[i]=cnt;
			cnt=1;
		}
		
		
		return answer;
	}

	public static void main(String[] args){
		 study_chapter2_8 T = new study_chapter2_8();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=kb.nextInt();
		}
		for(int x : T.solution(n,num)){
			System.out.print(x+" ");
		}
		
		
	}


}
