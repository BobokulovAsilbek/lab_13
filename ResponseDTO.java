package com.example.newlab;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDTO<T> {

    @JsonProperty("custom_message")
    private String message;

    @JsonProperty("http_status")
    private int status;

    @JsonProperty("response_data")
    private T data;

    public ResponseDTO(String message, int status, T data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", data=" + data +
                '}';
    }
}

