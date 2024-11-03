package vn.edu.ueh.bit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.ueh.bit.models.Continent;

public interface ContinentRepository extends JpaRepository<Continent, Integer> {
}