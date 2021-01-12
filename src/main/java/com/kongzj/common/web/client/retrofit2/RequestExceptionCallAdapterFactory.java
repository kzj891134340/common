package com.kongzj.common.web.client.retrofit2;

import retrofit2.CallAdapter;
import retrofit2.Retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * @author kongzj Create At 2018/10/10 20:51
 */
public class RequestExceptionCallAdapterFactory extends CallAdapter.Factory {

    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        return new RequestExceptionCallAdapter(returnType);
    }
}
