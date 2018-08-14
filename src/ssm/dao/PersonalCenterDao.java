package ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import ssm.entity.PersonalCenter;

@Repository
public interface PersonalCenterDao {

    public List<PersonalCenter> findPersonalCenters();
}
