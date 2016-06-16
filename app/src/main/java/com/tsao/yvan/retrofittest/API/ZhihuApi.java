package com.tsao.yvan.retrofittest.API;



import com.tsao.yvan.retrofittest.model.Zhihu;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by Yvan on 2016/6/1.
 */
public interface ZhihuApi {

    @GET("api/4/news/latest")
    Call<Zhihu> getZhihuNewsLatest();
}
