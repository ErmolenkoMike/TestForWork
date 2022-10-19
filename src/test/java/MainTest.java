import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends TestInit {

    @Test
    public void Testing1() {

        FirstTest firstTest = new FirstTest(driver);

        openUrl("https://demo.vercel.store");
        firstTest.newArrivals().click();
        firstTest.aCMECup().click();
        firstTest.addToCart().click();
        firstTest.changeQuantity();

        Assert.assertTrue(firstTest.checkOnPrice().getText().contains("25"));

        firstTest.closeCartMenu().click();
        firstTest.openFeatured().click();
        firstTest.quaterZipPage().click();
        firstTest.chooseSizeM().click();

        Assert.assertTrue(firstTest.chooseSizeM().getText().contains("M"));

        firstTest.addToCart().click();

        Assert.assertTrue(firstTest.assertForQuarter().getText().contains("Quarter Zip"));
        Assert.assertTrue(firstTest.assertForCup().getText().contains("ACME Cup"));
        Assert.assertTrue(firstTest.checkOnPrice().getText().contains("215"));

        firstTest.checkOut().click();
        firstTest.emailEnter().click();
        firstTest.emailEnter().sendKeys("probnik@gmail.com");
        firstTest.firstNameEnter().click();
        firstTest.firstNameEnter().sendKeys("Jack");
        firstTest.lastNameEnter().click();
        firstTest.lastNameEnter().sendKeys("Harfin");
        firstTest.addressEnter().click();
        firstTest.addressEnter().sendKeys("Solemnskaya 25");
        firstTest.appatmentEnter().click();
        firstTest.appatmentEnter().sendKeys("1");
        firstTest.cityEnter().click();
        firstTest.cityEnter().sendKeys("Kiev");
        firstTest.postCodeEnter().click();
        firstTest.postCodeEnter().sendKeys("01033");
        firstTest.continueShipping().click();
        firstTest.choosePayment().click();
        firstTest.continueShipping().click();

        Assert.assertTrue(firstTest.verifyText().getText().contains("This store can’t accept payments right now."));


    }
}
