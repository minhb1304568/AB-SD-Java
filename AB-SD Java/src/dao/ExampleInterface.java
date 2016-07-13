package dao;

import java.util.List;

//Đinh nghĩa trước các hàm cần phải làm bên ExampleDAO
// *** Lưu ý: Kiểu Object là các lớp của Model

public interface ExampleInterface {

	public void insertEntity(Object Entity);

	public void deleteEntity(Object Entity);

	public void updateEntity(Object Entity);

	public Object getEntityByName(String name);

	public List<Object> getAllEntity();

}
