package com.araguacaima.orpheusdb.jar.model.versionable;

import com.araguacaima.orpheusdb.jar.model.K;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PersistenceUnit;

@Entity
@PersistenceUnit(unitName = "orpheus-db-test")

public abstract class J extends K {

    @Column
    private String testField5;

    @Column
    private boolean testField6;

    public J() {
    }

    public String getTestField5() {
        return testField5;
    }

    public void setTestField5(String testField5) {
        this.testField5 = testField5;
    }

    public boolean isTestField6() {
        return testField6;
    }

    public void setTestField6(boolean testField6) {
        this.testField6 = testField6;
    }
}