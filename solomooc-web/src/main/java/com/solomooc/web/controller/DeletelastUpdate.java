package com.solomooc.web.controller;

import java.io.File;

public class DeletelastUpdate {
    public static void main(String[] args) {
        //这里写进去的第一层目录

        File file =new File("E:\\maven\\mvn_repo");
        File[] list=file.listFiles();
        for (File file1 : list) {
            fileDelete(file1);
          
        }

    }
    public static void fileDelete(File file){
        File[] list=file.listFiles();
        for(File thing:list){
            if(thing.isDirectory()){
                fileDelete(thing);
            }else{
                if (thing.getName().endsWith("lastUpdated")) {
                    thing.delete();
                }
            }
        }
    }
}
