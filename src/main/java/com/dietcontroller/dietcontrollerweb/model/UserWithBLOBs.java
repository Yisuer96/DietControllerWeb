package com.dietcontroller.dietcontrollerweb.model;

public class UserWithBLOBs extends User {
    /**
     * 
     */
    private byte[] ssl_cipher;

    /**
     * 
     */
    private byte[] x509_issuer;

    /**
     * 
     */
    private byte[] x509_subject;

    /**
     * 
     */
    private String authentication_string;

    /**
     * 
     * @return ssl_cipher 
     */
    public byte[] getSsl_cipher() {
        return ssl_cipher;
    }

    /**
     * 
     * @param ssl_cipher 
     */
    public void setSsl_cipher(byte[] ssl_cipher) {
        this.ssl_cipher = ssl_cipher;
    }

    /**
     * 
     * @return x509_issuer 
     */
    public byte[] getX509_issuer() {
        return x509_issuer;
    }

    /**
     * 
     * @param x509_issuer 
     */
    public void setX509_issuer(byte[] x509_issuer) {
        this.x509_issuer = x509_issuer;
    }

    /**
     * 
     * @return x509_subject 
     */
    public byte[] getX509_subject() {
        return x509_subject;
    }

    /**
     * 
     * @param x509_subject 
     */
    public void setX509_subject(byte[] x509_subject) {
        this.x509_subject = x509_subject;
    }

    /**
     * 
     * @return authentication_string 
     */
    public String getAuthentication_string() {
        return authentication_string;
    }

    /**
     * 
     * @param authentication_string 
     */
    public void setAuthentication_string(String authentication_string) {
        this.authentication_string = authentication_string == null ? null : authentication_string.trim();
    }
}