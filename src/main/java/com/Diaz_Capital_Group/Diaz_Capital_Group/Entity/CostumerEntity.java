package com.Diaz_Capital_Group.Diaz_Capital_Group.Entity;

import com.Diaz_Capital_Group.Diaz_Capital_Group.Dto.CostumerDto;
import com.Diaz_Capital_Group.Diaz_Capital_Group.Util.IMapper;
import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "costumer")
public class CostumerEntity implements IMapper<CostumerDto>, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false,nullable = false, length = 60)
    private String id;

    @Column(name = "cu", nullable = false, length = 60, unique = true)
    private String cu;

    @Column(name = "name", nullable = false,length = 100)
    private String name;

    @Column(name = "address", nullable = false, length = 150)
    private String address;

    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @Column(name = "mobile",nullable = false, length = 15)
    private String mobile;

    @Override
    public CostumerDto getData() {
        return CostumerDto.builder()
                .id(id)
                .cu(cu)
                .name(name)
                .address(address)
                .email(email)
                .mobile(mobile)
                .build();
    }

    @Override
    public void setData(CostumerDto costumerDto) {
        this.id =costumerDto.getId();
        this.cu = costumerDto.getCu();
        this.name = costumerDto.getName();
        this.email =costumerDto.getEmail();
        this.address = costumerDto.getAddress();
        this.mobile = costumerDto.getMobile();;
    }

    

}
