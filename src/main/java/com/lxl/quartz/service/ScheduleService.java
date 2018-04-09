package com.lxl.quartz.service;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: TODO
 * @create 2018-04-09 13:49
 **/
public interface ScheduleService {

    /**
     * @param jobName
     * @param jobClassName
     * @param jobGroupName
     * @param cronExpression
     * @throws Exception
     */
    void addJob(String jobName, String jobClassName, String jobGroupName, String cronExpression) throws Exception;

    /**
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    void pauseJob(String jobClassName, String jobGroupName) throws Exception;

    /**
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    void resumeJob(String jobClassName, String jobGroupName) throws Exception;

    /**
     * @param jobClassName
     * @param jobGroupName
     * @param cronExpression
     * @throws Exception
     */
    void rescheduleJob(String jobClassName, String jobGroupName, String cronExpression) throws Exception;

    /**
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    void deleteJob(String jobClassName, String jobGroupName) throws Exception;
}
