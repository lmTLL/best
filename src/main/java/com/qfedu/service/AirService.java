package com.qfedu.service;

import com.qfedu.vo.ResultVo;

public interface AirService {
    ResultVo selectAll();

    ResultVo UpdateTem(Integer airTem);

    ResultVo UpdateWsp(Integer airWsp);

    ResultVo UpdateWdir(Integer airWdir);
}
