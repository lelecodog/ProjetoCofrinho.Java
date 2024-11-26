package empresa;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
		System.out.println("Moeda adicionada: " + m.info());
		System.out.println();
	}
	public void remover(Moeda m) {
		boolean removed = listaMoedas.remove(m);
		if (removed) {
			System.out.println("Moeda removida: " + m.info());
		}
		else {
			System.out.println("Moeda não encontrada: " + m.info());
		}
		System.out.println();
	}
	public void listar() {
		for (Moeda m : listaMoedas) {
			System.out.println(m.info() + ":  Valor em reais: " + m.converter());	
		}
	}
	public double totalConvertido() {
		double total = 0;
		for(Moeda m : listaMoedas) {
			total += m.converter();
		}
		return total;
	}
	
}

