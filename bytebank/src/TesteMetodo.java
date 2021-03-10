
public class TesteMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.deposita(200);

		//System.out.println("Saldo em conta: " + conta.saldo);
		
		conta.deposita(200);
		conta.deposita(100);
		conta.deposita(300);
		
		//System.out.println("Saldo em conta: " + conta.saldo);
		
		boolean saqueRealizado = conta.saca(900);
		
		System.out.println(conta.saldo);
		
		//System.out.println(saqueRealizado);
		
		Conta contaDois = new Conta();
		contaDois.deposita(3000);
		
		System.out.println(contaDois.saldo);
		
		boolean transferenciaRealizada = contaDois.transfere(500, conta);
		
		System.out.println("Saldo da contaDois : " + contaDois.saldo);
		System.out.println("Saldo da conta : "+ conta.saldo);
		
		if(transferenciaRealizada) {
			System.out.println("Transferência realizada com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		conta.titular = "Juliana Lima";
		System.out.println(conta.titular);
		
	}

}
