package com.freesofts.algorithm.service.impl;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import com.freesofts.common.response.result.types.ListBizResult;
import com.freesofts.common.response.result.types.ObjectBizResult;
import com.freesofts.algorithm.service.ModelSkeletonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelSkeletonServiceImpl implements ModelSkeletonService {


    @Override
    public ObjectBizResult selectSkeletonTree(String id) {

        return ObjectBizResult.builder().object(null).build();
    }
}
