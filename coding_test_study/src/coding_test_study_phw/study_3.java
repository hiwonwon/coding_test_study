package coding_test_study_phw;

import java.util.Scanner;

public class study_3 {
	public String solution(String str) {
	      String answer="";
	      int m = Integer.MIN_VALUE;//미니멈 값을 초기값으로 대입
	      String[] s=str.split(" ");
	      for(String x:s) {
	    	  //System.out.println(x);
	    	  int len=x.length();
	    	  if(len>m) {
	    		  m=len;
	    		  answer=x;
	    	  }
	    	  
	      }
	      
	      
	      return answer;
	   }
	   
	   public static void main(String[] args) {
	      study_3 T=new study_3();
	      Scanner kb = new Scanner(System.in);
	      String str=kb.nextLine();
	      System.out.print(T.solution(str));
	   }

}
