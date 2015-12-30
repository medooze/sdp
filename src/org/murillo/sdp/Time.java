/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class Time {

    private Integer start;
    private Integer stop;

    public Time() {

    }

    public Time(Integer start, Integer stop) {
        this.start = start;
        this.stop = stop;
    }
    
    @Override
    public Time clone() {
	    return new Time(start,stop);
    }

    @Override
    public String toString() {
        return "t=" + start.toString() + " " + stop.toString() + "\r\n";
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getStop() {
        return stop;
    }

    public void setStop(Integer stop) {
        this.stop = stop;
    }
    

}
