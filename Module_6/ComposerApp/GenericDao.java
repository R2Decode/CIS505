package Module_6.ComposerApp;

import java.util.List;

public interface GenericDao<T, ID> {
    List<T> findAll();
    T findBy(ID id);
    void insert(T entity);
}
