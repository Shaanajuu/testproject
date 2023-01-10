package org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\suganya.s\\eclipse-workspace1\\AdactinProject\\src\\test\\resources\\FeatureFile", 
glue = "org.stepdefinition")

public class RunnerClass {

}
