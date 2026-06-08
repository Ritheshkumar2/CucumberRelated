package programs;

import java.util.ArrayList;
import java.util.List;

public class MoveAlZerostoLast {

	public static void main(String[] args) {
		//test();
		testone();

	}

	private static void testone() {
		int arr[]= {1,2,-2,-5,6,-9};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				System.out.print(arr[i]+" ");
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

	private static void test() {
		int[] arr= {1,2,0,0,1,3,2,0};
		
		List<Integer> object=new ArrayList<>();
		
		int zerocount=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				zerocount++;
			}else {
				object.add(arr[i]);
			}
		}
		
		for(int i=0;i<zerocount;i++) {
			object.add(0);
		}
		System.out.print(object);
		
	}

}
