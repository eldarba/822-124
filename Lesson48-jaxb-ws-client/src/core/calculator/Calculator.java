/**
 * Calculator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package core.calculator;

public interface Calculator extends java.rmi.Remote {
    public int sum(int arg0, int arg1) throws java.rmi.RemoteException;
    public core.calculator.Person getPerson(int arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException;
    public java.lang.String greet(core.calculator.Person arg0) throws java.rmi.RemoteException;
}
