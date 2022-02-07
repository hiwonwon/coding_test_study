package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter1_5 {
	public String solution(String str) {
		String answer;
		char[]s=str.toCharArray();
		int lt=0,rt=str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
			char tmp=s[lt];
			s[lt]=s[rt];
			s[rt]=tmp;
			lt++;
			rt--;
			}
			
		}
		answer=String.valueOf(s);//character�迭�� string���� ��ȯ
	      
	      return answer;
	   }
	   
	   public static void main(String[] args) {
	      study_chapter1_5 T=new study_chapter1_5();
	      Scanner kb = new Scanner(System.in);
	      String str=kb.next();
	      System.out.println(T.solution(str));
	   }

}
