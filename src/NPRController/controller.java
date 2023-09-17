package NPRController;
import model.PilhaInt;

public class controller {

	public controller() {
		super();
	}

	public void insereValor(PilhaInt pi, int valor) {
		pi.push(valor);
		}
	
	public int NPR(PilhaInt pi, String op) {
		int x, y;
		int resultado = 0;
		
		try {
			x = pi.pop();
			y = pi.pop();
		switch (op) {
		  case "+":
			resultado = y + x;
			this.insereValor(pi, resultado);
			break;
		  case "-":
		  	resultado = y - x;
		  	this.insereValor(pi, resultado);
		  	break;
		  case "*":
		   	resultado = y*x;
		   	this.insereValor(pi, resultado);
		   	break;
		  case "/":
		  	resultado = y/x;
		  	this.insereValor(pi, resultado);
		  	break;
		  	
		  	default:
		  		System.out.println("Operação inválida");
		  		this.insereValor(pi, x);
		  		this.insereValor(pi, y);
		  		break;
		}
	} catch (Exception errPilha) {
		System.err.println(errPilha);
	}
		return resultado;
}
}