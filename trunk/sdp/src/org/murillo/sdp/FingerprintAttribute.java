/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class FingerprintAttribute implements Attribute {



    private String hashFunc;
    private String fingerprint;


    public FingerprintAttribute() {
    }

    public FingerprintAttribute(String hashFunc, String fingerprint) {
	this.hashFunc = hashFunc;
	this.fingerprint = fingerprint;
    }
    
    @Override
    public FingerprintAttribute clone() {
	    return new FingerprintAttribute(hashFunc, fingerprint);
    }
  

    @Override
    public String getField() {
        return "fingerprint";
    }

    @Override
    public String getValue() {
      
        return hashFunc+" "+fingerprint;
    }

    @Override
    public String toString() {
        //Get value
        String value = getValue();
        //Generic attr
        return "a="+ getField() + (value!=null ? ":" + value : "") + "\r\n";
    }

    public String getFingerprint() {
	return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
	this.fingerprint = fingerprint;
    }

    public String getHashFunc() {
	return hashFunc;
    }

    public void setHashFunc(String hashFunc) {
	this.hashFunc = hashFunc;
    }

   
}
