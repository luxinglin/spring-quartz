package com.lxl.springboot.quartz.common.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: TODO
 * @create 2018-04-09 10:48
 **/
public interface BaseJob extends Job {
    /**
     * 执行自动任务
     *
     * @param context
     * @throws JobExecutionException
     */
    @Override
    void execute(JobExecutionContext context) throws JobExecutionException;
}

