package com.bignerdranch.android.amplitudo6;

import com.bignerdranch.android.amplitudo6.models.SearchResultsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("search/anime")
    Call<SearchResultsResponse> getSearchResults(@Query("q") String query);


}
