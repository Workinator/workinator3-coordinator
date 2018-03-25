package com.allardworks.workinator3.coordinator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PartitionExistsException extends Exception {
    private final String partitionKey;
    public PartitionExistsException(final String partitionKey) {
        super("The partition already exists: " + partitionKey);
        this.partitionKey = partitionKey;
    }
}
