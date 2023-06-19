package com.freesofts.algorithm.common.feign.fallback;

import com.freesofts.common.response.BizResponseData;
import com.freesofts.common.response.result.types.ObjectBizResult;
import com.freesofts.algorithm.common.feign.FileService;

import java.util.HashMap;


public class FileServiceCallback implements FileService {

    @Override
    public BizResponseData<?> copy(HashMap fileCopy) {
        return ObjectBizResult.builder().object(null).message("复制图片失败").build().nonNull();
    }
}
