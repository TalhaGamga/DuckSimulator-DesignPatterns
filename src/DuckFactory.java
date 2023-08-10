
public class DuckFactory extends AbstractDuckFactory {

	@Override
	public IQuackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public IQuackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public IQuackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public IQuackable createRubberDuck() {
		return new RubberDuck();
	}
}
