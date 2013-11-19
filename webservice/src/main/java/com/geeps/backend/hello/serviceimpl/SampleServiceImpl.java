package com.geeps.backend.hello.serviceimpl;

import org.springframework.stereotype.Service;

import com.geeps.backend.hello.domain.Sample;

/**
 * Implementation of SampleService.
 */
@Service("sampleService")
public class SampleServiceImpl extends SampleServiceImplBase {
    public SampleServiceImpl() {
    }

    //sample create method
    public Sample create(Sample sample) {

       return getSampleRepository().save(sample) ;


    }
}
