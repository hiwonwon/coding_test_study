package coding_test_study_phw;

import java.util.Scanner;
import java.util.Stack;

public class study_chapter5_3 {
	public int solution(int n,int arr[][],int m, int m_arr[]){
		int answer=0;
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j][m_arr[i]-1]!=0&&m_arr[i]-1<n) {
					stack.push(arr[j][m_arr[i]-1]);
					arr[j][m_arr[i]-1]=0;
					if(stack.size()>=2) {
						if(stack.get(stack.size()-1)==stack.get(stack.size()-2)) {
							stack.pop();
							stack.pop();
							answer+=2;
						}
					}
					break;
				}
			}
			
		}
		
		//System.out.print(stack);
		
		return answer;
	}

	public static void main(String[] args){
		study_chapter5_3 T = new study_chapter5_3();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int arr[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		int m=kb.nextInt();
		int m_arr[]=new int [m];
		for(int i=0;i<m;i++) {
			m_arr[i]=kb.nextInt();
		}
	
		System.out.println(T.solution(n,arr,m,m_arr));
	}
}
