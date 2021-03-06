package com.demo.weixin.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * 微信公众号菜单
 */
public class WeixinMenu implements Serializable {

    private static final long serialVersionUID = 1483333672743300631L;
    private String name;
    private MenuType type;
    private String key;
    private String url;
    @JSONField(name = "sub_button")
    private List<WeixinMenu> subButton;

    public enum MenuType {
        click,//点击推事件 微信服务器会通过消息接口推送消息类型为event 的结构给开发者 并且带上按钮中开发者填写的key值
        view,// 跳转URL
        scancode_push,//微信客户端将调起扫一扫工具，完成扫码操作后显示扫描结果（如果是URL，将进入URL），且会将扫码的结果传给开发者，开发者可以下发消息。
        scancode_waitmsg,//扫码推事件且弹出“消息接收中”提示框
        pic_sysphoto,//弹出系统拍照发图
        pic_photo_or_album,//弹出拍照或者相册发图
        pic_weixin,// 	弹出微信相册发图器
        location_select;// 	弹出地理位置选择器
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<WeixinMenu> getSubButton() {
        return subButton;
    }

    public void setSubButton(List<WeixinMenu> subButton) {
        this.subButton = subButton;
    }

    @Override
    public String toString() {
        return "WeixinMenu{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", key='" + key + '\'' +
                ", url='" + url + '\'' +
                ", subButton=" + subButton +
                '}';
    }
}
