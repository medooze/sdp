/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.murillo.sdp;
/**
 *
 * @author Sergio
 * 
 */
public class SCTPMapAttribute implements Attribute {

	private Integer number;
	private String app;
	private Integer streams;

	public SCTPMapAttribute() {
		
	}

	public SCTPMapAttribute(Integer number, String app, Integer streams) {
		this.number = number;
		this.app = app;
		this.streams = streams;
	}

	@Override
	public SCTPMapAttribute clone() {
		return new SCTPMapAttribute(number, app, streams);
	}

	@Override
	public String getField() {
		return "sctpmap";
	}

	@Override
	public String getValue() {

		String value =  number + " " + app;
		
		if (streams!=null)
			value += " " + streams;
		
		return value;
	}

	@Override
	public String toString() {
		//Get value
		String value = getValue();
		//Generic attr
		return "a=" + getField() + (value != null ? ":" + value : "") + "\r\n";
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public Integer getStreams() {
		return streams;
	}

	public void setStreams(Integer streams) {
		this.streams = streams;
	}
	
}
