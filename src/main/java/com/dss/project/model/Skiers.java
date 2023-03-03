package com.dss.project.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "ResortsList")
public class Skiers {

    @Id
    private ObjectId objectId;
    @Field
    private Integer resortID;
    @Field
    private Integer seasonId;
    @Field
    private Integer skierId;
    @Field
    private Integer liftId;
    @Field
    private Integer dayId;
    @Field
    private Integer totalVert;
    @Field
    private Integer time;
    @Field
    private Integer numSkiers;
    @Field
    private List<String> seasons;
    @Field
    private String resortName;


    public Skiers(ObjectId objectId, Integer resortID, Integer seasonId, Integer skierId, Integer liftId, Integer dayId, Integer totalVert, Integer time, Integer numSkiers, List<String> seasons, String resortName) {
        this.objectId = objectId;
        this.resortID = resortID;
        this.seasonId = seasonId;
        this.skierId = skierId;
        this.liftId = liftId;
        this.dayId = dayId;
        this.totalVert = totalVert;
        this.time = time;
        this.numSkiers = numSkiers;
        this.seasons = seasons;
        this.resortName = resortName;
    }

    public ObjectId getObjectId() {
        return objectId;
    }

    public void setObjectId(ObjectId objectId) {
        this.objectId = objectId;
    }

    public Integer getResortID() {
        return resortID;
    }

    public void setResortID(Integer resortID) {
        this.resortID = resortID;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public Integer getSkierId() {
        return skierId;
    }

    public void setSkierId(Integer skierId) {
        this.skierId = skierId;
    }

    public Integer getLiftId() {
        return liftId;
    }

    public void setLiftId(Integer liftId) {
        this.liftId = liftId;
    }

    public Integer getDayId() {
        return dayId;
    }

    public void setDayId(Integer dayId) {
        this.dayId = dayId;
    }

    public Integer getTotalVert() {
        return totalVert;
    }

    public void setTotalVert(Integer totalVert) {
        this.totalVert = totalVert;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getNumSkiers() {
        return numSkiers;
    }

    public void setNumSkiers(Integer numSkiers) {
        this.numSkiers = numSkiers;
    }

    public List<String> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<String> seasons) {
        this.seasons = seasons;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    @Override
    public String toString() {
        return "Skiers{" +
                "objectId=" + objectId +
                ", resortID=" + resortID +
                ", seasonId=" + seasonId +
                ", skierId=" + skierId +
                ", liftId=" + liftId +
                ", dayId=" + dayId +
                ", totalVert=" + totalVert +
                ", time=" + time +
                ", numSkiers=" + numSkiers +
                ", seasons='" + seasons + '\'' +
                ", resortName='" + resortName + '\'' +
                '}';
    }
}
