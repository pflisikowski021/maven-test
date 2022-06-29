package com.testmaven.app;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
    private Greeter greeter = new Greeter();

    @Test
    public void shouldAnswerWithTrue()
    {
        assertThat("Returned wrong greeting", greeter.sayHello(), containsString("Hello"));
    }
}
