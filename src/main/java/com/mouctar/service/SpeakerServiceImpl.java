package com.mouctar.service;

import com.mouctar.model.Speaker;
import com.mouctar.repository.HibernateSpeakerRepositoryImpl;
import com.mouctar.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

}
