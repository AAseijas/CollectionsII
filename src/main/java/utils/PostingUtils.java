package utils;

import model.CurrencyEnum;
import model.OperationTypeEnum;
import model.Posting;
import model.PostingType;
import model.Price;
import model.RealestateTypeEnum;

import java.util.ArrayList;
import java.util.Collection;

public class PostingUtils {

    private static Collection<Posting> postings = null;
    private static Collection<Posting> postingsToRemove = null;

    public static Collection<Posting> getPostings() {
            postings = new ArrayList<>();
            postings.add(new Posting("Departamento en venta", new Price(120000L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.PROPERTY));
            postings.add(new Posting("Departamento en venta Belgrano", new Price(127500L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.PROPERTY));
            postings.add(new Posting("Departamento en alquiler", new Price(24000L, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY));
            postings.add(new Posting("casa en alquiler", new Price(35000L, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY));
            postings.add(new Posting("casa en venta", new Price(300000L, CurrencyEnum.DOLAR), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.UNIT));
            postings.add(new Posting("departamento en venta en desarrllo", new Price(245000L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.UNIT));
            postings.add(new Posting("Desarrollo en pozo para inversion", new Price(175000L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT));
            postings.add(new Posting("Alquiler de departamento, oportunidad!", new Price(14000L, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY));
            postings.add(new Posting("Alquiler de casa en Mar del plata", new Price(20000L, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY));
            postings.add(new Posting("Venta de casa en Cordoba", new Price(287000L, CurrencyEnum.DOLAR), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY));
        return postings;
    }

    public static Collection<Posting> getPostingsToRemove() {
        postingsToRemove = new ArrayList<>();
        postingsToRemove.add(new Posting("Departamento en venta Belgrano", new Price(127500L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.PROPERTY));
        postingsToRemove.add(new Posting("departamento en venta en desarrllo", new Price(245000L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.UNIT));
        postingsToRemove.add(new Posting("Alquiler de departamento, oportunidad!", new Price(14000L, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY));
        postingsToRemove.add(new Posting("Venta de casa en Cordoba", new Price(287000L, CurrencyEnum.DOLAR), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY));
        return postingsToRemove;
    }
}
