
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaBella = new Conta();
		
		/*Cliente bella = new Cliente();*/
		
		contaBella.titular = new Cliente();
		
		System.out.println(contaBella.titular);
		
		contaBella.titular.nome = "Bella Lima";
		
		System.out.println(contaBella.titular.nome);
		
		
	}
}
