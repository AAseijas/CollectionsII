package model;

import java.util.Objects;

public class Posting {

    private String title;
    private Price price;
    private RealestateTypeEnum realestateType;
    private OperationTypeEnum operationType;
    private PostingType postingType;

    public Posting(String title, Price price, RealestateTypeEnum realestateType, OperationTypeEnum operationType, PostingType postingType) {
        this.title = title;
        this.price = price;
        this.realestateType = realestateType;
        this.operationType = operationType;
        this.postingType = postingType;
    }

    public String getTitle() {
        return title;
    }

    public Price getPrice() {
        return price;
    }

    public RealestateTypeEnum getRealestateType() {
        return realestateType;
    }

    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public PostingType getPostingType() {
        return postingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posting posting = (Posting) o;
        return title.equals(posting.title) && price.equals(posting.price) && realestateType == posting.realestateType && operationType == posting.operationType && postingType == posting.postingType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, realestateType, operationType, postingType);
    }

    @Override
    public String toString() {
        return "Posting{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", realestateType=" + realestateType +
                ", operationType=" + operationType +
                ", postingType=" + postingType +
                '}';
    }
}
