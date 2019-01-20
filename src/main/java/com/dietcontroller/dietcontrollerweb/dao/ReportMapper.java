package com.dietcontroller.dietcontrollerweb.dao;

import com.dietcontroller.dietcontrollerweb.model.Report;

public interface ReportMapper {
    int insert(Report record);

    int insertSelective(Report record);
}