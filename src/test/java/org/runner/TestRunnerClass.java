package org.runner;

import org.base.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = { "org.stepDef" }, plugin = { "pretty",
		"json:src\\test\\resources\\Reports\\AutomationFacebook.json" }, tags = { "~@A" })
public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {

		JvmReport.generateReport(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\AutomationFacebook.json");
	}

	public void div() {
		System.out.println("div");

	}

	public void multiple() {
		System.out.println("Multiple");

	}

	public void sample() {
		System.out.println("Sample");

	}

}
