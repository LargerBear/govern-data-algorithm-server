package com.freesofts.algorithm.common.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 功能描述：Feign配置类
 *
 * <p>版权所有：</p>
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 *
 * @Company 杭州孚立计算机软件有限公司
 * @Author 万启
 * @Datetime 2022/3/3 9:26
 */
@Configuration
@Slf4j
public class FeignConfiguration implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String token;
        if (attributes == null) {
            // 如果attributes为空，则可能是多线程调用，去线程共享类去尝试获取token
            token = "";
        } else {
            HttpServletRequest request = attributes.getRequest();
            token = request.getHeader(HttpHeaders.AUTHORIZATION); // 请求头名称，下同

        }
        if (token == null) {
            log.info("--请求中未携带token.......");
            return;
        }
        requestTemplate.header(HttpHeaders.AUTHORIZATION, token);
    }

}
