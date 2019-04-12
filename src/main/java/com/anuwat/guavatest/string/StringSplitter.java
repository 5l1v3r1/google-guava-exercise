package com.anuwat.guavatest.string;

import com.google.common.base.Splitter;

public class StringSplitter {
	   public static void main(String args[]) {
		   StringSplitter tester = new StringSplitter();
	      tester.testSplitter();
	   }

	   private void testSplitter() {
	      System.out.println(Splitter.on(',')
	         .trimResults()
	         .omitEmptyStrings()
	         .split("the ,quick, ,brown, fox, jumps, over, the, lazy, little dog."));
	   }
	}