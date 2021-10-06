package ru.sklyarov.gar;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

public class AddrObject {
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "OBJECTID", required = true)
    protected long objectid;
    @XmlAttribute(name = "OBJECTGUID", required = true)
    protected String objectguid;
    @XmlAttribute(name = "CHANGEID", required = true)
    protected long changeid;
    @XmlAttribute(name = "NAME", required = true)
    protected String name;
    @XmlAttribute(name = "TYPENAME", required = true)
    protected String typename;
    @XmlAttribute(name = "LEVEL", required = true)
    protected String level;
    @XmlAttribute(name = "OPERTYPEID", required = true)
    protected BigInteger opertypeid;
    @XmlAttribute(name = "PREVID")
    protected Long previd;
    @XmlAttribute(name = "NEXTID")
    protected Long nextid;
    @XmlAttribute(name = "UPDATEDATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updatedate;
    @XmlAttribute(name = "STARTDATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startdate;
    @XmlAttribute(name = "ENDDATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enddate;
    @XmlAttribute(name = "ISACTUAL", required = true)
    protected BigInteger isactual;
    @XmlAttribute(name = "ISACTIVE", required = true)
    protected BigInteger isactive;

    /**
     * Gets the value of the id property.
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the objectid property.
     */
    public long getOBJECTID() {
        return objectid;
    }

    /**
     * Sets the value of the objectid property.
     */
    public void setOBJECTID(long value) {
        this.objectid = value;
    }

    /**
     * Gets the value of the objectguid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOBJECTGUID() {
        return objectguid;
    }

    /**
     * Sets the value of the objectguid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOBJECTGUID(String value) {
        this.objectguid = value;
    }

    /**
     * Gets the value of the changeid property.
     */
    public long getCHANGEID() {
        return changeid;
    }

    /**
     * Sets the value of the changeid property.
     */
    public void setCHANGEID(long value) {
        this.changeid = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the typename property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTYPENAME() {
        return typename;
    }

    /**
     * Sets the value of the typename property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTYPENAME(String value) {
        this.typename = value;
    }

    /**
     * Gets the value of the level property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLEVEL() {
        return level;
    }

    /**
     * Sets the value of the level property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLEVEL(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the opertypeid property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getOPERTYPEID() {
        return opertypeid;
    }

    /**
     * Sets the value of the opertypeid property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setOPERTYPEID(BigInteger value) {
        this.opertypeid = value;
    }

    /**
     * Gets the value of the previd property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getPREVID() {
        return previd;
    }

    /**
     * Sets the value of the previd property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setPREVID(Long value) {
        this.previd = value;
    }

    /**
     * Gets the value of the nextid property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getNEXTID() {
        return nextid;
    }

    /**
     * Sets the value of the nextid property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setNEXTID(Long value) {
        this.nextid = value;
    }

    /**
     * Gets the value of the updatedate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getUPDATEDATE() {
        return updatedate;
    }

    /**
     * Sets the value of the updatedate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setUPDATEDATE(XMLGregorianCalendar value) {
        this.updatedate = value;
    }

    /**
     * Gets the value of the startdate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setSTARTDATE(XMLGregorianCalendar value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the enddate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getENDDATE() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setENDDATE(XMLGregorianCalendar value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the isactual property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getISACTUAL() {
        return isactual;
    }

    /**
     * Sets the value of the isactual property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setISACTUAL(BigInteger value) {
        this.isactual = value;
    }

    /**
     * Gets the value of the isactive property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getISACTIVE() {
        return isactive;
    }

    /**
     * Sets the value of the isactive property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setISACTIVE(BigInteger value) {
        this.isactive = value;
    }
}
