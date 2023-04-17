package com.library.steps;

import com.library.pages.BookPage;
import com.library.pages.LoginPage;
import io.cucumber.java.en.Given;

public class UIStepDefs {

        LoginPage loginPage = new LoginPage();
        BookPage bookPage = new BookPage();

        @Given("I logged in Library UI as {string}")
        public void i_logged_in_library_ui_as(String user) {
            loginPage.login(user);

        }
        @Given("I navigate to {string} page")
        public void i_navigate_to_page(String page) {
            bookPage.navigateModule(page);
        }


    }
