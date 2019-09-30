
/**
 * ResultadoPoliza.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */

            
                package coop.equidad.servicios.suscripcion;
            

            /**
            *  ResultadoPoliza bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ResultadoPoliza
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ResultadoPoliza
                Namespace URI = http://www.example.org/SrvPoliza/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Sucur
                        */

                        
                                    protected java.lang.String localSucur ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSucur(){
                               return localSucur;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Sucur
                               */
                               public void setSucur(java.lang.String param){
                            
                                            this.localSucur=param;
                                       

                               }
                            

                        /**
                        * field for Poliza
                        */

                        
                                    protected java.lang.String localPoliza ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPoliza(){
                               return localPoliza;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Poliza
                               */
                               public void setPoliza(java.lang.String param){
                            
                                            this.localPoliza=param;
                                       

                               }
                            

                        /**
                        * field for Certif
                        */

                        
                                    protected java.lang.String localCertif ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCertif(){
                               return localCertif;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Certif
                               */
                               public void setCertif(java.lang.String param){
                            
                                            this.localCertif=param;
                                       

                               }
                            

                        /**
                        * field for Estado
                        */

                        
                                    protected int localEstado ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getEstado(){
                               return localEstado;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Estado
                               */
                               public void setEstado(int param){
                            
                                            this.localEstado=param;
                                       

                               }
                            

                        /**
                        * field for Fecini
                        */

                        
                                    protected java.util.Date localFecini ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecini(){
                               return localFecini;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecini
                               */
                               public void setFecini(java.util.Date param){
                            
                                            this.localFecini=param;
                                       

                               }
                            

                        /**
                        * field for Fecter
                        */

                        
                                    protected java.util.Date localFecter ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getFecter(){
                               return localFecter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fecter
                               */
                               public void setFecter(java.util.Date param){
                            
                                            this.localFecter=param;
                                       

                               }
                            

                        /**
                        * field for Codpla
                        */

                        
                                    protected java.lang.String localCodpla ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCodpla(){
                               return localCodpla;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Codpla
                               */
                               public void setCodpla(java.lang.String param){
                            
                                            this.localCodpla=param;
                                       

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this,parentQName));
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.example.org/SrvPoliza/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ResultadoPoliza",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ResultadoPoliza",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "";
                                    writeStartElement(null, namespace, "sucur", xmlWriter);
                             

                                          if (localSucur==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("sucur cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSucur);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "";
                                    writeStartElement(null, namespace, "poliza", xmlWriter);
                             

                                          if (localPoliza==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("poliza cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPoliza);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "";
                                    writeStartElement(null, namespace, "certif", xmlWriter);
                             

                                          if (localCertif==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("certif cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCertif);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "";
                                    writeStartElement(null, namespace, "estado", xmlWriter);
                             
                                               if (localEstado==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("estado cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstado));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecini", xmlWriter);
                             

                                          if (localFecini==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecini cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecini));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "";
                                    writeStartElement(null, namespace, "fecter", xmlWriter);
                             

                                          if (localFecter==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fecter cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecter));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "";
                                    writeStartElement(null, namespace, "codpla", xmlWriter);
                             

                                          if (localCodpla==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("codpla cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCodpla);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.example.org/SrvPoliza/")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace,attName,attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace,attName,attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ResultadoPoliza parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ResultadoPoliza object =
                new ResultadoPoliza();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();
                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ResultadoPoliza".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ResultadoPoliza)coop.equidad.servicios.suscripcion.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sucur").equals(reader.getName()) || new javax.xml.namespace.QName("","sucur").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"sucur" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSucur(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","poliza").equals(reader.getName()) || new javax.xml.namespace.QName("","poliza").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"poliza" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPoliza(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","certif").equals(reader.getName()) || new javax.xml.namespace.QName("","certif").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"certif" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertif(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","estado").equals(reader.getName()) || new javax.xml.namespace.QName("","estado").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"estado" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEstado(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecini").equals(reader.getName()) || new javax.xml.namespace.QName("","fecini").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecini" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecini(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fecter").equals(reader.getName()) || new javax.xml.namespace.QName("","fecter").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fecter" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFecter(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","codpla").equals(reader.getName()) || new javax.xml.namespace.QName("","codpla").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"codpla" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCodpla(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // 2 - A start element we are not expecting indicates a trailing invalid property
                                
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    