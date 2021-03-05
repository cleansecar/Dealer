package com.autobrixusedcar.dealer.services;

import java.util.Map;

import com.autobrixusedcar.dealer.dtos.DealerHomeRequestDTO;


public interface DealerHomeService {
	
	void createnewdealar(DealerHomeRequestDTO dto) throws JPAException;


	Map<String,Object> getdealerHomepagedetails(DealerHomeRequestDTO dto);
	
	Map<String,Object> getsaleemployeelist(String phoneNo,String typeofacc);

}
