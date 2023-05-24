package com.example.demo.common;

import com.example.demo.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 minutes";
    }
}
