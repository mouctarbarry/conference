package com.mouctar.repository;

import com.mouctar.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstname("Mouctar");
        speaker.setLastname("Barry");
        speakers.add(speaker);

        return speakers;
    }
}
