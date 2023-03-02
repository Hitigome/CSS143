import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* CSSSKL 162
 * 
 * UsingStacksSuitorsLab
 * 
 * This class is mostly a driver for playing with Strings as palindromes, 
 * both iteratively and recursively.  The UsingStacksSuitorsLab class itself is
 * a runnable object, so it can be passed to a thread in our Queue demo
 * 
 * 
 */

public class UsingStacksSuitorsLab implements Runnable {
	private static int threadCount = 0;
	private String name;
	
	public UsingStacksSuitorsLab() {
		name = "#" + threadCount++ + "Thread";
	}
	
	public static void main(String[] args) {
		String s1 = "food";		    //not a palindrome
		String s2 = "racecar";      //a palindrome
			
		System.out.println("String1 is \"" + s1 + "\"");
		System.out.println("String2 is \"" + s2 + "\"");
		
		System.out.println(s1 + " reversed is: ");
		printReverse(s1);
		System.out.println(s2 + " reversed is: ");
		printReverse(s2);
		
	    recPrintReverse(s1);
		System.out.println();
		recPrintReverse(s2);
		System.out.println();
		
		System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
		System.out.println(s2 + " is a palindrome: " + isPalindrome(s2));
		
		System.out.println(s1 + " is a palindrome(recursively): " + isPalindromeRec(s1));
		System.out.println(s2 + " is a palindrome(recursively): " + isPalindromeRec(s2));	
	
		int n = 6;
		System.out.println("For " + n + " suitors, stand in place:" + findPlaceToStand(n));
		
		n = 10;
		System.out.println("For " + n + " suitors, stand in place:" + findPlaceToStand(n)); 
	}
		
	
	
	
	public static void printReverse(String target) {
		//todo: use a stack
		Stack<Integer> a = new Stack<Integer>();
		String input = target;

		for (int i = 0; i<input.length(); i++){
			char currentChar = input.charAt(i);
			a.push((int) currentChar);
		}

		while(!a.isEmpty()){
			int current = a.pop();
			char currentChar = (char) current;
			System.out.println(currentChar);
		}
	}
	
	public static void recPrintReverse(String target) {

		if(target.length() == 1){
			System.out.println(target);
		}else{
			char last = target.charAt(target.length() - 1);
			String newTarget = target.substring(0, target.length() - 1);
			recPrintReverse(newTarget);
			System.out.println(last);
		}
	}
	
	public static boolean isPalindrome(String input) {
		Stack<Character> a = new Stack<Character>();

		for(int i=0; i < input.length(); i++){
			char current = input.charAt(i);
			a.push(current);
		}

		String reversed = "";
		while(!a.isEmpty()){
			int current = a.pop();
			reversed += current;
		}

		return input.equals(reversed);
	}

	public static boolean isPalindromeRec(String sentence)	{

	  	if(sentence.length() < 2){
			return true;
		}else if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
			return false;
		}
		String substring = sentence.substring(1, sentence.length() - 1);
		return isPalindromeRec(substring);
	}
	
	public static int findPlaceToStand(int numSuitors) {
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= numSuitors; i++){
			q.add(i);
		}

		while (q.size() > 1){
			int first = q.poll();
			q.add(first);

			int second = q.poll();
			q.add(second);

			int third = q.poll();
		}

		return q.poll();
	}	

	public static int findPlaceToStack(int numSuitors){
		Stack<Integer> left = new Stack<Integer>();
		Stack<Integer> right = new Stack<Integer>();

		for (int i=1; i<=n; i++){
			if (i % 2 == 1){
				left.push(i);
			}else{
				right.push(i);
			}
		}
		
		boolean forward = true;
		while(left.size() + right.size() > 1){
			int suitor;
			if(forward){
				suitor = left.pop();
				if(!left.empty()){
					left.push(right.pop());
				}
			}else{
				suitor = right.pop();
				if(!right.empty()){
					right.push(left.pop());
				}
			}
			forward = !forward;
		}

		if(!left.empty()){
			return left.pop();
		}else{
			return right.pop();
		}
		
	}


	
	/*
	 * No need to edit anything below here, 
	 * unless you'd like to change the 
	 * behaviour of each thread in the thread pool above
	 */
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(name + ": " + i + "th iteration");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				//do nothing here
			}
		}
	}
}
