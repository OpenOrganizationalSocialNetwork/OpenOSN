package com.openosn.apis.user.model.to;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private int id;
    @Basic
    private String firstName;
    @Basic
    private String lastName;
    @Basic
    private Integer employeeId;
    @Basic
    private Integer imageId;
    @Basic
    private Date contractStartDate;
    @Basic
    private Date contractEndDate;

}
