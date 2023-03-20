package com.hillel.kornieiev.project.homework16;

public class Androids implements Smartphones, Linux {

    @Override
    public void call(String phoneNum) {
        System.out.println("Call :" + phoneNum);
    }

    @Override
    public void sms(String smsNum) {
        System.out.println("SMS :" + smsNum);
    }

    @Override
    public void internet(String internetAddress) {
        System.out.println("HTTPS:" + internetAddress);
    }

    @Override
    public void linuxOS(String linuxVer){
        System.out.println("Setting up LinuxOS: " + linuxVer);
    }

}
