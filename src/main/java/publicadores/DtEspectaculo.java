/**
 * DtEspectaculo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtEspectaculo  implements java.io.Serializable {
    private int cantMaxEspectadores;

    private int cantMinEspectadores;

    private float costo;

    private java.lang.String descripcion;

    private int duracionMin;

    private java.util.Calendar fechaRegistro;

    private publicadores.DtFuncion[] funciones;

    private java.lang.String nombre;

    private java.lang.String url;

    private java.lang.String urlImg;

    public DtEspectaculo() {
    }

    public DtEspectaculo(
           int cantMaxEspectadores,
           int cantMinEspectadores,
           float costo,
           java.lang.String descripcion,
           int duracionMin,
           java.util.Calendar fechaRegistro,
           publicadores.DtFuncion[] funciones,
           java.lang.String nombre,
           java.lang.String url,
           java.lang.String urlImg) {
           this.cantMaxEspectadores = cantMaxEspectadores;
           this.cantMinEspectadores = cantMinEspectadores;
           this.costo = costo;
           this.descripcion = descripcion;
           this.duracionMin = duracionMin;
           this.fechaRegistro = fechaRegistro;
           this.funciones = funciones;
           this.nombre = nombre;
           this.url = url;
           this.urlImg = urlImg;
    }


    /**
     * Gets the cantMaxEspectadores value for this DtEspectaculo.
     * 
     * @return cantMaxEspectadores
     */
    public int getCantMaxEspectadores() {
        return cantMaxEspectadores;
    }


    /**
     * Sets the cantMaxEspectadores value for this DtEspectaculo.
     * 
     * @param cantMaxEspectadores
     */
    public void setCantMaxEspectadores(int cantMaxEspectadores) {
        this.cantMaxEspectadores = cantMaxEspectadores;
    }


    /**
     * Gets the cantMinEspectadores value for this DtEspectaculo.
     * 
     * @return cantMinEspectadores
     */
    public int getCantMinEspectadores() {
        return cantMinEspectadores;
    }


    /**
     * Sets the cantMinEspectadores value for this DtEspectaculo.
     * 
     * @param cantMinEspectadores
     */
    public void setCantMinEspectadores(int cantMinEspectadores) {
        this.cantMinEspectadores = cantMinEspectadores;
    }


    /**
     * Gets the costo value for this DtEspectaculo.
     * 
     * @return costo
     */
    public float getCosto() {
        return costo;
    }


    /**
     * Sets the costo value for this DtEspectaculo.
     * 
     * @param costo
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }


    /**
     * Gets the descripcion value for this DtEspectaculo.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this DtEspectaculo.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the duracionMin value for this DtEspectaculo.
     * 
     * @return duracionMin
     */
    public int getDuracionMin() {
        return duracionMin;
    }


    /**
     * Sets the duracionMin value for this DtEspectaculo.
     * 
     * @param duracionMin
     */
    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }


    /**
     * Gets the fechaRegistro value for this DtEspectaculo.
     * 
     * @return fechaRegistro
     */
    public java.util.Calendar getFechaRegistro() {
        return fechaRegistro;
    }


    /**
     * Sets the fechaRegistro value for this DtEspectaculo.
     * 
     * @param fechaRegistro
     */
    public void setFechaRegistro(java.util.Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    /**
     * Gets the funciones value for this DtEspectaculo.
     * 
     * @return funciones
     */
    public publicadores.DtFuncion[] getFunciones() {
        return funciones;
    }


    /**
     * Sets the funciones value for this DtEspectaculo.
     * 
     * @param funciones
     */
    public void setFunciones(publicadores.DtFuncion[] funciones) {
        this.funciones = funciones;
    }

    public publicadores.DtFuncion getFunciones(int i) {
        return this.funciones[i];
    }

    public void setFunciones(int i, publicadores.DtFuncion _value) {
        this.funciones[i] = _value;
    }


    /**
     * Gets the nombre value for this DtEspectaculo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DtEspectaculo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the url value for this DtEspectaculo.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this DtEspectaculo.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the urlImg value for this DtEspectaculo.
     * 
     * @return urlImg
     */
    public java.lang.String getUrlImg() {
        return urlImg;
    }


    /**
     * Sets the urlImg value for this DtEspectaculo.
     * 
     * @param urlImg
     */
    public void setUrlImg(java.lang.String urlImg) {
        this.urlImg = urlImg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtEspectaculo)) return false;
        DtEspectaculo other = (DtEspectaculo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cantMaxEspectadores == other.getCantMaxEspectadores() &&
            this.cantMinEspectadores == other.getCantMinEspectadores() &&
            this.costo == other.getCosto() &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            this.duracionMin == other.getDuracionMin() &&
            ((this.fechaRegistro==null && other.getFechaRegistro()==null) || 
             (this.fechaRegistro!=null &&
              this.fechaRegistro.equals(other.getFechaRegistro()))) &&
            ((this.funciones==null && other.getFunciones()==null) || 
             (this.funciones!=null &&
              java.util.Arrays.equals(this.funciones, other.getFunciones()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.urlImg==null && other.getUrlImg()==null) || 
             (this.urlImg!=null &&
              this.urlImg.equals(other.getUrlImg())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCantMaxEspectadores();
        _hashCode += getCantMinEspectadores();
        _hashCode += new Float(getCosto()).hashCode();
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        _hashCode += getDuracionMin();
        if (getFechaRegistro() != null) {
            _hashCode += getFechaRegistro().hashCode();
        }
        if (getFunciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFunciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFunciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getUrlImg() != null) {
            _hashCode += getUrlImg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtEspectaculo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtEspectaculo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantMaxEspectadores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cantMaxEspectadores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantMinEspectadores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cantMinEspectadores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duracionMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duracionMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtFuncion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlImg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlImg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
