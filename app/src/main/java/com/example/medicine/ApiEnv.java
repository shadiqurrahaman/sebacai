package com.example.medicine;

public class ApiEnv {
    private String local;
    private String live;

    private String livedoctor;
    private String localdoctor;
    public ApiEnv() {
        this.live = "https://kgsebatech.com/api/";
        this.local = "http://192.168.0.108:8000/api/";
        this.livedoctor = "https://doctor.kgsebatech.com/api/";
        this.localdoctor = "http://192.168.0.108:9000/api/";

    }

    public String getLiveDoctor() {
        return livedoctor;
    }

    public String getLocaldoctor() {
        return livedoctor;

    }


    public String getLocal() {
        return local;
    }

    public String getLive() {
        return live;
    }

    public String base_url()
    {
        return getLive();
    }
}
