package com.iiht.eauction;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
@Transactional
public interface Bidsrepository extends JpaRepository<Bids,Integer>{
	void deleteByProductid(String Id);
	List<Bids> findByproductid(String Id);
	Bids findByProductidAndEmail(String getproductid,String getemail);
	

	
}

