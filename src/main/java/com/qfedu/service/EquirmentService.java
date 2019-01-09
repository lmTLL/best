package com.qfedu.service;

import com.qfedu.vo.ResultVo;

public interface EquirmentService {

    ResultVo addEquirment(Integer eqGid, Integer eqUid);

    ResultVo selectEqByUserId(Integer eqUid);
}
