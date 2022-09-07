package com.linx;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Department")
public class Department {

    @Column(name = "DepartmentID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DepartmentName", length = 30, nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Account> accounts;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Account author;

    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdDate;

}
