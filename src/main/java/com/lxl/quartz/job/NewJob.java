package com.lxl.quartz.job;

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
public class NewJob implements BaseJob {

    private static Logger logger = LoggerFactory.getLogger(NewJob.class);

    @Override
    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        logger.error("New Job执行时间: " + new Date());

    }
}  