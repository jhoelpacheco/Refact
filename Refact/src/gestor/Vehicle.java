package gestor;

public class Vehicle {
	public static final String BASIC = "BASIC";
	public static final String GENERAL = "GENERAL";
	public static final String LUXE = "LUXE";
	private String model;
	private String marca;
	private String categoria;
	
	public Vehicle(String marca, String model, String categoria) {
		this.marca = marca;
		this.model = model;
		this.categoria = categoria;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
