package dao;

import java.util.List;

public interface ExampleInterface {

	public void insertEntity(Object Entity);

	public void deleteEntity(Object Entity);

	//ahsdjsha
	public void updateEntity(Object Entity);

	public Object getEntityByName(String name);

	public List<Object> getAllEntity();
	
}
