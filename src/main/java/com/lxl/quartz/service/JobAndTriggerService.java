package com.lxl.quartz.service;


import com.lxl.quartz.entity.JobAndTrigger;
import com.github.pagehelper.PageInfo;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: TODO
 * @create 2018-04-09 10:48
 **/
public interface JobAndTriggerService {
    /**
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
