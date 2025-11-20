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

    private String id;
    private String cu;
    private String name;
    private String address;
    private String email;
    private String mobile;


}
