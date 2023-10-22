package co.com.bancolombia.model.zoo.gateways;

import co.com.bancolombia.model.zoo.Zoo;

import java.util.List;

public interface ZooRepository {
    default List<Zoo> getAllZoo() {
        return null;
    }

    void create(Zoo animal);

    Zoo read(String id);

    default Zoo update(Zoo animal) {
        return animal;
    };

    void delete(String id);
}
