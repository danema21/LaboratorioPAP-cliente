/**
 * ControladorConsultaEspectaculoPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorConsultaEspectaculoPublish extends java.rmi.Remote {
    public boolean espectaculoNoTieneFunciones() throws java.rmi.RemoteException;
    public java.lang.String[] listarEspectaculos(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean plataformaTieneEspectaculo(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtEspectaculo mostrarDatosEspectaculos(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarPlataformas() throws java.rmi.RemoteException, publicadores.SinPlataformasException;
}
