@RestController
@RequestMapping("/api")
public class ExampleController {

    @GetMapping("/test")
    public ResponseEntity<ApiResponse<String>> testApi() {
        ApiResponse<String> response = new ApiResponse<>();
        response.setStatus(true);
        response.setStatusCode(200);
        response.setMessage("Request was successful");
        response.setData("Test Data");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/error")
    public ResponseEntity<ApiResponse<Object>> testError() throws Exception {
        throw new Exception("Test exception");
    }

    @GetMapping("/not-found")
    public ResponseEntity<ApiResponse<Object>> testNotFound() throws ResourceNotFoundException {
        throw new ResourceNotFoundException("Resource not found");
    }
}
