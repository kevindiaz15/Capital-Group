package com.Diaz_Capital_Group.Diaz_Capital_Group.Service;

import com.Diaz_Capital_Group.Diaz_Capital_Group.Dto.CostumerDto;
import com.Diaz_Capital_Group.Diaz_Capital_Group.Util.ICrud;

public interface ICostumerService extends ICrud<CostumerDto> {
    CostumerDto getCu(Integer cu);
}
