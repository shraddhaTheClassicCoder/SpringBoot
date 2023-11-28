package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "bill")
public class BillGenerator {

	@Value("#{items.idliPrice+items.vadaPrice+items.dosaPrice}")
	private float billAmt;

	@Value("Taj")
	private String hotelName;

	@Autowired(required = true)
	private itemInfo item;

	@Override
	public String toString() {
		return "BillGenerator [billAmt=" + billAmt + ", hotelName=" + hotelName + ", item=" + item + "]";
	}

}
