package com.oocl.eurekaconsumer.controller;

import com.oocl.eurekaconsumer.remote.VesselRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VesselController {
  @Autowired
  VesselRemote vesselRemote;

  @RequestMapping("/vessel")
  public String getAllVessel() {
    return vesselRemote.getAllVessel();
  }

  @GetMapping("/vessel/{vesselGid}")
  public String getVesselByGid(@PathVariable("vesselGid") String vesselGid) {
    return vesselRemote.getVesselByGid(vesselGid);
  }

  @RequestMapping("/hello/{name}")
  public String index(@PathVariable("name") String name) {
    return vesselRemote.hello(name);
  }
}
