
public class Mom {
	void purchaseAndGive(){
		Shopkeeper s = new Shopkeeper();
		Toy ty= s.sellToy(250);
		Kid k = new Kid();
		k.acceptToy(ty);
	}
	
}
