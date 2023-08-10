import java.util.ArrayList;
import java.util.Iterator;

public class Flock  implements IQuackable{

	ArrayList quackers = new ArrayList();
	
	Observable observable;
	
	public Flock() {
		observable = new Observable(this);
	}
	
	public void add(IQuackable quackable) {
		quackers.add(quackable);
	}
	
	@Override
	public void quack() {
		Iterator iterator = quackers.iterator();
		
		while(iterator.hasNext()) {
			IQuackable quackable = (IQuackable)iterator.next();
			quackable.quack();
		}
	}

	@Override
	public void registerObserver(IObserver observer) {
		Iterator iterator = quackers.iterator();
		
		while(iterator.hasNext()) {
			IQuackable quackable = (IQuackable)iterator.next();
			quackable.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
	}

}
