package coding_test_study_phw;

import java.util.Scanner;
import java.util.Stack;

public class study_chapter5_4 {
	public int solution(String str){
		int answer=0;
		Stack<Integer> stack=new Stack<>();	
		for(char x:str.toCharArray()) {
			if(x=='+'||x=='-'||x=='*'||x=='/') {
				if(x=='+') {
					int a,b;
					a=stack.pop();
					b=stack.pop();
					//System.out.printf("%d ",a);
					stack.push((int)a+b);
				}
				else if(x=='-') {
					int a,b;
					a=stack.pop();
					b=stack.pop();
					//System.out.printf("%d ",a);
					stack.push((int)b-a);
				}
				else if(x=='*') {
					int a,b;
					a=stack.pop();
					b=stack.pop();
					//System.out.printf("%d ",a);
					stack.push((int)a*b);
				}
				else if(x=='/') {
					int a,b;
					a=stack.pop();
					b=stack.pop();
					//System.out.printf("%d ",a);
					stack.push((int)b/a);
				}
				
			}
			else {
				stack.push((int)x-48);
			}
		}
		answer=stack.get(0);
		return answer;
	}

	public static void main(String[] args){
		study_chapter5_4 T = new study_chapter5_4();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}
