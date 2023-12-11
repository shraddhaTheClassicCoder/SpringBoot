package in.ineuron.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.StudentBO;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private HibernateTemplate hTemplate;

	@Override
	public int insert(StudentBO bo) {
		int count = (int) hTemplate.save(bo);
		return count;
	}

	@Override
	public void delete(int id) {

		StudentBO bo = hTemplate.get(StudentBO.class, id);

		if (bo != null) {
			hTemplate.delete(bo);
		} else {
			System.out.println("Record is not available for deletion with Id "+id);
		}
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
		return hTemplate.get(StudentBO.class, id);

	}

	@Override
	public List<StudentBO> getAllStudent() {

		List<StudentBO> bo = hTemplate.loadAll(StudentBO.class);
		return bo;

	}

	@Override
	public String toString() {
		return "StudentDaoImpl [hTemplate=" + hTemplate + "]";
	}

}
