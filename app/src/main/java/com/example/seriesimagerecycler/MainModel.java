package com.example.seriesimagerecycler;

import androidx.recyclerview.widget.RecyclerView;

public class MainModel {
    Integer numImages;
    String numWords;

    public MainModel(Integer numImages, String numWords) {
        this.numImages = numImages;
        this.numWords = numWords;
    }

    public Integer getNumImages() {
        return numImages;
    }

    public String getNumWords() {
        return numWords;
    }
}
