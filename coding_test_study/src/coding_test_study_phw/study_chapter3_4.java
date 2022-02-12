package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter3_4 {
	public int solution(int n, int m, int[]a){
		int answer=0;
		int tmp=0;
		int x=0;
		for(int i=0;i<n;i++) {
			while(tmp<=m&&i+x<n) {
				if(tmp!=m)tmp+=a[i+x];
				x++;
			}
			//System.out.printf("%d\n",tmp);
			if(tmp==m)answer++;
			tmp=0;
			x=0;
		}
		
		return answer;
	

	}

	public static void main(String[] args){
		study_chapter3_4 T = new study_chapter3_4();
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
