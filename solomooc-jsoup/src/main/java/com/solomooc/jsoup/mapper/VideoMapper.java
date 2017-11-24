package com.solomooc.jsoup.mapper;

import com.solomooc.jsoup.pojo.VideoClass;
import com.solomooc.jsoup.pojo.VideoModule;

public interface VideoMapper {
    public void saveVideo(VideoClass video);

    public void saveModule(VideoModule module);
}
