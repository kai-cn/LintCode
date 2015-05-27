

public class SingleNumber {

	public static void main(String[] args) {
		System.out.print(singleNumber(new int[]{1,2,2,1,3,4,3}));
	}
	
	public static int singleNumber(int[] A) {
		if (A.length == 0) {
			return 0;
		}

		int n = A[0];
		for(int i = 1; i < A.length; i++) {
			n = n ^ A[i];	//异或操作，如果相同的数异或值为0，那么剩下的就为多出的数了。
		}

		return n;
	
	}
}


