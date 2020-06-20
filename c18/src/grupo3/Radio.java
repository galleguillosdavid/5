package grupo3;

public class Radio extends Aparato {

	public Radio(Double precio, String color, String marca, String modelo) {
		super(precio, color, marca, modelo);

	}

	@Override
	public String toString() {
		return "Radio [precio=" + precio + ", color=" + color + ", Marca=" + Marca + ", Modelo=" + Modelo + "]";
	}

}
