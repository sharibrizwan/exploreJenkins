import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import javax.naming.BinaryRefAddr;

public class Search {

	public static void main(String[] args) {
		
		int []A = {1,2,4,5,3};
		int []B = new int[A.length];
		B=Arrays.copyOf(A, A.length);

		Arrays.sort(B);
		Search ser = new Search();
		System.out.println(ser.Solution(011100));
	}
	
	int Solution(int binary) {
		//char[] A = i.toCharArray();
		//int decimal=0;
		int sum = 0;
		int decimal=0;
		int power =0;
		int count=0;
		
		int parseInt = Integer.parseInt("011100", 2);
		
		
		
		//BigDecimal pow = Math.pow(11,100);
		String string = BigDecimal.valueOf(11).pow(1000).toString();
		
		//string.charAt("1");
		
		for (int i = 0; i < string.length(); i++) {
			
			if (string.charAt(i)=='1') {
				count =count+1;
			}			
		}
		
	
		
		
			//int count = 0;
			while (sum != 0) {
			if (sum % 2 == 0) {
			sum = sum / 2;
			count = count + 1;
			} else {
			sum = sum - 1;
			count = count + 1;
			}
			}
			return count;
			}


	}


