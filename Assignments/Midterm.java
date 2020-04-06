package midterm;

/*
 * Your name goes here!
 */

import java.util.ArrayList;
import java.util.Arrays;
import algs13.Stack;
import stdlib.*;

public class Midterm {

	// Your methods go here.

	public static void main(String[] args) {
		StdOut.println(floorlog(32));
		StdOut.println(floorlog(35));
		StdOut.println(floorlog(64));
		StdOut.println(floorlog(2048));

		Double[] sqarray = {3.5, 4.7, 10.1, 25.0, 76.34, 100.01, 256.0};
		ArrayList<Double> dlist = new ArrayList<Double>(Arrays.asList(sqarray));
		StdOut.println(dlist);
		squareRootList(dlist);
		StdOut.println(dlist);

		StdOut.println(falling(10, 2));
		StdOut.println(falling(52, 6));

		dlist = new ArrayList<Double>();
		StdOut.println(sumBelowLimit(dlist, 50.0));
		Double[] sbarray = {45.3, 12.4, 50.1, 32.8, 75.5, 49.9, 50.0};
		dlist = new ArrayList<Double>(Arrays.asList(sbarray));
		StdOut.println(sumBelowLimit(dlist, 50.0));

		ArrayList<Integer> ilist = new ArrayList<Integer>();
		StdOut.println(productOfEvens(ilist));

		Integer[] eparray1 = {2, 3, 4, 9, 11, 12};
		ilist = new ArrayList<Integer>(Arrays.asList(eparray1));
		StdOut.println(productOfEvens(ilist));

		Integer[] eparray2 = {7, 3, 53, 9, 11, 19};
		ilist = new ArrayList<Integer>(Arrays.asList(eparray2));
		StdOut.println(productOfEvens(ilist));

		String[] starray = {"hello", "how", "are", "you"};
		reverse(starray);
		StdOut.println(Arrays.toString(starray));
	}
}
