package in.ineuron.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.StudentBO;
import in.ineuron.dao.IStudentDao;
import in.ineuron.dto.Student;

@Service
@Transactional 
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao dao;

	@Override
	public int insert(Student s) {

		StudentBO bo = new StudentBO();

		BeanUtils.copyProperties(s, bo);

		return dao.insert(bo);

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Student s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Student s) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "StudentServiceImpl [dao=" + dao + "]";
	}
}
