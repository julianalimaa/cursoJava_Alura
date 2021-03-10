public class TesteReferencias {

	public static void main(String[] args) {
	
		Conta primeiraConta = new Conta();
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 250;
		
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta); 
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		} else {
			System.out.println("Não são contas iguais");
		}
				
		
	}

}
