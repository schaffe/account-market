package com.accountmarket.entities;

public enum Platform {
    GMAIL;

    public static Platform getPlatformByName(String name) {
        return Platform.valueOf(name.toUpperCase());
    }
}
