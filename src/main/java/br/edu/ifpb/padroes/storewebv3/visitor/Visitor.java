package br.edu.ifpb.padroes.storewebv3.visitor;

import br.edu.ifpb.padroes.storewebv3.domain.Book;
import br.edu.ifpb.padroes.storewebv3.domain.Game;
import br.edu.ifpb.padroes.storewebv3.domain.Smartphone;

public interface Visitor {
    void visit(Book book);
    void visit(Game game);
    void visit(Smartphone smartphone);
}
