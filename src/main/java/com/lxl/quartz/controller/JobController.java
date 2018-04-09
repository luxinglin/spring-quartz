package com.lxl.quartz.controller;

import com.github.pagehelper.PageInfo;
import com.lxl.quartz.entity.JobAndTrigger;
import com.lxl.quartz.service.JobAndTriggerService;
import com.lxl.quartz.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: 定时任务管理类
 * @create 2018-04-09 10:48
 **/
@RestController
@RequestMapping(value = "/jobs")
public class JobController {
    @Autowired
    private JobAndTriggerService jobAndTriggerService;
    @Autowired
    private ScheduleService scheduleService;

    /**
     * 添加定时任务
     *
     * @param jobName
     * @param jobClassName
     * @param jobGroupName
     * @param cronExpression
     * @throws Exception
     */
    @PostMapping(value = "addJob")
    public void addjob(@RequestParam(value = "jobName") String jobName,
                       @RequestParam(value = "jobClassName") String jobClassName,
                       @RequestParam(value = "jobGroupName") String jobGroupName,
                       @RequestParam(value = "cronExpression") String cronExpression
    ) throws Exception {
        scheduleService.addJob(jobName, jobClassName, jobGroupName, cronExpression);
    }

    /**
     * 暂停定时任务
     *
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    @PostMapping(value = "/pausejob")
    public void pauseJob(@RequestParam(value = "jobClassName") String jobClassName,
                         @RequestParam(value = "jobGroupName") String jobGroupName) throws Exception {
        scheduleService.pauseJob(jobClassName, jobGroupName);
    }

    /**
     * 恢复定时任务
     *
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    @PostMapping(value = "/resumejob")
    public void resumeJob(@RequestParam(value = "jobClassName") String jobClassName,
                          @RequestParam(value = "jobGroupName") String jobGroupName) throws Exception {
        scheduleService.resumeJob(jobClassName, jobGroupName);
    }

    /**
     * 修改定时任务调度频率
     *
     * @param jobClassName
     * @param jobGroupName
     * @param cronExpression
     * @throws Exception
     */
    @PostMapping(value = "/reschedulejob")
    public void rescheduleJob(@RequestParam(value = "jobClassName") String jobClassName,
                              @RequestParam(value = "jobGroupName") String jobGroupName,
                              @RequestParam(value = "cronExpression") String cronExpression) throws Exception {
        scheduleService.rescheduleJob(jobClassName, jobGroupName, cronExpression);
    }

    /**
     * 移除定时任务
     *
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    @PostMapping(value = "/deletejob")
    public void deletejob(@RequestParam(value = "jobClassName") String jobClassName,
                          @RequestParam(value = "jobGroupName") String jobGroupName) throws Exception {
        scheduleService.deleteJob(jobClassName, jobGroupName);
    }

    /**
     * 查询现有定时任务
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping(value = "/queryjob")
    public Map<String, Object> queryjob(@RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize) {
        PageInfo<JobAndTrigger> jobAndTrigger = jobAndTriggerService.getJobAndTriggerDetails(pageNum, pageSize);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("JobAndTrigger", jobAndTrigger);
        map.put("number", jobAndTrigger.getTotal());
        return map;
    }
}
