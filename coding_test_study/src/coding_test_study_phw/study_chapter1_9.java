package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter1_9 {
	 public int solution(String str) {
		 String answer = "";
		 for(char x:str.toCharArray()) {
			 if(Character.isDigit(x)) answer+=x;
			 
		 }
		 
	      
	      return Integer.parseInt(answer);
	   }
	   
	   public static void main(String[] args) {
	      study_chapter1_9 T=new study_chapter1_9();
	      Scanner kb = new Scanner(System.in);
	      String str=kb.next();
	      System.out.print(T.solution(str));
	   }

}
