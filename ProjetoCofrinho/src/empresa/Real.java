package empresa;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
	}

	@Override
	public double converter() {
		return this.valor;
	}
	@Override
	public String info() {
		return "Real: " + this.valor;
	}

	
}
