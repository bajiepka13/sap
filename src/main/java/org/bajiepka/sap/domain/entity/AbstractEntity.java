package org.bajiepka.sap.domain.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractEntity {

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    protected LocalDateTime createdAt;

    @Column(name = "is_active", nullable = false)
    protected Boolean isActive;

    @UpdateTimestamp
    @Column(name = "modified_at", nullable = false)
    protected LocalDateTime modifiedAt;

    @Column(name = "is_deleted", nullable = false)
    protected Boolean isDeleted;

}
