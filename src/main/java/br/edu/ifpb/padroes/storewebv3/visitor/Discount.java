package br.edu.ifpb.padroes.storewebv3.visitor;

import br.edu.ifpb.padroes.storewebv3.domain.Book;
import br.edu.ifpb.padroes.storewebv3.domain.Game;
import br.edu.ifpb.padroes.storewebv3.domain.Smartphone;

public class Discount implements Visitor {
    private final Double BOOK_DISCOUNT_RATE = 0.5;
    private final Double GAME_DISCOUNT_RATE = 0.1;
    private final Double SMARTPHONE_DISCOUNT_RATE = 0.1;

    @Override
    public void visit(Book book) {
        Long finalPrice = PriceWithDiscount(book.getPrice(),BOOK_DISCOUNT_RATE);
        book.setPrice(finalPrice);
    }

    @Override
    public void visit(Game game) {
        Long finalPrice = PriceWithDiscount(game.getPrice(),GAME_DISCOUNT_RATE);
        game.setPrice(finalPrice);
    }

    @Override
    public void visit(Smartphone smartphone) {
        Long finalPrice = PriceWithDiscount(smartphone.getPrice(),SMARTPHONE_DISCOUNT_RATE);
        smartphone.setPrice(finalPrice);
    }

    private Long PriceWithDiscount(Long price, Double percentage) {
        Double discount = price * percentage;
        Long finalPrice = price - discount.longValue();
        return finalPrice;
    }

}
