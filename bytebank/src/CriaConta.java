
public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo= 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 600;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 450;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		} else {
			System.out.println("Não são contas iguais");
		}
		
		primeiraConta.deposita(200);
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		
		
		
	}
}
