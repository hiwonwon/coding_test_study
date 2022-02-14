package coding_test_study_phw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class study_chapter4_5 {
	public int solution(int n,int k,int arr[]){
		int answer=-1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				for(int l=j+1; l<n; l++){
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		//Tset.remove(143);
		//System.out.println(Tset.size());
		//System.out.println("first : "+ Tset.first());
		//System.out.println("last : "+ Tset.last());

		for(int x : Tset){
			//System.out.println(x);
			cnt++;
			if(cnt==k) return x;
		}
		return answer;
	}

	public static void main(String[] args){
		study_chapter4_5 T = new study_chapter4_5();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n,k,arr));
	}
}
