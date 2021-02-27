
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300;
		
		//AND && ------ OR ||

		if (salario >= 1900 && salario <= 2800) {
			System.out.println("O IR é de 7.5% e pode ser deduzido R$ 142,00");
		} else if (salario >= 2800.01 && salario <= 3751) {
			System.out.println("O IR é de 15% e pode ser deduzido R$ 350,00");
		} else if (salario >= 3751.01 && salario <= 4664) {
			System.out.println("O IR é de 22.5% e pode ser deduzido R$ 636,00");
		}
	}
}
