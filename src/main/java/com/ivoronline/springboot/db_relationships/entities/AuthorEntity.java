package com.ivoronline.springboot.db_relationships.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Component
public class AuthorEntity {

  @Id
  //@GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String  name;

}
