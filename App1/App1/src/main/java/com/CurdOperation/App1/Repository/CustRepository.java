package com.CurdOperation.App1.Repository;

import com.CurdOperation.App1.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustRepository extends JpaRepository<Customer,Integer>
{

}
