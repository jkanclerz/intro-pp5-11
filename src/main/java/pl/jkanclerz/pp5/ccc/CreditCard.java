package pl.jkanclerz.pp5.ccc;

import java.math.BigDecimal;

public class CreditCard {
    private final String number;

    public CreditCard(String number) {

        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void assignLimit(BigDecimal bigDecimal) {

    }

    public BigDecimal getCurrentBallance() {
        return null;
    }
}
