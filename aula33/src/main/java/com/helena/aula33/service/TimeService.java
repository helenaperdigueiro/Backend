package com.helena.aula33.service;

import com.helena.aula33.model.Time;
import com.helena.aula33.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeService {
    @Autowired
    private TimeRepository timeRepository;

    public Time createTime(Time time) {
        return timeRepository.save(time);
    }
}
