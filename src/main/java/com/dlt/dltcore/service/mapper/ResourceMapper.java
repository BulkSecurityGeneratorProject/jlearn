package com.dlt.dltcore.service.mapper;

import com.dlt.dltcore.domain.*;
import com.dlt.dltcore.service.dto.ResourceDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Resource and its DTO ResourceDTO.
 */
@Mapper(componentModel = "spring", uses = {DisciplineMapper.class, ProgramMapper.class, CourseMapper.class, LessonMapper.class})
public interface ResourceMapper extends EntityMapper<ResourceDTO, Resource> {

    @Mapping(source = "discipline.id", target = "disciplineId")
    @Mapping(source = "program.id", target = "programId")
    @Mapping(source = "course.id", target = "courseId")
    @Mapping(source = "lesson.id", target = "lessonId")
    ResourceDTO toDto(Resource resource);

    @Mapping(source = "disciplineId", target = "discipline")
    @Mapping(source = "programId", target = "program")
    @Mapping(source = "courseId", target = "course")
    @Mapping(source = "lessonId", target = "lesson")
    Resource toEntity(ResourceDTO resourceDTO);

    default Resource fromId(Long id) {
        if (id == null) {
            return null;
        }
        Resource resource = new Resource();
        resource.setId(id);
        return resource;
    }
}
