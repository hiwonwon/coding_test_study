package coding_test_study_phw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class study_chapter5_8 {
	public int solution(int n,int m,int arr[]){
		int answer=0;
		Queue<Integer> queue = new LinkedList<Integer>();
		int md=arr[m];
		for(int i=0;i<n;i++) {
			if(arr[i]>md)queue.offer(arr[i]);
			if(arr[i]==md) {
				if(i<m)queue.offer(arr[i]);
			}
		}
		answer=queue.size()+1;
		
		return answer;
	}

	public static void main(String[] args){
		study_chapter5_8 T = new study_chapter5_8();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n,m,arr));
	}
}
