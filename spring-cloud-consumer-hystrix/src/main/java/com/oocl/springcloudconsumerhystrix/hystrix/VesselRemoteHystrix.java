package com.oocl.springcloudconsumerhystrix.hystrix;

import com.oocl.springcloudconsumerhystrix.remote.VesselRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class VesselRemoteHystrix implements VesselRemote {

  @Override
  public String getAllVessel() {
    return "failed to getAllVessel";
  }

  @Override
  public String hello(@RequestParam(value = "name") String name) {
    return "hello" + name + ", this messge send failed ";
  }
}