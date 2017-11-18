package com.accountmarket.login;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void add() throws Exception {
        Assert.assertEquals(4, Main.add(2,2));
    }

}