package com.aysel.youtubedownload.dto;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class ResponseDto<T> extends BaseResponseDto {
    private T data;

    private ResponseDto(T data) {
        super(HttpStatus.OK.value(), "정상 처리되었습니다.");
        this.data = data;
    }

    public static <T> ResponseDto<T> of(T data) {
        return new ResponseDto<>(data);
    }

    public static ResponseDto<Void> empty() {
        return new ResponseDto<>(null);
    }
}
