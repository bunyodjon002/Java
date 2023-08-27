package uz.maktab.IT.maktabIT.service.vm;

import java.util.List;
import java.util.Optional;

public interface GeneralService <entity,IdType>{
    List<entity> getAll();

    Optional<entity> getById(IdType id);
    entity  create(entity entity);
    entity update(entity entity);

    entity delete(entity entity);
    void deleteById(IdType id);
}
