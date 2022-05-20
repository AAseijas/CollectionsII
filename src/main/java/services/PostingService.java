package services;

import model.*;
import utils.PostingUtils;

import java.util.*;

public class PostingService {

    public List<Price> getAllPriceListOfPostings(List<Posting> allPostings) {
        List<Price> priceOfListPosting = new ArrayList<>();

        for (Posting post : allPostings) {
            priceOfListPosting.add(post.getPrice());
        }

        return priceOfListPosting;
    }

    public List<Posting> searchPostingByParameters(List<Posting> postingToFilter, OperationTypeEnum operationType, RealestateTypeEnum postingType) {
        List<Posting> postFiltered = new ArrayList<>();
        for (Posting post : postingToFilter) {
            if (operationType.equals(post.getOperationType()) && postingType.equals(post.getRealestateType())) {
                postFiltered.add(post);
            }
        }
        return postFiltered;
    }

    public ArrayList<Posting> invertList(List<Posting> listPosting) {
        ArrayList<Posting> invertedPostingList = new ArrayList<>();
        for (int i = listPosting.size() - 1; i >= 0; i--) {
            invertedPostingList.add(listPosting.get(i));
        }
        return invertedPostingList;
    }

    public List<Price> getPricePostingByParameters(List<Posting> listPostingToSearch) {
        List<Price> listPostingPrice = new ArrayList<>();
        List<Posting> filteredPosting = new ArrayList<>(searchPostingByParameters(listPostingToSearch, OperationTypeEnum.RENT, RealestateTypeEnum.APARTMENT));
        for (Posting post : filteredPosting) {
            listPostingPrice.add(post.getPrice());
        }
        return listPostingPrice;
    }

    public Long getUsdPostingByParameters(List<Posting> listPostingToSearch) {
        List<Posting> filteredPosting = new ArrayList<>(searchPostingByParameters(listPostingToSearch, OperationTypeEnum.SELL, RealestateTypeEnum.APARTMENT));
        Long priceSum = 0L;
        for (Posting post : filteredPosting) {
            if (CurrencyEnum.DOLAR.equals(post.getPrice().getCurrency())) {
                priceSum = priceSum + post.getPrice().getAmount();
            }
        }
        return priceSum;
    }

    public LinkedList<Price> ordPriceOfListPosting(List<Posting> allPosting) {
        LinkedList<Price> linkedListPosting = new LinkedList<>();
        for (Posting post : allPosting) {
            if (CurrencyEnum.PESOS.equals(post.getPrice().getCurrency())) {
                linkedListPosting.addFirst(post.getPrice());
            } else if (CurrencyEnum.DOLAR.equals(post.getPrice().getCurrency())) {
                linkedListPosting.addLast(post.getPrice());
            }
        }
        return linkedListPosting;
    }

    public LinkedList<Long> getMaxAndMinPriceOfListPrice(List<Price> pricesList) {
        LinkedList<Long> maxAndMinValueOFPostingsList = new LinkedList<>();
        Iterator<Price> it = pricesList.iterator();
        Long max = 0L;
        Long min = pricesList.get(0).getAmount();
        while (it.hasNext()) {
            Price pricePosting = it.next();
            if (pricePosting.getAmount() > max) {
                max = pricePosting.getAmount();
            } else if (pricePosting.getAmount() < min) {
                min = pricePosting.getAmount();
            }
        }
        maxAndMinValueOFPostingsList.addFirst(min);
        maxAndMinValueOFPostingsList.addLast(max);
        return maxAndMinValueOFPostingsList;
    }
}