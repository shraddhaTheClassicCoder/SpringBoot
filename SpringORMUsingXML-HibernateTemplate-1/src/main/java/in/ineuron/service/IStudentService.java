package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.StudentBO;
import in.ineuron.dto.Student;

public interface IStudentService {

	public int insert(Student s);
	public void delete(int id);
	public void delete(Student s);
	public void update(Student s);
	public Student getStudent(int id);
	public List<Student> getAllStudent();
	
	
	
}
