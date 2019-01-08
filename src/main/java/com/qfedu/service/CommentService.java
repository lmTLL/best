package com.qfedu.service;

import com.qfedu.vo.ResultVo;

public interface CommentService {
    ResultVo selectByGoodsId(Integer comGid);
}
