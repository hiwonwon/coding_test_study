package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter3_6 {
	public int solution(int n, int k, int[]arr){
		int answer=0;
		int cnt=0;
		int x=k;
		int j=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			x=k;
			j=0;
			cnt=0;
			while(x>0&&i+j<n) {
				if(arr[i+j]==0) {
					x--;
					cnt++;
					j++;
				}
				else {
					cnt++;
					j++;
					
				}
				
			}
			if(cnt>max) {
				max=cnt;
				//System.out.printf("max=%d i=%d \n",max,i);
			}
		}
		answer=max;
		
		return answer;
	

	}

	public static void main(String[] args){
		study_chapter3_6 T = new study_chapter3_6();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	
	}
}
