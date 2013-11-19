package com.geeps.backend.hello.serviceapi;

import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import static org.junit.Assert.fail;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Spring based transactional test with DbUnit support.
 */
public class SampleServiceTest extends AbstractDbUnitJpaTests
    implements SampleServiceTestBase {
    @Autowired
    protected SampleService sampleService;

    @Test
    public void testCreate() throws Exception {
        // TODO Auto-generated method stub

    }
}
