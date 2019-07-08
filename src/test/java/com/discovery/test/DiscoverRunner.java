package com.discovery.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features/discovery.feature",     // this way it will run all the feature file from this directory 
		glue="com.discovery.test",   // for all the feature file ,it will find all the step defination from this directory
		dryRun=false,
		strict=true,
		monochrome=true,
		plugin = { "pretty", "html:target/cucumber-reports" }
		)
public class DiscoverRunner {
	

}
