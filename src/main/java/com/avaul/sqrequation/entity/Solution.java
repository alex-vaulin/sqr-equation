package com.avaul.sqrequation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Solution {

    @Id
    private String id;

    private Double x1;
    private Double x2;
}
