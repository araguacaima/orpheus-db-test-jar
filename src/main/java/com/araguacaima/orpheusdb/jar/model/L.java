package com.araguacaima.orpheusdb.jar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
@PersistenceUnit(unitName = "orpheus-db-test")
@Component
public abstract class L implements Serializable {

    @Id
    @NotNull
    @Column(name = "Id")
    private String id;

    public L() {
        this.id = generateId();
    }

    @JsonIgnore
    private String generateId() {
        return UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}