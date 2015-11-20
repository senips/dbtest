package org.qamatic.examples;

/**
 * Created by Senthil Maruthaiappan on 11/12/15.
 */

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations = {"classpath:/test-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class BaseDbTest {
}
