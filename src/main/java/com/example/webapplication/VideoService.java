package com.example.webapplication;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    private List<Video> videos = List.of(
            new Video("Need HELP with your SPRING BOOT 3?"),
            new Video("Do not do THIS to your own CODE!"),
            new Video("SECRETS to fix BROKEN CODE!")
    );

    public List<Video> getVideos() {
        return videos;
    }
}