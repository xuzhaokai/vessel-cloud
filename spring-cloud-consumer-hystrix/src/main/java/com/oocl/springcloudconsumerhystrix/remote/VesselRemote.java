package com.oocl.springcloudconsumerhystrix.remote;

import com.oocl.springcloudconsumerhystrix.base.BaseResponse;
import com.oocl.springcloudconsumerhystrix.hystrix.VesselRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "service-backend-vessel-state")
public interface VesselRemote {
//  @RequestMapping(value = "/vessel")
//  public String getAllVessel();
//
//  @RequestMapping(value = "/hello")
//  public String hello(@RequestParam(value = "name") String name);

  @RequestMapping(value = "vessel/status")
  public BaseResponse getVesselStatus(@RequestParam(value = "vesselGid") String vesselGid);
}
