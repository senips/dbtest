package org.qamatic.examples;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;


public class DataValidations extends BaseDbTest {

    @Autowired
    private Dummy injectedObject;


    @BeforeClass
    public static void setUp() {
        System.out.println("-----> SETUP <-----");
    }

    @AfterClass
    public static void afterTest() {
        System.out.println("-----> DESTROY <-----");
    }

    @Test
    public void testSampleServiceGetOrder() {


        assertNotNull("Object is not null", injectedObject);
    }
}
