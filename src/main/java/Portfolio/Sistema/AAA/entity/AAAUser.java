package Portfolio.Sistema.AAA.entity;

import Portfolio.Sistema.AAA.Enum.StatusAAAClient;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class AAAUser {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY )
 private Long id;

 @Column(name = "name" )
 private String name;

 @Column(name = "password_hash")
 private String passwordHash;

 @Column(name = "status")
 private StatusAAAClient status;

@ManyToOne(optional = false)
@JoinColumn(name = "authorization_profile_id", nullable = false)
private AuthorizationProfile authorizationProfile;

 @Column(name = "created_at")
 private LocalDateTime created_at;

 @Column(name = "updated_at")
 private LocalDateTime update_at;
}
