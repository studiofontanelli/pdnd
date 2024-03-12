/**
 * ServiziorissrvSrvServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class ServiziorissrvSrvServiceLocator extends org.apache.axis.client.Service implements it.csi.staris.pdnd.integration.service.starissrv.stub.ServiziorissrvSrvService {

    public ServiziorissrvSrvServiceLocator() {
    }


    public ServiziorissrvSrvServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiziorissrvSrvServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiziorissrvSrvPort
    private java.lang.String ServiziorissrvSrvPort_address = "http://tst-applogic.reteunitaria.piemonte.it/starissrvApplServiziorissrvWs/starissrvServiziorissrvOpen";

    public java.lang.String getServiziorissrvSrvPortAddress() {
        return ServiziorissrvSrvPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiziorissrvSrvPortWSDDServiceName = "ServiziorissrvSrvPort";

    public java.lang.String getServiziorissrvSrvPortWSDDServiceName() {
        return ServiziorissrvSrvPortWSDDServiceName;
    }

    public void setServiziorissrvSrvPortWSDDServiceName(java.lang.String name) {
        ServiziorissrvSrvPortWSDDServiceName = name;
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.Serviziorissrv getServiziorissrvSrvPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiziorissrvSrvPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiziorissrvSrvPort(endpoint);
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.Serviziorissrv getServiziorissrvSrvPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.csi.staris.pdnd.integration.service.starissrv.stub.ServiziorissrvSrvServiceSoapBindingStub _stub = new it.csi.staris.pdnd.integration.service.starissrv.stub.ServiziorissrvSrvServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getServiziorissrvSrvPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiziorissrvSrvPortEndpointAddress(java.lang.String address) {
        ServiziorissrvSrvPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.csi.staris.pdnd.integration.service.starissrv.stub.Serviziorissrv.class.isAssignableFrom(serviceEndpointInterface)) {
                it.csi.staris.pdnd.integration.service.starissrv.stub.ServiziorissrvSrvServiceSoapBindingStub _stub = new it.csi.staris.pdnd.integration.service.starissrv.stub.ServiziorissrvSrvServiceSoapBindingStub(new java.net.URL(ServiziorissrvSrvPort_address), this);
                _stub.setPortName(getServiziorissrvSrvPortWSDDServiceName());
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
        if ("ServiziorissrvSrvPort".equals(inputPortName)) {
            return getServiziorissrvSrvPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://serviziorissrv.business.starissrv.staris.csi.it/", "ServiziorissrvSrvService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://serviziorissrv.business.starissrv.staris.csi.it/", "ServiziorissrvSrvPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiziorissrvSrvPort".equals(portName)) {
            setServiziorissrvSrvPortEndpointAddress(address);
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
