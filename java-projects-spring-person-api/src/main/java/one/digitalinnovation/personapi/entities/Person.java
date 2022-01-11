package one.digitalinnovation.personapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
/*
 * @Data is a convenient shortcut annotation that bundles the features of
 * @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together:
 * In other words, @Data generates all the boilerplate that is normally associated with simple POJOs (Plain Old Java Objects) and beans:
 * getters for all fields, setters for all non-final fields, and appropriate toString, equals and hashCode implementations
 * that involve the fields of the class, and a constructor that initializes all final fields,
 * as well as all non-final fields with no initializer that have been marked with @NonNull, in order to ensure the field is never null.
 * */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String cpf;

    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    private List<Phone> phones;
}