package coding_test_study_phw;

import java.util.Scanner;

public class study_6 {
	public String solution(String str) {
		String answer="";
		char[]s=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
			
		}
	      
	      return answer;
	   }
	   
	   public static void main(String[] args) {
	      study_6 T=new study_6();
	      Scanner kb = new Scanner(System.in);
	      String str=kb.next();
	      System.out.println(T.solution(str));
	   }

}
