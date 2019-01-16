package com.lzy.ninegrid;

/**
 *
 */
public class ImageInfo {
    /**
     * 等比例缩略图URL
     */
    protected String zoom;
    /**
     * 矩形缩略图URL
     */
    protected String square;
    /**
     * 原图URL
     */
    protected String url;
    /**
     * 原图的宽度
     */
    protected int width;
    /**
     * 原图的高度
     */
    protected int height;

    public String getZoom() {
        return zoom;
    }

    public void setZoom(String zoom) {
        this.zoom = zoom;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
