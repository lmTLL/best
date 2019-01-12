package com.qfedu.controller;


import com.qfedu.pojo.Install;
import com.qfedu.service.InstallService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Api(produces="安装服务接口",value="接口文档")
@RestController
public class InstallController {

        @Autowired
        private InstallService installService;

        @ApiOperation(value="安装服务")
        @RequestMapping("/addInstall.do")
        @CrossOrigin
        public ResultVo addInstall(@ApiParam("安装产品id")Integer gid, @ApiParam("物流状态id")Integer dsid, @ApiParam("期望服务时间")String stime, @ApiParam("服务地址") Integer aid, @ApiParam("产品型号或机身条码")String type, @ApiParam("备注信息")String info)  {
            Install install=new Install();
            install.setGid(gid);
            install.setDsid(dsid);
            CustomerDateConvert dc=new CustomerDateConvert();
            Date expectedtime= null;
            try {
                expectedtime = dc.convert(stime);
            } catch (Exception e) {
                e.printStackTrace();
            }
            install.setExpectedtime(expectedtime);
            install.setAid(aid);
            install.setType(type);
            install.setInfo(info);
            int i=installService.addInstall(install);
            if(i>0){
                return ResultVo.setOK(1);
            }else{
                return ResultVo.setERROR();
            }

        }

}
