package fr.epita.bms.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    @Column(name = "priority")
    private String priority;

    @Column(name = "image_path")
    private String imagePath;

    //private byte[] imageData or BufferedImage here instead of imagePath

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @Column(name = "status")
    private String status;


}
