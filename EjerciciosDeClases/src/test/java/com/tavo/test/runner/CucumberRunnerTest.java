package com.tavo.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.tavo.test.stepDefinitions", "com.tavo.test.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}

