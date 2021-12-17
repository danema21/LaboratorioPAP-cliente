/**
 * CConsultaDeFuncionDeEspectaculoPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface CConsultaDeFuncionDeEspectaculoPublish extends java.rmi.Remote {
    public java.lang.String[] selectEspectaculoDePlataforma(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public publicadores.DtFuncion selectFuncionDeEspectaculo(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public java.lang.String[] listarPlataformas() throws java.rmi.RemoteException, publicadores.SinPlataformasException;
    public java.lang.String[] selectPlataforma(java.lang.String arg0) throws java.rmi.RemoteException;
}
