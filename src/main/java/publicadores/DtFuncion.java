/**
 * DtFuncion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtFuncion  implements java.io.Serializable {
    private java.lang.String[] artistas;

    private java.util.Calendar fecha;

    private java.util.Calendar fechaRegistro;

    private int horaInicio;

    private java.lang.String nombre;

    private java.lang.String urlImg;

    public DtFuncion() {
    }

    public DtFuncion(
           java.lang.String[] artistas,
           java.util.Calendar fecha,
           java.util.Calendar fechaRegistro,
           int horaInicio,
           java.lang.String nombre,
           java.lang.String urlImg) {
           this.artistas = artistas;
           this.fecha = fecha;
           this.fechaRegistro = fechaRegistro;
           this.horaInicio = horaInicio;
           this.nombre = nombre;
           this.urlImg = urlImg;
    }


    /**
     * Gets the artistas value for this DtFuncion.
     * 
     * @return artistas
     */
    public java.lang.String[] getArtistas() {
        return artistas;
    }


    /**
     * Sets the artistas value for this DtFuncion.
     * 
     * @param artistas
     */
    public void setArtistas(java.lang.String[] artistas) {
        this.artistas = artistas;
    }

    public java.lang.String getArtistas(int i) {
        return this.artistas[i];
    }

    public void setArtistas(int i, java.lang.String _value) {
        this.artistas[i] = _value;
    }


    /**
     * Gets the fecha value for this DtFuncion.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this DtFuncion.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the fechaRegistro value for this DtFuncion.
     * 
     * @return fechaRegistro
     */
    public java.util.Calendar getFechaRegistro() {
        return fechaRegistro;
    }


    /**
     * Sets the fechaRegistro value for this DtFuncion.
     * 
     * @param fechaRegistro
     */
    public void setFechaRegistro(java.util.Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    /**
     * Gets the horaInicio value for this DtFuncion.
     * 
     * @return horaInicio
     */
    public int getHoraInicio() {
        return horaInicio;
    }


    /**
     * Sets the horaInicio value for this DtFuncion.
     * 
     * @param horaInicio
     */
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }


    /**
     * Gets the nombre value for this DtFuncion.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DtFuncion.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the urlImg value for this DtFuncion.
     * 
     * @return urlImg
     */
    public java.lang.String getUrlImg() {
        return urlImg;
    }


    /**
     * Sets the urlImg value for this DtFuncion.
     * 
     * @param urlImg
     */
    public void setUrlImg(java.lang.String urlImg) {
        this.urlImg = urlImg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtFuncion)) return false;
        DtFuncion other = (DtFuncion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.artistas==null && other.getArtistas()==null) || 
             (this.artistas!=null &&
              java.util.Arrays.equals(this.artistas, other.getArtistas()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.fechaRegistro==null && other.getFechaRegistro()==null) || 
             (this.fechaRegistro!=null &&
              this.fechaRegistro.equals(other.getFechaRegistro()))) &&
            this.horaInicio == other.getHoraInicio() &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
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
        if (getArtistas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArtistas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArtistas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getFechaRegistro() != null) {
            _hashCode += getFechaRegistro().hashCode();
        }
        _hashCode += getHoraInicio();
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getUrlImg() != null) {
            _hashCode += getUrlImg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtFuncion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtFuncion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artistas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "artistas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("horaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
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
