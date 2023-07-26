package uz.maktab.IT.maktabIT.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Generalservice  <T ,l extends  Number>{
    public Page<T> getAll(Pageable pageable);

    public T create(T data);
    public T update (T data);
    public void delete(T data);
    public void deleteById(Long id);




}
