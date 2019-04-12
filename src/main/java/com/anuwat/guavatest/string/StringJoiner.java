package com.anuwat.guavatest.string;

import java.util.Arrays;

import com.google.common.base.Joiner;

public class StringJoiner {
	public static void main(String args[]) {
		StringJoiner tester = new StringJoiner();
		tester.testJoiner();
	}

	private void testJoiner() {
		System.out.println(Joiner.on(",").skipNulls().join(Arrays.asList(1, 2, 3, 4, 5, null, 6)));
	}
}