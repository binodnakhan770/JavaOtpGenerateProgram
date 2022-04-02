package com.company;
import java.util.Random; // random package import to otp generate

public class OtpGenerator {
    public static void main(String[] args) {

        System.out.print("Your  OTP is: ");
        System.out.println(generateOtp(6));

    }

//    otp generate
    private static char[] generateOtp(int len){
//        defining strings to be generate password
        String numbers = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#";
//        object create using random
        Random rando_otp = new Random();
        char[] otp = new char[len];

//        looping OTP generator
        for (int i = 0; i < len; i++){
            otp[i] = numbers.charAt(rando_otp.nextInt(numbers.length()));
        }
        return otp;
    }

}
