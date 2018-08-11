package ssm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import ssm.entity.Chater;

@Repository
public interface ChaterDao {

    public List<Chater> findChaters();
    public Chater addChater(Chater chater);
}
