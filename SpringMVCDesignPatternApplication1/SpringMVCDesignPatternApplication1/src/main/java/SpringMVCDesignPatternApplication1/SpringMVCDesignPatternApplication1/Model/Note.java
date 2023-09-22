package SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noteId")
    private int noteId;

    @Column(name = "noteTitle",nullable = false)
    private String noteTitle;

    @Lob
    @Column(name = "noteContent",nullable = false, length = 512)
    private String noteContent;

    @UpdateTimestamp
    @Column(name = "datetime",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date= LocalDateTime.now();

}