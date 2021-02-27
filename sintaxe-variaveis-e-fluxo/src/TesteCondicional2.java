
public class TesteCondicional2 {

	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		int idade = 27;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("O valor de acompanhado é " + acompanhado);
		
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
