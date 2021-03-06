package com.project.lpd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryid;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category" ,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<ProductEntity> product;
}
