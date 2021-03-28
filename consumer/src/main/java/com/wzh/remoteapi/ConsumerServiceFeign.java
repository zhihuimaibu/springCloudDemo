package com.wzh.remoteapi;

import com.wzh.fallback.FeignApiFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="producer", fallback = FeignApiFallBack.class)
public interface ConsumerServiceFeign {
    @RequestMapping("getMessage")
    String getMessage(@RequestParam("name") String name);
}
