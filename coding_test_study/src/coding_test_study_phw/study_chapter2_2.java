package coding_test_study_phw;

import java.util.Scanner;

public class study_chapter2_2 {
		public int solution(int num[],int n) {
		      int answer=1;
		      int max=num[0];
		      for(int i=0;i<n;i++) {
		    	  if(num[i]>max) {
		    		  answer++;
		    		  max=num[i];
		    	  }
		      }
		     
		      
		      return answer;
		   }
		   
		   public static void main(String[] args) {
		      study_chapter2_2 T=new study_chapter2_2();
		      Scanner kb = new Scanner(System.in);
		      int n=kb.nextInt();
		      int[] num;	
		      num = new int[n];
		      for (int i = 0 ; i < n ; i++) {
					num[i] = kb.nextInt();		
				}
		      System.out.println(T.solution(num,n));
			
		   }

}
