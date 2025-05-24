package com.aysel.youtubedownload.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aysel.youtubedownload.service.YoutubeService;
import com.aysel.youtubedownload.dto.RequestYoutubeDto;
import com.aysel.youtubedownload.dto.ResponseDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/youtube")
@RequiredArgsConstructor
public class YoutubeController {
    
    private final YoutubeService youtubeService;


    @PostMapping("/info")
    public ResponseEntity<ResponseDto<String>> getInfo(@RequestBody RequestYoutubeDto req) throws Exception {
        return ResponseEntity.ok(
            new ResponseDto<>(200, "", "success")
        );
    }

    @PostMapping("/download")
    public ResponseEntity<ResponseDto<String>> download(@RequestBody RequestYoutubeDto req) throws Exception {
        return ResponseEntity.ok(
            new ResponseDto<>(200, "", "success")
        );
    }
}
