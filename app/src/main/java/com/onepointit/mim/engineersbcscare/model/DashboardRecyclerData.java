package com.onepointit.mim.engineersbcscare.model;

public class DashboardRecyclerData {

    private String title;
    private String title2;
    private int imgid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public DashboardRecyclerData(String title, String title2, int imgid) {
        this.title = title;
        this.title2 = title2;
        this.imgid = imgid;
    }
}
