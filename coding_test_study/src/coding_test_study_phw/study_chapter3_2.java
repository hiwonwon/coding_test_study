package coding_test_study_phw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class study_chapter3_2 {
	public ArrayList<Integer> solution(int N, int M, int[]arr1, int[] arr2){
		ArrayList<Integer> answer = new ArrayList<>();
		
		int p1 = 0, p2 = 0;		//two pointers
		Arrays.sort(arr1); Arrays.sort(arr2);
		
		while(p1<N && p2<M) {
			if(arr1[p1] < arr2[p2]) p1++;
			else if(arr1[p1] == arr2[p2]) {
				answer.add(arr1[p1++]);
				p2++;
			} else p2++;
		}
		
		return answer;
	}

	public static void main(String[] args){
		study_chapter3_2 T = new study_chapter3_2();
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int[] arr1 = new int[N];
 		for(int i=0; i<N; i++) arr1[i] = kb.nextInt();
 		int M = kb.nextInt();
		int[] arr2 = new int[M];
 		for(int i=0; i<M; i++) arr2[i] = kb.nextInt();
 		for(int x : T.solution(N, M, arr1, arr2)) 
 			System.out.print(x + " ");
	}
}
