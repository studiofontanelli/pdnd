/**
 * Serviziorissrv.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.staris.pdnd.integration.service.starissrv.stub;

public interface Serviziorissrv extends java.rmi.Remote {
    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamento pagamento(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriPagamento parametri) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException;
    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStorno storno(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriStorno parametri) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException;
    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloRate calcoloRate(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaCalcoloRate request) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.CalcoloRateException;
    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoIUV pagamentoIUV(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriPagamento request) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException;
    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoStornoRate stornoRate(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaStornoRate request) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.StornoRateException;
    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoConsultazione consultazione(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriConsultazione prarametri) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException;
    public it.csi.staris.pdnd.integration.service.starissrv.stub.Iuv pagamentoRateCumulativo(it.csi.staris.pdnd.integration.service.starissrv.stub.RequestPagamentoRateCumulativo request) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.PagamentoRateException;
    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa calcoloTassaDatiTecnici(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriCalcoloTassaDatiTecnici parametri) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException;
    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoPagamentoRate pagamentoRate(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriRichiestaPagamentoRate request) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.PagamentoRateException;
    public it.csi.staris.pdnd.integration.service.starissrv.stub.EsitoCalcoloTassa calcoloTassa(it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriCalcoloTassa parametri) throws java.rmi.RemoteException, it.csi.staris.pdnd.integration.service.starissrv.stub.UnrecoverableException, it.csi.staris.pdnd.integration.service.starissrv.stub.ErroreImprevistoException;
}
