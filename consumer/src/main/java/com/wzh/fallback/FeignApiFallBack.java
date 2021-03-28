package com.wzh.fallback;

import com.wzh.remoteapi.ConsumerServiceFeign;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FeignApiFallBack implements ConsumerServiceFeign {
    @Override
    public String getMessage(@RequestParam String name) {
        return "hello" + name + ",this message send failed";
    }
}
