/**
 * ServiziorissrvSrvServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public class ServiziorissrvSrvServiceSoapBindingStub extends org.apache.axis.client.Stub implements it.csi.staris.pdnd.integration.service.starissrv.stub.Serviziorissrv {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pagamento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parametri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriPagamento"), it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriPagamento.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoPagamento"));
        oper.setReturnClass(it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamento.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("storno");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parametri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriStorno"), it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriStorno.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoStorno"));
        oper.setReturnClass(it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStorno.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("calcoloRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriRichiestaCalcoloRate"), it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaCalcoloRate.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoCalcoloRate"));
        oper.setReturnClass(it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloRate.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "CalcoloRateException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.CalcoloRateException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "CalcoloRateException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pagamentoIUV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriPagamento"), it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriPagamento.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoPagamentoIUV"));
        oper.setReturnClass(it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoIUV.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stornoRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriRichiestaStornoRate"), it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaStornoRate.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoStornoRate"));
        oper.setReturnClass(it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStornoRate.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "StornoRateException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.StornoRateException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "StornoRateException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultazione");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "prarametri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriConsultazione"), it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriConsultazione.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoConsultazione"));
        oper.setReturnClass(it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoConsultazione.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pagamentoRateCumulativo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "requestPagamentoRateCumulativo"), it.csi.staris.pdnd.integration.service.starissrv.stub.RequestPagamentoRateCumulativo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "iuv"));
        oper.setReturnClass(it.csi.staris.pdnd.integration.service.starissrv.stub.Iuv.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "PagamentoRateException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.PagamentoRateException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "PagamentoRateException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("calcoloTassaDatiTecnici");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parametri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriCalcoloTassaDatiTecnici"), it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriCalcoloTassaDatiTecnici.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoCalcoloTassa"));
        oper.setReturnClass(it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pagamentoRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriRichiestaPagamentoRate"), it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaPagamentoRate.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoPagamentoRate"));
        oper.setReturnClass(it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoRate.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "PagamentoRateException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.PagamentoRateException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "PagamentoRateException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("calcoloTassa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parametri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriCalcoloTassa"), it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriCalcoloTassa.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoCalcoloTassa"));
        oper.setReturnClass(it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"),
                      "it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException",
                      new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    public ServiziorissrvSrvServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServiziorissrvSrvServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServiziorissrvSrvServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "CalcoloRateException");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.CalcoloRateException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "codiceFiscale");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.CodiceFiscale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "dataAsString");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.DataAsString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "dataOraAsString");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.DataOraAsString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "divisa");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Divisa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "errore");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Errore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "ErroreImprevistoException");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "errori");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Errori.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoCalcoloRate");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoCalcoloTassa");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoConsultazione");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoConsultazione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoPagamento");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoPagamentoIUV");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoIUV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoPagamentoRate");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoStorno");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "esitoStornoRate");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStornoRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "identificativoPagamento");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.IdentificativoPagamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "iuv");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Iuv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "mittente");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Mittente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "mittenteCalcoloRate");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.MittenteCalcoloRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "modalitaCompensazione");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.ModalitaCompensazione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "numeroRicevuta");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.NumeroRicevuta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "PagamentoRateException");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.PagamentoRateException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriCalcoloTassa");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriCalcoloTassa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriCalcoloTassaDatiTecnici");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriCalcoloTassaDatiTecnici.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriConsultazione");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriConsultazione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriPagamento");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriPagamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriRichiestaCalcoloRate");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaCalcoloRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriRichiestaPagamentoRate");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaPagamentoRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriRichiestaStornoRate");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaStornoRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "parametriStorno");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriStorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "rata");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Rata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "regione");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Regione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "requestPagamentoRateCumulativo");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.RequestPagamentoRateCumulativo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "riduzione");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Riduzione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "scadenza");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Scadenza.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "StornoRateException");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.StornoRateException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "targa");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Targa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoCalcolo");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.TipoCalcolo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoFruitore");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.TipoFruitore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoModalitaEsenzioni");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.TipoModalitaEsenzioni.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoRiduzione");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.TipoRiduzione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoSanzionamento");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.TipoSanzionamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "tipoTarga");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.TipoTarga.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "transazioneEnte");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.TransazioneEnte.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "transazionePos");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.TransazionePos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "UnrecoverableException");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "validita");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Validita.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "valuta");
            cachedSerQNames.add(qName);
            cls = it.csi.staris.pdnd.integration.service.starissrv.stub.Valuta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamento pagamento(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriPagamento parametri) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "pagamento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamento) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamento) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamento.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStorno storno(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriStorno parametri) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "storno"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStorno) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStorno) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStorno.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloRate calcoloRate(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaCalcoloRate request) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.CalcoloRateException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "calcoloRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloRate) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloRate) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloRate.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.CalcoloRateException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.CalcoloRateException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoIUV pagamentoIUV(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriPagamento request) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "pagamentoIUV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoIUV) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoIUV) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoIUV.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStornoRate stornoRate(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaStornoRate request) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.StornoRateException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "stornoRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStornoRate) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStornoRate) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStornoRate.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.StornoRateException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.StornoRateException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoConsultazione consultazione(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriConsultazione prarametri) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "consultazione"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {prarametri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoConsultazione) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoConsultazione) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoConsultazione.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.Iuv pagamentoRateCumulativo(it.csi.staris.pdnd.integration.service.starissrv.stub.RequestPagamentoRateCumulativo request) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.PagamentoRateException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "pagamentoRateCumulativo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.Iuv) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.Iuv) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.staris.pdnd.integration.service.starissrv.stub.Iuv.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.PagamentoRateException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.PagamentoRateException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa calcoloTassaDatiTecnici(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriCalcoloTassaDatiTecnici parametri) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "calcoloTassaDatiTecnici"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoRate pagamentoRate(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaPagamentoRate request) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.PagamentoRateException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "pagamentoRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoRate) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoRate) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoRate.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.PagamentoRateException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.PagamentoRateException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa calcoloTassa(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriCalcoloTassa parametri) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://serviziorissrv.interfacews.starissrv.staris.csi.it/", "calcoloTassa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) {
              throw (it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
