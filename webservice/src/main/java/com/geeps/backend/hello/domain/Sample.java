package com.geeps.backend.hello.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Entity representing Sample.
 * <p>
 * This class is responsible for the domain object related
 * business logic for Sample. Properties and associations are
 * implemented in the generated base class {@link com.geeps.backend.hello.domain.SampleBase}.
 */
@Entity
@Table(name = "SAMPLE")
@XStreamAlias("Sample")
public class Sample extends SampleBase {
    private static final long serialVersionUID = 1L;

    protected Sample() {
    }

    public Sample(String entity) {
        super(entity);
    }
}
