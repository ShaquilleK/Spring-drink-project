package com.qa.SpringRum.Service;

import java.util.List;

public interface ServiceMethods<R> {
	
	R create(R r);
	
	List<R> getALL (); 
	
	R getByid(long id); 
	
	R update(long id, R r);
	
	boolean delete(long id);
	
	
	
	
	
	
	

}
