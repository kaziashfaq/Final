import java.util.Vector;

public class Buyer implements Observer{
	String name;
	Order order;
	Vector<String> doc;
	Subject subject;
	
	public Buyer() {
		
	}
	
	public Buyer(Subject s) {
		subject = s;
		subject.register(this);
	}
	
	public void update (Vector<String> doc) {
		this.doc = doc;
	}

	public Document search(Document doc) {
		return doc;
	}
	
	public void placeorder(Order order) {
		
	}

}
