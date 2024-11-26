package empresa;

public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		super(valor);
	}	
	
	@Override
	public double converter() {
		double valorConvertido = this.valor * 5.5;
		return valorConvertido;
	}
	@Override
	public String info() {
		return "Dolar: " + this.valor;
	}


}
