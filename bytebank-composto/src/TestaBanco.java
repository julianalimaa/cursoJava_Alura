
public class TestaBanco {

	public static void main(String[] args) {

		Cliente juliana = new Cliente();
		
		juliana.nome = "Juliana Lima";
		juliana.cpf = "222.222.222-22";
		juliana.profissao = "desenvolvedora";
		
		Conta contaJuliana = new Conta();
		contaJuliana.deposita(100);
		
		contaJuliana.titular = juliana;
		
		System.out.println(contaJuliana.titular.nome);
		System.out.println(contaJuliana.titular);
		System.out.println(juliana);
		
	}

}
