/**
 * CConsultaDeFuncionDeEspectaculoPublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class CConsultaDeFuncionDeEspectaculoPublishServiceLocator extends org.apache.axis.client.Service implements publicadores.CConsultaDeFuncionDeEspectaculoPublishService {

    public CConsultaDeFuncionDeEspectaculoPublishServiceLocator() {
    }


    public CConsultaDeFuncionDeEspectaculoPublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CConsultaDeFuncionDeEspectaculoPublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CConsultaDeFuncionDeEspectaculoPublishPort
    private java.lang.String CConsultaDeFuncionDeEspectaculoPublishPort_address = "http://localhost:1942/CConsultaDeFuncionDeEspectaculoPublish";

    public java.lang.String getCConsultaDeFuncionDeEspectaculoPublishPortAddress() {
        return CConsultaDeFuncionDeEspectaculoPublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CConsultaDeFuncionDeEspectaculoPublishPortWSDDServiceName = "CConsultaDeFuncionDeEspectaculoPublishPort";

    public java.lang.String getCConsultaDeFuncionDeEspectaculoPublishPortWSDDServiceName() {
        return CConsultaDeFuncionDeEspectaculoPublishPortWSDDServiceName;
    }

    public void setCConsultaDeFuncionDeEspectaculoPublishPortWSDDServiceName(java.lang.String name) {
        CConsultaDeFuncionDeEspectaculoPublishPortWSDDServiceName = name;
    }

    public publicadores.CConsultaDeFuncionDeEspectaculoPublish getCConsultaDeFuncionDeEspectaculoPublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CConsultaDeFuncionDeEspectaculoPublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCConsultaDeFuncionDeEspectaculoPublishPort(endpoint);
    }

    public publicadores.CConsultaDeFuncionDeEspectaculoPublish getCConsultaDeFuncionDeEspectaculoPublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.CConsultaDeFuncionDeEspectaculoPublishPortBindingStub _stub = new publicadores.CConsultaDeFuncionDeEspectaculoPublishPortBindingStub(portAddress, this);
            _stub.setPortName(getCConsultaDeFuncionDeEspectaculoPublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCConsultaDeFuncionDeEspectaculoPublishPortEndpointAddress(java.lang.String address) {
        CConsultaDeFuncionDeEspectaculoPublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.CConsultaDeFuncionDeEspectaculoPublish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.CConsultaDeFuncionDeEspectaculoPublishPortBindingStub _stub = new publicadores.CConsultaDeFuncionDeEspectaculoPublishPortBindingStub(new java.net.URL(CConsultaDeFuncionDeEspectaculoPublishPort_address), this);
                _stub.setPortName(getCConsultaDeFuncionDeEspectaculoPublishPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CConsultaDeFuncionDeEspectaculoPublishPort".equals(inputPortName)) {
            return getCConsultaDeFuncionDeEspectaculoPublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "CConsultaDeFuncionDeEspectaculoPublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "CConsultaDeFuncionDeEspectaculoPublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CConsultaDeFuncionDeEspectaculoPublishPort".equals(portName)) {
            setCConsultaDeFuncionDeEspectaculoPublishPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
