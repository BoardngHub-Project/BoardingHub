package com.groupi.boardinghub.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class ServiceProviderProfilePicture {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy="uuid2")
    @Column(name = "id")
    private String id;

    @Column(name = "email")
    private String email;

    @Column(name="profile_picture")
    private String profilePicture;

    @OneToOne(mappedBy = "profilePictureId")
    private ServiceProvider serviceProvider;
}
