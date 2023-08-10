
public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public IQuackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public IQuackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public IQuackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public IQuackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
