package com.oocl.springcloudconsumerhystrix.controller;

import com.oocl.springcloudconsumerhystrix.base.BaseResponse;
import com.oocl.springcloudconsumerhystrix.remote.VesselRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VesselController {
  @Autowired
  VesselRemote vesselRemote;

//  @RequestMapping("/vessel")
//  public String getAllVessel() {
//    return vesselRemote.getAllVessel();
//  }
//
//  @RequestMapping("/hello/{name}")
//  public String hello(@PathVariable("name") String name) {
//    return vesselRemote.hello(name);
//  }

  @ResponseBody
  @RequestMapping("/vessel/status/{vesselGid}")
  public BaseResponse index(@PathVariable("vesselGid") String vesselGid) {
    return vesselRemote.getVesselStatus(vesselGid);
  }
}
