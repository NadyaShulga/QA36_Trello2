package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase{
    @BeforeMethod
    public void preConditions(){
        if(app.getUser().isLogged()){
            app.getUser().logOut();
        }
    }
    @Test
    public void Login1(){
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillInLoginForm("shulganp@gmail.com", "Na:30091983");
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());
    }

}
