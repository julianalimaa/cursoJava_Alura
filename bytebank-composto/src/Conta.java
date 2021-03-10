
public class Conta {
	private double saldo;
	int agencia;
	int numero;
	double limite;
	Cliente titular;
	
	public void deposita(double valor){
		this.saldo += valor;
		//this.saldo = this.saldo + valor;
	}
	
	public void defineLimite(double valor) {
		this.limite += valor;
	}
	
	public boolean saca(double valor){
		if (this.saldo + limite >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino){
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
}