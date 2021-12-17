package publicadores;

public class ControladorConsultaEspectaculoPublishProxy implements publicadores.ControladorConsultaEspectaculoPublish {
  private String _endpoint = null;
  private publicadores.ControladorConsultaEspectaculoPublish controladorConsultaEspectaculoPublish = null;
  
  public ControladorConsultaEspectaculoPublishProxy() {
    _initControladorConsultaEspectaculoPublishProxy();
  }
  
  public ControladorConsultaEspectaculoPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorConsultaEspectaculoPublishProxy();
  }
  
  private void _initControladorConsultaEspectaculoPublishProxy() {
    try {
      controladorConsultaEspectaculoPublish = (new publicadores.ControladorConsultaEspectaculoPublishServiceLocator()).getControladorConsultaEspectaculoPublishPort();
      if (controladorConsultaEspectaculoPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorConsultaEspectaculoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorConsultaEspectaculoPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorConsultaEspectaculoPublish != null)
      ((javax.xml.rpc.Stub)controladorConsultaEspectaculoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorConsultaEspectaculoPublish getControladorConsultaEspectaculoPublish() {
    if (controladorConsultaEspectaculoPublish == null)
      _initControladorConsultaEspectaculoPublishProxy();
    return controladorConsultaEspectaculoPublish;
  }
  
  public boolean espectaculoNoTieneFunciones() throws java.rmi.RemoteException{
    if (controladorConsultaEspectaculoPublish == null)
      _initControladorConsultaEspectaculoPublishProxy();
    return controladorConsultaEspectaculoPublish.espectaculoNoTieneFunciones();
  }
  
  public java.lang.String[] listarEspectaculos(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaEspectaculoPublish == null)
      _initControladorConsultaEspectaculoPublishProxy();
    return controladorConsultaEspectaculoPublish.listarEspectaculos(arg0);
  }
  
  public boolean plataformaTieneEspectaculo(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaEspectaculoPublish == null)
      _initControladorConsultaEspectaculoPublishProxy();
    return controladorConsultaEspectaculoPublish.plataformaTieneEspectaculo(arg0);
  }
  
  public publicadores.DtEspectaculo mostrarDatosEspectaculos(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaEspectaculoPublish == null)
      _initControladorConsultaEspectaculoPublishProxy();
    return controladorConsultaEspectaculoPublish.mostrarDatosEspectaculos(arg0);
  }
  
  public java.lang.String[] listarPlataformas() throws java.rmi.RemoteException, publicadores.SinPlataformasException{
    if (controladorConsultaEspectaculoPublish == null)
      _initControladorConsultaEspectaculoPublishProxy();
    return controladorConsultaEspectaculoPublish.listarPlataformas();
  }
  
  
}