package coding_test_study_phw;

import java.util.Scanner;

public class study_11 {
	 public String solution(String str) {
	      String answer="";
	      int cnt=1;
	      
	      char[]s=str.toCharArray();
			for(int i=0;i<s.length;i++) {
				if(i==s.length-1) {
					answer+=s[i];
					if(cnt!=1) {
						answer+=cnt;
					}
					
				}
				else {
					if(s[i]==s[i+1]) {
						cnt++;
						}
						if(s[i]!=s[i+1]) {
						answer+=s[i];
						if(cnt!=1) {
							answer+=cnt;
						}
						cnt=1;
				}
				
			}
					
					
				
			}
		      
	      
	      return answer;
	   }
	   
	   public static void main(String[] args) {
	      study_11 T=new study_11();
	      Scanner kb = new Scanner(System.in);
	      String str=kb.next();
	      System.out.print(T.solution(str));
	   }

}
