public class DuckCall implements IQuackable
{
	Observable observable;
	
	public DuckCall() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}

	@Override
	public void registerObserver(IObserver observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
