package com.rahul;

public class String1 {

	public static void main(String[] args) {
		int count = 0;

		String srt = "aaashasuidgisdugygaaahhaaaa";
		int length = srt.length();
		for (int i = 0; i < length; i++) {
			if (srt.charAt(i) == 'a' && i + 1 < length && srt.charAt(i + 1) == 'a') {
				count++;
				i++;
			}
		}
		System.out.println(count);
	}

}
