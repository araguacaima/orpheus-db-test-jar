package com.araguacaima.orpheusdb.jar.model;

import com.araguacaima.orpheusdb.annotations.Versionable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PersistenceUnit;

@Entity
@PersistenceUnit(unitName = "orpheus-db-test")
@Versionable
public class G extends H {

    @Column
    private String testField1;

    @Column
    private long testField2;

    public G() {

    }

    public String getTestField1() {
        return testField1;
    }

    public void setTestField1(String testField1) {
        this.testField1 = testField1;
    }

    public long getTestField2() {
        return testField2;
    }

    public void setTestField2(long testField2) {
        this.testField2 = testField2;
    }


}