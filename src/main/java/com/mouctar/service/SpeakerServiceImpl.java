package com.mouctar.service;

import com.mouctar.model.Speaker;
import com.mouctar.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository (SpeakerRepository repository){
        this.repository = repository;
    }

}
