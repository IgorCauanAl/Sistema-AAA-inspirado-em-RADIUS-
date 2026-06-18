package Portfolio.Sistema.AAA.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name= "authorization_profiles")
public class AuthorizationProfile {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "access_level", nullable = false)
private String accessLevel;


@Column(name = "name", nullable = false )
private String name;

@Column(name = "vlan_id", nullable = false)
private Integer vlanId;

@Column(name = "session_timeout_seconds", nullable = false)
private int sessionIimeoutSeconds;

@Column(name = "description")
private String description;

@Column(name = "created_at", nullable = false)
private LocalDateTime createdAt;

@Column(name = "updated_at")
private LocalDateTime updateAt;


}
