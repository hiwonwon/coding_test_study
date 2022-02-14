package coding_test_study_phw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class study_chapter4_3 {
	public ArrayList<Integer> solution(int n,int k,int arr[]){
		ArrayList<Integer>answer=new ArrayList<>();
		for(int i=0;i<=n-k;i++) {
			HashMap<Integer, Integer> map=new HashMap<>();
			for(int j=0;j<k;j++) {
				map.put(arr[i+j], map.getOrDefault(arr[i+j], 0)+1);
			}
			answer.add(map.size());
		}
		
		
		
		return answer;
	}

	public static void main(String[] args){
		study_chapter4_3 T = new study_chapter4_3();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		for(int x:T.solution(n,k,arr)) {
			System.out.print(x+" ");
		}
		
	}
}
