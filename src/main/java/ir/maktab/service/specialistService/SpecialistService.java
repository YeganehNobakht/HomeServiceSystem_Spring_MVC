package ir.maktab.service.specialistService;

import ir.maktab.data.entity.Specialist;

public interface SpecialistService {

    void create(Specialist specialist);

    void delete(String specialistUsername);

    public void changePassword(String username, String oldPass,String newPass) throws Exception;
}
