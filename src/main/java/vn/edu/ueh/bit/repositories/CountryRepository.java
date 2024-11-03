package vn.edu.ueh.bit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.ueh.bit.models.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}