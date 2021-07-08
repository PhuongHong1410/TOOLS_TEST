
package Serenity;

        import net.thucydides.core.steps.ScenarioSteps;
        import Pages.WebTablePage;

public class WebTableSerenity extends ScenarioSteps {
    WebTablePage webtablePage;

    public void openHomePage(){
        webtablePage.open();
    }
    public String getFirstName() {
        return webtablePage.getFirstName();
    }
    public String getLastName() {
        return webtablePage.getLastName();
    }
    public String getFirstNameNew() {
        return webtablePage.getFirstNameNew();
    }
    public String getLastNameNew() {
        return webtablePage.getLastNameNew();
    }
    public String getAgeNew() {
        return webtablePage.getAgeNew();
    }
    public String getEmailNew() {
        return webtablePage.getEmailNew();
    }
    public String getSalaryNew() {
        return webtablePage.getSalaryNew();
    }
    public String getDepartmentNew() {
        return webtablePage.getDepartmentNew();
    }
    public void clickAddButton(){
        webtablePage.clickAddButton();
    }
    public String getFormName() {
        return webtablePage.getFormName();
    }
    public void clickSubmitButton(){
        webtablePage.clickSubmitButton();
    }
    public void enterDataTC03(){
        webtablePage.enterDataTC03();
    }
    public void enterDataTC04(){
        webtablePage.enterDataTC04();
    }
    public String colorCode(){

        return webtablePage.colorCode();
    }
    public String expectedColorWhenFalse(){
        return "rgba(220, 53, 69, 1)";
    }
    public String expectedColorWhenTrue(){

        return "rgba(40, 167, 69, 1)";
    }
}
