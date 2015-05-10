package io.theoperator.configuration;

import java.util.InputMismatchException;

/**
 * Created by andreas on 5/8/15.
 */
public class Time {

    private Integer hour;
    private Integer minute;
    private Integer second;
    private Integer duration;

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
