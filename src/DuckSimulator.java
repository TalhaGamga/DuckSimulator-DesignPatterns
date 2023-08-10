
public class DuckSimulator
{
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.Simulate(duckFactory);
	}
	
	public void Simulate(AbstractDuckFactory duckFactory) 
	{
		IQuackable redheadDuck=duckFactory.createRedheadDuck();
		IQuackable duckCall=duckFactory.createDuckCall();
		IQuackable rubberDuck=duckFactory.createRubberDuck();
		//IQuackable gooseDuck=new GooseAdapter(new Goose());
				
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		//flockOfDucks.add(gooseDuck);
		
		IQuackable mallardOne = duckFactory.createMallardDuck();
		IQuackable mallardTwo = duckFactory.createMallardDuck();
		IQuackable mallardThree = duckFactory.createMallardDuck();
		IQuackable mallardFour = duckFactory.createMallardDuck();
		
		Flock flockOfMallards = new Flock();
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree); 
		flockOfMallards.add(mallardFour); 
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: With Observer");
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		simulate(flockOfDucks);
		
		System.out.println("\nThe ducks quacked " +
							QuackCounter.GetQuacks() + 
							" times");
	}
	
	void simulate(IQuackable quackable) 
	{
		quackable.quack();
	}
}
