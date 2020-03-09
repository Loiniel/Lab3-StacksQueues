package queue;
import java.util.Scanner;
import stack.ArrayStack;
import stack.ArrayStackFactory;
import queue.CircularArrayQueue;
import queue.Queue;
import queue.DoublyLinkedQueue;


public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String isPalindrome() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String noSpace = input.replaceAll("[\\W", "");
		
		ArrayStack<String> stack = new ArrayStack<String>(noSpace.length());
		Queue<String> queue = new DoublyLinkedQueue<String>();
		
		return null;
	}

}
