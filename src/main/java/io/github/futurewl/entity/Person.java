package io.github.futurewl.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Data
@Entity
@Table(name = "t_person")
public class Person implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    @OneToOne(mappedBy = "person")
    private Card card;

}
