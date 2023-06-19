package com.freesofts.algorithm.common.feign;

import com.freesofts.common.response.BizResponseData;
import com.freesofts.algorithm.common.config.FeignConfiguration;
import com.freesofts.algorithm.common.feign.fallback.FileServiceCallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

@FeignClient(value = "govern-lowcode-tool", configuration = FeignConfiguration.class, fallback = FileServiceCallback.class)
public interface FileService {

    @PostMapping("/file/copy")
    BizResponseData<?> copy(@RequestBody HashMap fileCopy);
}
