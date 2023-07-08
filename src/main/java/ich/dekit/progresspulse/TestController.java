package ich.dekit.progresspulse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
    private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping("/sayHiPage")
    public String sayHi () {
        return "Hi!";
    }

    @GetMapping("/testPostRequest")
    public ResponseEntity<List<User>> getAllProduct () {
        return ResponseEntity.ok(this.testRepository.findAll());
    }

    @PostMapping("/testPostRequest")
    public ResponseEntity<User> createProduct(@RequestBody User test) {
        return ResponseEntity.status(201).body(this.testRepository.save(test));
    }

}