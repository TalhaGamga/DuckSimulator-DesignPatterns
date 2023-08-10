public class GooseAdapter implements IQuackable{

	Goose goose;
	
	Observable observable;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		goose.Honk();
		
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
