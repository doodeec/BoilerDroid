package com.doodeec.boilerdroid.client.response;

import com.google.gson.annotations.SerializedName;

/**
 * @author Dusan Bartos
 */
public class PlaceholderResponse {
    @SerializedName("data")
    private String mData;

    public String getData() {
        return mData;
    }
}
