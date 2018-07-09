package com.rk.base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class _0_Base64
{

    public static void main(String[] args)
    {
        Encoder encoderObj = Base64.getEncoder();
        Decoder decoderObj = Base64.getDecoder();

        String s1 = "ravikiran";
        System.out.println("Actual data:" + s1);
        System.out.println("Converted to byte array:" + s1.getBytes());
        byte[] userNameEncoded = encoderObj.encode(s1.getBytes());
        System.out.println("Converted to byte array then encoded by Base64:" + userNameEncoded);

        byte[] userNameDecoded=decoderObj.decode(userNameEncoded);
        System.out.println("Decoded as byte array by Base64:" + userNameDecoded);
        
        String decodedString=new String(userNameDecoded);
        System.out.println("Decoded String by Base64:" +decodedString);

        
    }

}
