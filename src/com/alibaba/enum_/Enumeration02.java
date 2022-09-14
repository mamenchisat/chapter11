//package com.alibaba.enum_;
//
///**
// * 项目名：    chapter11
// * 文件名：    Enumeration02
// * 创建时间：   2022/8/27 15:49
// *
// * @author crazy Chen
// * 描述：      TODO
// */
//public class Enumeration02 {
//    public static void main(String[] args) {
//        System.out.println(Season.SPRING);
//    }
//}
//
////演示自定义枚举实现
//class Season {
//    private String name;
//    private String desc;//描述
//
//    //去掉set相关方法，防止属性被修改
//    //在season类里面创建固定的对象
//    //优化，加入final
//
//    public static final Season SPRING = new Season("spring", "warm");
//    public static final Season SUMMER = new Season("summer", "hot");
//    public static final Season AUTUMN = new Season("autumn", "cool");
//    public static final Season WINTER = new Season("winter", "cold");
//
//
//    private Season(String name, String desc) {
//        //私有化构造器
//        this.name = name;
//        this.desc = desc;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Season{" +
//                "name='" + name + '\'' +
//                ", desc='" + desc + '\'' +
//                '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//}