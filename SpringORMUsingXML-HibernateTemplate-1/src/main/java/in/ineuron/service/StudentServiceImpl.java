package in.ineuron.service;

import java.util.ArrayList;
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
		
		dao.delete(id);
		

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

		StudentBO bo = dao.getStudent(id);

		Student std = new Student();

		BeanUtils.copyProperties(bo, std);

		return std;
	}

	@Override
	public List<Student> getAllStudent() {
		
		
		List<StudentBO> studentBo=dao.getAllStudent();
		
		System.out.println(studentBo);
		
		List<Student> student=new ArrayList<Student>();
		
		studentBo.forEach(bo->{
			Student stud=new Student();
			
			BeanUtils.copyProperties(bo, stud);
			
			student.add(stud);
		});
		
		return student;
	}

	@Override
	public String toString() {
		return "StudentServiceImpl [dao=" + dao + "]";
	}
}
