/**
 * 
 */
package com.souro;

/**
 * @author sourabrata
 *
 */
public class MissingNumberAndSequence {
	public static void main(String args[]) {
		int sample[] = { 1, 2, 3, 4, 5, 6, 8, 9 };
		int temp1 = sample[0];
		int temp2 = 1;
		for (int seq1 = 1; seq1 < sample.length; seq1 = seq1 + 1) {
			temp1 = temp1 ^ sample[seq1];
		}
		for (int seq2 = 2; seq2 <= sample.length + 1; seq2 = seq2 + 1) {
			temp2 = temp2 ^ seq2;
		}
		System.out.println("Missing Number here is: " + String.valueOf((temp1 ^ temp2)));
	}
}
