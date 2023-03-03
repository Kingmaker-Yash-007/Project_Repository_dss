package com.dss.project.controller;

import com.dss.project.dto.APIStatsDTO;
import com.dss.project.model.APIStats;
import com.dss.project.repository.APIStatsRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/statistics")
@Tag(name = "Statistics")
public class PerformanceStatsController {

    @Autowired
    private APIStatsRepository apiStatsRepository;

    @GetMapping("/statistics")
    @Operation(summary = "Get the API performance stats")
    public ResponseEntity<Map<String, List<APIStatsDTO>>> getEndpointStats() {
        List<APIStats> stats = apiStatsRepository.findAll();
        Map<String, List<APIStatsDTO>> result = new HashMap<>();
        for (APIStats stat : stats) {
            String url = stat.getURL();
            String operation = stat.getOperation();
            int mean = stat.getMean();
            int max = stat.getMax();
            APIStatsDTO dto = new APIStatsDTO(url, operation, mean, max);

            List<APIStatsDTO> urlStats = result.getOrDefault(url, new ArrayList<>());
            urlStats.add(dto);
            result.put(url, urlStats);
        }
        return ResponseEntity.ok(result);
    }

}
