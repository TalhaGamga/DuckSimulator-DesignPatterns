public interface IQuackObservable {
	void registerObserver(IObserver observer);
	void notifyObservers();
}
