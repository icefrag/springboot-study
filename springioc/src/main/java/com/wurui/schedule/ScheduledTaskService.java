package com.wurui.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wurui on 2019-01-01.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(fixedRate = 5000)
    /*
        “/”字符用来指定数值的增量
        例如：在子表达式（分钟）里的“0/15”表示从第0分钟开始，每15分钟
         在子表达式（分钟）里的“3/20”表示从第3分钟开始，每20分钟（它和“3，23，43”）的含义一样
     */
    @Scheduled(cron = "30/5 * * * * *")
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次 " + dataFormat.format(new Date()));
    }

    @Scheduled(cron = "0 29 21 ? * *")
    public void fixTimeExecution(){
        System.out.println("在执行时间 " + dataFormat.format(new Date()) + ",执行");
    }
}
