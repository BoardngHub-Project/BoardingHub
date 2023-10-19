package com.groupi.boardinghub.model;

import com.groupi.boardinghub.model.enums.ServiceProviderType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "SERVICE_PROVIDER_TYPE",
        discriminatorType = DiscriminatorType.STRING
)
public abstract class ServiceProvider {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy="uuid2")
    @Column(name = "id")
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "service_provider_type")
//    private ServiceProviderType serviceProviderType;

}
