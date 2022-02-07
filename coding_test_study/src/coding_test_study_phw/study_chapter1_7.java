package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter1_7 {
	 public String solution(String str) {
		 String answer = "NO";
		 str=str.toUpperCase();
		 String tmp =new StringBuilder(str).reverse().toString();
		 if(str.equals(tmp)) answer="YES";
	      
	      return answer;
	   }
	   
	   public static void main(String[] args) {
	      study_chapter1_7 T =new study_chapter1_7();
	      Scanner kb = new Scanner(System.in);
	      String str=kb.next();
	      System.out.print(T.solution(str));
	   }

}
