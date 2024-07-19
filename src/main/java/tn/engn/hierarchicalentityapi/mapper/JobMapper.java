package tn.engn.hierarchicalentityapi.mapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tn.engn.hierarchicalentityapi.dto.HierarchyRequestDto;
import tn.engn.hierarchicalentityapi.dto.HierarchyResponseDto;
import tn.engn.hierarchicalentityapi.model.Job;

/**
 * Mapper class for converting between Job entities and DTOs.
 */
@Component
@Slf4j
public class JobMapper extends AbstractHierarchyMapper<Job, HierarchyRequestDto, HierarchyResponseDto> {
    @Override
    protected boolean shouldFetchSubEntities() {
        return true;
    }

    @Override
    protected Job createNewEntityInstance() {
        return new Job();
    }

    @Override
    protected HierarchyResponseDto createNewResponseDtoInstance() {
        return new HierarchyResponseDto();
    }
}
