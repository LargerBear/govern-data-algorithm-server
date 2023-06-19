package com.freesofts.algorithm.service;

import com.freesofts.common.response.result.types.ListBizResult;
import com.freesofts.common.response.result.types.ObjectBizResult;

public interface ModelSkeletonService {

    ObjectBizResult selectSkeletonTree(String id);
}
