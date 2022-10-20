package com.company;

public class Password {

    public static final int Max_longitud = 8;

    public String password = "";

    public void SetPassword(String password){

        this.password = password;

    }

    public int getPasswordLength(){

        return password.length();

    }

    public String GetPassword(){

        return password;

    }
}
