package com.example.sagher.radiomubasher;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by sagher on 24/03/16.
 */
public class Member implements Serializable {
    private String mName;
    private String mEmail;
    private String mCommittee;
    private String mPassword;
    private UUID mId;

    public Member(String name, String email, String committee) {
        mName = name;
        mEmail = email;
        mCommittee = committee;
        mId=UUID.randomUUID();
    }

    public String getName() {
        return mName;
    }

    public String getEmail() {
        return mEmail;
    }

    public String getCommittee() {
        return mCommittee;
    }

    public String getPassword() {
        return mPassword;
    }

    public UUID getId() {
        return mId;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public void setCommittee(String committee) {
        mCommittee = committee;
    }

    public void setPassword(String password) {
        mPassword = password;
    }
}
