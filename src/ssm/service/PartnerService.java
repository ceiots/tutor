package ssm.service;

import java.util.List;
import ssm.entity.Partner;

public interface PartnerService {

    public void addPartner(Partner partner);
    public List<Partner> findPartners();
}
