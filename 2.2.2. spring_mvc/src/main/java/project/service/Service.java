package project.service;

import java.util.List;

public interface Service<T> {
    void add(T object);

    List<T> getList();
}
