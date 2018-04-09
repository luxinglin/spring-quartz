package com.lxl.springboot.quartz.job;

import com.lxl.springboot.quartz.common.job.BaseJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: TODO
 * @create 2018-04-09 10:48
 **/
public class HelloJob implements BaseJob {

    private static Logger logger = LoggerFactory.getLogger(HelloJob.class);

    @Override
    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        logger.error("Hello Job执行时间: " + new Date());

    }
}  
