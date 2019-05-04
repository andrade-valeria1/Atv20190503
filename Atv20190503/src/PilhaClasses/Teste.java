package PilhaClasses;



public class Teste {

	public static void main(String[] args) {
		
	Peca peca1 = new Peca ("Macaco");
	Peca peca2 = new Peca ("Extintor");
	Peca peca3 = new Peca ("Bateria");
	
	Pilha pilha = new Pilha();
	pilha.insere(peca2);
	pilha.insere(peca1);
	pilha.insere(peca3);

	if (pilha.vazia()) {
	System.out.println("A pilha está vazia"+ pilha.vazia());
	
	} else {
		System.out.println("A pilha não está vazia");
	
	}
	 Peca removida = pilha.remove();
	 System.out.println(removida.getNome());
	
	}
	

	}

	
	



