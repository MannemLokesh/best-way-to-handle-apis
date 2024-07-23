public class ApiResponse<T> {
    private boolean status;
    private int statusCode;
    private String message;
    private T data;
    private ApiError error;

    // Getters and Setters

    public boolean isStatus() {
        return success;
    }

    public void setStatus(boolean success) {
        this.success = success;
    }

    public int getStatusCode() {
      return statusCode;
    }

    public void setStatusCode(int statusCode) {
      this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiError getError() {
        return error;
    }

    public void setError(ApiError error) {
        this.error = error;
    }
}
