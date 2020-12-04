package Modelos;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class hash {
    public static String getHash(String txt, String hashType){
        java.security.MessageDigest md;
        try {
            md = java.security.MessageDigest.getInstance(hashType);
            byte [] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).
                        substring(1,3));                
            }
            return sb.toString();
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(hash.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;   
    }
    
    public static String md5 (String txt){
        return hash.getHash(txt, "MD5");
    }
    
    public static String sha1(String txt){
        return hash.getHash(txt, "SHA1");
    }
    
    
}