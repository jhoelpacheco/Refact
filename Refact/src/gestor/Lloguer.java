package gestor;

import java.util.ArrayList;
import java.util.Date;

public class Lloguer {
	private Date data;
	private int dies;
	private Vehicle vehicle;
	
	public Lloguer(Date data, int dies, Vehicle vehicleBasic) {
		this.data = data;
		this.dies = dies;
		this.vehicle = vehicleBasic;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getDies() {
		return dies;
	}
	public void setDies(int dies) {
		this.dies = dies;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
}
