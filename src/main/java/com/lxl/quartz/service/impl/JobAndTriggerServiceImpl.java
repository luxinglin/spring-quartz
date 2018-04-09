package com.lxl.quartz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lxl.quartz.dao.JobAndTriggerMapper;
import com.lxl.quartz.entity.JobAndTrigger;
import com.lxl.quartz.service.JobAndTriggerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author luxinglin
 * @version 1.0
 * @Description: TODO
 * @create 2018-04-09 10:48
 **/
@Service
public class JobAndTriggerServiceImpl implements JobAndTriggerService {
    protected static Logger logger = LoggerFactory.getLogger(JobAndTriggerServiceImpl.class);
    @Autowired
    private JobAndTriggerMapper jobAndTriggerMapper;

    @Override
    public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<JobAndTrigger> list = jobAndTriggerMapper.getJobAndTriggerDetails();
        PageInfo<JobAndTrigger> page = new PageInfo<JobAndTrigger>(list);
        logger.info(String.format("get jobs return {%s} record", page != null ? page.getTotal() : 0));
        return page;
    }

}