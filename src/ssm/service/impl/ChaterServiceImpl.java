package ssm.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ssm.dao.ChaterDao;
import ssm.entity.Chater;
import ssm.service.ChaterService;

@Service("ChaterService")
public class ChaterServiceImpl implements ChaterService {

    @Resource
    private ChaterDao chaterDao;

	@Override
	public List<Chater> findChaters() {
		return chaterDao.findChaters();
	}

	@Override
	public void addChater(Chater chater) {
		chaterDao.addChater(chater);
	}

}
