package noemibaglieri.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Author {
    @Setter(AccessLevel.NONE)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String avatar;

    public Author(String firstName, String lastName, String email, String dateOfBirth, String avatar) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 10000);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.avatar = avatar;
    }
}
