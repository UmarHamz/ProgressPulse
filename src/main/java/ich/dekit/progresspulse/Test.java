package ich.dekit.progresspulse;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String NEW_TEST_COMPLETED;
    private String role;

    public Test(Long id, String NEW_TEST_COMPLETED, String role) {
        this.id = id;
        this.NEW_TEST_COMPLETED = NEW_TEST_COMPLETED;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNEW_TEST_COMPLETED() {
        return NEW_TEST_COMPLETED;
    }

    public void setNEW_TEST_COMPLETED(String NEW_TEST_COMPLETED) {
        this.NEW_TEST_COMPLETED = NEW_TEST_COMPLETED;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
