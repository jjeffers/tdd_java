public class Money
{

    public void testMultiplication() 
    {
        Dollar five= new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}