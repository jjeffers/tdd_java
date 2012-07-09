package Money;

public interface Expression {
	Money reduce(String to);
	
	Money reduce(Bank bank, String to);
	Expression plus(Expression addend);
	Expression times(int multiplier);
}
