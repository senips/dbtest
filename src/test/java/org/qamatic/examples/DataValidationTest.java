package org.qamatic.examples;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.qamatic.mintleaf.interfaces.DbContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.Assert.assertNotNull;


public class DataValidationTest extends BaseDbTest {


    @Autowired
    @Qualifier("TEST_USER_CONTEXT")
    private DbContext testUserDbContext;

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

        assertNotNull("Object is not null", testUserDbContext);

    }
}
