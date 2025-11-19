package com.Diaz_Capital_Group.Diaz_Capital_Group.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CostumerDto {

    private Long id;
    private Integer cu;
    private String name;
    private String address;
    private String email;
    private Integer mobile;


}
