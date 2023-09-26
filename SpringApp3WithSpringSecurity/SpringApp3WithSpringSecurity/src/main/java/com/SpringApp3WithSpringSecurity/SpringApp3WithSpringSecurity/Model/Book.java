package com.SpringApp3WithSpringSecurity.SpringApp3WithSpringSecurity.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "book1")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookId")
    private int bookId;
    @Column(name = "bookName",nullable = false)
    private String bookName;
    @Lob
    @Column(name = "bookDescription",nullable = false,length = 512)
    private String bookDescription;
    @Column(name = "bookPrice",nullable = false)
    private double bookPrice;
    @Column(name = "bookPublisherName",nullable = false)
    private String bookPublisherName;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "bookPublishingDate",nullable = false)
    private LocalDateTime bookPublishingDate=LocalDateTime.now();
}
