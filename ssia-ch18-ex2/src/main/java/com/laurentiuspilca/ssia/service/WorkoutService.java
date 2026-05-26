package com.laurentiuspilca.ssia.service;

import com.laurentiuspilca.ssia.entities.Workout;
import com.laurentiuspilca.ssia.repositories.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    @PreAuthorize("#workout.user == authentication.name and #oauth2.hasScope('fitnessapp')")
    public void saveWorkout(Workout workout) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Workout> findWorkouts() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void deleteWorkout(Integer id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
