package com.example.retrofit;

        import java.util.List;


        import retrofit2.Call;
        import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://jsonplaceholder.typicode.com/todos/";

    @GET("https://jsonplaceholder.typicode.com/todos/")
    Call<List<Hero>> getHeroes();
}

