//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.11 at 03:29:32 PM MESZ 
//


package com.w3schools;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rezept" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="info">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Ueberschrift" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Zutatenliste">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Zutat" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Menge">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             &lt;minInclusive value="0"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Einheit">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="Gramm"/>
 *                                             &lt;enumeration value="Stueck"/>
 *                                             &lt;enumeration value="Teeloeffel"/>
 *                                             &lt;enumeration value="Essloeffel"/>
 *                                             &lt;enumeration value="Packung"/>
 *                                             &lt;enumeration value="Bund"/>
 *                                             &lt;enumeration value="ml"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Zubereitung">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Arbeitszeit">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;minInclusive value="0"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Schwierigkeitsgrad">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="leicht"/>
 *                                   &lt;enumeration value="normal"/>
 *                                   &lt;enumeration value="schwer"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Brennwert">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minInclusive value="0"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Anleitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Kommentare">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Nachricht" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rezept"
})
@XmlRootElement(name = "Chefkoch")
public class Chefkoch {

    @XmlElement(name = "Rezept", required = true)
    protected List<Chefkoch.Rezept> rezept;

    /**
     * Gets the value of the rezept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rezept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRezept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chefkoch.Rezept }
     * 
     * 
     */
    public List<Chefkoch.Rezept> getRezept() {
        if (rezept == null) {
            rezept = new ArrayList<Chefkoch.Rezept>();
        }
        return this.rezept;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="info">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Ueberschrift" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Zutatenliste">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Zutat" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Menge">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   &lt;minInclusive value="0"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Einheit">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="Gramm"/>
     *                                   &lt;enumeration value="Stueck"/>
     *                                   &lt;enumeration value="Teeloeffel"/>
     *                                   &lt;enumeration value="Essloeffel"/>
     *                                   &lt;enumeration value="Packung"/>
     *                                   &lt;enumeration value="Bund"/>
     *                                   &lt;enumeration value="ml"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Zubereitung">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Arbeitszeit">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;minInclusive value="0"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Schwierigkeitsgrad">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="leicht"/>
     *                         &lt;enumeration value="normal"/>
     *                         &lt;enumeration value="schwer"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Brennwert">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;minInclusive value="0"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Anleitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Kommentare">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Nachricht" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "info",
        "zutatenliste",
        "zubereitung",
        "kommentare"
    })
    public static class Rezept {

        @XmlElement(required = true)
        protected Chefkoch.Rezept.Info info;
        @XmlElement(name = "Zutatenliste", required = true)
        protected Chefkoch.Rezept.Zutatenliste zutatenliste;
        @XmlElement(name = "Zubereitung", required = true)
        protected Chefkoch.Rezept.Zubereitung zubereitung;
        @XmlElement(name = "Kommentare", required = true)
        protected Chefkoch.Rezept.Kommentare kommentare;
        @XmlAttribute
        protected BigInteger id;

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link Chefkoch.Rezept.Info }
         *     
         */
        public Chefkoch.Rezept.Info getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link Chefkoch.Rezept.Info }
         *     
         */
        public void setInfo(Chefkoch.Rezept.Info value) {
            this.info = value;
        }

        /**
         * Gets the value of the zutatenliste property.
         * 
         * @return
         *     possible object is
         *     {@link Chefkoch.Rezept.Zutatenliste }
         *     
         */
        public Chefkoch.Rezept.Zutatenliste getZutatenliste() {
            return zutatenliste;
        }

        /**
         * Sets the value of the zutatenliste property.
         * 
         * @param value
         *     allowed object is
         *     {@link Chefkoch.Rezept.Zutatenliste }
         *     
         */
        public void setZutatenliste(Chefkoch.Rezept.Zutatenliste value) {
            this.zutatenliste = value;
        }

        /**
         * Gets the value of the zubereitung property.
         * 
         * @return
         *     possible object is
         *     {@link Chefkoch.Rezept.Zubereitung }
         *     
         */
        public Chefkoch.Rezept.Zubereitung getZubereitung() {
            return zubereitung;
        }

        /**
         * Sets the value of the zubereitung property.
         * 
         * @param value
         *     allowed object is
         *     {@link Chefkoch.Rezept.Zubereitung }
         *     
         */
        public void setZubereitung(Chefkoch.Rezept.Zubereitung value) {
            this.zubereitung = value;
        }

        /**
         * Gets the value of the kommentare property.
         * 
         * @return
         *     possible object is
         *     {@link Chefkoch.Rezept.Kommentare }
         *     
         */
        public Chefkoch.Rezept.Kommentare getKommentare() {
            return kommentare;
        }

        /**
         * Sets the value of the kommentare property.
         * 
         * @param value
         *     allowed object is
         *     {@link Chefkoch.Rezept.Kommentare }
         *     
         */
        public void setKommentare(Chefkoch.Rezept.Kommentare value) {
            this.kommentare = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Ueberschrift" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ueberschrift",
            "bild"
        })
        public static class Info {

            @XmlElement(name = "Ueberschrift", required = true)
            protected String ueberschrift;
            @XmlElement(name = "Bild", required = true)
            @XmlSchemaType(name = "anyURI")
            protected List<String> bild;

            /**
             * Gets the value of the ueberschrift property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUeberschrift() {
                return ueberschrift;
            }

            /**
             * Sets the value of the ueberschrift property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUeberschrift(String value) {
                this.ueberschrift = value;
            }

            /**
             * Gets the value of the bild property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bild property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBild().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getBild() {
                if (bild == null) {
                    bild = new ArrayList<String>();
                }
                return this.bild;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Nachricht" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nachricht"
        })
        public static class Kommentare {

            @XmlElement(name = "Nachricht", required = true)
            protected List<String> nachricht;

            /**
             * Gets the value of the nachricht property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the nachricht property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNachricht().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getNachricht() {
                if (nachricht == null) {
                    nachricht = new ArrayList<String>();
                }
                return this.nachricht;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Arbeitszeit">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;minInclusive value="0"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Schwierigkeitsgrad">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="leicht"/>
         *               &lt;enumeration value="normal"/>
         *               &lt;enumeration value="schwer"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Brennwert">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;minInclusive value="0"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Anleitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "arbeitszeit",
            "schwierigkeitsgrad",
            "brennwert",
            "anleitung"
        })
        public static class Zubereitung {

            @XmlElement(name = "Arbeitszeit", required = true)
            protected BigInteger arbeitszeit;
            @XmlElement(name = "Schwierigkeitsgrad", required = true)
            protected String schwierigkeitsgrad;
            @XmlElement(name = "Brennwert", required = true)
            protected BigDecimal brennwert;
            @XmlElement(name = "Anleitung", required = true)
            protected String anleitung;

            /**
             * Gets the value of the arbeitszeit property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getArbeitszeit() {
                return arbeitszeit;
            }

            /**
             * Sets the value of the arbeitszeit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setArbeitszeit(BigInteger value) {
                this.arbeitszeit = value;
            }

            /**
             * Gets the value of the schwierigkeitsgrad property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchwierigkeitsgrad() {
                return schwierigkeitsgrad;
            }

            /**
             * Sets the value of the schwierigkeitsgrad property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchwierigkeitsgrad(String value) {
                this.schwierigkeitsgrad = value;
            }

            /**
             * Gets the value of the brennwert property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBrennwert() {
                return brennwert;
            }

            /**
             * Sets the value of the brennwert property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBrennwert(BigDecimal value) {
                this.brennwert = value;
            }

            /**
             * Gets the value of the anleitung property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnleitung() {
                return anleitung;
            }

            /**
             * Sets the value of the anleitung property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnleitung(String value) {
                this.anleitung = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Zutat" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Menge">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         &lt;minInclusive value="0"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Einheit">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="Gramm"/>
         *                         &lt;enumeration value="Stueck"/>
         *                         &lt;enumeration value="Teeloeffel"/>
         *                         &lt;enumeration value="Essloeffel"/>
         *                         &lt;enumeration value="Packung"/>
         *                         &lt;enumeration value="Bund"/>
         *                         &lt;enumeration value="ml"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "zutat"
        })
        public static class Zutatenliste {

            @XmlElement(name = "Zutat", required = true)
            protected List<Chefkoch.Rezept.Zutatenliste.Zutat> zutat;

            /**
             * Gets the value of the zutat property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the zutat property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getZutat().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Chefkoch.Rezept.Zutatenliste.Zutat }
             * 
             * 
             */
            public List<Chefkoch.Rezept.Zutatenliste.Zutat> getZutat() {
                if (zutat == null) {
                    zutat = new ArrayList<Chefkoch.Rezept.Zutatenliste.Zutat>();
                }
                return this.zutat;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Menge">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               &lt;minInclusive value="0"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Einheit">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="Gramm"/>
             *               &lt;enumeration value="Stueck"/>
             *               &lt;enumeration value="Teeloeffel"/>
             *               &lt;enumeration value="Essloeffel"/>
             *               &lt;enumeration value="Packung"/>
             *               &lt;enumeration value="Bund"/>
             *               &lt;enumeration value="ml"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "menge",
                "einheit",
                "bezeichnung"
            })
            public static class Zutat {

                @XmlElement(name = "Menge", required = true)
                protected BigDecimal menge;
                @XmlElement(name = "Einheit", required = true)
                protected String einheit;
                @XmlElement(name = "Bezeichnung", required = true)
                protected String bezeichnung;

                /**
                 * Gets the value of the menge property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMenge() {
                    return menge;
                }

                /**
                 * Sets the value of the menge property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMenge(BigDecimal value) {
                    this.menge = value;
                }

                /**
                 * Gets the value of the einheit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEinheit() {
                    return einheit;
                }

                /**
                 * Sets the value of the einheit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

                /**
                 * Gets the value of the bezeichnung property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBezeichnung() {
                    return bezeichnung;
                }

                /**
                 * Sets the value of the bezeichnung property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBezeichnung(String value) {
                    this.bezeichnung = value;
                }

            }

        }

    }

}
