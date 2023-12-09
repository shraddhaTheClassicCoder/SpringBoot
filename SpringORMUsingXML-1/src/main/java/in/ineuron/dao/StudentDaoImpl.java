package in.ineuron.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.StudentBO;
import in.ineuron.dto.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private HibernateTemplate hTemplate;
	

	

	@Override
	public int insert(StudentBO bo) {
		int count=(int) hTemplate.save(bo);
		return count;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(StudentBO s) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(StudentBO s) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public StudentBO getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<StudentBO> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "StudentDaoImpl [hTemplate=" + hTemplate + "]";
	}


}
