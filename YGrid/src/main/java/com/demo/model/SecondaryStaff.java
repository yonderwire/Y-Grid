package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "secondary_staff")
public class SecondaryStaff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "secondary_staffId")
    private int secondaryStaffId;
    @Column(name = "screen_writers")
    private String screenWriters;
    @Column(name = "audio_engr")
    private String audioEngr;
    @Column(name = "illustrators")
    private String illustrators;
    @Column(name = "editors")
    private String editors;
    @Column(name = "musicians")
    private String musicians;

    public SecondaryStaff() {
      
    }

    public SecondaryStaff(int secondaryStaffId, String screenWriters, String audioEngr, String illustrators,
            String editors, String musicians) {
        this.secondaryStaffId = secondaryStaffId;
        this.screenWriters = screenWriters;
        this.audioEngr = audioEngr;
        this.illustrators = illustrators;
        this.editors = editors;
        this.musicians = musicians;
    }

    public int getSecondaryStaffId() {
        return secondaryStaffId;
    }

    public String getScreenWriters() {
        return screenWriters;
    }

    public String getAudioEngr() {
        return audioEngr;
    }

    public String getIllustrators() {
        return illustrators;
    }

    public String getEditors() {
        return editors;
    }

    public String getMusicians() {
        return musicians;
    }

    public void setSecondaryStaffId(int secondaryStaffId) {
        this.secondaryStaffId = secondaryStaffId;
    }

    public void setScreenWriters(String screenWriters) {
        this.screenWriters = screenWriters;
    }

    public void setAudioEngr(String audioEngr) {
        this.audioEngr = audioEngr;
    }

    public void setIllustrators(String illustrators) {
        this.illustrators = illustrators;
    }

    public void setEditors(String editors) {
        this.editors = editors;
    }

    public void setMusicians(String musicians) {
        this.musicians = musicians;
    }

    @Override
    public String toString() {
        return "SecondaryStaff [secondaryStaffId=" + secondaryStaffId + ", screenWriters=" + screenWriters
                + ", audioEngr=" + audioEngr + ", illustrators=" + illustrators + ", editors=" + editors
                + ", musicians=" + musicians + "]";
    }

}
