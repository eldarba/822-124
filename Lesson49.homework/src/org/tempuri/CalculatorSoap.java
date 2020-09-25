/**
 * CalculatorSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface CalculatorSoap extends java.rmi.Remote {

    /**
     * Adds two integers. This is a test WebService. ©DNE Online
     */
    public int add(int intA, int intB) throws java.rmi.RemoteException;
    public int subtract(int intA, int intB) throws java.rmi.RemoteException;
    public int multiply(int intA, int intB) throws java.rmi.RemoteException;
    public int divide(int intA, int intB) throws java.rmi.RemoteException;
}
