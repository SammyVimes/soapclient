<wsdl:definitions xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" targetNamespace="http://tempuri.org/">
<wsdl:types>
<s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
<s:element name="aF">
<s:complexType>
<s:sequence>
<s:element minOccurs="1" maxOccurs="1" name="newVal" type="s:int"/>
</s:sequence>
</s:complexType>
</s:element>
<s:element name="aFResponse">
<s:complexType>
<s:sequence>
<s:element minOccurs="0" maxOccurs="1" name="aFResult" type="tns:ArrayOfInt"/>
</s:sequence>
</s:complexType>
</s:element>
<s:complexType name="ArrayOfInt">
<s:sequence>
<s:element minOccurs="0" maxOccurs="unbounded" name="int" type="s:int"/>
</s:sequence>
</s:complexType>
<s:element name="aL">
<s:complexType>
<s:sequence>
<s:element minOccurs="1" maxOccurs="1" name="newVal" type="s:int"/>
</s:sequence>
</s:complexType>
</s:element>
<s:element name="aLResponse">
<s:complexType>
<s:sequence>
<s:element minOccurs="0" maxOccurs="1" name="aLResult" type="tns:ArrayOfInt"/>
</s:sequence>
</s:complexType>
</s:element>
<s:element name="rL">
<s:complexType/>
</s:element>
<s:element name="rLResponse">
<s:complexType/>
</s:element>
<s:element name="rF">
<s:complexType/>
</s:element>
<s:element name="rFResponse">
<s:complexType/>
</s:element>
<s:element name="sL">
<s:complexType>
<s:sequence>
<s:element minOccurs="1" maxOccurs="1" name="counts" type="s:int"/>
</s:sequence>
</s:complexType>
</s:element>
<s:element name="sLResponse">
<s:complexType>
<s:sequence>
<s:element minOccurs="0" maxOccurs="1" name="sLResult" type="tns:ArrayOfInt"/>
</s:sequence>
</s:complexType>
</s:element>
</s:schema>
</wsdl:types>
<wsdl:message name="aFSoapIn">
<wsdl:part name="parameters" element="tns:aF"/>
</wsdl:message>
<wsdl:message name="aFSoapOut">
<wsdl:part name="parameters" element="tns:aFResponse"/>
</wsdl:message>
<wsdl:message name="aLSoapIn">
<wsdl:part name="parameters" element="tns:aL"/>
</wsdl:message>
<wsdl:message name="aLSoapOut">
<wsdl:part name="parameters" element="tns:aLResponse"/>
</wsdl:message>
<wsdl:message name="rLSoapIn">
<wsdl:part name="parameters" element="tns:rL"/>
</wsdl:message>
<wsdl:message name="rLSoapOut">
<wsdl:part name="parameters" element="tns:rLResponse"/>
</wsdl:message>
<wsdl:message name="rFSoapIn">
<wsdl:part name="parameters" element="tns:rF"/>
</wsdl:message>
<wsdl:message name="rFSoapOut">
<wsdl:part name="parameters" element="tns:rFResponse"/>
</wsdl:message>
<wsdl:message name="sLSoapIn">
<wsdl:part name="parameters" element="tns:sL"/>
</wsdl:message>
<wsdl:message name="sLSoapOut">
<wsdl:part name="parameters" element="tns:sLResponse"/>
</wsdl:message>
<wsdl:portType name="WebService1Soap">
<wsdl:operation name="aF">
<wsdl:input message="tns:aFSoapIn"/>
<wsdl:output message="tns:aFSoapOut"/>
</wsdl:operation>
<wsdl:operation name="aL">
<wsdl:input message="tns:aLSoapIn"/>
<wsdl:output message="tns:aLSoapOut"/>
</wsdl:operation>
<wsdl:operation name="rL">
<wsdl:input message="tns:rLSoapIn"/>
<wsdl:output message="tns:rLSoapOut"/>
</wsdl:operation>
<wsdl:operation name="rF">
<wsdl:input message="tns:rFSoapIn"/>
<wsdl:output message="tns:rFSoapOut"/>
</wsdl:operation>
<wsdl:operation name="sL">
<wsdl:input message="tns:sLSoapIn"/>
<wsdl:output message="tns:sLSoapOut"/>
</wsdl:operation>
</wsdl:portType>
<wsdl:binding name="WebService1Soap" type="tns:WebService1Soap">
<soap:binding transport="http://schemas.xmlsoap.org/soap/http"/>
<wsdl:operation name="aF">
<soap:operation soapAction="http://tempuri.org/aF" style="document"/>
<wsdl:input>
<soap:body use="literal"/>
</wsdl:input>
<wsdl:output>
<soap:body use="literal"/>
</wsdl:output>
</wsdl:operation>
<wsdl:operation name="aL">
<soap:operation soapAction="http://tempuri.org/aL" style="document"/>
<wsdl:input>
<soap:body use="literal"/>
</wsdl:input>
<wsdl:output>
<soap:body use="literal"/>
</wsdl:output>
</wsdl:operation>
<wsdl:operation name="rL">
<soap:operation soapAction="http://tempuri.org/rL" style="document"/>
<wsdl:input>
<soap:body use="literal"/>
</wsdl:input>
<wsdl:output>
<soap:body use="literal"/>
</wsdl:output>
</wsdl:operation>
<wsdl:operation name="rF">
<soap:operation soapAction="http://tempuri.org/rF" style="document"/>
<wsdl:input>
<soap:body use="literal"/>
</wsdl:input>
<wsdl:output>
<soap:body use="literal"/>
</wsdl:output>
</wsdl:operation>
<wsdl:operation name="sL">
<soap:operation soapAction="http://tempuri.org/sL" style="document"/>
<wsdl:input>
<soap:body use="literal"/>
</wsdl:input>
<wsdl:output>
<soap:body use="literal"/>
</wsdl:output>
</wsdl:operation>
</wsdl:binding>
<wsdl:binding name="WebService1Soap12" type="tns:WebService1Soap">
<soap12:binding transport="http://schemas.xmlsoap.org/soap/http"/>
<wsdl:operation name="aF">
<soap12:operation soapAction="http://tempuri.org/aF" style="document"/>
<wsdl:input>
<soap12:body use="literal"/>
</wsdl:input>
<wsdl:output>
<soap12:body use="literal"/>
</wsdl:output>
</wsdl:operation>
<wsdl:operation name="aL">
<soap12:operation soapAction="http://tempuri.org/aL" style="document"/>
<wsdl:input>
<soap12:body use="literal"/>
</wsdl:input>
<wsdl:output>
<soap12:body use="literal"/>
</wsdl:output>
</wsdl:operation>
<wsdl:operation name="rL">
<soap12:operation soapAction="http://tempuri.org/rL" style="document"/>
<wsdl:input>
<soap12:body use="literal"/>
</wsdl:input>
<wsdl:output>
<soap12:body use="literal"/>
</wsdl:output>
</wsdl:operation>
<wsdl:operation name="rF">
<soap12:operation soapAction="http://tempuri.org/rF" style="document"/>
<wsdl:input>
<soap12:body use="literal"/>
</wsdl:input>
<wsdl:output>
<soap12:body use="literal"/>
</wsdl:output>
</wsdl:operation>
<wsdl:operation name="sL">
<soap12:operation soapAction="http://tempuri.org/sL" style="document"/>
<wsdl:input>
<soap12:body use="literal"/>
</wsdl:input>
<wsdl:output>
<soap12:body use="literal"/>
</wsdl:output>
</wsdl:operation>
</wsdl:binding>
<wsdl:service name="WebService1">
<wsdl:port name="WebService1Soap" binding="tns:WebService1Soap">
<soap:address location="http://localhost:53464/WebService1.asmx"/>
</wsdl:port>
<wsdl:port name="WebService1Soap12" binding="tns:WebService1Soap12">
<soap12:address location="http://localhost:53464/WebService1.asmx"/>
</wsdl:port>
</wsdl:service>
</wsdl:definitions>
