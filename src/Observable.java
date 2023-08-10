import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements IQuackObservable {
	ArrayList observers = new ArrayList();
	IQuackObservable duck;
	
	public Observable(IQuackObservable duck)
	{
		this.duck = duck;
	}
	
	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator iterator = observers.iterator();
		
		while(iterator.hasNext()) {
			IObserver observer = (IObserver)iterator.next();
			observer.update(duck);
		}
	}
}
