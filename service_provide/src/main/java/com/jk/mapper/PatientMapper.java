package com.jk.mapper;

import com.jk.bean.General;

import java.util.List;

public interface PatientMapper {

    List<General> queryVideo();

    List<General> queryManual();
}