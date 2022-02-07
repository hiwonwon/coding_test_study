package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter2_1 {
	public int[] solution(int num[],int n) {
	      int answer[]=new int[n];
	      int a=num[0];
	      int cnt=0;
	      for(int i=0;i<n;i++) {
	    	  if(i==0) {
	    		  answer[cnt]=num[i];
	    		  cnt++;
	    	  }
	    	  else {
	    		  if(num[i]>a) {
	    			  answer[cnt]=num[i];
		    		  cnt++;
	    		  }
	    		  a=num[i];
	    	  }
	      }
	      for(int x=0;x<cnt;x++){
				System.out.print(answer[x]+" ");
			}
	      
	      
	      
	      return answer;
	   }
	   
	   public static void main(String[] args) {
	      study_chapter2_1 T=new study_chapter2_1();
	      Scanner kb = new Scanner(System.in);
	      int n=kb.nextInt();
	      int[] num;	
	      num = new int[n];		
			for (int i = 0 ; i < n ; i++) {
				num[i] = kb.nextInt();		
			}
			T.solution(num, n);
	   }

}
