package com.mouctar.repository;

import com.mouctar.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
