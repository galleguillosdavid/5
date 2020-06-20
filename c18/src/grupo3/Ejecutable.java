package grupo3;

public class Ejecutable {

	public static void main(String[] args) {

		Aparato lista[] = new Aparato[9];

		lista[0] = new Aparato(777.0, "Rojo", "Stroller", "Onep");
		lista[1] = new Tv(777.0, "Rojo", "Stroller", "Onep");
		lista[2] = new Radio(777.0, "Rojo", "fre", "Onep");
		lista[3] = new Aparato(777.0, "Rojo", "Stroller", "Onep");
		lista[4] = new Tv(777.0, "Rojo", "fre", "Onep");
		lista[5] = new Aparato(777.0, "Verde", "Stroller", "Onep");
		lista[6] = new Aparato(777.0, "Negro", "fr", "Onep");
		lista[7] = new Aparato(777.0, "Rojo", "tyrtey", "Onep");
		lista[8] = new Aparato(777.0, "Rojo", "Stroller", "Onep");
		
		for (int i = 0; i < lista.length; i++) {
		System.out.println(lista[i]+"\n");
	}
	}
}
