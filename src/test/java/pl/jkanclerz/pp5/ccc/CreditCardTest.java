package pl.jkanclerz.pp5.ccc;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    public void creditCardIsIdentifiedWithNumber() {
        //Arrange
        //Act
        CreditCard card = new CreditCard("1234-5678");
        //Assert
        Assert.assertEquals(card.getNumber(), "1234-5678");
    }

    @Test
    public void itAllowsAssignLimitToCC() {
        //Arrange
        CreditCard card = new CreditCard("1234-5678");
        //Act
        card.assignLimit(new BigDecimal(2000));
        //Assert
        Assert.assertTrue(new BigDecimal(2000).equals(card.getCurrentBallance()));
    }

    @Test
    public void itDenyLimitBelow100() {
        //Arrange
        CreditCard card = new CreditCard("1234-5678");
        //Act
        try {
            card.assignLimit(new BigDecimal(20));
            Assert.fail("should throw exception");
        } catch (LimitBelow100Exception e) {
            Assert.assertTrue(true);
        }
    }
}
