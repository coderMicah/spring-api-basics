package com.mika.restful_web_services.versioning;

public class Person2 {
    private Name name;

    public Person2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1[name = " + this.name + " ]";
    }

}
