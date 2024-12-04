package com.winzfast.dto;

public class RoleDTO {

    private Long id;
    private String name;

    public RoleDTO() {
    }

    public RoleDTO(String name, String description) {
        this.name = name;
    }

    public RoleDTO(Long id, String name, String description) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
