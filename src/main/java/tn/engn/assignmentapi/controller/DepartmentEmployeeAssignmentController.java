package tn.engn.assignmentapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.engn.assignmentapi.dto.AssignmentMetadataRequestDto;
import tn.engn.assignmentapi.dto.AssignmentResponseDto;
import tn.engn.assignmentapi.dto.BulkAssignmentToHierarchicalEntityRequestDto;
import tn.engn.assignmentapi.dto.BulkAssignmentResponseDto;
import tn.engn.assignmentapi.model.DepartmentEmployeeAssignment;
import tn.engn.assignmentapi.service.BaseAssignmentService;
import tn.engn.assignmentapi.service.DepartmentEmployeeAssignmentService;
import tn.engn.employeeapi.dto.EmployeeRequestDto;
import tn.engn.employeeapi.dto.EmployeeResponseDto;
import tn.engn.employeeapi.model.Employee;
import tn.engn.hierarchicalentityapi.dto.HierarchyRequestDto;
import tn.engn.hierarchicalentityapi.dto.HierarchyResponseDto;
import tn.engn.hierarchicalentityapi.dto.PaginatedResponseDto;
import tn.engn.hierarchicalentityapi.model.Department;

import java.util.List;

/**
 * Controller for managing assignments between departments and employees.
 * This controller provides endpoints for assigning employees to departments,
 * removing assignments, bulk operations, and retrieving assignments, both as
 * individual entities and in paginated forms.
 */
@RestController
@RequestMapping("/api/v1/department-employee-assignments")
@Tag(name = "DepartmentEmployeeAssignment (ManyToMany)", description = "API for managing assignments between departments and employees")
public class DepartmentEmployeeAssignmentController extends AbstractAssignmentController<
        DepartmentEmployeeAssignment,
        Department,
        Employee,
        EmployeeRequestDto,
        EmployeeResponseDto,
        HierarchyRequestDto,
        HierarchyResponseDto> {

    public DepartmentEmployeeAssignmentController(DepartmentEmployeeAssignmentService assignmentService) {
        super(assignmentService);
    }
}
