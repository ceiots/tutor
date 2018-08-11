package ssm.service;

import java.util.List;
import ssm.entity.Chater;

public interface ChaterService {

    public void addChater(Chater chater);
    
    public List<Chater> findChaters();
}
