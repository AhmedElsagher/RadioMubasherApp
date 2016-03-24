package com.example.sagher.radiomubasher;

import android.provider.CalendarContract;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;


/**
 * Created by sagher on 24/03/16.
 */
public class Program implements Serializable {
    private String mName;
    private String mDescription;
    //mTimes just for mo3ed el program
    private ArrayList<Calendar> mTimes;
    //used members instead of id of members
    private Member mPresenter;
    private Member mDirector;
    private Member mEditor;
    private UUID mId;

    public Program(String description, String name, Member presenter, Member director, Member edittor) {
        mDescription = description;
        mName = name;
        mPresenter = presenter;
        mDirector = director;
        mEditor = edittor;
        mId = UUID.randomUUID();
    }

    public Program(String name, String description) {
        mName = name;
        mDescription = description;
        mId = UUID.randomUUID();
    }

    public void setName(String name) {
        mName = name;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public void setTimes(ArrayList<Calendar> times) {
        mTimes = times;
    }

    public void setPresenter(Member presenter) {
        mPresenter = presenter;
    }

    public void setDirector(Member director) {
        mDirector = director;
    }

    public void setEdittor(Member edittor) {
        mEditor = edittor;
    }


    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public ArrayList<Calendar> getTimes() {
        return mTimes;
    }

    public Member getPresenter() {
        return mPresenter;
    }

    public Member getDirector() {
        return mDirector;
    }

    public Member getEdittor() {
        return mEditor;
    }

    public UUID getId() {
        return mId;
    }
}
