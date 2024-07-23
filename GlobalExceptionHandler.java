@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Object>> handleException(Exception ex) {
        ApiError apiError = new ApiError();
        apiError.setErrorCode("500");
        apiError.setErrorMessage(ex.getMessage());
        apiError.setDetails(Collections.singletonList(ex.toString()));

        ApiResponse<Object> response = new ApiResponse<>();
        response.setStatus(false);
        response.setMessage("An error occurred");
        response.setError(apiError);
        response.setStatusCode(500);

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse<Object>> handleResourceNotFoundException(ResourceNotFoundException ex) {
        ApiError apiError = new ApiError();
        apiError.setErrorCode("404");
        apiError.setErrorMessage(ex.getMessage());
        apiError.setDetails(Collections.singletonList(ex.toString()));

        ApiResponse<Object> response = new ApiResponse<>();
        response.setStatus(false);
        response.setMessage("Resource not found");
        response.setError(apiError);
        response.setStatusCode(400);

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    // Add more handlers for other specific exceptions as needed
}
