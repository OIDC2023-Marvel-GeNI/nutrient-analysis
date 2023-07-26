package marvel.geni.nutrientanalysis.entity;

import jakarta.persistence.*;
import lombok.*;
import marvel.geni.nutrientanalysis.enumType.Gender;

import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "member", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class Member {

    @Id
    @Column(name="memberId")
    private Long memberId;

    @Column(name="email")
    @NonNull
    private String email;

    @Column(name="password")
    @NonNull
    private String password;

    @Column(name="name")
    @NonNull
    private String name;

    @Column(name="gender")
    @NonNull
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name="age")
    @NonNull
    private Integer age;

    @Column(name="kg")
    @NonNull
    private Integer kg;

    @Column(name="cm")
    @NonNull
    private Integer cm;

    @Column(name="registeredDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registeredDate;

    @Column(name="updateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

}
