package DAO;

import java.util.List;

public interface BillingDAO {
    List<Billing> findAll();
    List<Billing> findById();
    List<> findByName();
    boolean insertBilling(Billing billing);
    boolean updateBilling(Billing billing);
    boolean deleteBilling(Billing billing);


}
