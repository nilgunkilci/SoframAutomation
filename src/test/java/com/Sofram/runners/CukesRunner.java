package com.Sofram.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/Sofram/stepsdefinitions",
        dryRun =false,
        tags = "@B7SFRM-195"
)
public class CukesRunner {
}
