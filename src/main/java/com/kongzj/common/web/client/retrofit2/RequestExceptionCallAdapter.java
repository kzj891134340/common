package com.kongzj.common.web.client.retrofit2;

import com.kongzj.common.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Response;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * 请求异常处理
 * 抛出SDK内部异常
 *
 * @author kongzj Create At 2018/10/10 20:58
 */
@Slf4j
public class RequestExceptionCallAdapter implements CallAdapter {

    private Type returnType;

    public RequestExceptionCallAdapter(Type returnType) {
        this.returnType = returnType;
    }

    @Override
    public Type responseType() {
        return returnType;
    }

    @Override
    public Object adapt(Call call) {
        try {
            Response response = call.execute();
            if (!response.isSuccessful()) {
                log.error("服务器响应状态不成功:{}", response.code());
                ServiceException e = new ServiceException("服务处理失败:" + response.code());
                e.setPayload(response.code());
                throw e;
            }
            return response.body();
        } catch (IOException e) {
            log.error("请求服务失败: {}", e.getMessage(), e);
            throw new ServiceException(e.getMessage(), e);
        }
    }

}
