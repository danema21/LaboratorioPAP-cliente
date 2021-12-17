/**
 * ControladorAltaUsuarioPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorAltaUsuarioPublish extends java.rmi.Remote {
    public void modificarMail(java.lang.String arg0) throws java.rmi.RemoteException;
    public void modificarNickname(java.lang.String arg0) throws java.rmi.RemoteException;
    public void confirmacionPass(java.lang.String arg0) throws java.rmi.RemoteException, publicadores.ContraseniaIncorrectaException;
    public void elegirImagen(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ingresarDatos(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.util.Calendar arg4, java.lang.String arg5) throws java.rmi.RemoteException, publicadores.UsuarioRepetidoException;
    public void ingresarDatosArtista(java.lang.String arg0) throws java.rmi.RemoteException;
    public void linkPagina(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ingresarBiografia(java.lang.String arg0) throws java.rmi.RemoteException;
    public void altaUsuario() throws java.rmi.RemoteException;
}
