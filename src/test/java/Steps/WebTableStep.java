package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import Serenity.WebTableSerenity;

public class WebTableStep {
    @Steps
    WebTableSerenity webtableSerenity;
    @Given("^Open home page$")
    public void openHomePage() {
        webtableSerenity.openHomePage();
    }

    @Then("^The website display Member in Grid correct with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theWebsiteDisplayMemberinGridCorrectWithAnd(String firstName,String lastName) throws Throwable {
        Assert.assertEquals(webtableSerenity.getFirstName(),firstName);
        Assert.assertEquals(webtableSerenity.getLastName(),lastName);
    }
    @When("^Click on add button$")
    public void clickOnAddButton() {
        webtableSerenity.clickAddButton();
    }

    @Then("^The website display Form correct with \"([^\"]*)\"$")
    public void theWebsiteDisplayFormCorrectWith(String formName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(webtableSerenity.getFormName(),formName);

    }

    @And("^Enter data to all textfield$")
    public void enterDataToAllTextfield() {
        webtableSerenity.enterDataTC03();
    }

    @And("^Click submit button$")
    public void clickSubmitButton() {
        webtableSerenity.clickSubmitButton();
    }

    @Then("^The website display Member in Grid correct with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theWebsiteDisplayMemberInGridCorrectWithAndAndAndAndAnd(String fnamenew, String lnamenew, String agenew, String emailnew, String salarynew, String departmentnew) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(webtableSerenity.getFirstNameNew(),fnamenew);
        Assert.assertEquals(webtableSerenity.getLastNameNew(),lnamenew);
        Assert.assertEquals(webtableSerenity.getAgeNew(),agenew);
        Assert.assertEquals(webtableSerenity.getEmailNew(),emailnew);
        Assert.assertEquals(webtableSerenity.getSalaryNew(),salarynew);
        Assert.assertEquals(webtableSerenity.getDepartmentNew(),departmentnew);
    }

    @And("^Enter invalid data in email textfield and valid data in required fields$")
    public void enterInvalidDataInEmailTextfieldAndValidDataInRequiredFields() {
        webtableSerenity.enterDataTC04();
    }

    @Then("^The website display warning at email textfield$")
    public void theWebsiteDisplayWarningAtEmailTextfield() {
        Assert.assertEquals(webtableSerenity.expectedColorWhenTrue(),webtableSerenity.colorCode());
    }


}
