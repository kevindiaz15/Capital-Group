package com.Diaz_Capital_Group.Diaz_Capital_Group.Repository;

import com.Diaz_Capital_Group.Diaz_Capital_Group.Entity.CostumerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.security.PublicKey;
import java.util.Optional;

@Repository
public interface CostumerRepo extends JpaRepository<CostumerEntity,Long> {

    public Optional<CostumerEntity> findByCu(Integer cu);

}
