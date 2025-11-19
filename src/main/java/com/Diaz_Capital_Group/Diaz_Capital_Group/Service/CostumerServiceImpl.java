package com.Diaz_Capital_Group.Diaz_Capital_Group.Service;

import com.Diaz_Capital_Group.Diaz_Capital_Group.Dto.CostumerDto;
import com.Diaz_Capital_Group.Diaz_Capital_Group.Entity.CostumerEntity;
import com.Diaz_Capital_Group.Diaz_Capital_Group.Repository.CostumerRepo;
import com.Diaz_Capital_Group.Diaz_Capital_Group.Util.IMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CostumerServiceImpl implements ICostumerService{

    @Autowired
    private CostumerRepo costumerRepo;


    @Override
    public CostumerDto getCu(Integer cu) {
        return null;
    }

    @Override
    public List<CostumerDto> getAll() {
        return costumerRepo.findAll().stream().map(CostumerEntity::getData).toList();
    }

    @Override
    public Optional<CostumerDto> getByID(Long id) {
        return costumerRepo.findById(id).stream().map(CostumerEntity::getData).findFirst();
    }

    @Override
    public CostumerDto add(CostumerDto costumerDto) {
        CostumerEntity costumerEntity = new CostumerEntity();
        costumerEntity.setData(costumerDto);
        return costumerRepo.save(costumerEntity).getData();
    }

    @Override
    public CostumerDto upDate(CostumerDto costumerDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
        Optional<CostumerEntity>  buscar = costumerRepo.findById(id);
        if (buscar.isPresent()){
            costumerRepo.deleteById(id);
        }else{
            throw new RuntimeException("Usuario No encontrado");
        }
    }
}
