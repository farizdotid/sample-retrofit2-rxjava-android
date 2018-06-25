package com.farizdotid.sampleretrofitrx.apiservice;

import com.farizdotid.sampleretrofitrx.model.ResponseRepos;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by fariz ramadhan.
 * website : www.farizdotid.com
 * github : https://github.com/farizdotid
 * linkedin : https://www.linkedin.com/in/farizramadhan/
 */
public interface BaseApiService {

    /*
    Fungsi @Path disini adalah untuk mengisi value yang sudah kita set.
    Contoh : {username} disini nantinya akan diisi dengan kebutuhan yang disesuaikan.

    Observable disini ialah dari RxJava. Karena pada contoh disini kita akan menggabungkan
    Retrofit dengan RxJava.
     */
    @GET("users/{username}/repos")
    Observable<List<ResponseRepos>> requestRepos(@Path("username") String username);
}