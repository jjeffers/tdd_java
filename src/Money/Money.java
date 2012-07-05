package Money;

public class Money {
	protected int amount;
	protected String currency;
	
	Money(int amount, String currency)
	{
		this.amount = amount;
		this.currency = currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}

	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	Money times(int multiplier)
	{
		return null;
	}
	
	String currency()
	{
		return currency;
	}
}
