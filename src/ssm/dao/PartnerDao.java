package ssm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import ssm.entity.Partner;
@Repository
public interface PartnerDao {

    public void addPartner(Partner partner);
    
    public List<Partner> findPartners();
}
