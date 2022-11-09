package BUS;

import DAO.DAO_Test;
import DTO.DTO_Test;

public class BUS_Test {

     public Boolean Them(DTO_Test Test) {
        return new DAO_Test().Them(Test);
    }
    
}

