package endless.overcooked.ordering.api.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import endless.overcooked.ordering.api.OrderRepository;
import endless.overcooked.ordering.model.Order;

public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public void deleteInBatch(Iterable<Order> arg0) {

    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public List<Order> findAll(Sort arg0) {
        return null;
    }

    @Override
    public List<Order> findAll(Iterable<Long> arg0) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public Order getOne(Long arg0) {
        return null;
    }

    @Override
    public <S extends Order> List<S> save(Iterable<S> arg0) {
        return null;
    }

    @Override
    public <S extends Order> S saveAndFlush(S arg0) {
        return null;
    }

    @Override
    public Page<Order> findAll(Pageable arg0) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long arg0) {

    }

    @Override
    public void delete(Order arg0) {

    }

    @Override
    public void delete(Iterable<? extends Order> arg0) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public boolean exists(Long arg0) {
        return false;
    }

    @Override
    public Order findOne(Long arg0) {
        return null;
    }

    @Override
    public <S extends Order> S save(S arg0) {
        return null;
    }

}