import java.util.Vector;

public class Document implements Subject {
	String name;
	String authorName;
	String publishDate;
	Vector<Observer> observers;
	Vector<String> doc;
	
	public Document() {
		doc = new Vector<String>();
		observers = new Vector<Observer>();
	}
	
	@Override
	public void register(Observer o) {
		observers.add(o);
		o.update(doc);
	}
	
	@Override
	public void remove(Observer o) {
		observers.remove(o);
		
	}
	@Override
	public void notifiyAllBuyers() {
		for(int i=0; i<observers.size(); i++) {
			Observer o = observers.get(i);
			o.update(doc);
		}
		
	}
}
