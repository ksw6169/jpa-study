package org.corgi.jpastudy.example.inheritance.singleTable.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
//@DiscriminatorValue(value = "M")   // default : Entity name
public class Movie extends Item {

    private String director;
    private String actor;
}
