package business;

public class Multiplicacao extends Calculo {

	public Multiplicacao(float valor1, float valor2) {
		super(valor1, valor2);
		// TODO Auto-generated constructor stub
	}

	public void calcular() {
		resultado = valor1 * valor2;
	}
}
