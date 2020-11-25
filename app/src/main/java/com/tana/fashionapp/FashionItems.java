package com.tana.fashionapp;

public class FashionItems {
    private int mImg;
    private String mItemInfo;
    private String mItemSubInfo;
    private String mPrice;

    public FashionItems(int img, String itemInfo, String itemSubInfo, String price) {
        mImg = img;
        mItemInfo = itemInfo;
        mItemSubInfo = itemSubInfo;
        mPrice = price;
    }

    public int getImg() {
        return mImg;
    }

    public void setImg(int img) {
        mImg = img;
    }

    public String getItemInfo() {
        return mItemInfo;
    }

    public void setItemInfo(String itemInfo) {
        mItemInfo = itemInfo;
    }

    public String getItemSubInfo() {
        return mItemSubInfo;
    }

    public void setItemSubInfo(String itemSubInfo) {
        mItemSubInfo = itemSubInfo;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }
}
