package coding_test_study_phw;

import java.util.Scanner;
import java.util.Stack;

public class study_chapter5_2 {
	public Stack<Character> solution(String str){
		String answer="YES";
		Stack<Character> stack=new Stack<>();	
		for(char x:str.toCharArray()) {
			if(x==')') {
				while(stack.peek()!='(') {
					System.out.print(stack.peek()+" ");
					stack.pop();
				}
				stack.pop();
				
			}
			else {
				stack.push(x);
			}
		}
		return stack;
	}

	public static void main(String[] args){
		study_chapter5_2 T = new study_chapter5_2();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}
