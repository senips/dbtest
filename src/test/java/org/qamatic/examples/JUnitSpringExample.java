package org.qamatic.examples;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class JUnitSpringExample {

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
