/**
 *
 */
package com.casestudy.couchbase.ecommerce.model;

import java.util.Set;

/**
 * Product.
 *
 * @author vijay
 * @version $Revision: 1.10 $
 */
public class Product {

    private String productId;
    private String name;
    private String type;
    private double unitPrice;
    private String description;
    private Set<String> categories;
    private String color;
    private Set<String> reviews;
    private String imageURL;
    private String dateModified;
    private String dateAdded;

    /**
     * Constructor.
     *
     */
    Product(){

    }

    /**
     *
     * Getter of {@link #productId}.
     *
     * @return {@link #productId}
     */
    public String getProductId() {
        return productId;
    }

    /**
     *
     * Getter of {@link #name}.
     *
     * @return {@link #name}
     */
    public String getName() {
        return name;
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
     * Getter of {@link #unitPrice}.
     *
     * @return {@link #unitPrice}
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     *
     * Getter of {@link #description}.
     *
     * @return {@link #description}
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * Getter of {@link #categories}.
     *
     * @return {@link #categories}
     */
    public Set<String> getCategories() {
        return categories;
    }

    /**
     *
     * Getter of {@link #color}.
     *
     * @return {@link #color}
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * Getter of {@link #reviews}.
     *
     * @return {@link #reviews}
     */
    public Set<String> getReviews() {
        return reviews;
    }

    /**
     *
     * Getter of {@link #imageURL}.
     *
     * @return {@link #imageURL}
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     *
     * Getter of {@link #dateModified}.
     *
     * @return {@link #dateModified}
     */
    public String getDateModified() {
        return dateModified;
    }

    /**
     *
     * Getter of {@link #dateAdded}.
     *
     * @return {@link #dateAdded}
     */
    public String getDateAdded() {
        return dateAdded;
    }

    /**
     *
     * Setter of {@link #productId}.
     *
     * @param productId
     *            to be set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     *
     * Setter of {@link #name}.
     *
     * @param name
     *            to be set
     */
    public void setName(String name) {
        this.name = name;
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
     * Setter of {@link #unitPrice}.
     *
     * @param unitPrice
     *            to be set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     *
     * Setter of {@link #description}.
     *
     * @param description
     *            to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * Setter of {@link #categories}.
     *
     * @param categories
     *            to be set
     */
    public void setCategories(Set<String> categories) {
        this.categories = categories;
    }

    /**
     *
     * Setter of {@link #color}.
     *
     * @param color
     *            to be set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * Setter of {@link #reviews}.
     *
     * @param reviews
     *            to be set
     */
    public void setReviews(Set<String> reviews) {
        this.reviews = reviews;
    }

    /**
     *
     * Setter of {@link #imageURL}.
     *
     * @param imageURL
     *            to be set
     */
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    /**
     *
     * Setter of {@link #dateModified}.
     *
     * @param dateModified
     *            to be set
     */
    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    /**
     *
     * Setter of {@link #dateAdded}.
     *
     * @param dateAdded
     *            to be set
     */
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((productId == null) ? 0 : productId.hashCode());
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
        final Product other = (Product) obj;
        if (productId == null) {
            if (other.productId != null)
                return false;
        } else if (!productId.equals(other.productId))
            return false;
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Product [productId=");
        builder.append(productId);
        builder.append(", name=");
        builder.append(name);
        builder.append(", type=");
        builder.append(type);
        builder.append(", unitPrice=");
        builder.append(unitPrice);
        builder.append(", description=");
        builder.append(description);
        builder.append(", categories=");
        builder.append(categories);
        builder.append(", color=");
        builder.append(color);
        builder.append(", reviews=");
        builder.append(reviews);
        builder.append(", imageURL=");
        builder.append(imageURL);
        builder.append(", dateModified=");
        builder.append(dateModified);
        builder.append(", dateAdded=");
        builder.append(dateAdded);
        builder.append("]");
        return builder.toString();
    }




}
