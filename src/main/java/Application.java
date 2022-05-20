import model.Posting;
import model.Price;
import services.PostingService;
import utils.PostingUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
   Utilizando los métodos de la clase PostingUtils, implementar :
   1- Método que muestre por pantalla los elementos de la collection devuelta por getPostings()
   2- Método que elimine de la collection getPostings() los postings existentes en getPostingsToRemove() y mostrar por pantalla el resultado
   3- Metodo que muestre todos los postings que tiene tipo de operacion SELL y tipo de propiedad APARTMENT
   4- Método que muestre todos los postings que tiene tipo de operacion RENT y tipo de propiedad HOUSE
   -----------------------------------------------------------------------------------------------------------------------------------------
   5- Implementar un método que reciba por parámetro una lista de postings y que retorne un ArrayList invirtiendo la lista original
   6- Implementar un metodo que reciba por parametro una lista de postings y devuelva un listado de precios de las propiedades de tipo APARTMENT Y operacion RENT
   7- Implementar un metodo que reciba por parametro una lista de postings y devuelva la suma de los precios en dolares de los postings con tipo de operacion SELL y propiedad APARTMENT
   8- Implementar un metodo que reciba por parámetro una lista de postings y retorne una LinkedList con los precios de las propiedades listando primero los precios en moneda PESOS y al final los en moneda DOLAR
   9- Implementar un método que reciba por parámetro una lista de precios y retorne una LinkedList cuyo primer elemento sea el precio minimo y el segundo elemento el precio maximo. Utilizar Iterator.
*/
public class Application {

    public static void main(String[] args) {
        PostingService postingService = new PostingService();
        List<Posting> allPosting = new ArrayList<>(PostingUtils.getPostings());
        System.out.println("5)_");
        for (Posting post : postingService.invertList(allPosting)) {
            System.out.println(post);
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("6)_");
        List<Price> listPrice = new ArrayList<>(postingService.getPricePostingByParameters(allPosting));
        for (Price pricePosting : listPrice) {
            System.out.println(pricePosting);
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("7)_");
        System.out.println("La suma es:" + postingService.getUsdPostingByParameters(allPosting));
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("8)_");
        LinkedList<Price> pricesLinkedList = new LinkedList<>(postingService.ordPriceOfListPosting(allPosting));
        for (Price priceOfPosting : pricesLinkedList) {
            System.out.println(priceOfPosting);
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("9)_");
        System.out.println(postingService.getMaxAndMinPriceOfListPrice(postingService.getAllPriceListOfPostings(allPosting)));
    }
}
