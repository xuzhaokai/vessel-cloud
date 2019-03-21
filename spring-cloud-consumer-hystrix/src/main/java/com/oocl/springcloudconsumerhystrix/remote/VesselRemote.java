package com.oocl.springcloudconsumerhystrix.remote;

import com.oocl.springcloudconsumerhystrix.hystrix.VesselRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "service-backend-producer" ,fallback = VesselRemoteHystrix.class)
public interface VesselRemote {
  @RequestMapping(value = "/vessel")
  public String getAllVessel();

  @RequestMapping(value = "/hello")
  public String hello(@RequestParam(value = "name") String name);
}
