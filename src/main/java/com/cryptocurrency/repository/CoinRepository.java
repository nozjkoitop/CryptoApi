package com.cryptocurrency.repository;

import com.cryptocurrency.model.Coin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoinRepository extends CrudRepository<Coin, Long> {
}
