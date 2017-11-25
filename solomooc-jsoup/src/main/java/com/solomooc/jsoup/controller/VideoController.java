package com.solomooc.jsoup.controller;

import com.solomooc.jsoup.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VideoController {

    @Autowired
    private VideoService videoService;

    @RequestMapping("/saveModule")
    @ResponseBody
    public String saveModule() {
        videoService.saveModule();
        return "SUCCESS";
    }
}
