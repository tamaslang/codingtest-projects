package com.equalexperts.codingtest;

import com.equalexperts.HelloWorld;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class HelloWorldTest {
    @Test
    public void firstTest() {
        assertThat(new HelloWorld().hello(), is("hello"));
    }
}
