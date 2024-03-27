package ru.netology.testmode.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private final SelenideElement codeField = $("[data-test-id=code] input");
    private final SelenideElement verifyField = $("[data-test-id=action-verify]");

    public DashboardPage validVerify(String verificationCode) {
        codeField.setValue(verificationCode);
        verifyField.click();
        return new DashboardPage();
    }
}
