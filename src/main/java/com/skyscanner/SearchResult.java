package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResult {
    @JsonProperty
    private String city;
    @JsonProperty
    private String title;
    @JsonProperty
    private String kind;

    public SearchResult() {
    }

    public SearchResult(String city, String title, String kind) {
        this.city = city;
        this.title = title;
        this.kind = kind;
    }

    public String getCity() {
        return city;
    }

    public String getTitle() {
        return title;
    }

    public String getKind() {
        return kind;
    }
}
