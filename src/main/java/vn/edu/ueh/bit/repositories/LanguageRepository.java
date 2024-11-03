package vn.edu.ueh.bit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.ueh.bit.models.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}