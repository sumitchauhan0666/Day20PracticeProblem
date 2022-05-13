package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Userregistrationunit {

    public String NameMatch(String name){

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2}$");
        Matcher matcher = pattern.matcher(name);
       if(matcher.matches())
           return "Happy";
       else
           return "Sad";

    }

    public String EmailMatch(String email){

        Pattern emailpattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher= emailpattern.matcher(email);
        if(matcher.matches())
            return "Happy";
        else
            return "Sad";
    }
    public String MobileMatch(String mobile){
        Pattern mobilepattern = Pattern.compile("(?:\\+?(\\d{2}))?+[\s]+[897]{1}+[0-9]{9}");
        Matcher matcher= mobilepattern.matcher(mobile);
        if(matcher.matches())
            return "Happy";
        else
            return "Sad";
    }
    public static void main(String[] args) {

    }
}
