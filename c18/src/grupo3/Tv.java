package grupo3;

public class Tv extends Aparato {

	public Tv(Double precio, String color, String marca, String modelo) {
		super(precio, color, marca, modelo);

	}

	@Override
	public String toString() {
		return "Tv [precio=" + precio + ", color=" + color + ", Marca=" + Marca + ", Modelo=" + Modelo
				+ ", precioFinal()]";
	}

	public double precioFinal() {
		double desc = super.descuento();
		return desc;
	}
}
