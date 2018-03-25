package com.allardworks.workinator3.coordinator;

import com.allardworks.workinator3.core.Assignment;
import com.allardworks.workinator3.core.WorkerStatus;

public interface AssignmentStrategy {
    Assignment getAssignment(WorkerStatus executor);
    void releaseAssignment(Assignment assignment);
}
