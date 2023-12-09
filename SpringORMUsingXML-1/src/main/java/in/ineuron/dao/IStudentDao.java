package in.ineuron.dao;

import java.util.List;

import in.ineuron.bo.StudentBO;
import in.ineuron.dto.Student;

public interface IStudentDao {

	

	public int insert(StudentBO bo);
	public void delete(int id);
	public void delete(StudentBO s);
	public void update(StudentBO s);
	public StudentBO getStudent(int id);
	public List<StudentBO> getAllStudent();
	
}
