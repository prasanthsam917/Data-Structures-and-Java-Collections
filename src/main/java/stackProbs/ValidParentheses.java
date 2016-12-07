package stackProbs;

import java.util.Stack;

/***
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid. The brackets must close in the
 * correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 ***/
public class ValidParentheses {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			}

			if (s.charAt(i) == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}

			if (s.charAt(i) == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			}

			if (s.charAt(i) == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}

		}

		if (stack.isEmpty()) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
	}

}
