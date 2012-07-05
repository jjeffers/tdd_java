package Money;

class Franc extends Money {

   Franc(int amount) {
      this.amount= amount;
   }

   Franc times(int multiplier) {
      return new Franc(amount * multiplier);
   }

   public boolean equals(Object object) {
      Franc franc= (Franc) object;
      return amount == franc.amount;
   }
}
