package com.aysel.youtubedownload.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;

import com.aysel.youtubedownload.dto.ResponseYoutubeDto;
import com.aysel.youtubedownload.repository.YoutubeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class YoutubeService {

    private final YoutubeRepository youtubeRepository;

    public ResponseYoutubeDto getYoutubeInfo(String url) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("wsl", "yt-dlp", "--get-title", "--get-thumbnail", url);
        Process process = pb.start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String title = reader.readLine(); // first line: title
        String thumbnailUrl = reader.readLine(); // second line: thumbnail

        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new RuntimeException("yt-dlp 실행 실패");
        }

        return new ResponseYoutubeDto(title, thumbnailUrl);
    }

    public void downloadVideo(String url) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("wsl", "yt-dlp", "-f", "best", url);
        pb.inheritIO(); // 로그 보기용
        Process process = pb.start();
        process.waitFor();
    }
}
