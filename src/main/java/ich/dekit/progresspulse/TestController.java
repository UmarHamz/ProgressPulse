package ich.dekit.progresspulse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
    private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping("/showTablePage")
    public ResponseEntity getAllProduct () {
        return ResponseEntity.ok(testRepository.findAll());
    }
    @GetMapping("/sayHiPage")
    public String sayHi () {
        return "Hi!";
    }

}