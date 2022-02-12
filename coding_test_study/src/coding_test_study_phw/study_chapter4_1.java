package coding_test_study_phw;

import java.util.HashMap;
import java.util.Scanner;

public class study_chapter4_1 {
	public char solution(int n,String str,HashMap map){
		char answer=0;
		int tmp=0;
		int max=Integer.MIN_VALUE;
		char[]s=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			tmp = (int) map.get(s[i]);
			tmp++;
			//System.out.printf("%d ", tmp);
			map.put(str.charAt(i),tmp);
			if(tmp>max) {max=tmp;
			answer=s[i];
			}
			
		}
		
		
		
		
		return answer;
	

	}

	public static void main(String[] args){
		study_chapter4_1 T = new study_chapter4_1();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String str=kb.next();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		// 값넣는 방법
		map.put('A', 0);
		map.put('B', 0);
		map.put('C', 0);
		map.put('D', 0);
		map.put('E', 0);
		
		System.out.print(T.solution(n,str,map));
	
	}
}
