package coding_test_study_phw;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class study_chapter5_1 {
	public String solution(String str){
		String answer="YES";
		Stack<Character> stack=new Stack<>();	
		for(char x:str.toCharArray()) {
			if(x=='(')stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}

	public static void main(String[] args){
		study_chapter5_1 T = new study_chapter5_1();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}
