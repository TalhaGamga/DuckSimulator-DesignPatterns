public class RubberDuck implements IQuackable
{
	Observable observable;
	public RubberDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Squeak");
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
