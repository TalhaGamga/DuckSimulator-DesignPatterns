public class RedheadDuck implements IQuackable
{
	Observable observable;
	
	public RedheadDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
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
