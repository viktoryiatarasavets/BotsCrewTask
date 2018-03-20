package com.botscrew.task.domain;


public class LectorDegree {
    private int degreeId;
    private String degreeName;

    public int getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(int degreeId) {
        this.degreeId = degreeId;
    }

    public String getDegreeName() {
        return degreeName;
    }


    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;


    }


    @Override
    public String toString() {
        return "LectorDegree{" +
                "degreeId=" + degreeId +
                ", degreeName='" + degreeName + '\'' +
                '}';
    }
}
