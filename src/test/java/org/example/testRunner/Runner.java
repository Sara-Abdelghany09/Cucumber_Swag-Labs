package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "C:\\Users\\sigma\\IdeaProjects\\Task_SwagLab\\src\\main\\resources\\Features",
        //glue  stepdef copy reference
        glue ="org.example.stepDef",
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"}

)
public class Runner extends AbstractTestNGCucumberTests
{

}
