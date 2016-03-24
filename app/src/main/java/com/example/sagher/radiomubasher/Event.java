package com.example.sagher.radiomubasher;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by sagher on 24/03/16.
 */
public class Event implements Serializable {
    private String mName;
    private String mDescription;
    private Date mDate;
    private UUID mId;

    public Event(String name, String description) {
        mName = name;
        mDescription = description;
    }

    public Event(String name, String description, Date date) {
        mName = name;
        mDescription = description;
        mDate = date;
        mId = UUID.randomUUID();
    }


    public void setName(String name) {
        mName = name;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public Date getDate() {
        return mDate;
    }

    public UUID getId() {
        return mId;
    }
}
