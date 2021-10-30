package com.we_love_crazy_quote.bmi_calculator;

import androidx.annotation.DrawableRes;

public class BucketListEntry {
    String heading;
    String description;
    int image;
    float rating;


    public BucketListEntry(String heading, String description, @DrawableRes int image, float rating){
        this.heading=heading;
        this.description=description;
        this.image=image;
        this.rating=rating;
    }

}
