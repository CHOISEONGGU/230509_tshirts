package io.playdata.tshirts.Repository;

import io.playdata.tshirts.model.TShirt;
import org.springframework.data.jpa.repository.JpaRepository;

//io.playdata.tshirts.repository.TShirtRepository
public interface TShirtRepository extends JpaRepository<TShirt, Long> {
}