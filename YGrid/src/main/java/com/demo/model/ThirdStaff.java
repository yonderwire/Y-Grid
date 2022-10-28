package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "third_staff")
public class ThirdStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "third_staff_id")
    private int thirdStaffId;
    @Column(name = "line_reader")
    private String lineReader;
    @Column(name = "set_designer")
    private String setDesigner;
    @Column(name = "hmu")
    private String hmu;

    public ThirdStaff(){
        
    }
    
    public ThirdStaff(int thirdStaffId, String lineReader, String setDesigner, String hmu) {
        this.thirdStaffId = thirdStaffId;
        this.lineReader = lineReader;
        this.setDesigner = setDesigner;
        this.hmu = hmu;
    }

    public int getThirdStaffId() {
        return thirdStaffId;
    }


    public void setThirdStaffId(int thirdStaffId) {
        this.thirdStaffId = thirdStaffId;
    }


    public String getLineReader() {
        return lineReader;
    }


    public void setLineReader(String lineReader) {
        this.lineReader = lineReader;
    }


    public String getSetDesigner() {
        return setDesigner;
    }


    public void setSetDesigner(String setDesigner) {
        this.setDesigner = setDesigner;
    }


    public String getHmu() {
        return hmu;
    }


    public void setHmu(String hmu) {
        this.hmu = hmu;
    }


    @Override
    public String toString() {
        return "ThirdStaff [thirdStaffId=" + thirdStaffId + ", lineReader=" + lineReader + ", setDesigner="
                + setDesigner + ", hmu=" + hmu + "]";
    }

}
