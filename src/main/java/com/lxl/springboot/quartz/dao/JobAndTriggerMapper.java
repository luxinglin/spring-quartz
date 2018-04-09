package com.lxl.springboot.quartz.dao;

import com.lxl.springboot.quartz.entity.JobAndTrigger;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: TODO
 * @create 2018-04-09 10:48
 **/
@Repository
public interface JobAndTriggerMapper {
    /**
     * test
     * @return
     */
    List<JobAndTrigger> getJobAndTriggerDetails();
}
