package empresa;

public class Euro extends Moeda {
	
	public Euro(double valor) {
		super(valor);
	}	
	
	@Override
	public double converter() {
		double valorConvertido = this.valor * 6;
		return valorConvertido;
		
	}
	@Override
	public String info() {
		return "Euro: " + this.valor;
	}

}
