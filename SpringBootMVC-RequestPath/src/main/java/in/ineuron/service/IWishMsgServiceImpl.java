package in.ineuron.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class IWishMsgServiceImpl implements IWishMsgservice {

	@Override
	public String getLocaleDateTime() {

		LocalDateTime ldt = LocalDateTime.now();
		int hour = ldt.getHour();
		if (hour < 12)
			return "Good Morning";
		else if (hour < 16)
			return "Good Afternoon";
		else if (hour < 20)
			return "Good Evening";
		else
			return "Good night";

	}

}
