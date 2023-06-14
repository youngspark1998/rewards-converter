import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        int cash_to_miles = (int) (cashValue / 0.0035);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cash_to_miles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double miles_to_cash = milesValue * 0.0035;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(miles_to_cash, rewardValue.getCashValue());
    }
}
