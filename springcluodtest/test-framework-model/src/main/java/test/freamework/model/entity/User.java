package test.freamework.model.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "lib_user")
@Data
@ToString
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer categoryId;
    private String image;
    private String name;
    private Long profileId;
    private Long roleId;


}
