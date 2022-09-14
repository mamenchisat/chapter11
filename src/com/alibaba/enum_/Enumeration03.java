package com.alibaba.enum_;

/**
 * 项目名：    chapter11
 * 文件名：    Enumeration03
 * 创建时间：   2022/8/27 16:01
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        //System.out.println(Season instanceof Enum);
    }
}

//使用enum关键字来实现枚举类
enum Season {
//    private String name;
//    private String desc;//描述

    //去掉set相关方法，防止属性被修改
    //在season类里面创建固定的对象
    //优化，加入final

//    public static final Season SPRING = new Season("spring", "warm");
//    public static final Season SUMMER = new Season("summer", "hot");
//    public static final Season AUTUMN = new Season("autumn", "cool");
//    public static final Season WINTER = new Season("winter", "cold");

    SPRING("春天","温暖"),SUMMER("summer", "hot");
    //用enum替换class
    //SPRING对象名，后面括号实参列表,多个对象逗号间隔
    //要求定义的常量对象定义在最前面
    private String name;
    private String desc;//描述

    private Season(String name, String desc) {
        //私有化构造器
        this.name = name;
        this.desc = desc;
    }


    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

}