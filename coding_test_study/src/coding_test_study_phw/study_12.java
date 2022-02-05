package coding_test_study_phw;

import java.util.Scanner;

public class study_12 {
	 public String solution(String str,int n) {
	      String answer="";
	      int e;
	      String tmp="";
	      char[]s=str.toCharArray();
	      for(int i=0;i<s.length;i++) {
	    	  if(i==s.length-1) {
	    		  if(s[i]=='#')tmp+=1;
	    		  if(s[i]=='*')tmp+=0;
	    		  e=Integer.parseInt(tmp,2);
	    		  answer+=(char)e;
	    		  //System.out.print(tmp);
	    		  //System.out.printf("\n");
	    	  }
	    	  if(i%7==0) {
	    		  //System.out.print(tmp);
	    		  if(i!=0) {
	    			  e=Integer.parseInt(tmp,2);
		    		  answer+=(char)e;
	    		  }
	    		  //System.out.printf("\n");
		    	  tmp="";//ÃÊ±âÈ­
		    	  if(s[i]=='#')tmp+=1;
	    		  if(s[i]=='*')tmp+=0;
	    	  }
	    	  else {
	    		  if(s[i]=='#')tmp+=1;
	    		  if(s[i]=='*')tmp+=0;
	    	  }
	    	  
	      }	     
	      
	      return answer;
	   }
	   
	   public static void main(String[] args) {
	      study_12 T=new study_12();
	      Scanner kb = new Scanner(System.in);
	      int n=kb.nextInt();
	      String str=kb.next();
	      System.out.print(T.solution(str,n));
	   }

}
