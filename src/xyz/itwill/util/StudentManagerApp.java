package xyz.itwill.util;

import java.util.Collections;
import java.util.List;

//학생정보 관리 프로그램
public class StudentManagerApp {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		
		//학생정보를 전달하여 저장매체에 저장하는 메소드 호출
		manager.insertStudent(new Student(1000, "홍길동"));
		manager.insertStudent(new Student(2000, "임꺽정"));
		manager.insertStudent(new Student(3000, "전우치"));
		manager.insertStudent(new Student(4000, "일지매"));
		
		boolean result = manager.insertStudent(new Student(5000, "장길산"));
		if(result) {
			System.out.println("[메시지]학생정보를 성공적으로 저장하였습니다.");
		} else {
			System.out.println("[메시지]이미 저장된 학번의 학생정보입니다.");
		}
		System.out.println("====================================================");
		
		//학번이 [2000]인 학생정보를 검색하여 출력
		Student searchStudent = manager.selectStudent(2000);
		if(searchStudent == null) {
			System.out.println("[메시지]해당 학번의 학생정보를 찾을 수 없습니다.");
		} else {
			System.out.println(searchStudent);	
		}
		System.out.println("====================================================");
		
		//학번이 [2000]인 학생의 이름을 [임걱정]으로 변경
		searchStudent.setName("임걱정");
		if(manager.updateStudent(searchStudent)) {
			System.out.println("[메시지]학생정보를 성공적으로 변경하였습니다.");
		} else {
			System.out.println("[메시지]변경할 학생정보를 찾을 수 없습니다.");
		}
		System.out.println("====================================================");
		
		//학번이 [4000]인 학생정보 삭제
		if(manager.deleteStudent(4000)) {
			System.out.println("[메시지]학생정보를 성공적으로 삭제하였습니다.");
		} else {
			System.out.println("[메시지]삭제할 학생정보를 찾을 수 없습니다.");
		}
		System.out.println("====================================================");
		
		List<Student> studentList = manager.selectStudentList();
		
		for(Student student:studentList) {
			System.out.println(student);//toString() 메소드 자동 호출
		}
		System.out.println("====================================================");
		
		//List 인스턴스에 저장된 학생정보를 정렬하여 출력
		//Collections.sort() 메소드에 전달되는 List 인스턴스는 요소의 필드값을 비교하여
		//정렬하기 위한 기능이 제공되지 않으면 에러 발생
		Collections.sort(studentList);
		
		for(Student student:studentList) {
			System.out.println(student);//toString() 메소드 자동 호출
		}
		System.out.println("====================================================");
	}
}
