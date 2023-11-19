package com.example.demo.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository underTest;

    @Test
    void itShouldCheckIfStudentEmailExists() {

        //given
        String mail = "jacek@wp.pl";
        Student student = new Student(
                "Jacek",
                mail,
                Gender.FEMALE
        );
        underTest.save(student);

        //when
        boolean expected = underTest.selectExistsEmail(mail);

        //then
        assertThat(expected).isTrue();
    }

    @Test
    void itShouldCheckIfStudentDoesNotEmailExists() {

        //given
        String mail = "jacek@wp.pl";

        //when
        boolean expected = underTest.selectExistsEmail("jacek@wp.pl");

        //then
        assertThat(expected).isTrue();
    }
}








































