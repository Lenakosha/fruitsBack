package ru.jafix.fruties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.jafix.fruties.entities.Image;
import ru.jafix.fruties.entities.Order;

import java.util.UUID;

@Repository
public interface ImageRepository extends JpaRepository<Image, UUID> {

}
