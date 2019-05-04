package Teste;

import java.util.Stack;
import PilhaClasses.Peca;

public class PilhaTestStack {
	
	public static void main(String[] args) {
		
	Stack<Peca> pecas= new Stack <Peca>();
	
		
	
	Peca peca2= new Peca("tim");
	
	pecas.add(peca2);
	pecas.add(peca2);
	
	Peca p = pecas.pop();
	System.out.println(p.getNome());
	 p = pecas.peek();
	System.out.println(p.getNome());
}
}