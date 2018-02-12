package za.co.ajk.billing.cucumber.stepdefs;

import za.co.ajk.billing.BillingModuleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = BillingModuleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
