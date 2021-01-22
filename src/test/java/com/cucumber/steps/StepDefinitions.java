package com.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;
import com.pcom.pages.*;

import java.util.Map;

public class StepDefinitions {
    private Map<String, String> orderDetails;

    @Given("I have the emulator open")
    public void i_have_the_emulator_open() {
        StartPage startPage = new StartPage();
        EnvironmentsPage environmentsPage = startPage.accessMainframeSystem();
        SystemAccessPage systemAccessPage = environmentsPage.accessJtrach();
        H3AAPage h3AAPage = systemAccessPage.accessH3AA();
        h3AAPage.listFields();

    }

    @Given("I do the rest")
    public void i_do_the_rest() {



    }
}
