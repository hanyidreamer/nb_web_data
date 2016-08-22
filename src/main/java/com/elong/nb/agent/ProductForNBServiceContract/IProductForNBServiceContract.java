package com.elong.nb.agent.ProductForNBServiceContract;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-08-15T17:31:12.758+08:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IProductForNBServiceContract")
@XmlSeeAlso({ObjectFactory.class})
public interface IProductForNBServiceContract {

    @WebMethod(operationName = "GetAllPriceByHotelId", action = "http://tempuri.org/IProductForNBServiceContract/GetAllPriceByHotelId")
    @Action(input = "http://tempuri.org/IProductForNBServiceContract/GetAllPriceByHotelId", output = "http://tempuri.org/IProductForNBServiceContract/GetAllPriceByHotelIdResponse")
    @RequestWrapper(localName = "GetAllPriceByHotelId", targetNamespace = "http://tempuri.org/", className = "com.elong.nb.agent.ProductForNBServiceContract.GetAllPriceByHotelId")
    @ResponseWrapper(localName = "GetAllPriceByHotelIdResponse", targetNamespace = "http://tempuri.org/", className = "com.elong.nb.agent.ProductForNBServiceContract.GetAllPriceByHotelIdResponse")
    @WebResult(name = "GetAllPriceByHotelIdResult", targetNamespace = "http://tempuri.org/")
    public com.elong.nb.agent.ProductForNBServiceContract.GetAllPriceByHotelIdResponse2 getAllPriceByHotelId(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        com.elong.nb.agent.ProductForNBServiceContract.GetAllPriceByHotelIdRequest request
    );

    @WebMethod(operationName = "GetHotelRoomPrice", action = "http://tempuri.org/IProductForNBServiceContract/GetHotelRoomPrice")
    @Action(input = "http://tempuri.org/IProductForNBServiceContract/GetHotelRoomPrice", output = "http://tempuri.org/IProductForNBServiceContract/GetHotelRoomPriceResponse")
    @RequestWrapper(localName = "GetHotelRoomPrice", targetNamespace = "http://tempuri.org/", className = "com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPrice")
    @ResponseWrapper(localName = "GetHotelRoomPriceResponse", targetNamespace = "http://tempuri.org/", className = "com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPriceResponse")
    @WebResult(name = "GetHotelRoomPriceResult", targetNamespace = "http://tempuri.org/")
    public com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPriceResponse2 getHotelRoomPrice(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        com.elong.nb.agent.ProductForNBServiceContract.GetHotelRoomPriceRequest request
    );

    @WebMethod(operationName = "SetB2BSellChannel", action = "http://tempuri.org/IProductForNBServiceContract/SetB2BSellChannel")
    @Action(input = "http://tempuri.org/IProductForNBServiceContract/SetB2BSellChannel", output = "http://tempuri.org/IProductForNBServiceContract/SetB2BSellChannelResponse")
    @RequestWrapper(localName = "SetB2BSellChannel", targetNamespace = "http://tempuri.org/", className = "com.elong.nb.agent.ProductForNBServiceContract.SetB2BSellChannel")
    @ResponseWrapper(localName = "SetB2BSellChannelResponse", targetNamespace = "http://tempuri.org/", className = "com.elong.nb.agent.ProductForNBServiceContract.SetB2BSellChannelResponse")
    @WebResult(name = "SetB2BSellChannelResult", targetNamespace = "http://tempuri.org/")
    public com.elong.nb.agent.ProductForNBServiceContract.SetB2BSellChannelResponse2 setB2BSellChannel(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        com.elong.nb.agent.ProductForNBServiceContract.SetB2BSellChannelRequest request
    );

    @WebMethod(operationName = "GetRatePlanBaseInfo", action = "http://tempuri.org/IProductForNBServiceContract/GetRatePlanBaseInfo")
    @Action(input = "http://tempuri.org/IProductForNBServiceContract/GetRatePlanBaseInfo", output = "http://tempuri.org/IProductForNBServiceContract/GetRatePlanBaseInfoResponse")
    @RequestWrapper(localName = "GetRatePlanBaseInfo", targetNamespace = "http://tempuri.org/", className = "com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfo")
    @ResponseWrapper(localName = "GetRatePlanBaseInfoResponse", targetNamespace = "http://tempuri.org/", className = "com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfoResponse")
    @WebResult(name = "GetRatePlanBaseInfoResult", targetNamespace = "http://tempuri.org/")
    public com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfoResponse2 getRatePlanBaseInfo(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseInfoRequest request
    );

    @WebMethod(operationName = "GetRatePlanBaseList", action = "http://tempuri.org/IProductForNBServiceContract/GetRatePlanBaseList")
    @Action(input = "http://tempuri.org/IProductForNBServiceContract/GetRatePlanBaseList", output = "http://tempuri.org/IProductForNBServiceContract/GetRatePlanBaseListResponse")
    @RequestWrapper(localName = "GetRatePlanBaseList", targetNamespace = "http://tempuri.org/", className = "com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseList")
    @ResponseWrapper(localName = "GetRatePlanBaseListResponse", targetNamespace = "http://tempuri.org/", className = "com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseListResponse")
    @WebResult(name = "GetRatePlanBaseListResult", targetNamespace = "http://tempuri.org/")
    public com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseListResponse2 getRatePlanBaseList(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        com.elong.nb.agent.ProductForNBServiceContract.GetRatePlanBaseListRequest request
    );
}
