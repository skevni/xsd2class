//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.06 at 10:14:20 PM MSK 
//


package ru.sklyarov.gar;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ITEM" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ID" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *                       &lt;totalDigits value="19"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="PARENTID" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *                       &lt;totalDigits value="19"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CHILDID" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *                       &lt;totalDigits value="19"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CHANGEID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "item"
})
@XmlRootElement(name = "ITEMS")
public class ITEMS {

    @XmlElement(name = "ITEM")
    protected List<ITEMS.ITEM> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ITEMS.ITEM }
     * 
     * 
     */
    public List<ITEMS.ITEM> getITEM() {
        if (item == null) {
            item = new ArrayList<ITEMS.ITEM>();
        }
        return this.item;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="ID" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
     *             &lt;totalDigits value="19"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="PARENTID" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
     *             &lt;totalDigits value="19"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CHILDID" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
     *             &lt;totalDigits value="19"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CHANGEID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ITEM {

        @XmlAttribute(name = "ID", required = true)
        protected long id;
        @XmlAttribute(name = "PARENTID", required = true)
        protected long parentid;
        @XmlAttribute(name = "CHILDID", required = true)
        protected long childid;
        @XmlAttribute(name = "CHANGEID", required = true)
        protected long changeid;

        /**
         * Gets the value of the id property.
         * 
         */
        public long getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setID(long value) {
            this.id = value;
        }

        /**
         * Gets the value of the parentid property.
         * 
         */
        public long getPARENTID() {
            return parentid;
        }

        /**
         * Sets the value of the parentid property.
         * 
         */
        public void setPARENTID(long value) {
            this.parentid = value;
        }

        /**
         * Gets the value of the childid property.
         * 
         */
        public long getCHILDID() {
            return childid;
        }

        /**
         * Sets the value of the childid property.
         * 
         */
        public void setCHILDID(long value) {
            this.childid = value;
        }

        /**
         * Gets the value of the changeid property.
         * 
         */
        public long getCHANGEID() {
            return changeid;
        }

        /**
         * Sets the value of the changeid property.
         * 
         */
        public void setCHANGEID(long value) {
            this.changeid = value;
        }

    }

}