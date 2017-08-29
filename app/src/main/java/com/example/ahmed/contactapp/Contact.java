package com.example.ahmed.contactapp;

/**
 * Created by Ahmed on 29/08/2017.
 */

public class Contact {


    private String mName ;
    private String mPhoneNumber ;
    private int mImageResourceID=No_IMAGE_PROVIDED;
    private static final int  No_IMAGE_PROVIDED =-1;


    public Contact(String name,String phoneNumber ,int imageResourceID){

        mName=name;
        mPhoneNumber=phoneNumber;
        mImageResourceID=imageResourceID;
    }


    public String getmName() {
        return mName;
    }


    public String getmPhoneNumber() {
        return mPhoneNumber;
    }


    public int getmImageResourceID() {
        return mImageResourceID;
    }


}
