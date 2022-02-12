package coding_test_study_phw;

import java.util.Arrays;
import java.util.Scanner;

public class study_chapter3_1 {
	public int[] solution(int n, int m, int[]a,int[]b){
		int answer[]=new int[n+m];
		for(int i=0;i<n;i++) {
			answer[i]=a[i];
		}
		for(int i=n,j=0;i<n+m;i++,j++) {
			answer[i]=b[j];
		}
		int tmp;
		Arrays.sort(answer);
		
		
		
		return answer;
	}

	public static void main(String[] args){
		study_chapter3_1 T = new study_chapter3_1();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		int m=kb.nextInt();
		int b[]=new int[m];
		for(int i=0; i<m; i++){
			b[i]=kb.nextInt();
			
		}
		
		for(int x:T.solution(n, m, a,b)){
			System.out.print(x+" ");
		}
	}
	}
