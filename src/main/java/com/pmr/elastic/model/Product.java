package com.pmr.elastic.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Document(indexName = "products", createIndex = true)
public class Product {
    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Keyword)
    private Category category;

    @Field(type = FieldType.Long)
    private double price;

    public enum Category {
        CLOTHES,
        ELECTRONICS,
        GAMES;
    }
}
