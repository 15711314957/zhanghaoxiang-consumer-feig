package com.bw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhx on 2017/7/22.
 */
@RestController
public class DcController {
    @Autowired
    private DcClient dcClient;
    @GetMapping("/consumer")
    public User dc(Integer id,String username) {

        return dcClient.get1(id, username);
    }
}
