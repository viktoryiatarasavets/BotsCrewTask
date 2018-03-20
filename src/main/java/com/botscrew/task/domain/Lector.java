package com.botscrew.task.domain;


public class Lector {

    private int lectorId;
    private String name;

    LectorDegree degree;

    public int getLectorId() {
        return lectorId;
    }

    public void setLectorId(int lectorId) {
        this.lectorId = lectorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LectorDegree getDegree() {
        return degree;
    }

    public void setDegree(LectorDegree degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Lector{" +
                "lectorId=" + lectorId +
                ", name='" + name + '\'' +
                ", degree=" + degree +
                '}';
    }
}
