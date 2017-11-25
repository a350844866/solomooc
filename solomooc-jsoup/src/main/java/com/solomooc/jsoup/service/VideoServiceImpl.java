package com.solomooc.jsoup.service;

import com.solomooc.jsoup.mapper.VideoMapper;
import com.solomooc.jsoup.pojo.VideoClass;
import com.solomooc.jsoup.pojo.VideoModule;
import com.solomooc.jsoup.util.imoocJsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    public void saveModule() {

        List<VideoClass> classNames = imoocJsoup.getClassName();

        for (VideoClass video : classNames) {
            video.setCreated(new Date());
            video.setUpdated(video.getCreated());
            videoMapper.saveVideo(video);
            System.out.println("插入数据成功");
        }

        List<String> classificationUrlList = imoocJsoup.get1Url();

        List<String> pageUrlList = imoocJsoup.getpageUrl(classificationUrlList);

        Random rand = new Random();
        int sum = 0;
        for (String url : pageUrlList) {
            List<VideoModule> moduleList = imoocJsoup.getModule(url);
            for (VideoModule module : moduleList) {
                module.setPrice(rand.nextDouble() * 500);
                module.setScore(rand.nextDouble() * 10);
                module.setEarn(module.getPrice() * module.getBuyed());
                module.setModuleStatus(0);
                module.setHeat(rand.nextInt(100));//热度随机生成
                module.setCreated(new Date());
                module.setUpdated(module.getCreated());
                videoMapper.saveModule(module);
                sum = sum + 1;
                System.out.println("成功爬取" + sum + "条数据");
            }
        }

    }
}
