package com.Diaz_Capital_Group.Diaz_Capital_Group.Util;

import java.util.List;
import java.util.Optional;

public interface ICrud<T> {

    List<T> getAll();

    Optional<T> getByID(Long id);

    T add(T t);

    T upDate(T t);

    void delete(Long id);

}
