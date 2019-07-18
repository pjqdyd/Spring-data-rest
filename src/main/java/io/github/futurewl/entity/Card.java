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
public class Card implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @OneToOne
    private Person person;

}
