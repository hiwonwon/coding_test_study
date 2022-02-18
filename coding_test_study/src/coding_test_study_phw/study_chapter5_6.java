package coding_test_study_phw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class study_chapter5_6 {
	public int solution(int n,int k){
		int answer=0;
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			queue.offer(i);
		}
		while(queue.size()>1) {
			for(int j=0;j<k-1;j++) {
				int tmp=queue.poll();
				queue.offer(tmp);
			}
			queue.poll();
		}
		
		answer=queue.poll();
		return answer;
	}

	public static void main(String[] args){
		study_chapter5_6 T = new study_chapter5_6();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		System.out.println(T.solution(n,k));
	}
}
