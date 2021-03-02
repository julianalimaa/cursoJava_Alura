
public class TesteContador {

	public static void main(String[] args) {
		int contador = 0;
		
		int total = 0;

		while (contador <= 10) {

			/* int total = 0 ---- se a variável fosse inicializada e atribuída aqui dentro,
			a cada nova repetição, o total seria zerado.*/

			total = total + contador;
			contador++;

			System.out.println(total);

		}

		System.out.println(total);

	}
}

//Convertendo o while em for:
//int contador;
//int total = 0;
// 
//for (contador = 0 ; contador <= 10 ; contador++) {
//	total = total + contador;
//	System.out.println(total);
//}
