package com.dlt.dltcore.repository;

import com.dlt.dltcore.domain.Lesson;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Lesson entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
