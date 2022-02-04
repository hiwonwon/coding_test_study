package coding_test_study_phw;

import java.util.Scanner;

public class study_8 {
	 public String solution(String str) {
		 String answer = "No";
		 str= str.toUpperCase().replaceAll("[^A-Z]", "");
		 String tmp =new StringBuilder(str).reverse().toString();
		 if(str.equals(tmp)) answer="Yes";
	      
	      return answer;
	   }
	   
	   public static void main(String[] args) {
	      study_8 T =new study_8();
	      Scanner kb = new Scanner(System.in);
	      String str=kb.nextLine();
	      System.out.print(T.solution(str));
	   }

}
