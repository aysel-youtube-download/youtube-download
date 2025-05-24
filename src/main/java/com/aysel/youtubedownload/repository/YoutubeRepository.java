package com.aysel.youtubedownload.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aysel.youtubedownload.entity.YoutubeLog;

public interface YoutubeRepository extends JpaRepository<YoutubeLog, Long>  {

}
