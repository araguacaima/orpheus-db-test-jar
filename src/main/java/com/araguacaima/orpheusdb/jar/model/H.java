package com.araguacaima.orpheusdb.jar.model;


import com.araguacaima.orpheusdb.jar.model.versionable.I;

import javax.persistence.Entity;
import javax.persistence.PersistenceUnit;

@Entity
@PersistenceUnit(unitName = "orpheus-db-test")
public abstract class H extends I {
    public H() {
    }
}
