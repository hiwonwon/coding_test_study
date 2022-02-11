package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter2_10 {
	public int solution(int n,int num[][]){
		int answer=0;
		for(int i=0;i<=n+1;i++) {
			for(int j=0;j<=n+2;j++) {
				if(i!=0&&j!=0&&j!=n+2&&i!=n+2) {
					if(num[i][j]>num[i-1][j]&&num[i][j]>num[i][j-1]&&num[i][j]>num[i+1][j]&&num[i][j]>num[i][j+1]) {
						answer++;
					}
				}
			}
		}
	
		
		return answer;
	}

	public static void main(String[] args){
		 study_chapter2_10 T = new study_chapter2_10();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int num[][]=new int[n+2][n+2];
		for(int i=0;i<=n+2;i++) {
			for(int j=0;j<=n+2;j++) {
				if(i==0||j==0||j==n+2||i==n+2) {
					num[i][j]=0;
				}
				else num[i][j]=kb.nextInt();
			}
		}
		System.out.print(T.solution(n,num));
		
	}


}
