package com.bw;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhx on 2017/7/24.
 */
@FeignClient("service-client")
public interface DcClient {

    @RequestMapping(value="/get",method = RequestMethod.GET)
    public User get1(@RequestParam("id") int id, @RequestParam("username") String username);
}
