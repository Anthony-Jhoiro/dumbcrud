package fr.anthonyquere.dumbcrud;

import java.util.List;

/**
 * Describes a providers that handles stocking the Domain object
 * @param <Domain> the object that you want to manage with your CRUD
 */
public interface CrudProvider<Domain> {
    void add(Domain domain) throws Exception;

    List<Domain> list() throws Exception;
}
