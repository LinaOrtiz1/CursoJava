package co.com.bancolombia.api;
import co.com.bancolombia.model.zoo.Zoo;
import co.com.bancolombia.usecase.zoo.ZooUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
//    private final MyUseCase useCase;

    private final ZooUseCase  useCaseZoo;

    @GetMapping(path = "/")
    public String commandName() {
//      return useCase.doAction();
        return "Hello World";
    }

    @GetMapping(path = "/animals")
    public List<Zoo> getAllZoo() {
        return useCaseZoo.getAllZoo();
    }

    @PostMapping(path = "/animals")
    public void create(@RequestBody Zoo animal) {
        useCaseZoo.create(animal);
    }

    @GetMapping(path = "/animals/{id}")
    public Zoo read(@PathVariable String id) {
        return useCaseZoo.read(id);
    }

    @PutMapping(path = "/animals/{id}")
    public Zoo update(@RequestBody Zoo animal) {
        return useCaseZoo.update(animal);
    }

    @DeleteMapping(path = "/animals/{id}")
    public void delete(@PathVariable String id) {
        useCaseZoo.delete(id);
    }
}
