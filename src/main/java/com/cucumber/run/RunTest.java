package com.cucumber.run;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Administrator on 2017/5/2.
 */

    @CucumberOptions(
            features = "src/test/features/",
            format = {"pretty",
                    "html:target/site/cucumber-pretty",
                    "return:target/site/return.txt",
                    "json:target/cucumberjson.json"
            },
            tags = {"@Automation"},
    //            tags = {"~@Automation"},//表示排除这个Automation的所有标签
            glue = {"steps"}
    )

    public class RunTest extends AbstractTestNGCucumberTests{
 }