package com.id.cap.skillgrid.dto;

import lombok.Data;

import java.util.List;

@Data
public class Domain {
    private String domain;
    private List<Skill> skills;
    private String matricule;
}
