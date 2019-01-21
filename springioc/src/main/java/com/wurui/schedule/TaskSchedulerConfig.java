package com.wurui.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by wurui on 2019-01-01.
 */

@Configuration
@ComponentScan("com.wurui.schedule")
@EnableScheduling
public class TaskSchedulerConfig {
}
