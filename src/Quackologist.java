
public class Quackologist implements IObserver {

	@Override
	public void update(IQuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
}
