//package com.alibaba.enum_;
//
///**
// * 项目名：    chapter11
// * 文件名：    Enumeration01
// * 创建时间：   2022/8/27 15:34
// *
// * @author crazy Chen
// * 描述：      TODO
// */
//public class Enumeration01 {
//    public static void main(String[] args) {
//        Season spring = new Season("spring", "warm");
//        Season winter = new Season("winter", "cold");
//        Season summer = new Season("summer", "hot");
//        Season autumn = new Season("autumn", "cool");
//        //这样不好，有可能会被修改
//    }
//}
//class Season{
//    private String name;
//    private String desc;//描述
//
//    public Season(String name, String desc) {
//        this.name = name;
//        this.desc = desc;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//}