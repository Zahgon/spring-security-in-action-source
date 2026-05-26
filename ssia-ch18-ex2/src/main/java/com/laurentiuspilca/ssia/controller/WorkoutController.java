package com.laurentiuspilca.ssia.controller;

import com.laurentiuspilca.ssia.entities.Workout;
import com.laurentiuspilca.ssia.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @PostMapping("/")
    public void add(@RequestBody Workout workout) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @GetMapping("/")
    public List<Workout> findAll() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
