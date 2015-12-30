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
public class CryptoAttribute implements Attribute {



    static public class KeyParam {
        private String method;
        private String info;

        public KeyParam() {

        }
            
        public KeyParam(String method, String info) {
            this.method = method;
            this.info = info;
        }
	
	@Override 
	public
	KeyParam clone() {
		return new KeyParam(method, info);
	}

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

    }

    private Integer tag;
    private String suite;
    ArrayList<KeyParam> keyParams;
    private String sessionParams;

    public CryptoAttribute() {
        keyParams = new ArrayList<KeyParam>();
    }

    public CryptoAttribute(Integer tag, String suite, ArrayList<KeyParam> keyParams, String sessionParams) {
        this.tag = tag;
        this.suite = suite;
        this.keyParams = keyParams;
        this.sessionParams = sessionParams;
    }

    public CryptoAttribute(Integer tag, String suite, String method, String info, String sessionParams) {
        this.tag = tag;
        this.suite = suite;
        this.keyParams = new ArrayList<KeyParam>();
        this.keyParams.add(new KeyParam(method, info));
        this.sessionParams = sessionParams;
    }

    public CryptoAttribute(Integer tag, String suite, String method, String info) {
        this.tag = tag;
        this.suite = suite;
        this.keyParams = new ArrayList<KeyParam>();
        this.keyParams.add(new KeyParam(method, info));
    }
    
    @Override
    public CryptoAttribute clone() {
	//Clne key params
	ArrayList<KeyParam> clonedKeyParams = new ArrayList<KeyParam>();
	//Add each param
	for(KeyParam param: keyParams)
		//Add it
		clonedKeyParams.add(param.clone());
	//return the cloenda attr
	return new CryptoAttribute(tag, suite, clonedKeyParams, sessionParams);
    }
  

    @Override
    public String getField() {
        return "crypto";
    }

    @Override
    public String getValue() {
        boolean first = true;
        String value = tag + " " + suite + " ";
        for (KeyParam param : keyParams)
        {
            if (first)
                first = false;
            else
                value += ";";
            value += param.method +":"+param.info;

        }
        if (sessionParams!=null)
            value += " " + sessionParams;
        return value;
    }

    @Override
    public String toString() {
        //Get value
        String value = getValue();
        //Generic attr
        return "a="+ getField() + (value!=null ? ":" + value : "") + "\r\n";
    }

    public ArrayList<KeyParam> getKeyParams() {
        return keyParams;
    }

    public void addKeyParam(KeyParam param) {
        keyParams.add(param);
    }
    
    public void setKeyParams(ArrayList<KeyParam> keyParams) {
        this.keyParams = keyParams;
    }

    public String getSessionParams() {
        return sessionParams;
    }

    public void setSessionParams(String sessionParams) {
        this.sessionParams = sessionParams;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public KeyParam getFirstKeyParam() {
        return keyParams.get(0);
    }
}
