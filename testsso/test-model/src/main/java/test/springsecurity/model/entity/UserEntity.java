package test.springsecurity.model.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "user")
@Data
@Entity
@NameStyle(Style.normal)
public class UserEntity {
    @Id
    private Long id;
    private String username;
    private String password;
}
