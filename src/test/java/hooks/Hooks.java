package hooks;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void start(){
        BaseTest.setup();
    }

    @After
    public void end(){
        BaseTest.quit();
    }
}