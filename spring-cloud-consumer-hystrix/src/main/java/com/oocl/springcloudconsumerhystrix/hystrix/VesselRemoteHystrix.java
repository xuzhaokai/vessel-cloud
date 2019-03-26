package com.oocl.springcloudconsumerhystrix.hystrix;

import com.oocl.springcloudconsumerhystrix.base.BaseResponse;
import com.oocl.springcloudconsumerhystrix.base.Constant;
import com.oocl.springcloudconsumerhystrix.remote.VesselRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class VesselRemoteHystrix implements VesselRemote {
//  @Override
//  public String hello(String name) {
//    return null;
//  }

  @Override
  public BaseResponse getVesselStatus(@RequestParam(value = "vesselGid") String vesselGid) {
    BaseResponse baseResponse = new BaseResponse();
    baseResponse.setMsg(Constant.SERVER_FAIL);
    baseResponse.setCode(Constant.SERVER_FAIL_CODE);
    return baseResponse;
  }
}