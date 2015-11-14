package org.qamatic.examples;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

/**
 * Created by senthil on 11/13/15.
 */
public class SampleTest extends BaseDbTest  {

    @Autowired
    private Dummy injectedObject;


    @Test
    public void aTest(){
        assertNotNull("Object is not null", injectedObject);
    }
}
