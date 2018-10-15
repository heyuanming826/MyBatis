package com.newer.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

public class TimeInterceptor extends HandlerInterceptorAdapter{
    private int startTime;
    private int endTime;

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Calendar now=Calendar.getInstance();
        int hour=now.get(Calendar.HOUR_OF_DAY);
        if(hour>=startTime&&hour<=endTime){
            return true;
        }
       response.sendRedirect(request.getContextPath()+"/error");
        return false;
    }

}
