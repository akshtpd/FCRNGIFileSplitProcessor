package com.oracle.fcr.ngi.renameIt.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "table_name")
@Getter
@Setter
public class TestEntity implements Serializable {
    private static final long serialVersionUID = -8271086864543828367L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;


}
