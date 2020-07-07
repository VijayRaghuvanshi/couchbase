/**
 *
 */
package com.casestudy.couchbase.ecommerce.model;

/**
 * Credit card details.
 *
 * @author vijaykumar02
 * @version $Revision: 1.10 $
 */
/**
 * TODO: Insert description here.
 *
 * @author vijaykumar02
 * @version $Revision: 1.10 $
 */
public class CreditCard {
    private String cardNumber;
    private String cardType;
    private String cardExpiry;
    /**
     *
     * Getter of {@link #cardNumber}.
     *
     * @return {@link #cardNumber}
     */
    public String getCardNumber() {
        return cardNumber;
    }
    /**
     *
     * Getter of {@link #cardType}.
     *
     * @return {@link #cardType}
     */
    public String getCardType() {
        return cardType;
    }
    /**
     *
     * Getter of {@link #cardExpiry}.
     *
     * @return {@link #cardExpiry}
     */
    public String getCardExpiry() {
        return cardExpiry;
    }
    /**
     *
     * Setter of {@link #cardNumber}.
     *
     * @param cardNumber
     *            to be set
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    /**
     *
     * Setter of {@link #cardType}.
     *
     * @param cardType
     *            to be set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    /**
     *
     * Setter of {@link #cardExpiry}.
     *
     * @param cardExpiry
     *            to be set
     */
    public void setCardExpiry(String cardExpiry) {
        this.cardExpiry = cardExpiry;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((cardNumber == null) ? 0 : cardNumber.hashCode());
        result = prime * result
                + ((cardType == null) ? 0 : cardType.hashCode());
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
        final CreditCard other = (CreditCard) obj;
        if (cardNumber == null) {
            if (other.cardNumber != null)
                return false;
        } else if (!cardNumber.equals(other.cardNumber))
            return false;
        if (cardType == null) {
            if (other.cardType != null)
                return false;
        } else if (!cardType.equals(other.cardType))
            return false;
        return true;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("CreditCard [cardNumber=");
        builder.append(cardNumber);
        builder.append(", cardType=");
        builder.append(cardType);
        builder.append(", cardExpiry=");
        builder.append(cardExpiry);
        builder.append("]");
        return builder.toString();
    }





}
