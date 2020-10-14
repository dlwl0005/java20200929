package chap06.textbook.exercises.p18;

import chap06.textbook.s061005.Singleton;

public class ShopService {
	private final static ShopService shopService = new ShopService();
	
	private ShopService() {}
			
	
	static ShopService getInstance() {
		return shopService;
	}


}
