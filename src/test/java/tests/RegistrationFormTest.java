package tests;

import org.junit.jupiter.api.Test;
import page.RegistrationFormPage;
import static io.qameta.allure.Allure.step;

public class RegistrationFormTest extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    void registrationFormTest(){
        step("Open registration form", (step) -> {
            registrationFormPage.openPage();
        });
        step("Fill registration form", (step) -> {
            registrationFormPage.fillForm();
        });

        step("Check registration form", (step) -> {
            registrationFormPage.checkData();
        });

    }
}
