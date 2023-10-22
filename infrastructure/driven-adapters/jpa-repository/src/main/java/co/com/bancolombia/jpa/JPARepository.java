package co.com.bancolombia.jpa;

import co.com.bancolombia.jpa.entities.zooentity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<zooentity/* change for adapter model */, String>, QueryByExampleExecutor<zooentity/* change for adapter model */> {
}
