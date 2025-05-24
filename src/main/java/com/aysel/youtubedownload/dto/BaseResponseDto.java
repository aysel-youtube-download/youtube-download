package com.aysel.youtubedownload.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BaseResponseDto {
    private final int status;
    private final String message;
}
