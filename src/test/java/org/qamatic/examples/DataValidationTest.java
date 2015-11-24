/*
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2010-2015 Senthil Maruthaiappan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package org.qamatic.examples;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.qamatic.common.BaseDbTest;
import org.qamatic.mintleaf.interfaces.DbContext;
import org.qamatic.mintleaf.oracle.OraclePackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.IOException;
import java.sql.SQLException;

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

    @Test
    public void testUserCreation() throws IOException, SQLException {
        OraclePackage sqlObject = new OraclePackage(testUserDbContext) {
        };
        sqlObject.setSource("/CREATE_TEST_USER.sql");
        sqlObject.create();
        assertNotNull("Object is not null", testUserDbContext);

    }

}
