package com.cucumber.steps;

import com.cucumber.login.LoginTest;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Administrator on 2017/5/2.
 */
public class Steps {
    WebDriver driver;

    @当("^我打开163网站$")
    public void openURL(){
//        System.out.println("我打开163网站");
        driver = new FirefoxDriver();
        driver.get("http://mail.163.com/");
    }

    @并且("^我在email文本框输入\"(.*?)\"$")
    public void sendkeysEmail(String email){
        System.out.println("我输入的emali是：  "+email);
    }

    @并且("^我在密码框输入\"(.*?)\"$")
    public void sendkeysPWD(String pwd){
        System.out.println("我输入的密码是：  "+pwd);
    }

    @当("^我点击登陆成功$")
    public void clickLoginButton(){
        System.out.println("我点击登陆成功");
    }

    @那么("^我登陆成功$")
    public void loginSuc(){
        System.out.println("登陆成功");
    }

    @当("^我用\"(.*?)\"帐号，密码\"(.*?)\"登录$")
    public void loginTestAccount(String email,String pwd){
       /* System.out.println("我用 "+email+" 帐号登录");
        System.out.println("我用 "+pwd+" 密码登录");*/
       /* driver.switchTo().frame("x-URS-iframe");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.id("dologin")).click();*/
        LoginTest.login(driver,email,pwd);

    }

}

