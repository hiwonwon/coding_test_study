package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter2_3 {
	public char[] solution(int num1[],int num2[],int n) {
	      char answer[]=new char[n];
	      for(int i=0;i<n;i++) {
	    	  if(num1[i]==num2[i]) {
	    		  answer[i]='D';
	    	  }
	    	  else if((num1[i]==1&&num2[i]==3)||(num1[i]==2&&num2[i]==1)||(num1[i]==3&&num2[i]==2))//A가 이기는 경우
	    	  {
	    		  answer[i]='A';
	    	  }
	    	  else//B가 이기는 경우
	    	  {
	    		  answer[i]='B';
	    	  }
	    	  }
	      
	      
	     
	      
	      return answer;
	   }
	   
	   public static void main(String[] args) {
	      study_chapter2_3 T=new study_chapter2_3();
	      Scanner kb = new Scanner(System.in);
	      int n=kb.nextInt();
	      int[] num1;	
	      num1 = new int[n];
	      for (int i = 0 ; i < n ; i++) {
				num1[i] = kb.nextInt();		
			}
	      int[] num2;	
	      num2 = new int[n];
	      for (int i = 0 ; i < n ; i++) {
				num2[i] = kb.nextInt();		
			}
	      for(char x : T.solution(num1,num2,n)){
				System.out.println(x+" ");
			}
		
	   }


}
