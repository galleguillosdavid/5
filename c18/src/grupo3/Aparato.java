package grupo3;

public class Aparato {

	protected Double precio;
	protected String color;
	protected String Marca;
	protected String Modelo;

	public Aparato(Double precio, String color, String marca, String modelo) {
		super();
		this.precio = precio;
		this.color = color;
		Marca = marca;
		Modelo = modelo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public double descuento() {
		double desc = 0.1;
		return precio * desc;
	}

	@Override
	public String toString() {
		return "Aparato [precio=" + precio + ", color=" + color + ", Marca=" + Marca + ", Modelo=" + Modelo + "]";
	}

}
