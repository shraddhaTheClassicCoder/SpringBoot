package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "items")
public class itemInfo {

	@Value("${info.price.idli}")
	private float idliPrice;
	
	
	@Value("${info.price.vada}")
	private float vadaPrice;
	
	@Value("${info.price.dosa}")
	private float dosaPrice;
	
	
	static {
		System.out.println("itemInfo .class file is loading....");
	}
	
	public itemInfo() {
		System.out.println("itemInfo class is instatiated...");
	}

	public float getIdliPrice() {
		return idliPrice;
	}

	public void setIdliPrice(float idliPrice) {
		this.idliPrice = idliPrice;
	}

	public float getVadaPrice() {
		return vadaPrice;
	}

	public void setVadaPrice(float vadaPrice) {
		this.vadaPrice = vadaPrice;
	}

	public float getDosaPrice() {
		return dosaPrice;
	}

	public void setDosaPrice(float dosaPrice) {
		this.dosaPrice = dosaPrice;
	}

	@Override
	public String toString() {
		return "itemInfo [idliPrice=" + idliPrice + ", vadaPrice=" + vadaPrice + ", dosaPrice=" + dosaPrice + "]";
	}	
}
