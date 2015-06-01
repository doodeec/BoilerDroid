package com.doodeec.boilerdroid.client;

import com.doodeec.boilerdroid.client.response.PlaceholderResponse;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * @author Dusan Bartos
 */
public interface RestService {
    @GET("/api")
    void getSomething(Callback<PlaceholderResponse> callback);
}
