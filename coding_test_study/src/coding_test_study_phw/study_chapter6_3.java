package coding_test_study_phw;
import java.util.Scanner;

public class study_chapter6_3 {

		private static void swap(int[] a, int i, int j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		public void solution(int n,int arr[]){

			
			for(int i=0;i<n;i++) {
				int target = arr[i];
				
				int j = i - 1;
			
				while(j >= 0 && target < arr[j]) {
					arr[j + 1] = arr[j];
					j--;
				}
				arr[j + 1] = target;
			}
			
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
				
			}
			
		}

		public static void main(String[] args){
			study_chapter6_3 T = new study_chapter6_3();
			Scanner kb = new Scanner(System.in);
			int n=kb.nextInt();
			int arr[]=new int [n];
			for(int i=0;i<n;i++) {
				arr[i]=kb.nextInt();
			}
			T.solution(n,arr);
		}
	}


