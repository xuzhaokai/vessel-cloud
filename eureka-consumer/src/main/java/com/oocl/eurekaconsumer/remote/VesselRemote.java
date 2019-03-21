package com.oocl.eurekaconsumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "service-backend-producer" )
public interface VesselRemote {
  @RequestMapping(value = "/vessel")
  public String getAllVessel();

  @RequestMapping(value = "/hello")
  public String hello(@RequestParam(value = "name") String name);

  @GetMapping(value = "/vessel/{vesselGid}")
  public String getVesselByGid(@PathVariable(value = "vesselGid") String vesselGid);
}
