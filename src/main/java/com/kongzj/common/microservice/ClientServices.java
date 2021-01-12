package com.kongzj.common.microservice;

import java.util.List;
import java.util.Map;

/**
 * @author kongzj Create At 2019-12-13
 */
public interface ClientServices {

    List<String> getServices();

    boolean exists(String serviceId);

    <T> T newInstance(String serviceId, Class<T> clazz);

    <T> T newInstance(String serviceId, Class<T> clazz, Map<String, String> headers);

}
