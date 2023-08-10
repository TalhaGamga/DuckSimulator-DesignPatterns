public class QuackCounter implements IQuackable 
{
	IQuackable duck;
	
	private static int numberOfQuacks; 
	
	
	public QuackCounter(IQuackable duck) {
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int GetQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(IObserver observer) {
		duck.registerObserver(observer);
	}
 
	@Override
	public void notifyObservers() {
		duck.notifyObservers();
	}
}