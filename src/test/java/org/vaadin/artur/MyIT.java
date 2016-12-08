package org.vaadin.artur;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.LabelElement;
import com.vaadin.testbench.elements.TextFieldElement;

public class MyIT extends TestBenchTestCase {

    @Test
    public void basicTest() {
        setDriver(new ChromeDriver());
        getDriver().get("http://localhost:8080");

        TextFieldElement input = $(TextFieldElement.class).first();
        input.setValue("TestBench");

        ButtonElement button = $(ButtonElement.class).first();
        button.click();

        Assert.assertEquals("Thanks TestBench, it works!",
                $(LabelElement.class).first().getText());
    }
}