package publicadores;

public class ControladorAltaUsuarioPublishProxy implements publicadores.ControladorAltaUsuarioPublish {
  private String _endpoint = null;
  private publicadores.ControladorAltaUsuarioPublish controladorAltaUsuarioPublish = null;
  
  public ControladorAltaUsuarioPublishProxy() {
    _initControladorAltaUsuarioPublishProxy();
  }
  
  public ControladorAltaUsuarioPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorAltaUsuarioPublishProxy();
  }
  
  private void _initControladorAltaUsuarioPublishProxy() {
    try {
      controladorAltaUsuarioPublish = (new publicadores.ControladorAltaUsuarioPublishServiceLocator()).getControladorAltaUsuarioPublishPort();
      if (controladorAltaUsuarioPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorAltaUsuarioPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorAltaUsuarioPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorAltaUsuarioPublish != null)
      ((javax.xml.rpc.Stub)controladorAltaUsuarioPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorAltaUsuarioPublish getControladorAltaUsuarioPublish() {
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    return controladorAltaUsuarioPublish;
  }
  
  public void modificarMail(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.modificarMail(arg0);
  }
  
  public void modificarNickname(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.modificarNickname(arg0);
  }
  
  public void confirmacionPass(java.lang.String arg0) throws java.rmi.RemoteException, publicadores.ContraseniaIncorrectaException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.confirmacionPass(arg0);
  }
  
  public void elegirImagen(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.elegirImagen(arg0);
  }
  
  public void ingresarDatos(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.util.Calendar arg4, java.lang.String arg5) throws java.rmi.RemoteException, publicadores.UsuarioRepetidoException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.ingresarDatos(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public void ingresarDatosArtista(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.ingresarDatosArtista(arg0);
  }
  
  public void linkPagina(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.linkPagina(arg0);
  }
  
  public void ingresarBiografia(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.ingresarBiografia(arg0);
  }
  
  public void altaUsuario() throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.altaUsuario();
  }
  
  
}