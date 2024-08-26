import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long movie_Id;
    private String title;
    private LocalDateTime dateTime;
    private String status; //"já vi" or "Quero ver"

    // Getters e Setters
}
