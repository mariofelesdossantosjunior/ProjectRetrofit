package com.mariofeles.projectretrofit.api;

import com.mariofeles.projectretrofit.model.Programas;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by mario on 23/10/15.
 */
public interface ProgramasAPI {
    @GET("programas/verifica")
    Call<List<Programas>> getProgramasCall();
}
