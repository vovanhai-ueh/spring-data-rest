package vn.edu.ueh.bit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.ueh.bit.models.Region;

public interface RegionRepository extends JpaRepository<Region, Integer> {
}