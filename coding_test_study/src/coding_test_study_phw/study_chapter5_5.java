package coding_test_study_phw;

import java.util.Scanner;
import java.util.Stack;

public class study_chapter5_5 {
	public int solution(String str){
		int answer=0;
		Stack<Character> stack=new Stack<>();
		char s[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(s[i]=='(') {
				stack.push(s[i]);
			}
			if(s[i]==')') {
				if(s[i-1]=='(') {
					stack.pop();
					//System.out.printf("%d \n",stack.size()+1);
					answer+=stack.size();
				}
				else {
					answer++;
					stack.pop();
				}
			}
		}
		return answer;
	}

	public static void main(String[] args){
		study_chapter5_5 T = new study_chapter5_5();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}
