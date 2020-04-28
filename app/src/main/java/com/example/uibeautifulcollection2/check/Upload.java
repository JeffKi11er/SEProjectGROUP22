package com.example.uibeautifulcollection2.check;

public class Upload {
    private String nameItem;
    private String ImageUrl;

    public Upload() {

    }

    public Upload(String mNamel, String imageUrl) {
//        if(mNamel.trim().equals("")){
//            mNamel = "No name";
//        }
        this.nameItem = mNamel;
        ImageUrl = imageUrl;
    }

    public String getmNamel() {
        return nameItem;
    }

    public void setmNamel(String mNamel) {
        this.nameItem = mNamel;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
}
