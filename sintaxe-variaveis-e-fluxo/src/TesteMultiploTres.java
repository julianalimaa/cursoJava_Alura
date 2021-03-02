
public class TesteMultiploTres {

	public static void main(String[] args) {

		int total = 0;

		for (int contador = 0; contador <= 100; contador += 1) {

			int multiplicador = 3;

			total = multiplicador * contador;

			if (total >= 100) {
				break;
			}

			System.out.println(multiplicador + " x " + contador + " = " + total);
		}		
	}
}


//for (int i = 3; i < 100; i += 3 ){
//System.out.println(i);
//}
//
//for (int i = 1; i < 100; i++ ){
//    if (i % 3 == 0)    {
//        System.out.println(i);
//    }
//}


