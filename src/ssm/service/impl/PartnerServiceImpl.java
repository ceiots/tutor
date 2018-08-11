package ssm.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ssm.dao.PartnerDao;
import ssm.entity.Partner;
import ssm.service.PartnerService;

@Service("PartnerService")
public class PartnerServiceImpl implements PartnerService {

    @Resource
    private PartnerDao partnerDao;

	@Override
	public void addPartner(Partner partner) {
		partnerDao.addPartner(partner);
	}
	@Override
	public List<Partner> findPartners(){
		return partnerDao.findPartners();
	}
}
