package coding_test_study_phw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class study_chapter5_7 {
	public String solution(String str1,String str2){
		String answer="YES";
		Queue<Character> queue = new LinkedList<Character>();
		for(char x:str1.toCharArray()) {
			queue.offer(x);
		}
		for(char x:str2.toCharArray()) {
			if(queue.contains(x)) {
				if(queue.poll()!=x) {
					return "NO";
				}
			}
		}
		if(queue.size()!=0)return "NO";
		
		return answer;
	}

	public static void main(String[] args){
		study_chapter5_7 T = new study_chapter5_7();
		Scanner kb = new Scanner(System.in);
		String str1=kb.next();
		String str2=kb.next();
		System.out.println(T.solution(str1,str2));
	}
}
