package co.com.bancolombia.jpa;

import co.com.bancolombia.model.zoo.Zoo;
import co.com.bancolombia.model.zoo.gateways.ZooRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@AllArgsConstructor

public class zooimpl implements ZooRepository {

    private JPARepositoryAdapter JPArepositorio;
    @Override
    public List<Zoo> getAllZoo() {return JPArepositorio.findAll(); }
    @Override
    public void create(Zoo animal) { JPArepositorio.save(animal); }

    @Override
    public Zoo read(String id) { return JPArepositorio.findById(id); }

    @Override
    public Zoo update(Zoo animal) { return JPArepositorio.save(animal); }

    @Override
    public void delete(String id) { JPArepositorio.deleteById(id); }

}
