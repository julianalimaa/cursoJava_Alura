
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(100, 1005);
		Cliente cliente = new Cliente();
		
		System.out.println(conta.getAgencia());
		
		System.out.println(conta.getAgencia());
						
		cliente.setNome("Juliana");
		conta.setTitular(cliente);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setNome("Juliana Lima");
		conta.getTitular().setProfissao("Desenvolvedora");
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(cliente);
		System.out.println(conta.getTitular());
		
		
	}

}
