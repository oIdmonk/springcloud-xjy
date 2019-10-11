package com.oldmonk.cloud.service.hystrixfactory;

import com.oldmonk.cloud.exception.ServiceException;
import com.oldmonk.cloud.service.remote.HelloRemote;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @program: cloud
 * @description: 统一熔断处理===效果不理想，自定义异常无效、后续研究
 * @author: xujingyang
 * @create: 2019-10-09 13:24
 **/
@Component
public class WebFeignFallbackFactory implements FallbackFactory<HelloRemote> {
    @Override
    public HelloRemote create(Throwable throwable) {
        throw new ServiceException("guala");
    }
}
