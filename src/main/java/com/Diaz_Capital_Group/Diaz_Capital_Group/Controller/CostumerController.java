package com.Diaz_Capital_Group.Diaz_Capital_Group.Controller;

import com.Diaz_Capital_Group.Diaz_Capital_Group.Dto.CostumerDto;
import com.Diaz_Capital_Group.Diaz_Capital_Group.Service.CostumerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Costumer")
public class CostumerController {

    @Autowired
    private CostumerServiceImpl costumerService;

    @GetMapping("/{id}")
    public Optional<CostumerDto> findById(@PathVariable String id){
        return costumerService.getByID(id);
    }

    @GetMapping("/{cu}")
    public Optional<CostumerDto> findByCu(@PathVariable String cu) {
        return costumerService.getCu(cu);
    }

    @GetMapping
    public List<CostumerDto> findAll(){
        return  costumerService.getAll();
    }

    @PostMapping
    public CostumerDto save(@RequestBody CostumerDto costumerDto) {
        return costumerService.add(costumerDto);
    }

    @PutMapping
    public CostumerDto update(@RequestBody CostumerDto costumerDto){
        return costumerService.upDate(costumerDto);
    }

    @DeleteMapping
    public void delete(@PathVariable String id){
        costumerService.delete(id);
    }

}
