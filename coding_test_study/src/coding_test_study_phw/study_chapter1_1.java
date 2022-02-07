package coding_test_study_phw;

import java.util.*;
class study_chapter1_1{
   public int solution(String str,char t) {
      int answer=0;
      str=str.toUpperCase();
      t=Character.toUpperCase(t);
      for(int i=0;i<str.length();i++) {
         if(str.charAt(i)==t){
            answer++;
         }
      }
      
      
      return answer;
   }
   
   public static void main(String[] args) {
      study_chapter1_1 T=new study_chapter1_1();
      Scanner kb = new Scanner(System.in);
      String str=kb.next();
      char c=kb.next().charAt(0);
      System.out.print(T.solution(str, c));
   }
}