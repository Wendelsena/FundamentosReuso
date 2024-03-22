package services;

import java.util.ArrayList;
import java.util.List;

// tipo T = qualquer (cria um parametro para classe).
public class PrintService<T> {
	
	// lista de números inteiros.
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) { // adiciona um valor a lista.
		list.add(value);
	}
	
	public T first() { // devolve o primero objeto dentro da lista.
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty!"); // caso a lista esteja vazia.
		}
		return list.get(0); // caso contrario, retorna a posição
	}
	
	// imprime a lista 
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) { // se a lista não for vazia 
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}

}
