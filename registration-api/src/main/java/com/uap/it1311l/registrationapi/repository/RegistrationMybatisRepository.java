package com.uap.it1311l.registrationapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.uap.it1311l.registrationapi.model.Attendee;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RegistrationMybatisRepository 
{
	@Select("select * from attendees")
	public List<Attendee> findAll();
	
	@Insert("INSERT INTO attendees(firstName, middleName, lastName, course, age) VALUES (#{firstName}, #{middleName}, #{lastName}, #{course},#{age})")
	public int insert(Attendee attendee);
}
