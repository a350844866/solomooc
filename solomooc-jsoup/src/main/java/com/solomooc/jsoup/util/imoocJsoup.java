package com.solomooc.jsoup.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.solomooc.jsoup.pojo.VideoClass;
import com.solomooc.jsoup.pojo.VideoModule;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class imoocJsoup {

    private static Map<String, Integer> map = new HashMap<String, Integer>();

    public static void getUrl() {

        String url = "https://www.imooc.com/course/list?c=java";

        Elements elements;
        try {
            elements = Jsoup.connect(url).get().select(".course-card-container");
            for (Element element : elements) {
                String url2 = "https://www.imooc.com" + element.select("a").attr("href");
                System.out.println(url2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static List<VideoClass> getClassName() {
        String url = "https://www.imooc.com/course/list";
        List<VideoClass> videos = new ArrayList<VideoClass>();

        try {
            Elements elements = Jsoup.connect(url).get().select(".course-nav-item");
            for (int i = 0; i < elements.size(); i++) {
                String className = elements.get(i).select("a").text();
                if (!className.equals("全部")) {
                    VideoClass video = new VideoClass();
                    video.setClassId(i + 1L);
                    video.setClassName(className);
                    map.put(className, i + 1);
                    videos.add(video);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return videos;
    }

    /**
     * 获取分类后的地址
     */
    public static List<String> get1Url() {
        String url = "https://www.imooc.com/course/list";

        List<String> classificationUrlList = new ArrayList<String>();
        try {
            Elements elements = Jsoup.connect(url).get().select(".bd .course-nav-item");
            for (Element element : elements) {
                String classificationUrl = "https://www.imooc.com" + element.select("a").attr("href");
                if (classificationUrl.startsWith("https://www.imooc.com/course/list?c=")) {
                    classificationUrlList.add(classificationUrl);
                    //System.out.println(classificationUrl);
                }
            }
            //System.out.println(classificationUrlList.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return classificationUrlList;
    }

    /**
     * 获取每一页url
     *
     * @param classificationUrlList
     */
    public static List<String> getpageUrl(List<String> classificationUrlList) {

        List<String> pageUrlList = new ArrayList<String>();

        for (int k = 0; k < classificationUrlList.size(); k++) {
            try {
                int page = Integer.valueOf(Jsoup.connect(classificationUrlList.get(k)).get().select(".pager-num .pager-total").text());
                for (int i = 1; i <= page; i++) {
                    String pageUrl = classificationUrlList.get(k) + "&page=" + i;
                    //System.out.println(pageUrl);
                    pageUrlList.add(pageUrl);
                }
                //System.out.println(pageUrlList.size());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return pageUrlList;
    }

    /**
     * 获取每节课对象
     *
     * @param url
     */
    public static List<VideoModule> getModule(String url) {
        List<VideoModule> moduleList = new ArrayList<VideoModule>();

        //List<String> lableList = new ArrayList<String>();
        try {
            Elements elements = Jsoup.connect(url).get().select(".course-card-container");
            for (Element element : elements) {
                VideoModule module = new VideoModule();
                //标签
                String label = element.select("label").get(0).text();//c++

                //lableList.add(label);
                //标题
                String title = element.select("h3").text();
                //图片url
                String image = element.select("img").attr("src");
                //购买的人数
                int buyed = Integer.valueOf(element.select(".course-card-info span").get(1).text());
                //获取视频简介
                String intro = element.select(".course-card-desc").text();

                int classId = map.get(label);
                module.setClassId((long) classId);
                module.setModuleName(title);
                module.setIntro(intro);
                module.setImage(image);
                module.setBuyed(buyed);

                moduleList.add(module);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return moduleList;
    }

}
