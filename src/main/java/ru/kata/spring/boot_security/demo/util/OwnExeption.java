package ru.kata.spring.boot_security.demo.util;


public class OwnExeption {
    private String info;

    public OwnExeption(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
