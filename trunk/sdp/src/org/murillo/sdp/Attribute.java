/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;
/**
 *
 * @author Sergio
 */
public interface Attribute {
    public String getField();
    public String getValue();
    public Attribute clone();
}
