package com.aysel.youtubedownload.service;

import org.springframework.stereotype.Service;

import com.aysel.youtubedownload.repository.YoutubeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class YoutubeService {

    private final YoutubeRepository youtubeRepository;

}
