package co.com.bancolombia.usecase.zoo;

import co.com.bancolombia.model.zoo.Zoo;
import co.com.bancolombia.model.zoo.gateways.ZooRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ZooUseCase {
    private ZooRepository zooRepository;
    public List<Zoo> getAllZoo() {
        return zooRepository.getAllZoo();
    }

    public void create (Zoo animal) {
        zooRepository.create(animal);
    }
    public Zoo read(String id) {
        return zooRepository.read(id);
    }

    public Zoo update(Zoo animal) {
        zooRepository.update(animal);
        return animal;
    }
    public void delete(String id) {
        zooRepository.delete(id);
    }
}
