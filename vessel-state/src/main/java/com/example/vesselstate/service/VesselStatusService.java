package com.example.vesselstate.service;

import com.example.vesselstate.base.BaseResponse;
import com.example.vesselstate.entity.VesselStatus;

import java.util.List;

public interface VesselStatusService {

  BaseResponse saveVesselStatus(VesselStatus vessel);

  BaseResponse removeVesselStatus(String vesselGid);

  BaseResponse updateVesselStatus(VesselStatus vessel);

  BaseResponse findVesselStatusByVesselGid(String vesselGid);

  BaseResponse<List<VesselStatus>> getAllVessel();
}
