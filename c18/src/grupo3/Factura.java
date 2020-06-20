package grupo3;

public class Factura {
	Tv televisor;// aparato que se vende
	Radio equipomusica;
	double desc;
	int numerofactura;

	public Factura(Tv televisor, Radio equipomusica, double desc, int numerofactura) {
		super();
		this.televisor = televisor;
		this.equipomusica = equipomusica;
		this.desc = desc;
		this.numerofactura = numerofactura;
	}

	public Tv getTelevisor() {
		return televisor;
	}

	public void setTelevisor(Tv televisor) {
		this.televisor = televisor;
	}

	public Radio getEquipomusica() {
		return equipomusica;
	}

	public void setEquipomusica(Radio equipomusica) {
		this.equipomusica = equipomusica;
	}

	public double getDesc() {
		return desc;
	}

	public void setDesc(double desc) {
		this.desc = desc;
	}

	public int getNumerofactura() {
		return numerofactura;
	}

	public void setNumerofactura(int numerofactura) {
		this.numerofactura = numerofactura;
	}

	@Override
	public String toString() {
		return "Factura [televisor=" + televisor + ", equipomusica=" + equipomusica + ", desc=" + desc
				+ ", numerofactura=" + numerofactura + "]";
	}

}