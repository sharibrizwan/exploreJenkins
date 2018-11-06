import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert {
public static void main(String[] args) {
		
	//	int []A = {-1,1,3,3,3,2,1,0};
	//final int[] A = {1, 2, -3, 4, 5, -6};

   // final int[] A = {5,10,18,7,8,3};
	int[] A={8,24,3,20,1,17};


		int []B = new int[A.length];
		B=Arrays.copyOf(A, A.length);

		Arrays.sort(B);
		Insert ser = new Insert();
		int N=5;
		int K=3;
		

		System.out.println(ser.solution(A));
		//solution(18);
	}

	
		
public int solution(final int[] A) {
	//public int solution(int N) {

	Arrays.sort(A);
    int minimum = Integer.MAX_VALUE;

    for (int i = 0; i < A.length - 1; i++) {
        final int temp = Math.abs(A[i + 1] - A[i]);
        if (temp <= minimum) {
            minimum = temp;
        }
    }
    return minimum;
}


}
