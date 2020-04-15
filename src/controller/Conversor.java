package controller;

public class Conversor {
	
	public boolean operador(char s) {
		return (s == '+' || s == '-' || s == '(' || s == ')' || s == '*' || s == '/' || s == '^');
	}

	public int prioridade(char s) {

		switch (s) {
		case '+':
			return 1;
		case '-':
			return 2;

		case '*':
			return 3;
			
		case '/':
			return 4;
			
		case '^':
		    return 5;
		case '(':
		case ')':
			return 6;
		}
		return 0;
	}

}
