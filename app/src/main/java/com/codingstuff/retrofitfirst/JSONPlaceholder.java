package com.codingstuff.retrofitfirst;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JSONPlaceholder {
    @GET("posts")
    Call<List<Post>> getPost();

    @GET("comments")
    Call<List<Comment>> getComments(@Query("postId") int postId);

    @POST("posts")
    Call<Post> createPost(@Body Post post);

    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(@Field("userId") String userId , @Field("title") String title , @Field("body") String text);

    @PUT("posts/{id}")
    Call<Post> putPost(@Path("id") int id , @Body Post post);

    @PATCH("posts/{id}")
    Call<Post> patchPost(@Path("id") int id , @Body Post post);

    @DELETE("posts/{id}")
    Call<Void> deletePost(@Path("id") int id);
}
