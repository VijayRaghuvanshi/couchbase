/**
 *
 */
package com.casestudy.couchbase.ecommerce.model;

import java.util.Set;

/**
 * Purchase model class.
 *
 * @author vijaykumar
 * @version $Revision: 1.10 $
 */
public class Purchase {

    private String purchaseId;
    private String type;
    private String purchasedAt;
    private String customerId;
    private Set<LineItem> lineItems;


    /**
     *
     * Getter of {@link #purchaseId}.
     *
     * @return {@link #purchaseId}
     */
    public String getPurchaseId() {
        return purchaseId;
    }

    /**
     *
     * Setter of {@link #purchaseId}.
     *
     * @param purchaseId
     *            to be set
     */
    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    /**
     *
     * Getter of {@link #type}.
     *
     * @return {@link #type}
     */
    public String getType() {
        return type;
    }

    /**
     *
     * Getter of {@link #purchasedAt}.
     *
     * @return {@link #purchasedAt}
     */
    public String getPurchasedAt() {
        return purchasedAt;
    }

    /**
     *
     * Getter of {@link #customerId}.
     *
     * @return {@link #customerId}
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     *
     * Getter of {@link #lineItems}.
     *
     * @return {@link #lineItems}
     */
    public Set<LineItem> getLineItems() {
        return lineItems;
    }

    /**
     *
     * Setter of {@link #type}.
     *
     * @param type
     *            to be set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * Setter of {@link #purchasedAt}.
     *
     * @param purchasedAt
     *            to be set
     */
    public void setPurchasedAt(String purchasedAt) {
        this.purchasedAt = purchasedAt;
    }

    /**
     *
     * Setter of {@link #customerId}.
     *
     * @param customerId
     *            to be set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     *
     * Setter of {@link #lineItems}.
     *
     * @param lineItems
     *            to be set
     */
    public void setLineItems(Set<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((purchaseId == null) ? 0 : purchaseId.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Purchase other = (Purchase) obj;
        if (purchaseId == null) {
            if (other.purchaseId != null)
                return false;
        } else if (!purchaseId.equals(other.purchaseId))
            return false;
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Purchase [purchaseId=");
        builder.append(purchaseId);
        builder.append(", type=");
        builder.append(type);
        builder.append(", purchasedAt=");
        builder.append(purchasedAt);
        builder.append(", customerId=");
        builder.append(customerId);
        builder.append(", lineItems=");
        builder.append(lineItems);
        builder.append("]");
        return builder.toString();
    }

}
