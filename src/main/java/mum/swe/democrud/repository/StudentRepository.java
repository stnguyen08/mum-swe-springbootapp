package mum.swe.democrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import mum.swe.democrud.model.Student;

@Repository("studentRepository")
//public interface StudentRepository extends MongoRepository<Student, Long> {
public interface StudentRepository extends JpaRepository<Student, Long> {
}
