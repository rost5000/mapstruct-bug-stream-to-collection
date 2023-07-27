package org.example.dto;

import org.example.domain.SimpleModel;

import java.util.List;

public class SimpleModelResponse {
    List<SimpleModel> model;

    public List<SimpleModel> getModel() {
        return model;
    }

    public void setModel(List<SimpleModel> model) {
        this.model = model;
    }
}
