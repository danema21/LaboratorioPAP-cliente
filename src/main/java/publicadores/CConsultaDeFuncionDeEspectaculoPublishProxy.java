package publicadores;

public class CConsultaDeFuncionDeEspectaculoPublishProxy implements publicadores.CConsultaDeFuncionDeEspectaculoPublish {
  private String _endpoint = null;
  private publicadores.CConsultaDeFuncionDeEspectaculoPublish cConsultaDeFuncionDeEspectaculoPublish = null;
  
  public CConsultaDeFuncionDeEspectaculoPublishProxy() {
    _initCConsultaDeFuncionDeEspectaculoPublishProxy();
  }
  
  public CConsultaDeFuncionDeEspectaculoPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initCConsultaDeFuncionDeEspectaculoPublishProxy();
  }
  
  private void _initCConsultaDeFuncionDeEspectaculoPublishProxy() {
    try {
      cConsultaDeFuncionDeEspectaculoPublish = (new publicadores.CConsultaDeFuncionDeEspectaculoPublishServiceLocator()).getCConsultaDeFuncionDeEspectaculoPublishPort();
      if (cConsultaDeFuncionDeEspectaculoPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cConsultaDeFuncionDeEspectaculoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cConsultaDeFuncionDeEspectaculoPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cConsultaDeFuncionDeEspectaculoPublish != null)
      ((javax.xml.rpc.Stub)cConsultaDeFuncionDeEspectaculoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.CConsultaDeFuncionDeEspectaculoPublish getCConsultaDeFuncionDeEspectaculoPublish() {
    if (cConsultaDeFuncionDeEspectaculoPublish == null)
      _initCConsultaDeFuncionDeEspectaculoPublishProxy();
    return cConsultaDeFuncionDeEspectaculoPublish;
  }
  
  public java.lang.String[] selectEspectaculoDePlataforma(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (cConsultaDeFuncionDeEspectaculoPublish == null)
      _initCConsultaDeFuncionDeEspectaculoPublishProxy();
    return cConsultaDeFuncionDeEspectaculoPublish.selectEspectaculoDePlataforma(arg0, arg1);
  }
  
  public publicadores.DtFuncion selectFuncionDeEspectaculo(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (cConsultaDeFuncionDeEspectaculoPublish == null)
      _initCConsultaDeFuncionDeEspectaculoPublishProxy();
    return cConsultaDeFuncionDeEspectaculoPublish.selectFuncionDeEspectaculo(arg0, arg1, arg2);
  }
  
  public java.lang.String[] listarPlataformas() throws java.rmi.RemoteException, publicadores.SinPlataformasException{
    if (cConsultaDeFuncionDeEspectaculoPublish == null)
      _initCConsultaDeFuncionDeEspectaculoPublishProxy();
    return cConsultaDeFuncionDeEspectaculoPublish.listarPlataformas();
  }
  
  public java.lang.String[] selectPlataforma(java.lang.String arg0) throws java.rmi.RemoteException{
    if (cConsultaDeFuncionDeEspectaculoPublish == null)
      _initCConsultaDeFuncionDeEspectaculoPublishProxy();
    return cConsultaDeFuncionDeEspectaculoPublish.selectPlataforma(arg0);
  }
  
  
}