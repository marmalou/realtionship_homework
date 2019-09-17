package com.codeclan.relationship.relationships_homework.models;

public class File {

    private String name;
    private String extension;
    private int size;
    private String Folder;

    public File(String name, String extension, int size, String folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        Folder = folder;
    }
}
