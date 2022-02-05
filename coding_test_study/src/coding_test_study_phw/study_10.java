package coding_test_study_phw;

import java.util.ArrayList;
import java.util.Scanner;

public class study_10 {
	  public ArrayList<Integer> solution(String str,char t) {
		  int len = str.length();
	      ArrayList<Integer> answer = new ArrayList<>();
	      int min = len;
	      int a[]=new int[len];
	      int cnt=0;
	      char[]s=str.toCharArray();
	      for(int i=0;i<str.length();i++) {
	    	  if(s[i]==t) { 
	    		  a[cnt]=i;
	    		  cnt++;}
	      }
	      for(int i=0;i<str.length();i++) {
	    	  for(int j=0;j<cnt;j++) {
	    		  int dif=i-a[j];
	    		  if(dif<0)dif=-dif;
	    		  if(dif<min)min=dif;
	    	  }
	    	  answer.add(min);
	    	  min=len;
	      }
	      
	      return answer;
	   }
	   
	   public static void main(String[] args) {
	      study_10 T=new study_10();
	      Scanner kb = new Scanner(System.in);
	      String str=kb.next();
	      char c=kb.next().charAt(0);
	      for(int x:T.solution(str, c)) {
		    	 System.out.printf("%d ",x);
		     }
	   }

}
