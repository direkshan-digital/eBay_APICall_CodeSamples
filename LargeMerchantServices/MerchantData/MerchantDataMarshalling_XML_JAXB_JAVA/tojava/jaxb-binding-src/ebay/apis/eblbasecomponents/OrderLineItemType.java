//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Specifics for the sale data for a single SKU or item.
 * 			
 * 
 * <p>Java class for OrderLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OriginalChargeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="ItemTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SKU" type="{urn:ebay:apis:eBLBaseComponents}SKUType" minOccurs="0"/>
 *         &lt;element name="GlobalCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiteDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantitySold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SalePrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentClearedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ListingSiteID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SaleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="SellingManagerSaleRecordID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BuyerPaymentTransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Variation" type="{urn:ebay:apis:eBLBaseComponents}MerchantDataVariationType" minOccurs="0"/>
 *         &lt;element name="TaxCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{urn:ebay:apis:eBLBaseComponents}TaxesType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}TransactionStatusType" minOccurs="0"/>
 *         &lt;element name="ActualShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="UnpaidItem" type="{urn:ebay:apis:eBLBaseComponents}UnpaidItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLineItemType", propOrder = {
    "orderLineItemID",
    "transactionTime",
    "originalChargeTime",
    "itemID",
    "itemTitle",
    "serialNumber",
    "sku",
    "globalCategoryDescription",
    "siteDescription",
    "quantitySold",
    "salePrice",
    "taxAmount",
    "shippingCost",
    "totalCost",
    "paymentClearedTime",
    "insuranceCost",
    "listingSiteID",
    "saleTime",
    "memo",
    "secondDescription",
    "feeDescription",
    "feeAmount",
    "sellingManagerSaleRecordID",
    "buyerPaymentTransactionNumber",
    "variation",
    "taxCategory",
    "taxes",
    "status",
    "actualShippingCost",
    "unpaidItem"
})
public class OrderLineItemType {

    @XmlElement(name = "OrderLineItemID")
    protected String orderLineItemID;
    @XmlElement(name = "TransactionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionTime;
    @XmlElement(name = "OriginalChargeTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalChargeTime;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "ItemTitle")
    protected String itemTitle;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "GlobalCategoryDescription")
    protected String globalCategoryDescription;
    @XmlElement(name = "SiteDescription")
    protected String siteDescription;
    @XmlElement(name = "QuantitySold")
    protected Integer quantitySold;
    @XmlElement(name = "SalePrice")
    protected AmountType salePrice;
    @XmlElement(name = "TaxAmount")
    protected AmountType taxAmount;
    @XmlElement(name = "ShippingCost")
    protected AmountType shippingCost;
    @XmlElement(name = "TotalCost")
    protected AmountType totalCost;
    @XmlElement(name = "PaymentClearedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentClearedTime;
    @XmlElement(name = "InsuranceCost")
    protected AmountType insuranceCost;
    @XmlElement(name = "ListingSiteID")
    protected Integer listingSiteID;
    @XmlElement(name = "SaleTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleTime;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "SecondDescription")
    protected String secondDescription;
    @XmlElement(name = "FeeDescription")
    protected String feeDescription;
    @XmlElement(name = "FeeAmount")
    protected AmountType feeAmount;
    @XmlElement(name = "SellingManagerSaleRecordID")
    protected Integer sellingManagerSaleRecordID;
    @XmlElement(name = "BuyerPaymentTransactionNumber")
    protected String buyerPaymentTransactionNumber;
    @XmlElement(name = "Variation")
    protected MerchantDataVariationType variation;
    @XmlElement(name = "TaxCategory")
    protected String taxCategory;
    @XmlElement(name = "Taxes")
    protected TaxesType taxes;
    @XmlElement(name = "Status")
    protected TransactionStatusType status;
    @XmlElement(name = "ActualShippingCost")
    protected AmountType actualShippingCost;
    @XmlElement(name = "UnpaidItem")
    protected UnpaidItemType unpaidItem;

    /**
     * Gets the value of the orderLineItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineItemID() {
        return orderLineItemID;
    }

    /**
     * Sets the value of the orderLineItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineItemID(String value) {
        this.orderLineItemID = value;
    }

    /**
     * Gets the value of the transactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionTime() {
        return transactionTime;
    }

    /**
     * Sets the value of the transactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionTime(XMLGregorianCalendar value) {
        this.transactionTime = value;
    }

    /**
     * Gets the value of the originalChargeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalChargeTime() {
        return originalChargeTime;
    }

    /**
     * Sets the value of the originalChargeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalChargeTime(XMLGregorianCalendar value) {
        this.originalChargeTime = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the itemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * Sets the value of the itemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTitle(String value) {
        this.itemTitle = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the globalCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalCategoryDescription() {
        return globalCategoryDescription;
    }

    /**
     * Sets the value of the globalCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalCategoryDescription(String value) {
        this.globalCategoryDescription = value;
    }

    /**
     * Gets the value of the siteDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteDescription() {
        return siteDescription;
    }

    /**
     * Sets the value of the siteDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteDescription(String value) {
        this.siteDescription = value;
    }

    /**
     * Gets the value of the quantitySold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantitySold() {
        return quantitySold;
    }

    /**
     * Sets the value of the quantitySold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantitySold(Integer value) {
        this.quantitySold = value;
    }

    /**
     * Gets the value of the salePrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalePrice() {
        return salePrice;
    }

    /**
     * Sets the value of the salePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalePrice(AmountType value) {
        this.salePrice = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxAmount(AmountType value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the shippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingCost() {
        return shippingCost;
    }

    /**
     * Sets the value of the shippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingCost(AmountType value) {
        this.shippingCost = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCost(AmountType value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the paymentClearedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentClearedTime() {
        return paymentClearedTime;
    }

    /**
     * Sets the value of the paymentClearedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentClearedTime(XMLGregorianCalendar value) {
        this.paymentClearedTime = value;
    }

    /**
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceCost(AmountType value) {
        this.insuranceCost = value;
    }

    /**
     * Gets the value of the listingSiteID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListingSiteID() {
        return listingSiteID;
    }

    /**
     * Sets the value of the listingSiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListingSiteID(Integer value) {
        this.listingSiteID = value;
    }

    /**
     * Gets the value of the saleTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleTime() {
        return saleTime;
    }

    /**
     * Sets the value of the saleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleTime(XMLGregorianCalendar value) {
        this.saleTime = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the secondDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondDescription() {
        return secondDescription;
    }

    /**
     * Sets the value of the secondDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondDescription(String value) {
        this.secondDescription = value;
    }

    /**
     * Gets the value of the feeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeDescription() {
        return feeDescription;
    }

    /**
     * Sets the value of the feeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeDescription(String value) {
        this.feeDescription = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFeeAmount(AmountType value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the sellingManagerSaleRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellingManagerSaleRecordID() {
        return sellingManagerSaleRecordID;
    }

    /**
     * Sets the value of the sellingManagerSaleRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellingManagerSaleRecordID(Integer value) {
        this.sellingManagerSaleRecordID = value;
    }

    /**
     * Gets the value of the buyerPaymentTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPaymentTransactionNumber() {
        return buyerPaymentTransactionNumber;
    }

    /**
     * Sets the value of the buyerPaymentTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPaymentTransactionNumber(String value) {
        this.buyerPaymentTransactionNumber = value;
    }

    /**
     * Gets the value of the variation property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantDataVariationType }
     *     
     */
    public MerchantDataVariationType getVariation() {
        return variation;
    }

    /**
     * Sets the value of the variation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantDataVariationType }
     *     
     */
    public void setVariation(MerchantDataVariationType value) {
        this.variation = value;
    }

    /**
     * Gets the value of the taxCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCategory() {
        return taxCategory;
    }

    /**
     * Sets the value of the taxCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCategory(String value) {
        this.taxCategory = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setTaxes(TaxesType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusType }
     *     
     */
    public TransactionStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusType }
     *     
     */
    public void setStatus(TransactionStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the actualShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getActualShippingCost() {
        return actualShippingCost;
    }

    /**
     * Sets the value of the actualShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setActualShippingCost(AmountType value) {
        this.actualShippingCost = value;
    }

    /**
     * Gets the value of the unpaidItem property.
     * 
     * @return
     *     possible object is
     *     {@link UnpaidItemType }
     *     
     */
    public UnpaidItemType getUnpaidItem() {
        return unpaidItem;
    }

    /**
     * Sets the value of the unpaidItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpaidItemType }
     *     
     */
    public void setUnpaidItem(UnpaidItemType value) {
        this.unpaidItem = value;
    }

}
