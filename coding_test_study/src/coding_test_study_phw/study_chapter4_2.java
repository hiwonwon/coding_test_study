package coding_test_study_phw;

import java.util.HashMap;
import java.util.Scanner;

public class study_chapter4_2 {
	public String solution(String str1,String str2){
		String answer="YES";
		HashMap<Character, Integer> map1=new HashMap<>();
		for(char x : str1.toCharArray()){
			map1.put(x, map1.getOrDefault(x, 0)+1); 
		}
		HashMap<Character, Integer> map2=new HashMap<>();
		for(char x : str2.toCharArray()){
			map2.put(x, map2.getOrDefault(x, 0)+1); 
		}
		for(char x : str1.toCharArray()) {
			if(map1.get(x)!=map2.get(x))answer="NO";
		}
		
		
		return answer;
	}

	public static void main(String[] args){
		study_chapter4_2 T = new study_chapter4_2();
		Scanner kb = new Scanner(System.in);
		String str1=kb.next();
		String str2=kb.next();
		System.out.println(T.solution(str1,str2));
	}
}
