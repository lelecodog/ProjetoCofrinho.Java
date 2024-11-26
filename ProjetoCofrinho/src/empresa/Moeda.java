package empresa;

public abstract class Moeda {
	public double valor;

	protected Moeda(double valor) {
		this.valor = valor;
	}
	public abstract double converter();
	
	public abstract String info();
	
	@Override // metodo para comparar se moedas selecionadas para exclusão existe no cofrinho
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		boolean result = Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
		return result;
	}
	
}
