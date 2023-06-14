public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    public double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
//        Miles -> Cash rate = 0.0035;
        this.cashValue = cashValue;
        this.milesValue = cashValue / conversionRate;
    }

//    Pass in integer for parameters of this RewardValue
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * conversionRate;
    }

//    Return cash value of RewardValue using getCashValue()
    public double getCashValue() {
        return cashValue;
    }

//    Return miles value of RewardValue using getMilesValue()
    public double getMilesValue() {
        return (int) milesValue;
    }
}

/*
This class must satisfy the following requirements:
- RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
- RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
- RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
- RewardValue must convert from miles to cash at a rate of 0.0035.
 */